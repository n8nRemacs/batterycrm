package one.me.settings.privacy.ui.onboarding;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import defpackage.a0d;
import defpackage.a93;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.efd;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.f8j;
import defpackage.fua;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gza;
import defpackage.ho7;
import defpackage.iqb;
import defpackage.ivd;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kga;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l5j;
import defpackage.mgb;
import defpackage.mvd;
import defpackage.nwe;
import defpackage.o4d;
import defpackage.pcc;
import defpackage.qfb;
import defpackage.roe;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ut3;
import defpackage.uwd;
import defpackage.v1a;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wwd;
import defpackage.yfb;
import defpackage.yn6;
import defpackage.yy7;
import defpackage.z7;
import defpackage.zwc;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/onboarding/SafeModeOnboardingScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SafeModeOnboardingScreen extends Widget {
    public static final /* synthetic */ yy7[] X = {new toc(SafeModeOnboardingScreen.class, "withoutPinCodeButton", "getWithoutPinCodeButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), ho7.d(vid.a, SafeModeOnboardingScreen.class, "content", "getContent()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)};
    public final eo7 a;
    public final ka5 b;
    public final k18 c;
    public final bbd d;
    public final bbd o;

    public SafeModeOnboardingScreen() {
        super(null, 0, 3, null);
        this.a = eo7.f;
        this.b = new ka5(f1e.SETTINGS_PRIVACY_SAFE_MODE);
        this.c = createViewModelLazy(wwd.class, new vdc(11, new efd(5)));
        this.d = viewBinding(a0d.oneme_settings_privacy_onboarding_without_code_button);
        this.o = viewBinding(a0d.oneme_settings_privacy_onboarding_content);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.b;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        constraintLayout.setId(a0d.oneme_settings_privacy_onboarding_root);
        v1a v1aVar = a93.s0;
        constraintLayout.setBackgroundColor(v1aVar.y(constraintLayout).b().l);
        yfb yfbVar = new yfb(constraintLayout.getContext(), 6);
        yfbVar.setId(a0d.oneme_settings_privacy_onboarding_toolbar);
        yfbVar.setForm(qfb.a);
        yfbVar.setBackgroundColor(0);
        yfbVar.setLayoutParams(new kt3(-1, -2));
        yfbVar.setTranslationZ(1000.0f);
        yfbVar.setLeftActions(new gfb(new iqb(23, this)));
        constraintLayout.addView(yfbVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(a0d.oneme_settings_privacy_onboarding_scroll_view);
        scrollView.setLayoutParams(new kt3(-1, -2));
        scrollView.setClipChildren(false);
        scrollView.setClipToPadding(false);
        scrollView.setClipToOutline(false);
        Context context = scrollView.getContext();
        ConstraintLayout constraintLayout2 = new ConstraintLayout(context);
        constraintLayout2.setId(a0d.oneme_settings_privacy_onboarding_content);
        constraintLayout2.setClipChildren(false);
        constraintLayout2.setClipToPadding(false);
        constraintLayout2.setClipToOutline(false);
        Guideline guideline = new Guideline(context);
        guideline.setId(a0d.oneme_settings_privacy_onboarding_top_guideline);
        kt3 kt3Var = new kt3(0, 0);
        kt3Var.a = kti.d(60 * vw4.d().getDisplayMetrics().density);
        kt3Var.V = 0;
        guideline.setLayoutParams(kt3Var);
        constraintLayout2.addView(guideline);
        View view = new View(context);
        view.setId(a0d.oneme_settings_privacy_onboarding_lock_background);
        kt3 kt3Var2 = new kt3(0, 0);
        ((ViewGroup.MarginLayoutParams) kt3Var2).topMargin = ((kt3) guideline.getLayoutParams()).a;
        view.setLayoutParams(kt3Var2);
        constraintLayout2.setClipToPadding(false);
        view.setClipToOutline(false);
        nwe nweVar = new nwe(context);
        nweVar.d(false);
        view.setBackground(nweVar);
        constraintLayout2.addView(view);
        ImageView imageView = new ImageView(context);
        imageView.setId(a0d.oneme_settings_privacy_onboarding_lock);
        imageView.setLayoutParams(new kt3(0, 0));
        imageView.setImageResource(zwc.oneme_settings_privacy_big_lock);
        constraintLayout2.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(a0d.oneme_settings_privacy_onboarding_content_title);
        kt3 kt3Var3 = new kt3(-2, -2);
        float f = 32;
        kt3Var3.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        kt3Var3.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
        textView.setLayoutParams(kt3Var3);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        textView.setTextColor(az1.f(dpg.c, textView, v1aVar, textView).e);
        textView.setText(o4d.oneme_settings_privacy_screen_safe_mode);
        constraintLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(a0d.oneme_settings_privacy_onboarding_content_subtitle);
        kt3 kt3Var4 = new kt3(-2, -2);
        kt3Var4.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        kt3Var4.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
        textView2.setLayoutParams(kt3Var4);
        textView2.setMaxLines(2);
        textView2.setTextAlignment(4);
        textView2.setTextColor(az1.f(dpg.j, textView2, v1aVar, textView2).g);
        textView2.setText(o4d.oneme_settings_privacy_onboarding_content_subtitle);
        constraintLayout2.addView(textView2);
        roe roeVar = new roe(context, 0);
        roeVar.setId(a0d.oneme_settings_privacy_onboarding_item_1);
        roeVar.setStartIcon(ivd.G0);
        roeVar.setTitle(z7.e(roeVar.getContext(), o4d.oneme_settings_privacy_onboarding_item_1_title));
        roeVar.setDescription(z7.e(roeVar.getContext(), o4d.oneme_settings_privacy_onboarding_item_1_subtitle));
        roeVar.onThemeChanged(v1aVar.x(context).k());
        constraintLayout2.addView(roeVar);
        roe roeVar2 = new roe(context, 0);
        roeVar2.setId(a0d.oneme_settings_privacy_onboarding_item_2);
        roeVar2.setStartIcon(ivd.C);
        roeVar2.setTitle(z7.e(roeVar2.getContext(), o4d.oneme_settings_privacy_onboarding_item_2_title));
        roeVar2.setDescription(z7.e(roeVar2.getContext(), o4d.oneme_settings_privacy_onboarding_item_2_subtitle));
        roeVar2.onThemeChanged(v1aVar.x(context).k());
        constraintLayout2.addView(roeVar2);
        roe roeVar3 = new roe(context, 0);
        roeVar3.setId(a0d.oneme_settings_privacy_onboarding_item_3);
        roeVar3.setStartIcon(ivd.y);
        roeVar3.setTitle(z7.e(roeVar3.getContext(), o4d.oneme_settings_privacy_onboarding_item_3_title));
        roeVar3.setDescription(z7.e(roeVar3.getContext(), o4d.oneme_settings_privacy_onboarding_item_3_subtitle));
        roeVar3.onThemeChanged(v1aVar.x(context).k());
        constraintLayout2.addView(roeVar3);
        roe roeVar4 = new roe(context, 0);
        roeVar4.setId(a0d.oneme_settings_privacy_onboarding_item_4);
        roeVar4.setStartIcon(ivd.v);
        roeVar4.setTitle(z7.e(roeVar4.getContext(), o4d.oneme_settings_privacy_onboarding_item_4_title));
        roeVar4.setDescription(z7.e(roeVar4.getContext(), o4d.oneme_settings_privacy_onboarding_item_4_subtitle));
        roeVar4.onThemeChanged(v1aVar.x(context).k());
        constraintLayout2.addView(roeVar4);
        ut3 ut3VarG = l5j.g(constraintLayout2);
        int id = view.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        float f2 = HttpStatus.SC_MULTIPLE_CHOICES;
        ut3VarG.g(id).d.Z = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.g(id).d.a0 = kti.d(vw4.d().getDisplayMetrics().density * f2);
        ut3VarG.g(id).d.y = "1:1";
        int id2 = imageView.getId();
        ut3VarG.d(id2, 3, guideline.getId(), 3);
        ut3VarG.d(id2, 6, view.getId(), 6);
        ut3VarG.d(id2, 7, view.getId(), 7);
        ut3VarG.d(id2, 4, view.getId(), 4);
        ut3VarG.g(id2).d.Z = kti.d(f2 * vw4.d().getDisplayMetrics().density);
        ut3VarG.g(id2).d.a0 = kti.d(212 * vw4.d().getDisplayMetrics().density);
        int id3 = textView.getId();
        ut3VarG.d(id3, 3, view.getId(), 4);
        ut3VarG.d(id3, 6, 0, 6);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        new fua(ut3VarG, 7, id3, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f));
        int id4 = textView2.getId();
        ut3VarG.d(id4, 3, textView.getId(), 4);
        ut3VarG.d(id4, 6, 0, 6);
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id4, 5));
        ut3VarG.d(id4, 7, 0, 7);
        new fua(ut3VarG, 7, id4, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        int id5 = roeVar.getId();
        ut3VarG.d(id5, 3, textView2.getId(), 4);
        az1.q(36, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id5, 5));
        ut3VarG.d(id5, 6, 0, 6);
        float f3 = 12;
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id5, 5));
        ut3VarG.d(id5, 7, 0, 7);
        new fua(ut3VarG, 7, id5, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f3));
        int id6 = roeVar2.getId();
        ut3VarG.d(id6, 3, roeVar.getId(), 4);
        float f4 = 4;
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id6, 5));
        ut3VarG.d(id6, 6, 0, 6);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id6, 5));
        ut3VarG.d(id6, 7, 0, 7);
        new fua(ut3VarG, 7, id6, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f3));
        int id7 = roeVar3.getId();
        ut3VarG.d(id7, 3, roeVar2.getId(), 4);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id7, 5));
        ut3VarG.d(id7, 6, 0, 6);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id7, 5));
        ut3VarG.d(id7, 7, 0, 7);
        new fua(ut3VarG, 7, id7, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f3));
        int id8 = roeVar4.getId();
        ut3VarG.d(id8, 3, roeVar3.getId(), 4);
        az1.q(f4, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id8, 5));
        ut3VarG.d(id8, 6, 0, 6);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id8, 5));
        ut3VarG.d(id8, 7, 0, 7);
        new fua(ut3VarG, 7, id8, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f3));
        ut3VarG.a(constraintLayout2);
        scrollView.addView(constraintLayout2);
        constraintLayout.addView(scrollView);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(a0d.oneme_settings_privacy_onboarding_without_code_button);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setText(mvd.W);
        oneMeButton.setLayoutParams(new kt3(0, -2));
        f8j.d(oneMeButton, 300L, new pcc(7, this));
        constraintLayout.addView(oneMeButton);
        ut3 ut3VarG2 = l5j.g(constraintLayout);
        int id9 = yfbVar.getId();
        ut3VarG2.d(id9, 3, 0, 3);
        ut3VarG2.d(id9, 6, 0, 6);
        ut3VarG2.d(id9, 7, 0, 7);
        int id10 = scrollView.getId();
        ut3VarG2.d(id10, 3, 0, 3);
        ut3VarG2.d(id10, 6, 0, 6);
        ut3VarG2.d(id10, 7, 0, 7);
        int id11 = oneMeButton.getId();
        ut3VarG2.d(id11, 6, 0, 6);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 6, id11, 5));
        ut3VarG2.d(id11, 7, 0, 7);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG2, 7, id11, 5));
        ut3VarG2.d(id11, 4, 0, 4);
        new fua(ut3VarG2, 4, id11, 5).e(kti.d(f3 * vw4.d().getDisplayMetrics().density));
        ut3VarG2.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        a93.s0.x(view.getContext()).k().b();
        window.setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        tqi.c(new kga(view, (Continuation) null, 19), view);
        OneMeButton oneMeButton = (OneMeButton) this.d.D(this, X[0]);
        mgb.a(oneMeButton, new yn6(oneMeButton, 29, this));
        gw0.w(new g56(aw0.a(((wwd) this.c.getValue()).o, getViewLifecycleOwner().p(), l38.d), new uwd(2, null), 1), getViewLifecycleScope());
    }
}
