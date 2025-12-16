package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qp3 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ vp3 Y;
    public final /* synthetic */ String Z;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp3(vp3 vp3Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = vp3Var;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qp3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qp3(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        if (r14.a(r1, r0, r13) != r10) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0108, code lost:
    
        if (r14.d(r2, r13) != r10) goto L49;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qp3.n(java.lang.Object):java.lang.Object");
    }
}
