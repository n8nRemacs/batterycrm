package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class zy {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final hwa b;
    public final ve2 c;
    public final z7c d;

    public zy(hwa hwaVar, ve2 ve2Var, z7c z7cVar) {
        this.b = hwaVar;
        this.c = ve2Var;
        this.d = z7cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.si9 r13) {
        /*
            r12 = this;
            xi9 r0 = r13.s0
            long r1 = r13.a
            jdc r3 = r13.x0
            xi9 r4 = defpackage.xi9.d
            if (r0 == r4) goto Lc1
            xi9 r4 = defpackage.xi9.Y
            if (r0 == r4) goto Lc1
            xi9 r4 = defpackage.xi9.c
            if (r0 != r4) goto L14
            goto Lc1
        L14:
            r0 = 0
            w10 r4 = r3.o(r0)
            z7c r5 = r12.d
            r6 = 0
            if (r4 == 0) goto L55
            boolean r8 = r4.t
            if (r8 == 0) goto L24
            goto L55
        L24:
            o10 r8 = r4.g
            if (r8 == 0) goto L2d
            w10 r8 = r8.g
            if (r8 == 0) goto L2d
            r4 = r8
        L2d:
            boolean r8 = r4.t
            if (r8 == 0) goto L32
            goto L55
        L32:
            v10 r4 = r4.d
            if (r4 != 0) goto L37
            goto L55
        L37:
            boolean r8 = r4.g
            ry r9 = r4.o
            if (r9 != 0) goto L40
            if (r8 != 0) goto L40
            goto L76
        L40:
            if (r8 == 0) goto L55
            long r8 = r4.c
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 > 0) goto L55
            pe8 r8 = r5.a
            long r8 = r8.j()
            long r10 = r4.l
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L55
            goto L76
        L55:
            w10 r0 = r3.o(r0)
            if (r0 == 0) goto Lc1
            boolean r3 = r0.t
            if (r3 == 0) goto L60
            goto Lc1
        L60:
            boolean r0 = defpackage.ssi.h(r0)
            if (r0 == 0) goto Lc1
            long r3 = r13.c
            sxg r0 = r5.c
            java.lang.String r5 = "app.update.to.version.with.file.video.date"
            n18 r0 = r0.g
            long r5 = r0.getLong(r5, r6)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto Lc1
        L76:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r3 = r12.a
            java.lang.Object r0 = r3.get(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L94
            long r6 = r0.longValue()
            long r4 = r4 - r6
            r6 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto Lc1
        L94:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.put(r0, r1)
            ve2 r0 = r12.c
            long r1 = r13.Z
            pb2 r0 = r0.M(r1)
            if (r0 != 0) goto Lae
            goto Lc1
        Lae:
            rf2 r0 = r0.b
            long r0 = r0.a
            long r2 = r13.b
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            java.util.List r13 = java.util.Collections.singletonList(r13)
            hwa r2 = r12.b
            r2.y(r0, r13)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy.a(si9):void");
    }
}
