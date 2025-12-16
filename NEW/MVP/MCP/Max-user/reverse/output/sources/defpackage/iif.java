package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iif extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ kif Z;
    public ahf o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iif(kif kifVar, Continuation continuation) {
        super(2, continuation);
        this.Z = kifVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iif) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iif iifVar = new iif(this.Z, continuation);
        iifVar.Y = obj;
        return iifVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iif.n(java.lang.Object):java.lang.Object");
    }
}
