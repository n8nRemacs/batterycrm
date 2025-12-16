package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ea7 extends AtomicReference implements py4 {
    public final h0e X;
    public final vta Y;
    public final AtomicBoolean Z = new AtomicBoolean();
    public final k18 a;
    public final int b;
    public final String c;
    public final String d;
    public final String o;
    public long s0;

    public ea7(vta vtaVar, k18 k18Var, int i, String str, String str2, String str3, h0e h0eVar) {
        this.a = k18Var;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.o = str3;
        this.X = h0eVar;
        this.Y = vtaVar;
    }

    public final void a(boolean z) {
        if (this.Z.compareAndSet(false, true)) {
            h0e h0eVar = this.X;
            if (!h0eVar.e()) {
                h0eVar.dispose();
            }
            if (z) {
                wqi.c("fa7", "cancelUpload", new Object[0]);
                wy5 wy5Var = (wy5) get();
                if (wy5Var != null) {
                    synchronized (wy5Var) {
                        try {
                            if (!wy5Var.b) {
                                if (!wy5Var.a.v0) {
                                    wy5Var.a.d();
                                }
                                wy5Var.b = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final void b(String str, o97 o97Var) {
        if (this.Z.get()) {
            return;
        }
        this.X.b(new se5(this, str, o97Var, 12));
    }

    @Override // defpackage.py4
    public final void dispose() {
        a(true);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.Z.get();
    }
}
