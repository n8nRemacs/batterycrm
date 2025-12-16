package one.me.calls.ui.bottomsheet.unkowncontact;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.ehg;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.ipe;
import defpackage.j0b;
import defpackage.k18;
import defpackage.kti;
import defpackage.kvf;
import defpackage.l38;
import defpackage.l48;
import defpackage.nrg;
import defpackage.t75;
import defpackage.toc;
import defpackage.tqg;
import defpackage.tqi;
import defpackage.uif;
import defpackage.uqg;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wx1;
import defpackage.yqg;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/unkowncontact/UnknownContactBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "callerId", "(Ljava/lang/String;J)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnknownContactBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] J0 = {new toc(UnknownContactBottomSheet.class, "callId", "getCallId()Ljava/lang/String;", 0), ho7.d(vid.a, UnknownContactBottomSheet.class, "callerServerId", "getCallerServerId()J", 0), new toc(UnknownContactBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), new toc(UnknownContactBottomSheet.class, "subtitle", "getSubtitle()Landroid/widget/TextView;", 0), new toc(UnknownContactBottomSheet.class, "buttons", "getButtons()Lone/me/calls/ui/bottomsheet/unkowncontact/view/UnknownContactButtonGroup;", 0)};
    public final hs C0;
    public final hs D0;
    public final bbd E0;
    public final bbd F0;
    public final bbd G0;
    public final k18 H0;
    public final AutoTransition I0;

    public UnknownContactBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = new hs(String.class, "unknowncall:call_id");
        this.D0 = new hs(Long.class, "unknowncall:caller_id");
        this.E0 = viewBinding(j0b.j2);
        this.F0 = viewBinding(j0b.i2);
        this.G0 = viewBinding(j0b.f2);
        this.H0 = createViewModelLazy(nrg.class, new uif(8, new kvf(11, this)));
        this.I0 = new AutoTransition();
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final boolean D0() {
        nrg nrgVarO0 = O0();
        nrgVarO0.t().j(wx1.CLOSE, nrgVarO0.b);
        return true;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(j0b.j2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 20;
        float f2 = 24;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), textView.getPaddingBottom());
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        dpg.D.b(textView, t75.b);
        tqi.c(new ipe(3, null, 12), textView);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(j0b.i2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        float f3 = 12;
        float f4 = 32;
        textView2.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f4 * vw4.d().getDisplayMetrics().density), textView2.getPaddingBottom());
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        dpg.G.b(textView2, t75.b);
        tqi.c(new ipe(3, null, 13), textView2);
        linearLayout.addView(textView2);
        yqg yqgVar = new yqg(linearLayout.getContext(), null);
        yqgVar.setOrientation(1);
        yqgVar.setGravity(17);
        yqgVar.setId(j0b.f2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        yqgVar.setListener(new ehg(3, this));
        yqgVar.setLayoutParams(layoutParams3);
        linearLayout.addView(yqgVar);
        return linearLayout;
    }

    public final nrg O0() {
        return (nrg) this.H0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        hbd hbdVar = O0().y0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new tqg(null, view, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(O0().z0, getViewLifecycleOwner().p(), l38Var), new uqg(null, this), 1), getViewLifecycleScope());
    }

    public UnknownContactBottomSheet(String str, long j) {
        this(gwi.b(new imb("unknowncall:call_id", str), new imb("unknowncall:caller_id", Long.valueOf(j))));
    }
}
