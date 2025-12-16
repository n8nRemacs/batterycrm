package defpackage;

/* loaded from: classes2.dex */
public final class ks2 {
    public final nxg a;
    public final String b;
    public final bwf c;
    public final bwf d;
    public final k18 e;
    public final k18 f;

    public ks2(bwf bwfVar, bwf bwfVar2, k18 k18Var, nxg nxgVar) {
        bwf bwfVarD = e03.a.getAccessor().d(48);
        this.a = nxgVar;
        this.b = ks2.class.getName();
        this.c = bwfVar;
        this.d = bwfVar2;
        this.e = k18Var;
        this.f = bwfVarD;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hs2 a(defpackage.pb2 r9) {
        /*
            r8 = this;
            bwf r0 = r8.c
            java.lang.Object r0 = r0.getValue()
            e23 r0 = (defpackage.e23) r0
            hs2 r1 = r0.a(r9)
            oc2 r9 = new oc2
            int r0 = r1.y0
            boolean r2 = r1.n()
            boolean r3 = r1.o()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L25
            boolean r3 = r1.p()
            if (r3 == 0) goto L23
            goto L25
        L23:
            r3 = r5
            goto L26
        L25:
            r3 = r4
        L26:
            r9.<init>(r0, r2, r3)
            k18 r0 = r8.f
            java.lang.Object r0 = r0.getValue()
            rt5 r0 = (defpackage.rt5) r0
            gu5 r0 = (defpackage.gu5) r0
            long r2 = r0.n()
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L3f
            r6 = r4
            goto L40
        L3f:
            r6 = r5
        L40:
            r0 = 0
            if (r6 != 0) goto L5c
            java.lang.CharSequence r2 = r1.X
            int r3 = r2.length()
            if (r3 <= 0) goto L4c
            goto L4d
        L4c:
            r2 = r0
        L4d:
            if (r2 == 0) goto L5c
            bwf r3 = r8.d
            java.lang.Object r3 = r3.getValue()
            nc2 r3 = (defpackage.nc2) r3
            u4g r2 = defpackage.cie.a(r3, r2, r9)
            goto L5d
        L5c:
            r2 = r0
        L5d:
            if (r6 != 0) goto L79
            java.lang.CharSequence r3 = r1.Z
            if (r3 == 0) goto L79
            int r4 = r3.length()
            if (r4 <= 0) goto L6a
            goto L6b
        L6a:
            r3 = r0
        L6b:
            if (r3 == 0) goto L79
            k18 r0 = r8.e
            java.lang.Object r0 = r0.getValue()
            bpg r0 = (defpackage.bpg) r0
            u4g r0 = defpackage.cie.a(r0, r3, r9)
        L79:
            r5 = r0
            r7 = 1047023(0xff9ef, float:1.467192E-39)
            r4 = 0
            r3 = 0
            hs2 r9 = defpackage.hs2.l(r1, r2, r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks2.a(pb2):hs2");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r9, defpackage.q44 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.js2
            if (r0 == 0) goto L13
            r0 = r10
            js2 r0 = (defpackage.js2) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            js2 r0 = new js2
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.d
            g84 r1 = defpackage.g84.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.g8j.b(r10)
            goto L81
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.g8j.b(r10)
            java.lang.String r10 = r8.b
            l6b r2 = defpackage.wqi.a
            r4 = 0
            if (r2 != 0) goto L3a
            goto L4f
        L3a:
            lg8 r5 = defpackage.lg8.d
            boolean r6 = r2.b(r5)
            if (r6 == 0) goto L4f
            int r6 = r9.size()
            java.lang.String r7 = "ChatModelConverter.toModelsAsync() START: chatsCount="
            java.lang.String r6 = defpackage.ho7.f(r6, r7)
            r2.c(r5, r10, r6, r4)
        L4f:
            nxg r10 = r8.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.we3.q(r9, r5)
            r2.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L60:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L78
            java.lang.Object r5 = r9.next()
            is2 r6 = new is2
            r6.<init>(r5, r4, r8)
            r5 = 3
            cs4 r5 = defpackage.svi.b(r10, r4, r6, r5)
            r2.add(r5)
            goto L60
        L78:
            r0.X = r3
            java.lang.Object r10 = defpackage.hui.b(r2, r0)
            if (r10 != r1) goto L81
            return r1
        L81:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r9 = defpackage.ue3.E(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks2.b(java.util.List, q44):java.lang.Object");
    }
}
