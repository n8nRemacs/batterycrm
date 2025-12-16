package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class pl8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity X;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        pl8 pl8Var = (pl8) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pl8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pl8 pl8Var = new pl8(this.X, continuation);
        pl8Var.o = ((Boolean) obj).booleanValue();
        return pl8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.setRequestedOrientation(this.o ? 2 : 1);
        return qqg.a;
    }
}
