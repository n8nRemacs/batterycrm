package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class n30 {
    public final AudioManager a;
    public final m30 b;
    public final xl5 c;
    public int d;
    public float e = 1.0f;

    public n30(Context context, Handler handler, xl5 xl5Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.a = audioManager;
        this.c = xl5Var;
        this.b = new m30(this, handler);
        this.d = 0;
    }

    public final void a() {
        if (this.d == 0) {
            return;
        }
        if (xxg.a < 26) {
            this.a.abandonAudioFocus(this.b);
        }
        b(0);
    }

    public final void b(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        float f = i == 3 ? 0.2f : 1.0f;
        if (this.e == f) {
            return;
        }
        this.e = f;
        xl5 xl5Var = this.c;
        if (xl5Var != null) {
            dm5 dm5Var = xl5Var.a;
            dm5Var.V0(1, 2, Float.valueOf(dm5Var.d1 * dm5Var.H0.e));
        }
    }

    public final int c(int i, boolean z) {
        a();
        return z ? 1 : -1;
    }
}
