package defpackage;

import java.util.HashSet;

/* loaded from: classes2.dex */
public final class skh implements py4, qy4 {
    public final zl3 a = new zl3();
    public final HashSet b = new HashSet();

    @Override // defpackage.qy4
    public final synchronized boolean a(py4 py4Var) {
        boolean zA;
        tkh tkhVar = new tkh(py4Var);
        zA = this.a.a(tkhVar);
        if (zA) {
            this.b.add(tkhVar);
        }
        return zA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r2.remove();
        r0 = r1.b(r3);
     */
    @Override // defpackage.qy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean b(defpackage.py4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            zl3 r1 = r5.a     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r2 = r5.b     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L27
        La:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L27
            tkh r3 = (defpackage.tkh) r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L27
            py4 r4 = (defpackage.py4) r4     // Catch: java.lang.Throwable -> L27
            if (r4 != r6) goto La
            r2.remove()     // Catch: java.lang.Throwable -> L27
            boolean r0 = r1.b(r3)     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r5)
            return r0
        L27:
            r6 = move-exception
            java.lang.String r1 = "skh"
            java.lang.String r2 = "delete: failed"
            defpackage.wqi.e(r1, r2, r6)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r5)
            return r0
        L31:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skh.b(py4):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r2.remove();
        r0 = r1.c(r3);
     */
    @Override // defpackage.qy4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean c(defpackage.py4 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            zl3 r1 = r5.a     // Catch: java.lang.Throwable -> L27
            java.util.HashSet r2 = r5.b     // Catch: java.lang.Throwable -> L27
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L27
        La:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L25
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L27
            tkh r3 = (defpackage.tkh) r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L27
            py4 r4 = (defpackage.py4) r4     // Catch: java.lang.Throwable -> L27
            if (r4 != r6) goto La
            r2.remove()     // Catch: java.lang.Throwable -> L27
            boolean r0 = r1.c(r3)     // Catch: java.lang.Throwable -> L27
        L25:
            monitor-exit(r5)
            return r0
        L27:
            r6 = move-exception
            java.lang.String r1 = "skh"
            java.lang.String r2 = "delete: failed"
            defpackage.wqi.e(r1, r2, r6)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r5)
            return r0
        L31:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L31
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skh.c(py4):boolean");
    }

    public final synchronized void d() {
        this.a.d();
        this.b.clear();
    }

    @Override // defpackage.py4
    public final synchronized void dispose() {
        this.a.dispose();
        this.b.clear();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.a.b;
    }
}
