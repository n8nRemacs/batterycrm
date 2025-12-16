package defpackage;

import kotlin.coroutines.Continuation;
import one.me.geo.view.OneMeSupportMapFragment;

/* loaded from: classes2.dex */
public final class aeb extends dtf implements sm6 {
    public final /* synthetic */ OneMeSupportMapFragment X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeb(OneMeSupportMapFragment oneMeSupportMapFragment, Continuation continuation) {
        super(2, continuation);
        this.X = oneMeSupportMapFragment;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        aeb aebVar = (aeb) l((yeb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        aebVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aeb aebVar = new aeb(this.X, continuation);
        aebVar.o = obj;
        return aebVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.s0((yeb) this.o);
        return qqg.a;
    }
}
