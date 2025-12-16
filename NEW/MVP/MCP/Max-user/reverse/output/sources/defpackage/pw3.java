package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pw3 extends dtf implements sm6 {
    public final /* synthetic */ pxg X;
    public final /* synthetic */ tw3 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw3(tw3 tw3Var, pxg pxgVar, Continuation continuation) {
        super(2, continuation);
        this.o = tw3Var;
        this.X = pxgVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pw3(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        hwa hwaVar = (hwa) this.o.z.getValue();
        oxg oxgVar = new oxg();
        oxgVar.q = this.X;
        return new Long(hwaVar.o(new qxg(oxgVar)));
    }
}
