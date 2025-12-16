package one.me.settings.twofa.restore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bbd;
import defpackage.cei;
import defpackage.d53;
import defpackage.dpg;
import defpackage.e0d;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.f8j;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gza;
import defpackage.hdc;
import defpackage.ho7;
import defpackage.iqb;
import defpackage.ivd;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kga;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.mgb;
import defpackage.mvd;
import defpackage.qfb;
import defpackage.r34;
import defpackage.r4d;
import defpackage.rdc;
import defpackage.sdc;
import defpackage.tdc;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u45;
import defpackage.udc;
import defpackage.v1a;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yfb;
import defpackage.yn6;
import defpackage.yy7;
import defpackage.zdc;
import defpackage.zn6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/twofa/restore/ProfileDeletionInfoScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-twofa_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileDeletionInfoScreen extends Widget {
    public static final /* synthetic */ yy7[] X = {new toc(ProfileDeletionInfoScreen.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), ho7.d(vid.a, ProfileDeletionInfoScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final eo7 a;
    public final ka5 b;
    public final k18 c;
    public final bbd d;
    public final bbd o;

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileDeletionInfoScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = eo7.f;
        this.b = new ka5(f1e.SETTINGS_2FA_PROFILE_DELETE_STOP);
        this.c = createViewModelLazy(zdc.class, new vdc(0, new hdc(10)));
        this.d = viewBinding(e0d.oneme_settings_twofa_onboarding_subtitle);
        this.o = viewBinding(e0d.oneme_settings_twofa_action);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getD() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(e0d.oneme_settings_twofa_onboarding_root);
        v1a v1aVar = a93.s0;
        frameLayout.setBackgroundColor(v1aVar.y(frameLayout).b().l);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setClipToOutline(false);
        yfb yfbVar = new yfb(frameLayout.getContext(), 6);
        yfbVar.setId(e0d.oneme_settings_twofa_onboarding_toolbar);
        yfbVar.setForm(qfb.a);
        yfbVar.setBackgroundColor(0);
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        yfbVar.setTranslationZ(1000.0f);
        yfbVar.setLeftActions(new gfb(new iqb(12, this)));
        frameLayout.addView(yfbVar);
        ScrollView scrollView = new ScrollView(viewGroup.getContext());
        scrollView.setId(e0d.oneme_settings_twofa_onboarding_scroll_content);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        Context context = scrollView.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(e0d.oneme_settings_twofa_onboarding_content);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), kti.d(190 * vw4.d().getDisplayMetrics().density), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipToOutline(false);
        ImageView imageView = new ImageView(context);
        imageView.setId(e0d.oneme_settings_twofa_onboarding_picture);
        float f = 88;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density)));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setColorFilter(new PorterDuffColorFilter(v1aVar.y(imageView).b().a.f, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(shapeDrawable);
        u45.n(28, vw4.d().getDisplayMetrics().density, imageView);
        int i = ivd.n;
        v1aVar.y(imageView).getIcon();
        Drawable drawableMutate = r34.b(imageView.getContext(), i).mutate();
        cei.k(drawableMutate, -1);
        imageView.setImageDrawable(drawableMutate);
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        textView.setId(e0d.oneme_settings_twofa_onboarding_title);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        float f2 = 32;
        layoutParams.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        layoutParams.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams);
        textView.setMaxLines(1);
        textView.setTextAlignment(4);
        textView.setGravity(17);
        textView.setTextColor(az1.f(dpg.c, textView, v1aVar, textView).e);
        textView.setText(r4d.oneme_settings_twofa_delete_user_title);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setId(e0d.oneme_settings_twofa_onboarding_subtitle);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
        layoutParams2.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f2));
        layoutParams2.setMarginEnd(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setTextColor(az1.f(dpg.j, textView2, v1aVar, textView2).g);
        linearLayout.addView(textView2);
        scrollView.addView(linearLayout);
        frameLayout.addView(scrollView);
        mgb.a(yfbVar, new zn6(yfbVar, 22, scrollView));
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        LinearLayout linearLayout2 = new LinearLayout(frameLayout.getContext());
        linearLayout2.setLayoutParams(layoutParams3);
        linearLayout2.setId(e0d.oneme_settings_twofa_action_wrapper);
        linearLayout2.setOrientation(1);
        OneMeButton oneMeButton = new OneMeButton(linearLayout2.getContext(), null);
        oneMeButton.setId(e0d.oneme_settings_twofa_action);
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setText(r4d.oneme_settings_twofa_delete_user_undo_delete_action);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        float f3 = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f3);
        layoutParams4.setMarginStart(iD);
        layoutParams4.setMarginEnd(iD);
        layoutParams4.bottomMargin = iD;
        oneMeButton.setLayoutParams(layoutParams4);
        f8j.d(oneMeButton, 300L, new rdc(this, 0));
        linearLayout2.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout2.getContext(), null);
        oneMeButton2.setId(e0d.oneme_settings_twofa_action_secondary);
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(iza.b);
        oneMeButton2.setAppearance(gza.c);
        oneMeButton2.setText(mvd.g0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int iD2 = kti.d(f3 * vw4.d().getDisplayMetrics().density);
        layoutParams5.setMarginStart(iD2);
        layoutParams5.setMarginEnd(iD2);
        layoutParams5.bottomMargin = iD2;
        oneMeButton2.setLayoutParams(layoutParams5);
        f8j.d(oneMeButton2, 300L, new rdc(this, 1));
        linearLayout2.addView(oneMeButton2);
        mgb.a(linearLayout2, new yn6(linearLayout2, 27, scrollView));
        frameLayout.addView(linearLayout2);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        tqi.c(new kga(this, (Continuation) null, 12), view);
        k18 k18Var = this.c;
        d53 d53Var = new d53(((zdc) k18Var.getValue()).Y, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new sdc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((zdc) k18Var.getValue()).s0, getViewLifecycleOwner().p(), l38Var), new tdc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((zdc) k18Var.getValue()).Z, getViewLifecycleOwner().p(), l38Var), new udc(null, this), 1), getViewLifecycleScope());
    }
}
