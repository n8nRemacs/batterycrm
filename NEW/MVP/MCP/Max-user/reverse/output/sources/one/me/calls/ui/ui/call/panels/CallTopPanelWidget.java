package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.as1;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bs1;
import defpackage.eyc;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hk1;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.ncg;
import defpackage.nr1;
import defpackage.or1;
import defpackage.q;
import defpackage.r5j;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ur1;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wo1;
import defpackage.xr1;
import defpackage.yr1;
import defpackage.yy7;
import defpackage.zr1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallTopPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lor1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class CallTopPanelWidget extends Widget implements or1 {
    public static final /* synthetic */ yy7[] d = {new toc(CallTopPanelWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), ho7.d(vid.a, CallTopPanelWidget.class, "callTopPanel", "getCallTopPanel()Lone/me/calls/ui/view/controls/CallTopControlViewNew;", 0)};
    public final k18 a;
    public final k18 b;
    public final bbd c;

    public CallTopPanelWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // defpackage.or1
    public final void B(nr1 nr1Var) {
        if (getView() == null) {
            return;
        }
        int i = nr1Var != null ? nr1Var.a : 0;
        int i2 = i == 0 ? -1 : yr1.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                y0().setTitle(nr1Var.b);
                y0().setStatus(nr1Var.c);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                y0().setTitle(null);
                y0().setStatus(null);
            }
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        gw0.w(new g56(aw0.a(z0().o, getViewLifecycleOwner().p(), l38.d), new zr1(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ur1 ur1Var = new ur1(getContext());
        ur1Var.setId(eyc.call_top_control);
        ur1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, kti.d(68 * vw4.d().getDisplayMetrics().density)));
        float f = 8;
        ur1Var.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(6 * vw4.d().getDisplayMetrics().density));
        return ur1Var;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ncg ncgVar = y0().H0;
        if (ncgVar != null) {
            ncgVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, x26] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        y0().setClickListener(new r5j(7, this));
        hbd hbdVar = z0().d;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new as1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().b.N0, getViewLifecycleOwner().p(), l38Var), new bs1(null, this), 1), getViewLifecycleScope());
    }

    public final ur1 y0() {
        return (ur1) this.c.D(this, d[1]);
    }

    public final xr1 z0() {
        return (xr1) this.b.getValue();
    }

    public CallTopPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        hs hsVar = new hs(b1e.class, new b1e("default"), Widget.ARG_SCOPE_ID);
        yy7 yy7Var = d[0];
        this.a = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, wo1.class, null);
        this.b = createViewModelLazy(xr1.class, new q(23, new hk1(1, this)));
        this.c = viewBinding(eyc.call_top_control);
    }
}
