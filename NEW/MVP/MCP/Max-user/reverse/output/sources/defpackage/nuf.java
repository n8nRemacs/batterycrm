package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nuf extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ l2h Y;
    public final /* synthetic */ quf Z;
    public k2h o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuf(quf qufVar, l2h l2hVar, Continuation continuation) {
        super(2, continuation);
        this.Y = l2hVar;
        this.Z = qufVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((nuf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new nuf(this.Z, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r11 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef A[RETURN] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nuf.n(java.lang.Object):java.lang.Object");
    }
}
