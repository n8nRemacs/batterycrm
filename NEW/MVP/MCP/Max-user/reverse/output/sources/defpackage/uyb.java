package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uyb extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ wyb o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyb(wyb wybVar, String str, Continuation continuation) {
        super(2, continuation);
        this.o = wybVar;
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uyb uybVar = (uyb) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uybVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new uyb(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((f9a) this.o.d.g.getValue()).setValue(this.X);
        return qqg.a;
    }
}
