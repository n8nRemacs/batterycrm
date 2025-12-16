package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ut6 {
    public static final long[] g = new long[0];
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;

    public ut6(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.e = k18Var5;
        this.f = k18Var6;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:22:0x0072, B:27:0x0079, B:30:0x0086, B:32:0x008e), top: B:39:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r15, defpackage.br2 r17, long r18, java.lang.String r20, defpackage.q44 r21) {
        /*
            r14 = this;
            r0 = r21
            boolean r1 = r0 instanceof defpackage.tt6
            if (r1 == 0) goto L15
            r1 = r0
            tt6 r1 = (defpackage.tt6) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            tt6 r1 = new tt6
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.o
            g84 r2 = defpackage.g84.a
            int r3 = r1.Y
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L34
            if (r3 != r5) goto L2c
            ut6 r1 = r1.d
            defpackage.g8j.b(r0)     // Catch: java.lang.Throwable -> L79
            goto L70
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L34:
            defpackage.g8j.b(r0)
            fh2 r6 = new fh2
            r0 = r17
            java.lang.String r9 = r0.a
            k18 r0 = r14.b
            java.lang.Object r0 = r0.getValue()
            age r0 = (defpackage.age) r0
            l5c r0 = (defpackage.l5c) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f87maxreadmarks
            r7 = 300(0x12c, float:4.2E-43)
            long r7 = (long) r7
            long r7 = r0.m(r3, r7)
            int r12 = (int) r7
            r7 = r15
            r10 = r18
            r13 = r20
            r6.<init>(r7, r9, r10, r12, r13)
            k18 r0 = r14.a     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L78
            hwa r0 = (defpackage.hwa) r0     // Catch: java.lang.Throwable -> L78
            r1.d = r14     // Catch: java.lang.Throwable -> L78
            r1.Y = r5     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r0.F(r6, r1)     // Catch: java.lang.Throwable -> L78
            if (r0 != r2) goto L6f
            return r2
        L6f:
            r1 = r14
        L70:
            cr2 r0 = (defpackage.cr2) r0     // Catch: java.lang.Throwable -> L79
            r1.b(r0)     // Catch: java.lang.Throwable -> L76
            return r0
        L76:
            r0 = move-exception
            goto L94
        L78:
            r1 = r14
        L79:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L76
            l6b r2 = defpackage.wqi.a     // Catch: java.lang.Throwable -> L76
            if (r2 != 0) goto L86
            goto La5
        L86:
            lg8 r3 = defpackage.lg8.Y     // Catch: java.lang.Throwable -> L76
            boolean r5 = r2.b(r3)     // Catch: java.lang.Throwable -> L76
            if (r5 == 0) goto La5
            java.lang.String r5 = "fail to get chat members"
            r2.c(r3, r0, r5, r4)     // Catch: java.lang.Throwable -> L76
            goto La5
        L94:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail"
            defpackage.wqi.e(r1, r2, r0)
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto La6
        La5:
            return r4
        La6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut6.a(long, br2, long, java.lang.String, q44):java.lang.Object");
    }

    public final void b(cr2 cr2Var) {
        if (cr2Var.c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(cr2Var.c.size());
        xs xsVar = new xs(cr2Var.c.size());
        Iterator it = cr2Var.c.iterator();
        while (it.hasNext()) {
            ar2 ar2Var = (ar2) it.next();
            gx3 gx3Var = ar2Var.a;
            arrayList.add(gx3Var);
            xsVar.add(Long.valueOf(gx3Var.a));
            h8c h8cVar = (h8c) this.d.getValue();
            h8cVar.c().f(gx3Var.a, po8.j(ar2Var.b));
        }
        if (!arrayList.isEmpty()) {
            ((qv3) this.c.getValue()).r(arrayList, g);
        }
        if (!xsVar.isEmpty()) {
            ((kq7) this.e.getValue()).a(xsVar);
        }
        ((tw0) this.f.getValue()).c(new t24(0L, xsVar));
    }
}
