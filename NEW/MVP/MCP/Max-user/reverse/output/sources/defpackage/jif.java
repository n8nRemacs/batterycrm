package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jif extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ String Z;
    public ahf o;
    public final /* synthetic */ kif s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jif(String str, kif kifVar, Continuation continuation) {
        super(2, continuation);
        this.Z = str;
        this.s0 = kifVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jif) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jif jifVar = new jif(this.Z, this.s0, continuation);
        jifVar.Y = obj;
        return jifVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jif.n(java.lang.Object):java.lang.Object");
    }
}
