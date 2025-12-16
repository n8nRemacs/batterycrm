package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuGeneralPageScreen;

/* loaded from: classes2.dex */
public final class xu4 extends dtf implements sm6 {
    public final /* synthetic */ DevMenuGeneralPageScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu4(DevMenuGeneralPageScreen devMenuGeneralPageScreen, Continuation continuation) {
        super(2, continuation);
        this.X = devMenuGeneralPageScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xu4 xu4Var = (xu4) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xu4Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xu4 xu4Var = new xu4(this.X, continuation);
        xu4Var.o = obj;
        return xu4Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.d.E((List) this.o);
        return qqg.a;
    }
}
