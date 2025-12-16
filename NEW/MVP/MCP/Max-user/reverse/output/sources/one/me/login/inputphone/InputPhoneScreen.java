package one.me.login.inputphone;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a38;
import defpackage.a93;
import defpackage.an7;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bn7;
import defpackage.c94;
import defpackage.ccb;
import defpackage.cm6;
import defpackage.cn7;
import defpackage.dn7;
import defpackage.dpg;
import defpackage.dq4;
import defpackage.en7;
import defpackage.eo7;
import defpackage.eza;
import defpackage.f8j;
import defpackage.fn7;
import defpackage.g56;
import defpackage.gn7;
import defpackage.gw0;
import defpackage.gza;
import defpackage.hbd;
import defpackage.hh8;
import defpackage.hn7;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i77;
import defpackage.ia;
import defpackage.ipi;
import defpackage.iza;
import defpackage.j8b;
import defpackage.jn7;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.lfb;
import defpackage.li1;
import defpackage.lwf;
import defpackage.lzf;
import defpackage.mgb;
import defpackage.mjd;
import defpackage.ms0;
import defpackage.mvd;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qqg;
import defpackage.rsb;
import defpackage.sfb;
import defpackage.t3d;
import defpackage.t5g;
import defpackage.t75;
import defpackage.tcf;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u3g;
import defpackage.v0a;
import defpackage.vid;
import defpackage.vmf;
import defpackage.vw4;
import defpackage.w9b;
import defpackage.wqi;
import defpackage.x2b;
import defpackage.x9;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.y83;
import defpackage.y9b;
import defpackage.ye6;
import defpackage.yeb;
import defpackage.yfb;
import defpackage.yn6;
import defpackage.yn7;
import defpackage.yo3;
import defpackage.yp7;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/login/inputphone/InputPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Lc94;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class InputPhoneScreen extends Widget implements c94 {
    public static final /* synthetic */ yy7[] C0 = {new z8a(InputPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;"), ho7.d(vid.a, InputPhoneScreen.class, "gradientBgView", "getGradientBgView()Landroid/view/View;", 0), new toc(InputPhoneScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(InputPhoneScreen.class, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new toc(InputPhoneScreen.class, "inputDescription", "getInputDescription()Landroid/widget/TextView;", 0), new toc(InputPhoneScreen.class, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    public final k18 A0;
    public final li1 B0;
    public final String X;
    public final k18 Y;
    public final bbd Z;
    public final /* synthetic */ lwf a;
    public final eo7 b;
    public final ka5 c;
    public final hs d;
    public final k18 o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final k18 w0;
    public yp7 x0;
    public final Object y0;
    public final k18 z0;

    public InputPhoneScreen() {
        super(null, 0, 3, null);
        this.a = new lwf();
        this.b = new eo7(0, new ms0(3, 3, false), 7);
        this.c = new ka5(new i77(8), (cm6) null, 6);
        this.d = new hs(String.class, "", "screen:input_phone:phone");
        this.o = createViewModelLazy(yn7.class, new yo3(18, new an7(this, 0)));
        yn7 yn7VarD0 = D0();
        x9f x9fVar = yn7VarD0.C0;
        if (x9fVar == null || !x9fVar.isActive()) {
            yn7VarD0.C0 = gw0.w(gw0.u(new g56(new y83(((mjd) yn7VarD0.X.getValue()).e, 14, yn7VarD0), new xn7(yn7VarD0, null), 1), ((q2b) ((lzf) yn7VarD0.d.getValue())).a()), yn7VarD0.a);
        }
        this.X = "LoginScope";
        hh8 hh8Var = hh8.a;
        this.Y = hh8Var.getAccessor().d(88);
        this.Z = viewBinding(xyc.oneme_login_input_gradient_bg);
        this.s0 = viewBinding(xyc.oneme_login_input_continue_button);
        this.t0 = viewBinding(xyc.oneme_login_input_phone_number_input);
        this.u0 = viewBinding(xyc.oneme_login_input_input_description);
        this.v0 = viewBinding(xyc.oneme_login_input_help_button);
        this.w0 = hh8Var.getAccessor().d(481);
        this.y0 = ipi.b(3, new an7(this, 1));
        rsb.a.a();
        this.z0 = hh8Var.a();
        this.A0 = hh8Var.getAccessor().d(81);
        this.B0 = new li1(this, 3);
    }

    public static void E0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan, yeb yebVar) {
        int iD = vmf.D(str, str2, 0, false, 6);
        int length = str2.length() + iD;
        spannableString.setSpan(clickableSpan, iD, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(yebVar.getText().e), iD, length, 33);
    }

    public static final void y0(InputPhoneScreen inputPhoneScreen, String str) {
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            inputPhoneScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            wqi.e("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", null);
            ccb ccbVar = new ccb(inputPhoneScreen);
            ccbVar.h(inputPhoneScreen.getContext().getString(mvd.I0));
            ccbVar.i();
        }
    }

    public static final void z0(InputPhoneScreen inputPhoneScreen, CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = inputPhoneScreen.D0().B0.b(inputPhoneScreen.getContext());
        }
        inputPhoneScreen.B0().setText(charSequence);
        TextView textViewB0 = inputPhoneScreen.B0();
        yeb yebVarY = a93.s0.y(inputPhoneScreen.B0());
        boolean z = inputPhoneScreen.D0().A0;
        u3g text = yebVarY.getText();
        textViewB0.setTextColor(z ? text.b : text.i);
        inputPhoneScreen.B0().setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final OneMeButton A0() {
        return (OneMeButton) this.s0.D(this, C0[2]);
    }

    public final TextView B0() {
        return (TextView) this.u0.D(this, C0[4]);
    }

    public final j8b C0() {
        return (j8b) this.t0.D(this, C0[3]);
    }

    public final yn7 D0() {
        return (yn7) this.o.getValue();
    }

    @Override // defpackage.c94
    public final void O(x2b x2bVar) {
        yn7 yn7VarD0 = D0();
        boolean z = C0().getPhoneWithoutCode().length() > 0;
        tcf tcfVar = yn7VarD0.x0;
        if (((x2b) tcfVar.getValue()).b == x2bVar.b && z) {
            return;
        }
        tcfVar.m(null, x2bVar);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getX() {
        return this.X;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
        xfh.r(D0().t0, qqg.a);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ConstraintLayout constraintLayout = new ConstraintLayout(scrollView.getContext());
        constraintLayout.setId(xyc.oneme_login_input_constraint_layout);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Continuation continuation = null;
        int i = 0;
        tqi.c(new cn7(this, null, 0), constraintLayout);
        View view = new View(constraintLayout.getContext());
        view.setId(xyc.oneme_login_input_gradient_bg);
        kt3 kt3Var = new kt3(-1, kti.d(283 * vw4.d().getDisplayMetrics().density));
        kt3Var.i = 0;
        kt3Var.t = 0;
        kt3Var.v = 0;
        view.setLayoutParams(kt3Var);
        if (Build.VERSION.SDK_INT <= 29) {
            view.setLayerType(1, null);
        }
        Drawable v0aVar = new v0a();
        v0aVar.setAlpha(127);
        view.setBackground(v0aVar);
        tqi.c(new cn7(this, null, 1), view);
        constraintLayout.addView(view);
        yfb yfbVar = new yfb(constraintLayout.getContext(), 6);
        yfbVar.setId(xyc.oneme_login_input_toolbar);
        kt3 kt3Var2 = new kt3(-1, -2);
        kt3Var2.i = 0;
        kt3Var2.t = 0;
        kt3Var2.v = 0;
        yfbVar.setLayoutParams(kt3Var2);
        yfbVar.setForm(qfb.a);
        int i2 = y9b.A;
        int i3 = w9b.a;
        yfbVar.setRightActions(new lfb(null, new sfb(i2, new ia(yfbVar, 17, this), 6), null));
        ((eza) this.A0.getValue()).getClass();
        zfi.b(yfbVar, new eo7(3, null, 13), null);
        constraintLayout.addView(yfbVar);
        View a38Var = new a38(constraintLayout.getContext());
        a38Var.setId(xyc.oneme_login_input_logo);
        kt3 kt3Var3 = new kt3(-1, 0);
        kt3Var3.i = 0;
        kt3Var3.t = 0;
        kt3Var3.v = 0;
        kt3Var3.l = xyc.oneme_login_input_toolbar;
        a38Var.setLayoutParams(kt3Var3);
        zfi.b(a38Var, new eo7(3, null, 13), null);
        constraintLayout.addView(a38Var);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(xyc.oneme_login_input_title);
        dpg.c.b(textView, t75.b);
        textView.setText(t3d.oneme_login_input_title);
        kt3 kt3Var4 = new kt3(0, -2);
        float f = 28;
        float f2 = 24;
        kt3Var4.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        kt3Var4.j = xyc.oneme_login_input_toolbar;
        kt3Var4.t = 0;
        kt3Var4.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(kt3Var4);
        tqi.c(new x9(3, null, 16), textView);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(xyc.oneme_login_input_description);
        dpg.i.b(textView2, t75.b);
        textView2.setText(t3d.oneme_login_input_description);
        kt3 kt3Var5 = new kt3(0, -2);
        float f3 = 12;
        kt3Var5.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        kt3Var5.j = xyc.oneme_login_input_title;
        kt3Var5.t = 0;
        kt3Var5.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(kt3Var5);
        tqi.c(new x9(3, null, 15), textView2);
        constraintLayout.addView(textView2);
        j8b j8bVar = new j8b(constraintLayout.getContext());
        j8bVar.setId(xyc.oneme_login_input_phone_number_input);
        kt3 kt3Var6 = new kt3(0, -2);
        kt3Var6.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f2));
        kt3Var6.j = xyc.oneme_login_input_description;
        kt3Var6.t = 0;
        kt3Var6.v = 0;
        j8bVar.setLayoutParams(kt3Var6);
        j8bVar.setPhoneFormatterProvider(new dq4(this, 6, j8bVar));
        j8bVar.setOnCountryViewClickListener(new an7(this, 2));
        constraintLayout.addView(j8bVar);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(xyc.oneme_login_input_input_description);
        t5g t5gVar = dpg.l;
        t5gVar.b(textView3, t75.b);
        textView3.setText(D0().B0.b(textView3.getContext()));
        kt3 kt3Var7 = new kt3(0, -2);
        kt3Var7.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f2), 0);
        kt3Var7.j = xyc.oneme_login_input_phone_number_input;
        kt3Var7.t = 0;
        kt3Var7.v = 0;
        textView3.setGravity(8388611);
        textView3.setLayoutParams(kt3Var7);
        tqi.c(new dn7(this, continuation, i), textView3);
        constraintLayout.addView(textView3);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(xyc.oneme_login_input_continue_button);
        oneMeButton.setMode(iza.a);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.d);
        kt3 kt3Var8 = new kt3(0, -2);
        float f4 = 16;
        kt3Var8.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4));
        kt3Var8.j = xyc.oneme_login_input_phone_number_input;
        kt3Var8.k = xyc.oneme_login_input_help_button;
        kt3Var8.t = 0;
        kt3Var8.v = 0;
        kt3Var8.F = 1.0f;
        oneMeButton.setLayoutParams(kt3Var8);
        oneMeButton.setText(t3d.oneme_login_input_continue);
        constraintLayout.addView(oneMeButton);
        TextView textView4 = new TextView(constraintLayout.getContext());
        textView4.setId(xyc.oneme_login_input_help_button);
        textView4.setGravity(1);
        kt3 kt3Var9 = new kt3(-1, -2);
        kt3Var9.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), 0, kti.d(f4 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        kt3Var9.l = 0;
        kt3Var9.t = 0;
        kt3Var9.v = 0;
        textView4.setLayoutParams(kt3Var9);
        t5gVar.b(textView4, t75.b);
        tqi.c(new dn7(this, continuation, 1), textView4);
        constraintLayout.addView(textView4);
        scrollView.addView(constraintLayout);
        return scrollView;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        j8b j8bVarC0 = C0();
        j8bVarC0.v0.removeTextChangedListener(this.x0);
        this.x0 = null;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        a93.s0.x(view.getContext()).k().b();
        window.setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        hbd hbdVar = D0().z0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new en7(null, this), 1), getViewLifecycleScope());
        yy7[] yy7VarArr = C0;
        Drawable background = ((View) this.Z.D(this, yy7VarArr[1])).getBackground();
        v0a v0aVar = background instanceof v0a ? (v0a) background : null;
        if (v0aVar != null) {
            v0aVar.start();
        }
        ((TextView) this.v0.D(this, yy7VarArr[5])).setMovementMethod(LinkMovementMethod.getInstance());
        yy7 yy7Var = yy7VarArr[0];
        String str = (String) this.d.a(this);
        C0().setText(str);
        A0().setEnabled(str.length() > 0);
        f8j.d(A0(), 300L, new ye6(5, this));
        C0().v0.addTextChangedListener(this.B0);
        gw0.w(new g56(D0().Z, new bn7(null, this), 1), getViewLifecycleScope());
        mgb.a(view, new yn6(view, 16, this));
        gw0.w(new g56(D0().u0, new hn7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().F0, getViewLifecycleOwner().p(), l38Var), new fn7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().t0, getViewLifecycleOwner().p(), l38Var), new gn7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().D0, getViewLifecycleOwner().p(), l38Var), new jn7(null, this), 1), getViewLifecycleScope());
    }
}
