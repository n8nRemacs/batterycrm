package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pxb extends dtf implements sm6 {
    public final /* synthetic */ wxb X;
    public final /* synthetic */ String Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pxb(wxb wxbVar, String str, Continuation continuation) {
        super(2, continuation);
        this.X = wxbVar;
        this.Y = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pxb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pxb(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0119, code lost:
    
        if (r14 == r5) goto L38;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxb.n(java.lang.Object):java.lang.Object");
    }
}
