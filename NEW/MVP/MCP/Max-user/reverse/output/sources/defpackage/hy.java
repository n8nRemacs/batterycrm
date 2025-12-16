package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hy {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public ey c;
    public final AtomicReference d;
    public final xn3 e;
    public boolean f;

    public hy(MediaCodec mediaCodec, HandlerThread handlerThread) {
        xn3 xn3Var = new xn3(0);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = xn3Var;
        this.d = new AtomicReference();
    }

    public static fy b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new fy();
                }
                return (fy) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f) {
            try {
                ey eyVar = this.c;
                eyVar.getClass();
                eyVar.removeCallbacksAndMessages(null);
                xn3 xn3Var = this.e;
                synchronized (xn3Var) {
                    xn3Var.b = false;
                }
                ey eyVar2 = this.c;
                eyVar2.getClass();
                eyVar2.obtainMessage(2).sendToTarget();
                xn3Var.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }
}
