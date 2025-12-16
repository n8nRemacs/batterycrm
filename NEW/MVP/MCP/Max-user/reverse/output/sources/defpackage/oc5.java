package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oc5 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ uc5 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc5(uc5 uc5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = uc5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oc5) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oc5 oc5Var = new oc5(this.Y, continuation);
        oc5Var.X = obj;
        return oc5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        if (r1.a(r4, r21) == r5) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101 A[PHI: r22
  0x0101: PHI (r22v3 int) = (r22v2 int), (r22v2 int), (r22v5 int) binds: [B:47:0x011c, B:56:0x013f, B:43:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc5.n(java.lang.Object):java.lang.Object");
    }
}
