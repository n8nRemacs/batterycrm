package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mw9 extends dtf implements sm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ yw9 Y;
    public final /* synthetic */ k18 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw9(k18 k18Var, yw9 yw9Var, k18 k18Var2, Continuation continuation) {
        super(2, continuation);
        this.X = k18Var;
        this.Y = yw9Var;
        this.Z = k18Var2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mw9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mw9(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r8 == r4) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            int r0 = r7.o
            r1 = 2
            r2 = 0
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r1) goto L11
            defpackage.g8j.b(r8)
            goto L51
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            defpackage.g8j.b(r8)
            goto L3d
        L1d:
            defpackage.g8j.b(r8)
            k18 r8 = r7.X
            java.lang.Object r8 = r8.getValue()
            l24 r8 = (defpackage.l24) r8
            r7.o = r3
            r8.getClass()
            hk1 r0 = new hk1
            r3 = 27
            r0.<init>(r3, r8)
            bd5 r8 = defpackage.bd5.a
            java.lang.Object r8 = defpackage.vmi.i(r8, r0, r7)
            if (r8 != r4) goto L3d
            goto L50
        L3d:
            ku3 r8 = (defpackage.ku3) r8
            lw9 r0 = new lw9
            k18 r3 = r7.Z
            r0.<init>(r3, r8, r2)
            r7.o = r1
            r5 = 100
            java.lang.Object r8 = defpackage.yei.g(r5, r0, r7)
            if (r8 != r4) goto L51
        L50:
            return r4
        L51:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            if (r8 == 0) goto L70
            yw9 r0 = r7.Y
            tcf r0 = r0.k
            java.lang.Object r1 = r0.getValue()
            ltb r1 = (defpackage.ltb) r1
            sk r1 = r1.a()
            androidx.core.graphics.drawable.IconCompat r8 = androidx.core.graphics.drawable.IconCompat.b(r8)
            r1.o = r8
            ltb r8 = r1.a()
            r0.m(r2, r8)
        L70:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw9.n(java.lang.Object):java.lang.Object");
    }
}
