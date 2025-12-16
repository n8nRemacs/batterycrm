package defpackage;

/* loaded from: classes.dex */
public final class qpd extends r0 {
    public pe4 h;

    public static void n(pe4 pe4Var) {
        if (pe4Var != null) {
            pe4Var.close();
        }
    }

    @Override // defpackage.r0, defpackage.pe4
    public final boolean close() {
        synchronized (this) {
            try {
                if (!super.close()) {
                    return false;
                }
                pe4 pe4Var = this.h;
                this.h = null;
                n(pe4Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.r0, defpackage.pe4
    public final synchronized Object d() {
        pe4 pe4Var;
        pe4Var = this.h;
        return pe4Var != null ? pe4Var.d() : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    @Override // defpackage.r0, defpackage.pe4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean e() {
        /*
            r1 = this;
            monitor-enter(r1)
            pe4 r0 = r1.h     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            boolean r0 = r0.e()     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            r0 = 0
        L10:
            monitor-exit(r1)
            return r0
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpd.e():boolean");
    }

    public final void o(brf brfVar) {
        if (f()) {
            return;
        }
        pe4 pe4Var = brfVar != null ? (pe4) brfVar.get() : null;
        synchronized (this) {
            try {
                if (f()) {
                    n(pe4Var);
                    return;
                }
                pe4 pe4Var2 = this.h;
                this.h = pe4Var;
                if (pe4Var != null) {
                    ((r0) pe4Var).l(new nu5(2, this), yu1.a);
                }
                n(pe4Var2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
