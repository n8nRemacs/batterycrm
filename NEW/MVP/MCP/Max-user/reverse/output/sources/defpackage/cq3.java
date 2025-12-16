package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cq3 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ dq3 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq3(String str, dq3 dq3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = dq3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cq3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cq3 cq3Var = new cq3(this.Y, this.Z, continuation);
        cq3Var.X = obj;
        return cq3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            dq3 r0 = r12.Z
            tcf r1 = r0.Y
            int r2 = r12.o
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 1
            r8 = 2
            qqg r9 = defpackage.qqg.a
            g84 r10 = defpackage.g84.a
            if (r2 == 0) goto L3c
            if (r2 == r7) goto L38
            if (r2 == r8) goto L34
            if (r2 == r6) goto L30
            if (r2 == r5) goto L28
            if (r2 != r4) goto L20
            defpackage.g8j.b(r13)
            return r9
        L20:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L28:
            java.lang.Object r1 = r12.X
            f84 r1 = (defpackage.f84) r1
            defpackage.g8j.b(r13)
            goto L8c
        L30:
            defpackage.g8j.b(r13)
            return r9
        L34:
            defpackage.g8j.b(r13)
            goto L75
        L38:
            defpackage.g8j.b(r13)
            goto L64
        L3c:
            defpackage.g8j.b(r13)
            java.lang.Object r13 = r12.X
            f84 r13 = (defpackage.f84) r13
            bwf r2 = defpackage.if5.a
            java.lang.String r2 = r12.Y
            java.lang.String r2 = defpackage.if5.a(r2)
            boolean r11 = defpackage.d7j.f(r13)
            if (r11 != 0) goto L52
            goto La5
        L52:
            java.lang.String r11 = r0.b
            boolean r2 = defpackage.fni.a(r2, r11)
            if (r2 != 0) goto L7f
            r12.o = r7
            aq3 r13 = defpackage.aq3.c
            r1.m(r3, r13)
            if (r9 != r10) goto L64
            goto La4
        L64:
            int r13 = defpackage.s65.d
            y65 r13 = defpackage.y65.SECONDS
            long r4 = defpackage.v9j.h(r8, r13)
            r12.o = r8
            java.lang.Object r13 = defpackage.s8j.d(r4, r12)
            if (r13 != r10) goto L75
            goto La4
        L75:
            r12.o = r6
            aq3 r13 = defpackage.aq3.a
            r1.m(r3, r13)
            if (r9 != r10) goto La5
            goto La4
        L7f:
            r12.X = r13
            r12.o = r5
            aq3 r2 = defpackage.aq3.b
            r1.m(r3, r2)
            if (r9 != r10) goto L8b
            goto La4
        L8b:
            r1 = r13
        L8c:
            boolean r13 = defpackage.d7j.f(r1)
            if (r13 != 0) goto L93
            goto La5
        L93:
            r12.X = r3
            r12.o = r4
            yy7[] r13 = defpackage.dq3.v0
            bq3 r13 = new bq3
            r13.<init>(r0, r3)
            java.lang.Object r13 = defpackage.d7j.d(r13, r12)
            if (r13 != r10) goto La5
        La4:
            return r10
        La5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq3.n(java.lang.Object):java.lang.Object");
    }
}
