package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class kbd implements Runnable {
    public volatile AtomicInteger a = new AtomicInteger(0);
    public final ou1 b;
    public final /* synthetic */ mbd c;

    public kbd(mbd mbdVar, ou1 ou1Var) {
        this.c = mbdVar;
        this.b = ou1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fa6 fa6Var;
        String strConcat = "OkHttp ".concat(this.c.z0.b.h());
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(strConcat);
        try {
            this.c.b.i();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    this.c.y0.a.u(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.i(this.c, this.c.h());
                fa6Var = this.c.y0.a;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    p2c p2cVar = p2c.a;
                    p2c p2cVar2 = p2c.a;
                    String str = "Callback failure for " + mbd.a(this.c);
                    p2cVar2.getClass();
                    p2c.i(4, str, e);
                } else {
                    this.b.j(this.c, e);
                }
                fa6Var = this.c.y0.a;
                fa6Var.u(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                this.c.d();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    saj.a(iOException, th);
                    this.b.j(this.c, iOException);
                }
                throw th;
            }
            fa6Var.u(this);
        } finally {
            threadCurrentThread.setName(name);
        }
    }
}
