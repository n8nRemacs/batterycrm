package defpackage;

import android.os.Build;
import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;

/* loaded from: classes.dex */
public final /* synthetic */ class gv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iv0 b;

    public /* synthetic */ gv0(iv0 iv0Var, int i) {
        this.a = i;
        this.b = iv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        c60 c60Var;
        switch (this.a) {
            case 0:
                iv0 iv0Var = this.b;
                iv0Var.k.set(false);
                d60 d60Var = iv0Var.g;
                d60Var.a();
                if (d60Var.d.getAndSet(false)) {
                    d60Var.a.stop();
                    if (d60Var.a.getRecordingState() != 1) {
                        gri.i("AudioStreamImpl", "Failed to stop AudioRecord with state: " + d60Var.a.getRecordingState());
                    }
                    if (pv4.a.e(AudioTimestampFramePositionIncorrectQuirk.class) != null) {
                        d60Var.a.release();
                        d60Var.a = d60.b(d60Var.f, d60Var.b, null);
                    }
                }
                synchronized (iv0Var.e) {
                    iv0Var.f = null;
                    iv0Var.c.clear();
                }
                return;
            case 1:
                iv0 iv0Var2 = this.b;
                try {
                    iv0Var2.g.d();
                    if (iv0Var2.k.getAndSet(true)) {
                        return;
                    }
                    iv0Var2.b();
                    return;
                } catch (AudioStream$AudioStreamException e) {
                    throw new RuntimeException(e);
                }
            case 2:
                this.b.b();
                return;
            default:
                iv0 iv0Var3 = this.b;
                iv0Var3.k.set(false);
                d60 d60Var2 = iv0Var3.g;
                if (!d60Var2.c.getAndSet(true)) {
                    if (Build.VERSION.SDK_INT >= 29 && (c60Var = d60Var2.k) != null) {
                        il.g(d60Var2.a, c60Var);
                    }
                    d60Var2.a.release();
                }
                synchronized (iv0Var3.e) {
                    iv0Var3.f = null;
                    iv0Var3.c.clear();
                }
                return;
        }
    }
}
