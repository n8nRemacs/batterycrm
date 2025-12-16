package one.me.calls.ui.ui.indicator;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a93;
import defpackage.aw0;
import defpackage.cc1;
import defpackage.fc1;
import defpackage.g56;
import defpackage.gm1;
import defpackage.gw0;
import defpackage.hc1;
import defpackage.ho7;
import defpackage.ic1;
import defpackage.j2e;
import defpackage.jc1;
import defpackage.k18;
import defpackage.kc1;
import defpackage.l38;
import defpackage.q;
import defpackage.sn0;
import defpackage.toc;
import defpackage.ub1;
import defpackage.vid;
import defpackage.yy7;
import defpackage.zb1;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calls/ui/ui/indicator/CallIndicatorWidget;", "Lone/me/sdk/arch/Widget;", "Lj2e;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallIndicatorWidget extends Widget implements j2e {
    public static final /* synthetic */ yy7[] Y = {new toc(CallIndicatorWidget.class, "indicatorView", "getIndicatorView()Lone/me/calls/ui/view/indicator/CallIndicatorView;", 0), ho7.d(vid.a, CallIndicatorWidget.class, "fakeIndicatorView", "getFakeIndicatorView()Landroid/view/View;", 0)};
    public final k18 X;
    public final int a;
    public final k18 b;
    public final ub1 c;
    public final sn0 d;
    public final sn0 o;

    /* JADX WARN: Multi-variable type inference failed */
    public CallIndicatorWidget() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = 2;
        gm1 gm1Var = gm1.a;
        this.b = gm1Var.getAccessor().d(HttpStatus.SC_INSUFFICIENT_STORAGE);
        this.c = (ub1) gm1Var.getAccessor().c(511);
        this.d = binding(new fc1(this, 0));
        this.o = binding(new fc1(this, 1));
        this.X = createViewModelLazy(cc1.class, new q(15, new fc1(this, 2)));
    }

    public static final zb1 y0(CallIndicatorWidget callIndicatorWidget) {
        sn0 sn0Var = callIndicatorWidget.d;
        yy7 yy7Var = Y[0];
        return (zb1) sn0Var.getValue();
    }

    public static final void z0(CallIndicatorWidget callIndicatorWidget, boolean z) {
        int i = z ? a93.s0.z(callIndicatorWidget.getContext()).c.b().l : 0;
        sn0 sn0Var = callIndicatorWidget.o;
        yy7 yy7Var = Y[1];
        Drawable background = ((View) sn0Var.getValue()).getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            ColorDrawable colorDrawable2 = colorDrawable.getColor() != i ? colorDrawable : null;
            if (colorDrawable2 != null) {
                colorDrawable2.setColor(i);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new hc1(this, getContext());
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        k18 k18Var = this.X;
        gw0.w(new g56(aw0.a(((cc1) k18Var.getValue()).s0, getViewLifecycleOwner().p(), l38.d), new ic1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(((cc1) k18Var.getValue()).X, new jc1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(((cc1) k18Var.getValue()).Z, new kc1(null, this), 1), getViewLifecycleScope());
    }

    @Override // defpackage.j2e
    /* renamed from: v, reason: from getter */
    public final int getA() {
        return this.a;
    }
}
