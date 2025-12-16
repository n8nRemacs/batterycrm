package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pg2 extends dtf implements sm6 {
    public final /* synthetic */ r85 X;
    public final /* synthetic */ qg2 Y;
    public final /* synthetic */ pb2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg2(r85 r85Var, qg2 qg2Var, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.X = r85Var;
        this.Y = qg2Var;
        this.Z = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pg2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pg2(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            r85 r0 = r14.X
            java.lang.String r1 = r0.d
            qg2 r2 = r14.Y
            tcf r3 = r2.i
            int r4 = r14.o
            pb2 r5 = r14.Z
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L1e
            if (r4 != r7) goto L16
            defpackage.g8j.b(r15)
            goto L4a
        L16:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1e:
            defpackage.g8j.b(r15)
            java.lang.Object r15 = r3.getValue()
            r85 r15 = (defpackage.r85) r15
            if (r15 == 0) goto L2c
            java.lang.String r15 = r15.d
            goto L2d
        L2c:
            r15 = r6
        L2d:
            boolean r15 = defpackage.fni.a(r1, r15)
            if (r15 != 0) goto L4a
            if (r1 == 0) goto L4a
            k18 r15 = r2.v
            java.lang.Object r15 = r15.getValue()
            c82 r15 = (defpackage.c82) r15
            long r8 = r5.a
            r14.o = r7
            java.lang.Object r15 = r15.a(r8, r1, r14)
            g84 r1 = defpackage.g84.a
            if (r15 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r15 = r0.f
            if (r15 == 0) goto L58
            java.lang.CharSequence r15 = defpackage.vmf.c0(r15)
            java.lang.String r15 = r15.toString()
            r13 = r15
            goto L59
        L58:
            r13 = r6
        L59:
            r15 = 0
            if (r13 == 0) goto L76
            int r0 = r13.length()
            if (r0 != 0) goto L76
            java.lang.Object r0 = r3.getValue()
            r85 r0 = (defpackage.r85) r0
            if (r0 == 0) goto L6d
            java.lang.String r0 = r0.f
            goto L6e
        L6d:
            r0 = r6
        L6e:
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L76
            r0 = r7
            goto L77
        L76:
            r0 = r15
        L77:
            if (r13 == 0) goto L91
            int r1 = r13.length()
            if (r1 != 0) goto L80
            goto L91
        L80:
            java.lang.Object r1 = r3.getValue()
            r85 r1 = (defpackage.r85) r1
            if (r1 == 0) goto L8a
            java.lang.String r6 = r1.f
        L8a:
            boolean r1 = defpackage.fni.a(r13, r6)
            if (r1 != 0) goto L91
            goto L92
        L91:
            r7 = r15
        L92:
            if (r0 != 0) goto L96
            if (r7 == 0) goto La8
        L96:
            k18 r15 = r2.q
            java.lang.Object r15 = r15.getValue()
            r8 = r15
            hwa r8 = (defpackage.hwa) r8
            long r9 = r5.a
            rf2 r15 = r5.b
            long r11 = r15.a
            r8.h(r9, r11, r13)
        La8:
            qqg r15 = defpackage.qqg.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg2.n(java.lang.Object):java.lang.Object");
    }
}
