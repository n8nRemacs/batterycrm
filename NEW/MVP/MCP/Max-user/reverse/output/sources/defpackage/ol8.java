package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;

/* loaded from: classes.dex */
public final class ol8 extends dtf implements sm6 {
    public final /* synthetic */ MainActivity o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.o = mainActivity;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ol8 ol8Var = (ol8) l(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ol8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ol8(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        MainActivity mainActivity = this.o;
        mainActivity.W0.b(mainActivity);
        return qqg.a;
    }
}
