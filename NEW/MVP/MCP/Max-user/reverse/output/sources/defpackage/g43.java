package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g43 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k53 Y;
    public final /* synthetic */ String Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g43(k53 k53Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = k53Var;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((g43) l((w68) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g43 g43Var = new g43(this.Y, this.Z, continuation);
        g43Var.X = obj;
        return g43Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g43.n(java.lang.Object):java.lang.Object");
    }
}
