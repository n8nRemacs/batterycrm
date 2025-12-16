package one.me.calls.ui.bottomsheet.ratecall;

import android.annotation.SuppressLint;
import android.content.Context;
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
import defpackage.c8d;
import defpackage.d8d;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hbd;
import defpackage.hd5;
import defpackage.hk1;
import defpackage.ho7;
import defpackage.hs;
import defpackage.ik1;
import defpackage.imb;
import defpackage.iza;
import defpackage.j0b;
import defpackage.j6;
import defpackage.jk1;
import defpackage.jza;
import defpackage.k18;
import defpackage.kk1;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.lk1;
import defpackage.m0b;
import defpackage.mk1;
import defpackage.q;
import defpackage.t75;
import defpackage.tk1;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u7d;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w7d;
import defpackage.x9;
import defpackage.yy7;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/calls/ui/bottomsheet/ratecall/CallRateBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Lu7d;", "Lc8d;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "callId", "", "isGroup", "isVideoCall", "", "sdkReasons", "(Ljava/lang/String;ZZLjava/util/List;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class CallRateBottomSheet extends BottomSheetWidget implements u7d, c8d {
    public static final /* synthetic */ yy7[] M0 = {new toc(CallRateBottomSheet.class, "callId", "getCallId()Ljava/lang/String;", 0), ho7.d(vid.a, CallRateBottomSheet.class, "isGroupCall", "isGroupCall()Z", 0), new toc(CallRateBottomSheet.class, "isVideoCall", "isVideoCall()Z", 0), new toc(CallRateBottomSheet.class, "sdkReasons", "getSdkReasons()Ljava/util/List;", 0), new toc(CallRateBottomSheet.class, "title", "getTitle()Landroid/widget/TextView;", 0), new toc(CallRateBottomSheet.class, "rateCallButtonGroup", "getRateCallButtonGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButtonGroup;", 0), new toc(CallRateBottomSheet.class, "reasonsChipGroup", "getReasonsChipGroup()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallReasonsChipGroup;", 0), new toc(CallRateBottomSheet.class, "sendButton", "getSendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final hs C0;
    public final hs D0;
    public final hs E0;
    public final hs F0;
    public final AutoTransition G0;
    public final k18 H0;
    public final bbd I0;
    public final bbd J0;
    public final bbd K0;
    public final bbd L0;

    public CallRateBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = new hs(String.class, "ratecall:call_id");
        Class<Boolean> cls = Boolean.class;
        this.D0 = new hs(cls, "ratecall:is_group_call");
        this.E0 = new hs(cls, "ratecall:is_video_call");
        this.F0 = new hs(List.class, "ratecall:sdk_reasons");
        this.G0 = new AutoTransition();
        this.H0 = createViewModelLazy(tk1.class, new q(21, new hk1(0, this)));
        this.I0 = viewBinding(j0b.E0);
        this.J0 = viewBinding(j0b.z0);
        this.K0 = viewBinding(j0b.A0);
        this.L0 = viewBinding(j0b.D0);
    }

    public static final d8d O0(CallRateBottomSheet callRateBottomSheet) {
        return (d8d) callRateBottomSheet.K0.D(callRateBottomSheet, M0[6]);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void H0() {
        P0().u(true);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        TextView textView = new TextView(context);
        textView.setId(j0b.E0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 24;
        layoutParams.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        dpg.c.b(textView, t75.b);
        tqi.c(new x9(3, null, 1), textView);
        w7d w7dVar = new w7d(context, null);
        w7dVar.b = 3;
        w7dVar.setOrientation(0);
        w7dVar.setGravity(17);
        w7dVar.c = hd5.a;
        w7dVar.setId(j0b.z0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        w7dVar.setLayoutParams(layoutParams2);
        w7dVar.setGravity(17);
        w7dVar.setListener(this);
        d8d d8dVar = new d8d(context, null);
        d8dVar.setId(j0b.A0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        d8dVar.setLayoutParams(layoutParams3);
        d8dVar.setListener(this);
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(j0b.D0);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setText(m0b.N0);
        f8j.d(oneMeButton, 300L, new j6(7, this));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setPaddingRelative(0, kti.d(f * vw4.d().getDisplayMetrics().density), 0, 0);
        linearLayout.addView(textView);
        linearLayout.addView(w7dVar);
        linearLayout.addView(d8dVar);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    public final tk1 P0() {
        return (tk1) this.H0.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = P0().s0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new ik1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(P0().u0, getViewLifecycleOwner().p(), l38Var), new jk1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(P0().w0, getViewLifecycleOwner().p(), l38Var), new kk1(null, view, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(P0().x0, getViewLifecycleOwner().p(), l38Var), new lk1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(P0().y0, getViewLifecycleOwner().p(), l38Var), new mk1(null, this), 1), getViewLifecycleScope());
    }

    public CallRateBottomSheet(String str, boolean z, boolean z2, List<String> list) {
        this(gwi.b(new imb("ratecall:call_id", str), new imb("ratecall:is_group_call", Boolean.valueOf(z)), new imb("ratecall:is_video_call", Boolean.valueOf(z2)), new imb("ratecall:sdk_reasons", list)));
    }
}
