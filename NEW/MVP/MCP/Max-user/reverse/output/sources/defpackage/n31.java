package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class n31 extends dtf implements wm6 {
    public /* synthetic */ boolean X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n31(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.o;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        switch (i) {
            case 0:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                n31 n31Var = new n31(4, (Continuation) obj4, 0);
                n31Var.X = zBooleanValue;
                n31Var.Y = zBooleanValue2;
                n31Var.Z = (ca) obj3;
                return n31Var.n(qqg.a);
            default:
                boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                n31 n31Var2 = new n31(4, (Continuation) obj4, 1);
                n31Var2.X = zBooleanValue;
                n31Var2.Z = (tn9) obj2;
                n31Var2.Y = zBooleanValue3;
                return n31Var2.n(qqg.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            switch(r0) {
                case 0: goto L33;
                default: goto L5;
            }
        L5:
            defpackage.g8j.b(r7)
            boolean r7 = r6.X
            java.lang.Object r0 = r6.Z
            tn9 r0 = (defpackage.tn9) r0
            boolean r1 = r6.Y
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L26
            android.view.MotionEvent r0 = r0.b
            int r4 = r0.getAction()
            r5 = 3
            if (r4 == r5) goto L26
            int r0 = r0.getAction()
            if (r0 != r3) goto L24
            goto L26
        L24:
            r0 = r2
            goto L27
        L26:
            r0 = r3
        L27:
            if (r7 != 0) goto L2e
            if (r1 != 0) goto L2e
            if (r0 == 0) goto L2e
            r2 = r3
        L2e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L33:
            defpackage.g8j.b(r7)
            boolean r7 = r6.X
            boolean r0 = r6.Y
            java.lang.Object r1 = r6.Z
            ca r1 = (defpackage.ca) r1
            boolean r2 = r1.a
            r3 = 0
            if (r2 != 0) goto L48
            boolean r1 = r1.c
            if (r1 != 0) goto L48
            goto L4d
        L48:
            if (r7 == 0) goto L4d
            if (r0 == 0) goto L4d
            r3 = 1
        L4d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n31.n(java.lang.Object):java.lang.Object");
    }
}
