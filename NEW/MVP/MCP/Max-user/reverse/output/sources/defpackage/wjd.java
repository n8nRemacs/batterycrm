package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wjd extends dtf implements sm6 {
    public final /* synthetic */ xbe X;
    public final /* synthetic */ xjd Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjd(xbe xbeVar, xjd xjdVar, Continuation continuation) {
        super(2, continuation);
        this.X = xbeVar;
        this.Y = xjdVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wjd) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wjd(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r0.a(r12, r7, r11) == r6) goto L28;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wjd.n(java.lang.Object):java.lang.Object");
    }
}
