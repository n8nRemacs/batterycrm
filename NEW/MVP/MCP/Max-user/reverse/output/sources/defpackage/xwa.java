package defpackage;

import android.content.res.Configuration;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* loaded from: classes.dex */
public final class xwa extends dtf implements sm6 {
    public final /* synthetic */ OneMeApplication X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwa(OneMeApplication oneMeApplication, Continuation continuation) {
        super(2, continuation);
        this.X = oneMeApplication;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xwa xwaVar = (xwa) l((t75) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xwaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xwa xwaVar = new xwa(this.X, continuation);
        xwaVar.o = obj;
        return xwaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        wqi.c("OneMeDynamicFont", "change dynamic font to " + ((t75) this.o).ordinal(), new Object[0]);
        OneMeApplication oneMeApplication = this.X;
        Configuration configuration = new Configuration(oneMeApplication.getResources().getConfiguration());
        configuration.fontScale = Float.intBitsToFloat(Float.floatToRawIntBits(configuration.fontScale) + (k7d.b.h() ? -1 : 1));
        oneMeApplication.getResources().updateConfiguration(configuration, oneMeApplication.getResources().getDisplayMetrics());
        oneMeApplication.onConfigurationChanged(configuration);
        return qqg.a;
    }
}
