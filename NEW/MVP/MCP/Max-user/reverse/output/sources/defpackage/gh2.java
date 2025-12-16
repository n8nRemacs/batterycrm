package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gh2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hh2 Y;
    public final /* synthetic */ ih2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh2(hh2 hh2Var, ih2 ih2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = hh2Var;
        this.Z = ih2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gh2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gh2 gh2Var = new gh2(this.Y, this.Z, continuation);
        gh2Var.X = obj;
        return gh2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            g84 r1 = defpackage.g84.a
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L14
            java.lang.Object r1 = r0.X
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r20)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L40
            goto L5a
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1c:
            defpackage.g8j.b(r20)
            java.lang.Object r2 = r0.X
            f84 r2 = (defpackage.f84) r2
            hh2 r5 = r0.Y     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            k1a r5 = r5.o()     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            ih2 r6 = r0.Z     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            int r7 = defpackage.s65.d     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            y65 r7 = defpackage.y65.SECONDS     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            r8 = 2
            long r7 = defpackage.v9j.h(r8, r7)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            r0.X = r2     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            r0.o = r4     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            java.lang.Object r2 = r5.l(r6, r7, r0)     // Catch: ru.ok.tamtam.errors.TamErrorException -> L3f
            if (r2 != r1) goto L5a
            return r1
        L3f:
            r1 = r2
        L40:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            l6b r2 = defpackage.wqi.a
            if (r2 != 0) goto L4d
            goto L5a
        L4d:
            lg8 r4 = defpackage.lg8.Y
            boolean r5 = r2.b(r4)
            if (r5 == 0) goto L5a
            java.lang.String r5 = "fail to get missed contacts for chat history"
            r2.c(r4, r1, r5, r3)
        L5a:
            hh2 r1 = r0.Y
            tm r1 = r1.c
            if (r1 == 0) goto L61
            goto L62
        L61:
            r1 = r3
        L62:
            k18 r1 = r1.T
            java.lang.Object r1 = r1.getValue()
            r4 = r1
            qh2 r4 = (defpackage.qh2) r4
            hh2 r1 = r0.Y
            long r5 = r1.a
            long r7 = r1.d
            long r9 = r1.X
            int r11 = r1.s0
            int r14 = r1.t0
            long r12 = r1.u0
            ih2 r2 = r0.Z
            rs4 r1 = r1.w0
            r15 = r12
            r12 = 0
            r18 = r1
            r17 = r2
            r4.a(r5, r7, r9, r11, r12, r14, r15, r17, r18)
            hh2 r1 = r0.Y
            long r4 = r1.Y
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto Laf
            a3g r2 = r1.r()
            r2g r2 = r2.j(r4)
            if (r2 == 0) goto Laf
            tm r1 = r1.c
            if (r1 == 0) goto La0
            r3 = r1
        La0:
            k18 r1 = r3.h
            java.lang.Object r1 = r1.getValue()
            c6i r1 = (defpackage.c6i) r1
            tsb r2 = r2.f
            rhe r2 = (defpackage.rhe) r2
            r1.b(r2)
        Laf:
            qqg r1 = defpackage.qqg.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh2.n(java.lang.Object):java.lang.Object");
    }
}
