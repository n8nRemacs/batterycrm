package defpackage;

import kotlin.coroutines.Continuation;
import one.me.pinbars.PinBarsWidget;

/* loaded from: classes2.dex */
public final class e0c extends dtf implements sm6 {
    public final /* synthetic */ PinBarsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0c(Continuation continuation, PinBarsWidget pinBarsWidget) {
        super(2, continuation);
        this.X = pinBarsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        e0c e0cVar = (e0c) l((ei4) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e0c e0cVar = new e0c(continuation, this.X);
        e0cVar.o = obj;
        return e0cVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        k0c.c.s0((ei4) this.o);
        return qqg.a;
    }
}
