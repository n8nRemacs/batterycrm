package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw3(tw3 tw3Var, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fw3(this.X, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            tw3 r0 = r14.X
            jve r1 = r0.d
            long r2 = r0.n
            int r4 = r14.o
            qqg r5 = defpackage.qqg.a
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            g84 r10 = defpackage.g84.a
            if (r4 == 0) goto L32
            if (r4 == r9) goto L2e
            if (r4 == r8) goto L2a
            if (r4 == r7) goto L26
            if (r4 != r6) goto L1e
            defpackage.g8j.b(r15)
            return r5
        L1e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L26:
            defpackage.g8j.b(r15)
            goto L93
        L2a:
            defpackage.g8j.b(r15)
            goto L75
        L2e:
            defpackage.g8j.b(r15)
            goto L45
        L32:
            defpackage.g8j.b(r15)
            k18 r15 = r0.w
            java.lang.Object r15 = r15.getValue()
            n04 r15 = (defpackage.n04) r15
            r14.o = r9
            r15.a(r2)
            if (r5 != r10) goto L45
            goto L9d
        L45:
            r15 = 48
            float r15 = (float) r15
            android.content.res.Resources r4 = defpackage.vw4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r15 = r15 * r4
            int r15 = defpackage.kti.d(r15)
            jve r4 = r0.e
            tgc r9 = new tgc
            int r11 = defpackage.u8b.z0
            n5g r12 = new n5g
            r12.<init>(r11)
            i62 r11 = new i62
            r13 = 16
            r11.<init>(r13, r0)
            r9.<init>(r12, r15, r11)
            r14.o = r8
            java.lang.Object r15 = r4.a(r9, r14)
            if (r15 != r10) goto L75
            goto L9d
        L75:
            k18 r15 = r0.p
            java.lang.Object r15 = r15.getValue()
            w63 r15 = (defpackage.w63) r15
            pb2 r15 = r15.n(r2)
            if (r15 == 0) goto L93
            long r2 = r15.a
            xfc r15 = new xfc
            r15.<init>(r2)
            r14.o = r7
            java.lang.Object r15 = r1.a(r15, r14)
            if (r15 != r10) goto L93
            goto L9d
        L93:
            jc3 r15 = defpackage.jc3.b
            r14.o = r6
            java.lang.Object r15 = r1.a(r15, r14)
            if (r15 != r10) goto L9e
        L9d:
            return r10
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fw3.n(java.lang.Object):java.lang.Object");
    }
}
