package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bo2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ jo2 Y;
    public final /* synthetic */ yb9 Z;
    public w10 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo2(jo2 jo2Var, yb9 yb9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jo2Var;
        this.Z = yb9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bo2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bo2(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        if (defpackage.svi.i(r1, r3, r31) == r9) goto L96;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bo2.n(java.lang.Object):java.lang.Object");
    }
}
