package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zv2 extends dtf implements sm6 {
    public final /* synthetic */ zx2 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv2(zx2 zx2Var, Continuation continuation) {
        super(2, continuation);
        this.o = zx2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zv2 zv2Var = (zv2) l((rx5) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zv2(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xfh.r(this.o.d1, new iw2(n1b.p, new Integer(n1b.o), null, 4));
        return qqg.a;
    }
}
