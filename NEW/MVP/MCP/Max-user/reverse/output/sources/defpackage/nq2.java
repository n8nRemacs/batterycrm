package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nq2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pb2 Y;
    public final /* synthetic */ si9 Z;
    public int o;
    public final /* synthetic */ yq2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq2(pb2 pb2Var, si9 si9Var, yq2 yq2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pb2Var;
        this.Z = si9Var;
        this.s0 = yq2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nq2 nq2Var = new nq2(this.Y, this.Z, this.s0, continuation);
        nq2Var.X = obj;
        return nq2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        if (r8.s(r9, r11, r12, r13) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[PHI: r0
  0x0012: PHI (r0v7 java.lang.Object) = (r0v3 java.lang.Object), (r0v3 java.lang.Object), (r0v11 java.lang.Object) binds: [B:22:0x0064, B:29:0x0089, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            g84 r1 = defpackage.g84.a
            int r0 = r14.o
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L24
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L15
            java.lang.Object r0 = r14.X
            defpackage.g8j.b(r15)
        L12:
            r13 = r14
            goto Lac
        L15:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1d:
            defpackage.g8j.b(r15)     // Catch: java.lang.Throwable -> L21
            goto L57
        L21:
            r0 = move-exception
            r15 = r0
            goto L5b
        L24:
            defpackage.g8j.b(r15)
            java.lang.Object r15 = r14.X
            f84 r15 = (defpackage.f84) r15
            pb2 r15 = r14.Y
            si9 r0 = r14.Z
            yq2 r5 = r14.s0
            fh2 r6 = new fh2     // Catch: java.lang.Throwable -> L21
            rf2 r15 = r15.b     // Catch: java.lang.Throwable -> L21
            long r7 = r15.a     // Catch: java.lang.Throwable -> L21
            long r9 = r0.b     // Catch: java.lang.Throwable -> L21
            r10 = r9
            java.lang.Long r9 = new java.lang.Long     // Catch: java.lang.Throwable -> L21
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L21
            java.util.Set r10 = r5.O0     // Catch: java.lang.Throwable -> L21
            r11 = 0
            r12 = 0
            r6.<init>(r7, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L21
            mq2 r15 = new mq2     // Catch: java.lang.Throwable -> L21
            r15.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L21
            r14.o = r3     // Catch: java.lang.Throwable -> L21
            r5 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r15 = defpackage.yei.g(r5, r15, r14)     // Catch: java.lang.Throwable -> L21
            if (r15 != r1) goto L57
            r13 = r14
            goto Lab
        L57:
            zj2 r15 = (defpackage.zj2) r15     // Catch: java.lang.Throwable -> L21
            r0 = r15
            goto L60
        L5b:
            ipd r0 = new ipd
            r0.<init>(r15)
        L60:
            yq2 r15 = r14.s0
            boolean r3 = r0 instanceof defpackage.ipd
            if (r3 != 0) goto L12
            r3 = r0
            zj2 r3 = (defpackage.zj2) r3
            java.lang.String r5 = r15.w0
            l6b r6 = defpackage.wqi.a
            if (r6 != 0) goto L70
            goto L89
        L70:
            lg8 r7 = defpackage.lg8.d
            boolean r8 = r6.b(r7)
            if (r8 == 0) goto L89
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Media viewer. Success request media total count: "
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            r6.c(r7, r5, r8, r4)
        L89:
            if (r3 == 0) goto L12
            java.util.concurrent.atomic.AtomicReference r5 = r15.S0
            k11 r6 = new k11
            r7 = 4
            r6.<init>(r7, r3)
            r5.updateAndGet(r6)
            w63 r8 = r15.D()
            long r9 = r15.b
            java.util.Set r11 = r15.O0
            int r12 = r3.o
            r14.X = r0
            r14.o = r2
            r13 = r14
            java.lang.Object r15 = r8.s(r9, r11, r12, r13)
            if (r15 != r1) goto Lac
        Lab:
            return r1
        Lac:
            yq2 r15 = r13.s0
            java.lang.Throwable r0 = defpackage.kpd.a(r0)
            if (r0 == 0) goto Lc1
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lc0
            java.lang.String r15 = r15.w0
            java.lang.String r0 = "Media viewer. Fail request media total count."
            defpackage.wqi.e(r15, r0, r4)
            goto Lc1
        Lc0:
            throw r0
        Lc1:
            qqg r15 = defpackage.qqg.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq2.n(java.lang.Object):java.lang.Object");
    }
}
