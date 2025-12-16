package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes2.dex */
public final class xu8 extends dtf implements sm6 {
    public final /* synthetic */ MediaBarWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.X = mediaBarWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xu8 xu8Var = (xu8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xu8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xu8 xu8Var = new xu8(continuation, this.X);
        xu8Var.o = obj;
        return xu8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        za9 za9Var = (za9) this.o;
        if (za9Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        yy7[] yy7VarArr = MediaBarWidget.c1;
        xfh.r(this.X.N0().x0, new xt8(za9Var.a));
        return qqg.a;
    }
}
