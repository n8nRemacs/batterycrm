package one.me.login.welcome;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.bbd;
import defpackage.ccb;
import defpackage.cm6;
import defpackage.dpg;
import defpackage.dwh;
import defpackage.e2i;
import defpackage.eo7;
import defpackage.eza;
import defpackage.f8j;
import defpackage.gza;
import defpackage.ho7;
import defpackage.ii8;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kt3;
import defpackage.kti;
import defpackage.kvf;
import defpackage.ms0;
import defpackage.mvd;
import defpackage.qwc;
import defpackage.r34;
import defpackage.sth;
import defpackage.t3d;
import defpackage.t75;
import defpackage.toc;
import defpackage.use;
import defpackage.vid;
import defpackage.vmf;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.x4e;
import defpackage.xu6;
import defpackage.xyc;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.z7;
import defpackage.zfi;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/welcome/WelcomeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class WelcomeScreen extends Widget {
    public static final /* synthetic */ yy7[] Z = {new toc(WelcomeScreen.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), ho7.d(vid.a, WelcomeScreen.class, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    public final Object X;
    public final yeb Y;
    public final eo7 a;
    public final ka5 b;
    public final k18 c;
    public final bbd d;
    public final Object o;

    public WelcomeScreen() {
        super(null, 0, 3, null);
        this.a = new eo7(0, new ms0(3, 1, false), 7);
        this.b = new ka5(new dwh(4), (cm6) null, 6);
        m39getSharedViewModelcp94BC8("LoginScope", ii8.class, null);
        this.c = x4e.k;
        viewBinding(xyc.oneme_login_welcome_placeholder);
        this.d = viewBinding(xyc.oneme_login_welcome_terms);
        this.o = ipi.b(3, new kvf(24, this));
        this.X = ipi.b(3, new dwh(5));
        this.Y = a93.s0.z(getContext()).c;
    }

    public static final void y0(WelcomeScreen welcomeScreen, String str) {
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            welcomeScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            wqi.e("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", null);
            ccb ccbVar = new ccb(welcomeScreen);
            ccbVar.h(welcomeScreen.getContext().getString(mvd.I0));
            ccbVar.i();
        }
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

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        View useVar = new use(constraintLayout.getContext());
        kt3 kt3Var = new kt3(-1, -1);
        kt3Var.i = 0;
        kt3Var.t = 0;
        kt3Var.v = 0;
        kt3Var.l = 0;
        useVar.setLayoutParams(kt3Var);
        constraintLayout.addView(useVar);
        View view = new View(constraintLayout.getContext());
        view.setId(xyc.oneme_login_welcome_toolbar);
        kt3 kt3Var2 = new kt3(0, kti.d(52 * vw4.d().getDisplayMetrics().density));
        kt3Var2.i = 0;
        kt3Var2.t = 0;
        kt3Var2.v = 0;
        view.setLayoutParams(kt3Var2);
        zfi.c(view);
        constraintLayout.addView(view);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(xyc.oneme_login_welcome_title);
        kt3 kt3Var3 = new kt3(-2, -2);
        float f = 16;
        kt3Var3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        kt3Var3.j = xyc.oneme_login_welcome_toolbar;
        kt3Var3.t = 0;
        kt3Var3.v = 0;
        kt3Var3.k = xyc.oneme_login_welcome_description;
        kt3Var3.K = 2;
        textView.setLayoutParams(kt3Var3);
        textView.setGravity(17);
        yeb yebVar = this.Y;
        textView.setTextColor(yebVar.getText().e);
        dpg.t.b(textView, t75.b);
        textView.setText(t3d.oneme_login_welcome_title);
        ?? r4 = this.X;
        ((eza) r4.getValue()).getClass();
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(xyc.oneme_login_welcome_description);
        kt3 kt3Var4 = new kt3(-2, -2);
        float f2 = 12;
        kt3Var4.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        kt3Var4.j = xyc.oneme_login_welcome_title;
        kt3Var4.t = 0;
        kt3Var4.v = 0;
        kt3Var4.k = xyc.oneme_login_welcome_placeholder;
        textView2.setLayoutParams(kt3Var4);
        textView2.setTextColor(yebVar.getText().h);
        dpg.i.b(textView2, t75.b);
        textView2.setText(t3d.oneme_login_welcome_description);
        ((eza) r4.getValue()).getClass();
        constraintLayout.addView(textView2);
        xu6 xu6Var = new xu6(constraintLayout.getContext());
        xu6Var.setId(xyc.oneme_login_welcome_placeholder);
        float f3 = 234;
        kt3 kt3Var5 = new kt3(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        kt3Var5.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        kt3Var5.j = xyc.oneme_login_welcome_title;
        kt3Var5.k = xyc.oneme_login_welcome_continue_btn;
        kt3Var5.t = 0;
        kt3Var5.v = 0;
        xu6Var.setLayoutParams(kt3Var5);
        xu6Var.setImageDrawable(r34.b(getContext(), qwc.welcome_logo));
        ((eza) r4.getValue()).getClass();
        constraintLayout.addView(xu6Var);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(xyc.oneme_login_welcome_continue_btn);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setText(t3d.oneme_login_welcome_continue_btn);
        kt3 kt3Var6 = new kt3(0, -2);
        kt3Var6.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f));
        kt3Var6.k = xyc.oneme_login_welcome_terms;
        kt3Var6.t = 0;
        kt3Var6.v = 0;
        oneMeButton.setLayoutParams(kt3Var6);
        f8j.d(oneMeButton, 300L, new sth(this, 1));
        oneMeButton.setCustomTheme(yebVar);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(xyc.oneme_login_welcome_terms);
        textView3.setGravity(1);
        kt3 kt3Var7 = new kt3(-1, -2);
        kt3Var7.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        kt3Var7.l = 0;
        kt3Var7.t = 0;
        kt3Var7.v = 0;
        textView3.setLayoutParams(kt3Var7);
        dpg.l.b(textView3, t75.b);
        textView3.setTextColor(yebVar.getText().g);
        constraintLayout.addView(textView3);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yy7[] yy7VarArr = Z;
        yy7 yy7Var = yy7VarArr[1];
        bbd bbdVar = this.d;
        TextView textView = (TextView) bbdVar.D(this, yy7Var);
        String strE = z7.e(getContext(), t3d.oneme_login_welcome_terms);
        String strE2 = z7.e(getContext(), t3d.oneme_login_welcome_privacy_policy_clickable_part);
        String strE3 = z7.e(getContext(), t3d.oneme_login_welcome_user_agreement_clickable_part);
        SpannableString spannableString = new SpannableString(strE);
        z0(strE, strE2, spannableString, new e2i(this, 0));
        z0(strE, strE3, spannableString, new e2i(this, 1));
        textView.setText(spannableString);
        ((TextView) bbdVar.D(this, yy7VarArr[1])).setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void z0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan) {
        int iD = vmf.D(str, str2, 0, false, 6);
        int length = str2.length() + iD;
        spannableString.setSpan(clickableSpan, iD, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.Y.getText().e), iD, length, 33);
    }
}
