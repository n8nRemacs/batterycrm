package one.me.calls.ui.ui.call.panels;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.b1e;
import defpackage.fu1;
import defpackage.gvf;
import defpackage.gwi;
import defpackage.imb;
import defpackage.jr7;
import defpackage.k18;
import defpackage.kti;
import defpackage.ljh;
import defpackage.mgb;
import defpackage.q8g;
import defpackage.te8;
import defpackage.tk4;
import defpackage.uif;
import defpackage.vw4;
import defpackage.x6i;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/VpnPanelWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "x6i", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VpnPanelWidget extends Widget {
    public static final /* synthetic */ int c = 0;
    public x6i a;
    public final k18 b;

    public VpnPanelWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jr7 jr7Var = new jr7(this, getContext());
        gvf gvfVar = new gvf(getContext());
        gvfVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        gvfVar.addView(jr7Var);
        float f = 12;
        gvfVar.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(0 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
        gvfVar.setCallback(new te8(this, gvfVar, jr7Var));
        mgb.a(gvfVar, new fu1(gvfVar, gvfVar, 2));
        return gvfVar;
    }

    public VpnPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.b = createViewModelLazy(ljh.class, new uif(11, new q8g(19)));
    }
}
