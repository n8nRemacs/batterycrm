package one.me.settings.twofa.restore;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.d53;
import defpackage.dpg;
import defpackage.dse;
import defpackage.e0d;
import defpackage.ekg;
import defpackage.eo7;
import defpackage.eog;
import defpackage.f1e;
import defpackage.f8j;
import defpackage.fkg;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.i84;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.kvf;
import defpackage.l38;
import defpackage.l48;
import defpackage.lzf;
import defpackage.mgb;
import defpackage.oog;
import defpackage.pog;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qlg;
import defpackage.qq3;
import defpackage.r4d;
import defpackage.sue;
import defpackage.svi;
import defpackage.t75;
import defpackage.tk4;
import defpackage.tng;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uif;
import defpackage.ung;
import defpackage.up7;
import defpackage.vid;
import defpackage.vng;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.wng;
import defpackage.wqi;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.xng;
import defpackage.yfb;
import defpackage.yng;
import defpackage.yy7;
import defpackage.zng;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/settings/twofa/restore/TwoFAStartRestoreScreen;", "Lone/me/sdk/arch/Widget;", "Loog;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "source", "trackId", "Lup7;", "navData", "(Ljava/lang/String;Ljava/lang/String;Lup7;)V", "settings-twofa_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class TwoFAStartRestoreScreen extends Widget implements oog, qq3 {
    public static final /* synthetic */ yy7[] s0 = {new toc(TwoFAStartRestoreScreen.class, "twoFAView", "getTwoFAView()Lone/me/settings/twofa/creation/TwoFAView;", 0), ho7.d(vid.a, TwoFAStartRestoreScreen.class, "resendCodeTimerView", "getResendCodeTimerView()Landroid/widget/TextView;", 0), new toc(TwoFAStartRestoreScreen.class, "resendCodeButton", "getResendCodeButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final eo7 a;
    public final Object b;
    public final ka5 c;
    public final k18 d;
    public final Object o;

    public TwoFAStartRestoreScreen(String str, String str2, up7 up7Var) {
        this(gwi.b(new imb("twofa_check_password_source_key", str), new imb("twofa_check_password_track_id_key", str2), new imb("twofa_check_password_nav_data_key", up7Var)));
    }

    @Override // defpackage.oog
    public final void a(String str) {
        eog eogVarY0 = y0();
        eogVarY0.getClass();
        if (str.length() == 0) {
            wqi.q(eogVarY0.X, "Add email step: Can't check code because is empty", new Object[0]);
            return;
        }
        x9f x9fVar = eogVarY0.C0;
        if (x9fVar == null || !x9fVar.isActive()) {
            eogVarY0.C0 = xfh.o(eogVarY0, ((q2b) ((lzf) eogVarY0.Z.getValue())).b(), new yng(eogVarY0, str, null), 2);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        eog eogVarY0 = y0();
        eogVarY0.getClass();
        if (i == e0d.oneme_settings_twofa_delete_user_confirmation_skip || i != e0d.oneme_settings_twofa_delete_user_confirmation_action) {
            return;
        }
        eogVarY0.B0.O(eogVarY0, eog.D0[1], svi.d(eogVarY0.a, ((q2b) ((lzf) eogVarY0.Z.getValue())).b(), i84.b, new zng(eogVarY0, null)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getU0() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(e0d.oneme_settings_twofa_onboarding_root);
        frameLayout.setBackgroundColor(a93.s0.y(frameLayout).b().l);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipToOutline(false);
        yfb yfbVar = new yfb(frameLayout.getContext(), 6);
        yfbVar.setId(e0d.oneme_settings_twofa_onboarding_toolbar);
        yfbVar.setForm(qfb.a);
        yfbVar.setBackgroundColor(0);
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        yfbVar.setTranslationZ(1000.0f);
        yfbVar.setLeftActions(new gfb(new dse(11, this)));
        frameLayout.addView(yfbVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(e0d.oneme_settings_twofa_onboarding_scroll_content);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        pog pogVar = new pog(scrollView.getContext());
        pogVar.setId(e0d.oneme_settings_twofa_onboarding_content);
        pogVar.setPadding(pogVar.getPaddingLeft(), kti.d(24 * vw4.d().getDisplayMetrics().density), pogVar.getPaddingRight(), pogVar.getPaddingBottom());
        pogVar.setListener(this);
        scrollView.addView(pogVar);
        frameLayout.addView(scrollView);
        mgb.a(yfbVar, new fkg(yfbVar, scrollView, 2));
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(e0d.oneme_settings_twofa_forget_password_action);
        oneMeButton.setText(r4d.oneme_settings_twofa_lost_email_action);
        iza izaVar = iza.d;
        oneMeButton.setMode(izaVar);
        gza gzaVar = gza.a;
        oneMeButton.setAppearance(gzaVar);
        jza jzaVar = jza.a;
        oneMeButton.setSize(jzaVar);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams2.setMarginStart(iD);
        layoutParams2.setMarginEnd(iD);
        layoutParams2.bottomMargin = iD;
        oneMeButton.setLayoutParams(layoutParams2);
        f8j.d(oneMeButton, 300L, new tng(this, 0));
        linearLayout.addView(oneMeButton);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(e0d.oneme_settings_twofa_verify_email_resend_timer);
        dpg.l.b(textView, t75.b);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams3.setMarginStart(iD2);
        layoutParams3.setMarginEnd(iD2);
        layoutParams3.bottomMargin = iD2;
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(17);
        linearLayout.addView(textView);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton2.setId(e0d.oneme_settings_twofa_verify_email_resend_action);
        oneMeButton2.setText(r4d.oneme_settings_twofa_creation_email_verify_resend_code);
        oneMeButton2.setMode(izaVar);
        oneMeButton2.setAppearance(gzaVar);
        oneMeButton2.setSize(jzaVar);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iD3 = kti.d(f * vw4.d().getDisplayMetrics().density);
        layoutParams4.setMarginStart(iD3);
        layoutParams4.setMarginEnd(iD3);
        layoutParams4.bottomMargin = iD3;
        oneMeButton2.setLayoutParams(layoutParams4);
        f8j.d(oneMeButton2, 300L, new tng(this, 1));
        linearLayout.addView(oneMeButton2);
        mgb.a(linearLayout, new ekg(linearLayout, scrollView, 1));
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        tqi.c(new qlg(this, null, 2), view);
        d53 d53Var = new d53(y0().u0, 12);
        pog pogVar = (pog) this.X.D(this, s0[0]);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new ung(null, pogVar), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().y0, getViewLifecycleOwner().p(), l38Var), new vng(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().x0, getViewLifecycleOwner().p(), l38Var), new wng(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().w0, getViewLifecycleOwner().p(), l38Var), new xng(null, this), 1), getViewLifecycleScope());
    }

    public final eog y0() {
        return (eog) this.d.getValue();
    }

    public TwoFAStartRestoreScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = ipi.b(3, new wj1(bundle, 19));
        this.c = new ka5(f1e.SETTINGS_2FA_PASSWORD_RESET_EMAIL_CODE);
        this.d = createViewModelLazy(eog.class, new uif(7, new sue(bundle, 10, this)));
        this.o = ipi.b(3, new kvf(10, this));
        this.X = viewBinding(e0d.oneme_settings_twofa_onboarding_content);
        this.Y = viewBinding(e0d.oneme_settings_twofa_verify_email_resend_timer);
        this.Z = viewBinding(e0d.oneme_settings_twofa_verify_email_resend_action);
    }

    public /* synthetic */ TwoFAStartRestoreScreen(String str, String str2, up7 up7Var, int i, tk4 tk4Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : up7Var);
    }
}
