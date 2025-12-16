package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lc6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ oc6 Y;
    public final /* synthetic */ f86 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc6(oc6 oc6Var, f86 f86Var, Continuation continuation) {
        super(2, continuation);
        this.Y = oc6Var;
        this.Z = f86Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((lc6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lc6 lc6Var = new lc6(this.Y, this.Z, continuation);
        lc6Var.X = obj;
        return lc6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        if (r0 == r2) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lc6.n(java.lang.Object):java.lang.Object");
    }
}
