package com.antony.decibelmeter;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;

/**
 * Created By antony on 12/20/2019.
 */
public class SettingsContentObserver extends ContentObserver {
    int previousVolume;
    float currentProgress;
    Context context;
    GaugeView gaugeView;

    public SettingsContentObserver(Context c, Handler handler, GaugeView gaugeView) {
        super(handler);
        context = c;
        this.gaugeView = gaugeView;

        AudioManager audio = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        previousVolume = audio.getStreamVolume(AudioManager.STREAM_MUSIC);

        float currentVolume = audio.getStreamVolume(AudioManager.STREAM_MUSIC);

        float max = audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC);

        currentProgress = (currentVolume / max) * 100;
    }

    @Override
    public boolean deliverSelfNotifications() {
        return super.deliverSelfNotifications();
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);

        AudioManager audio = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        float currentVolume = audio.getStreamVolume(AudioManager.STREAM_MUSIC);

        float max = audio.getStreamMaxVolume(AudioManager.STREAM_MUSIC);

        float percentage = (currentVolume / max) * 100;

        gaugeView.onChanged(percentage);
    }
}
