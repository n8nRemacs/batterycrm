package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class ql8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.o = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ql8 ql8Var = (ql8) l((Boolean) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ql8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ql8(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.o.N();
        return qqg.a;
    }
}
