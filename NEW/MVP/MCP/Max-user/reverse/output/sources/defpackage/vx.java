package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class vx implements x6f {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ vx(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    @Override // defpackage.x6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.qu0 r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.a
            java.lang.Object r1 = r5.b
            java.lang.Object r2 = r5.c
            switch(r0) {
                case 0: goto L88;
                default: goto L9;
            }
        L9:
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L10
            goto L53
        L10:
            if (r0 < 0) goto L78
            r0 = 1
            u9g r2 = (defpackage.u9g) r2     // Catch: java.lang.AssertionError -> L43
            r2.f()     // Catch: java.lang.AssertionError -> L43
            w9e r2 = r6.m0(r0)     // Catch: java.lang.AssertionError -> L43
            int r3 = r2.c     // Catch: java.lang.AssertionError -> L43
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.lang.AssertionError -> L43
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.AssertionError -> L43
            int r7 = (int) r7     // Catch: java.lang.AssertionError -> L43
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch: java.lang.AssertionError -> L43
            byte[] r8 = r2.a     // Catch: java.lang.AssertionError -> L43
            int r3 = r2.c     // Catch: java.lang.AssertionError -> L43
            int r7 = r1.read(r8, r3, r7)     // Catch: java.lang.AssertionError -> L43
            r8 = -1
            if (r7 != r8) goto L48
            int r7 = r2.b     // Catch: java.lang.AssertionError -> L43
            int r8 = r2.c     // Catch: java.lang.AssertionError -> L43
            if (r7 != r8) goto L45
            w9e r7 = r2.a()     // Catch: java.lang.AssertionError -> L43
            r6.a = r7     // Catch: java.lang.AssertionError -> L43
            defpackage.oae.a(r2)     // Catch: java.lang.AssertionError -> L43
            goto L45
        L43:
            r6 = move-exception
            goto L54
        L45:
            r3 = -1
            goto L53
        L48:
            int r8 = r2.c     // Catch: java.lang.AssertionError -> L43
            int r8 = r8 + r7
            r2.c = r8     // Catch: java.lang.AssertionError -> L43
            long r1 = r6.b     // Catch: java.lang.AssertionError -> L43
            long r3 = (long) r7     // Catch: java.lang.AssertionError -> L43
            long r1 = r1 + r3
            r6.b = r1     // Catch: java.lang.AssertionError -> L43
        L53:
            return r3
        L54:
            java.util.logging.Logger r7 = defpackage.yua.a
            java.lang.Throwable r7 = r6.getCause()
            r8 = 0
            if (r7 == 0) goto L6e
            java.lang.String r7 = r6.getMessage()
            if (r7 == 0) goto L6a
            java.lang.String r1 = "getsockname failed"
            boolean r7 = defpackage.vmf.s(r7, r1, r8)
            goto L6b
        L6a:
            r7 = r8
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            r0 = r8
        L6f:
            if (r0 == 0) goto L77
            java.io.IOException r7 = new java.io.IOException
            r7.<init>(r6)
            throw r7
        L77:
            throw r6
        L78:
            java.lang.String r6 = "byteCount < 0: "
            java.lang.String r6 = defpackage.vb9.e(r7, r6)
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L88:
            s87 r1 = (defpackage.s87) r1
            r1.i()
            vx r2 = (defpackage.vx) r2     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La2
            long r6 = r2.b(r6, r7)     // Catch: java.lang.Throwable -> La0 java.io.IOException -> La2
            boolean r8 = r1.j()
            if (r8 != 0) goto L9a
            return r6
        L9a:
            r6 = 0
            java.io.IOException r6 = r1.m(r6)
            throw r6
        La0:
            r6 = move-exception
            goto Laf
        La2:
            r6 = move-exception
            boolean r7 = r1.j()     // Catch: java.lang.Throwable -> La0
            if (r7 != 0) goto Laa
            goto Lae
        Laa:
            java.io.IOException r6 = r1.m(r6)     // Catch: java.lang.Throwable -> La0
        Lae:
            throw r6     // Catch: java.lang.Throwable -> La0
        Laf:
            r1.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx.b(qu0, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                s87 s87Var = (s87) this.b;
                s87Var.i();
                try {
                    ((vx) this.c).close();
                    if (s87Var.j()) {
                        throw s87Var.m(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!s87Var.j()) {
                        throw e;
                    }
                    throw s87Var.m(e);
                } finally {
                    s87Var.j();
                }
            default:
                ((InputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.x6f
    public final u9g m() {
        switch (this.a) {
            case 0:
                return (s87) this.b;
            default:
                return (u9g) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.source(" + ((vx) this.c) + ')';
            default:
                return "source(" + ((InputStream) this.b) + ')';
        }
    }
}
