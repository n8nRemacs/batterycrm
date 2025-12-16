package one.me.settings.twofa.creation.onboarding;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.ang;
import defpackage.aw0;
import defpackage.axc;
import defpackage.az1;
import defpackage.bbd;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.dpg;
import defpackage.dse;
import defpackage.e0d;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fua;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hp;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5j;
import defpackage.mgb;
import defpackage.mvd;
import defpackage.nwe;
import defpackage.omg;
import defpackage.pcc;
import defpackage.qfb;
import defpackage.qlg;
import defpackage.r4d;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uif;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vmg;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.wmg;
import defpackage.xmg;
import defpackage.yfb;
import defpackage.ymg;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/settings/twofa/creation/onboarding/TwoFAOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "state", "(Ljava/lang/String;)V", "wmg", "settings-twofa_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class TwoFAOnboardingScreen extends Widget {
    public static final /* synthetic */ yy7[] X;
    public final eo7 a;
    public final Object b;
    public final ka5 c;
    public final k18 d;
    public final bbd o;

    static {
        toc tocVar = new toc(TwoFAOnboardingScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0);
        vid.a.getClass();
        X = new yy7[]{tocVar};
    }

    public TwoFAOnboardingScreen(String str) {
        this(gwi.b(new imb("onboarding_2fa_state_key", str)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        if (z0() != wmg.b) {
            return super.handleBack();
        }
        omg.c.p0().b(":settings/privacy", null);
        return true;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(e0d.oneme_settings_twofa_onboarding_root);
        v1a v1aVar = a93.s0;
        frameLayout.setBackgroundColor(v1aVar.y(frameLayout).b().l);
        yfb yfbVar = new yfb(frameLayout.getContext(), 6);
        yfbVar.setId(e0d.oneme_settings_twofa_onboarding_toolbar);
        yfbVar.setForm(qfb.a);
        yfbVar.setBackgroundColor(0);
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        yfbVar.setTranslationZ(1000.0f);
        wmg wmgVarZ0 = z0();
        wmg wmgVar = wmg.a;
        if (wmgVarZ0 == wmgVar) {
            yfbVar.setLeftActions(new gfb(new dse(9, this)));
        }
        frameLayout.addView(yfbVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(e0d.oneme_settings_twofa_onboarding_scroll_content);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        scrollView.setClipChildren(false);
        scrollView.setClipToPadding(false);
        scrollView.setClipToOutline(false);
        Context context = scrollView.getContext();
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(e0d.oneme_settings_twofa_onboarding_content);
        constraintLayout.setClipChildren(false);
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipToOutline(false);
        View view = new View(context);
        view.setId(e0d.oneme_settings_twofa_onboarding_picture_background);
        float f = 240;
        view.setLayoutParams(new kt3(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        constraintLayout.setClipToPadding(false);
        view.setClipToOutline(false);
        nwe nweVar = new nwe(context);
        nweVar.d(false);
        view.setBackground(nweVar);
        constraintLayout.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(e0d.oneme_settings_twofa_onboarding_picture);
        imageView.setLayoutParams(new kt3(kti.d(214 * vw4.d().getDisplayMetrics().density), kti.d(136 * vw4.d().getDisplayMetrics().density)));
        imageView.setImageResource(z0() == wmgVar ? axc.oneme_settings_privacy_cloud_2fa_start_icon : axc.oneme_settings_privacy_cloud_2fa_end_icon);
        constraintLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(e0d.oneme_settings_twofa_onboarding_title);
        kt3 kt3Var = new kt3(0, -2);
        float f2 = 32;
        kt3Var.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        kt3Var.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView.setLayoutParams(kt3Var);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setTextColor(az1.f(dpg.c, textView, v1aVar, textView).e);
        textView.setText(z0() == wmgVar ? r4d.oneme_settings_twofa_onboarding_title : r4d.oneme_settings_twofa_onboarding_success_title);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(e0d.oneme_settings_twofa_onboarding_subtitle);
        kt3 kt3Var2 = new kt3(0, -2);
        kt3Var2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        kt3Var2.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView2.setLayoutParams(kt3Var2);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextColor(az1.f(dpg.j, textView2, v1aVar, textView2).g);
        textView2.setText(z0() == wmgVar ? r4d.oneme_settings_twofa_onboarding_description : r4d.oneme_settings_twofa_onboarding_success_description);
        constraintLayout.addView(textView2);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = view.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 4, 0, 4);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        ut3VarG.d(id2, 3, view.getId(), 3);
        ut3VarG.d(id2, 6, view.getId(), 6);
        ut3VarG.d(id2, 7, view.getId(), 7);
        ut3VarG.d(id2, 4, view.getId(), 4);
        int id3 = textView.getId();
        ut3VarG.d(id3, 3, imageView.getId(), 4);
        az1.q(68, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        new fua(ut3VarG, 7, id3, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        ut3VarG.g(id3).d.l0 = true;
        int id4 = textView2.getId();
        ut3VarG.d(id4, 3, textView.getId(), 4);
        az1.q(8, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
        ut3VarG.d(id4, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id4, 5));
        ut3VarG.d(id4, 7, 0, 7);
        new fua(ut3VarG, 7, id4, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.g(id4).d.l0 = true;
        ut3VarG.a(constraintLayout);
        scrollView.addView(constraintLayout);
        frameLayout.addView(scrollView);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), null);
        oneMeButton.setId(e0d.oneme_settings_twofa_action);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.d);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setText(z0() == wmgVar ? r4d.oneme_settings_twofa_onboarding_set_password : mvd.f0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams.setMarginStart(iD);
        layoutParams.setMarginEnd(iD);
        layoutParams.bottomMargin = iD;
        oneMeButton.setLayoutParams(layoutParams);
        f8j.d(oneMeButton, 300L, new pcc(23, this));
        mgb.a(oneMeButton, new hp(oneMeButton, scrollView, iD, 7));
        frameLayout.addView(oneMeButton);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        tqi.c(new qlg(this, null, 1), view);
        k18 k18Var = this.d;
        ci5 ci5Var = ((ang) k18Var.getValue()).X;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new xmg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((ang) k18Var.getValue()).o, getViewLifecycleOwner().p(), l38Var), new ymg(null, this), 1), getViewLifecycleScope());
    }

    public final OneMeButton y0() {
        return (OneMeButton) this.o.D(this, X[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final wmg z0() {
        return (wmg) this.b.getValue();
    }

    public TwoFAOnboardingScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = ipi.b(3, new wj1(bundle, 17));
        this.c = new ka5(new vmg(this, 0), (cm6) null, 6);
        this.d = createViewModelLazy(ang.class, new uif(5, new vmg(this, 1)));
        this.o = viewBinding(e0d.oneme_settings_twofa_action);
    }
}
