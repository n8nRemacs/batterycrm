package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ltf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ytf Y;
    public final /* synthetic */ bug Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltf(ytf ytfVar, bug bugVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ytfVar;
        this.Z = bugVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ltf) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ltf ltfVar = new ltf(this.Y, this.Z, continuation);
        ltfVar.X = obj;
        return ltfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f1, code lost:
    
        if (r2.a(r13, r12) == r1) goto L42;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ltf.n(java.lang.Object):java.lang.Object");
    }
}
