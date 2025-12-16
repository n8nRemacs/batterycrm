package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class dk6 implements bp0 {
    public int a;
    public vc3 b;

    public dk6(int i, vc3 vc3Var) {
        this.b = vc3Var;
        this.a = i;
    }

    public synchronized void a() {
        vc3.P(this.b);
        this.b = null;
        this.a = -1;
    }

    @Override // defpackage.bp0
    public synchronized void clear() {
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    @Override // defpackage.bp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean d(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.a     // Catch: java.lang.Throwable -> Lf
            if (r2 != r0) goto L11
            vc3 r2 = r1.b     // Catch: java.lang.Throwable -> Lf
            boolean r2 = defpackage.vc3.i0(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        Lf:
            r2 = move-exception
            goto L14
        L11:
            r2 = 0
        L12:
            monitor-exit(r1)
            return r2
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk6.d(int):boolean");
    }

    @Override // defpackage.bp0
    public synchronized vc3 l() {
        return vc3.y(this.b);
    }

    @Override // defpackage.bp0
    public synchronized void m(int i, vc3 vc3Var) {
        try {
            if (this.b != null) {
                Object objZ = vc3Var.Z();
                vc3 vc3Var2 = this.b;
                if (objZ.equals(vc3Var2 != null ? (Bitmap) vc3Var2.Z() : null)) {
                    return;
                }
            }
            vc3.P(this.b);
            this.b = vc3Var.w();
            this.a = i;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.bp0
    public void o(int i, vc3 vc3Var) {
    }

    @Override // defpackage.bp0
    public synchronized vc3 p() {
        try {
        } finally {
            a();
        }
        return vc3.y(this.b);
    }

    @Override // defpackage.bp0
    public synchronized vc3 s(int i) {
        return this.a == i ? vc3.y(this.b) : null;
    }
}
