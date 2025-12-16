package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hbg implements cs3 {
    public final bwf a;
    public final k18 b;
    public final tgg c;
    public final String d = hbg.class.getName();
    public final wce e;

    public hbg(bwf bwfVar, k18 k18Var, tgg tggVar) {
        this.a = bwfVar;
        this.b = k18Var;
        this.c = tggVar;
        int i = hr3.$EnumSwitchMapping$0[tggVar.a().ordinal()];
        int i2 = (i == 1 || i == 2) ? 10 : 7;
        int i3 = xce.a;
        this.e = new wce(i2);
    }

    @Override // defpackage.cs3
    public final Object a(Continuation continuation) {
        return qqg.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(2:13|14)(2:15|49))(5:16|50|17|43|44))(1:21))(5:22|(2:25|(1:27))|28|(1:31)|48)|32|(1:38)(1:(1:36)(1:37))|39|52|40) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c5, code lost:
    
        if (r13.invoke(r14, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cs3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ly5 r13, defpackage.q44 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbg.b(ly5, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.cs3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ebg r5, defpackage.q44 r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.gbg
            if (r0 == 0) goto L13
            r0 = r6
            gbg r0 = (defpackage.gbg) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            gbg r0 = new gbg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            hbg r5 = r0.d
            defpackage.g8j.b(r6)
            goto L40
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.g8j.b(r6)
            r0.d = r4
            r0.Y = r2
            java.lang.Object r5 = r5.a(r0)
            g84 r6 = defpackage.g84.a
            if (r5 != r6) goto L3f
            return r6
        L3f:
            r5 = r4
        L40:
            wce r5 = r5.e
            r5.c()
            qqg r5 = defpackage.qqg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbg.c(ebg, q44):java.lang.Object");
    }
}
