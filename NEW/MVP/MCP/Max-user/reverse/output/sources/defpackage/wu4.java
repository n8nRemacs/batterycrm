package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;

/* loaded from: classes2.dex */
public final class wu4 extends dtf implements sm6 {
    public final /* synthetic */ DevMenuFeatureTogglesPageScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu4(DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen, Continuation continuation) {
        super(2, continuation);
        this.X = devMenuFeatureTogglesPageScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wu4 wu4Var = (wu4) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wu4Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wu4 wu4Var = new wu4(this.X, continuation);
        wu4Var.o = obj;
        return wu4Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        List list = (List) this.o;
        DevMenuFeatureTogglesPageScreen devMenuFeatureTogglesPageScreen = this.X;
        devMenuFeatureTogglesPageScreen.o.F(list, new vu4(devMenuFeatureTogglesPageScreen, list));
        return qqg.a;
    }
}
