package defpackage;

/* loaded from: classes.dex */
public final class p1e implements de7 {
    public final de7 a;
    public final Object b = new Object();
    public boolean c;
    public wz1 d;

    public p1e(de7 de7Var) {
        this.a = de7Var;
    }

    @Override // defpackage.de7
    public final void a(long j, wz1 wz1Var) {
        qqg qqgVar;
        synchronized (this.b) {
            this.c = true;
            this.d = wz1Var;
        }
        de7 de7Var = this.a;
        if (de7Var != null) {
            de7Var.a(j, new wz1(1, this));
            qqgVar = qqg.a;
        } else {
            qqgVar = null;
        }
        if (qqgVar == null) {
            gri.b("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        qqg qqgVar;
        synchronized (this.b) {
            try {
                if (this.c) {
                    de7 de7Var = this.a;
                    if (de7Var != null) {
                        de7Var.clear();
                        qqgVar = qqg.a;
                    } else {
                        qqgVar = null;
                    }
                    if (qqgVar == null) {
                        gri.b("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    gri.i("ScreenFlashWrapper", "completePendingScreenFlashClear: none pending!");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                wz1 wz1Var = this.d;
                if (wz1Var != null) {
                    wz1Var.a();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.de7
    public final void clear() {
        b();
    }
}
