package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nwh extends dtf implements sm6 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ owh Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwh(boolean z, owh owhVar, Continuation continuation) {
        super(2, continuation);
        this.X = z;
        this.Y = owhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nwh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nwh(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (defpackage.k7j.b(r2.a, new defpackage.plh(r2, r14, 1), r13) == r1) goto L34;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwh.n(java.lang.Object):java.lang.Object");
    }
}
