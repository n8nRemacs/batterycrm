package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gv3 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ iv3 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv3(iv3 iv3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = iv3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gv3) l((String) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gv3 gv3Var = new gv3(this.Y, continuation);
        gv3Var.X = obj;
        return gv3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv3.n(java.lang.Object):java.lang.Object");
    }
}
