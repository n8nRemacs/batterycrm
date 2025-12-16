package defpackage;

import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Size;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class x7h extends HandlerThread {
    public final Size a;
    public final u75 b;
    public final long c;
    public final AtomicReference d;
    public final /* synthetic */ a8h o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7h(a8h a8hVar, Size size, u75 u75Var) {
        super("videomsg-gl-thread");
        this.o = a8hVar;
        this.a = size;
        this.b = u75Var;
        this.c = SystemClock.elapsedRealtime();
        this.d = new AtomicReference();
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        String str = this.o.a;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.d;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, a9h.d(SystemClock.elapsedRealtime() - this.c, "onLooperPrepared, GL thread startup took=", " ms"), null);
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        wqi.h(this.o.a, "run, previewSize=" + this.a + ", dynamicRange=" + this.b, null);
        if (this.o.b.get()) {
            wqi.q(this.o.a, "run, video message processor was requested to exit during startup GL thread, skip GL initialization!", new Object[0]);
        } else {
            try {
                a8h.a(this.o, this.a, this.b);
            } catch (Exception e) {
                wqi.e(this.o.a, "GL initialization failed", e);
                this.d.set(e);
            }
        }
        super.run();
        String str = this.o.a;
        l6b l6bVar = wqi.a;
        if (l6bVar == null) {
            return;
        }
        lg8 lg8Var = lg8.X;
        if (l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str, "run, GL thread finished", null);
        }
    }
}
