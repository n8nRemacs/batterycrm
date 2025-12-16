package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.forward.ForwardPickerScreen;

/* loaded from: classes.dex */
public final class rg6 extends dtf implements sm6 {
    public final /* synthetic */ ForwardPickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg6(Continuation continuation, ForwardPickerScreen forwardPickerScreen) {
        super(2, continuation);
        this.X = forwardPickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rg6 rg6Var = (rg6) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rg6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rg6 rg6Var = new rg6(continuation, this.X);
        rg6Var.o = obj;
        return rg6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((Boolean) this.o).getClass();
        yy7[] yy7VarArr = ForwardPickerScreen.I0;
        ForwardPickerScreen forwardPickerScreen = this.X;
        forwardPickerScreen.M0().setStartIconDrawable(((cg6) forwardPickerScreen.I0().c).g());
        return qqg.a;
    }
}
