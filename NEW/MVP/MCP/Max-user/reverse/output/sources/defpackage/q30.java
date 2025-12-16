package defpackage;

import android.media.AudioManager;

/* loaded from: classes2.dex */
public interface q30 extends AudioManager.OnAudioFocusChangeListener {
    default boolean U0() {
        return true;
    }

    float a();

    void b(float f);

    boolean d();

    void pause();

    void play();
}
