package one.me.inviteactions.invitebyphone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a84;
import defpackage.a93;
import defpackage.api;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.c94;
import defpackage.cm6;
import defpackage.d92;
import defpackage.dpg;
import defpackage.dq4;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fr7;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gr7;
import defpackage.gw0;
import defpackage.gza;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hr7;
import defpackage.hs;
import defpackage.i77;
import defpackage.ir7;
import defpackage.iza;
import defpackage.j8b;
import defpackage.jr7;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kr7;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.li1;
import defpackage.lr7;
import defpackage.lwf;
import defpackage.lzf;
import defpackage.mjd;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.qt7;
import defpackage.s5b;
import defpackage.t75;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tr7;
import defpackage.u5b;
import defpackage.u6g;
import defpackage.u9b;
import defpackage.ue;
import defpackage.vid;
import defpackage.vq7;
import defpackage.vr7;
import defpackage.vw4;
import defpackage.wr7;
import defpackage.x2b;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.ye6;
import defpackage.yfb;
import defpackage.yo3;
import defpackage.yp7;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/inviteactions/invitebyphone/InviteByPhoneScreen;", "Lone/me/sdk/arch/Widget;", "Lc94;", "", "Lqq3;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InviteByPhoneScreen extends Widget implements c94, qq3 {
    public static final /* synthetic */ yy7[] z0 = {new z8a(InviteByPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;"), ho7.d(vid.a, InviteByPhoneScreen.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new toc(InviteByPhoneScreen.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new toc(InviteByPhoneScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(InviteByPhoneScreen.class, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new toc(InviteByPhoneScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final /* synthetic */ lwf a;
    public final ka5 b;
    public final eo7 c;
    public final k18 d;
    public final hs o;
    public final bbd s0;
    public final bbd t0;
    public AppCompatTextView u0;
    public final bwf v0;
    public final k18 w0;
    public yp7 x0;
    public final li1 y0;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteByPhoneScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new lwf();
        this.b = new ka5(new i77(14), (cm6) null, 6);
        this.c = eo7.f;
        this.d = createViewModelLazy(wr7.class, new yo3(19, new i77(15)));
        wr7 wr7VarB0 = B0();
        x9f x9fVar = wr7VarB0.B0;
        if (x9fVar == null || !x9fVar.isActive()) {
            wr7VarB0.B0 = gw0.w(gw0.u(new g56(((mjd) wr7VarB0.u0.getValue()).e, new vr7(wr7VarB0, null), 1), ((q2b) ((lzf) wr7VarB0.Y.getValue())).a()), wr7VarB0.a);
        }
        this.o = new hs(String.class, "", "screen:input_phone:phone");
        this.X = viewBinding(s5b.i);
        this.Y = viewBinding(s5b.g);
        this.Z = viewBinding(s5b.f);
        this.s0 = viewBinding(s5b.h);
        this.t0 = viewBinding(s5b.j);
        this.v0 = new bwf(new i77(16));
        this.w0 = vq7.a.getAccessor().d(481);
        this.y0 = new li1(this, 4);
    }

    public static final void y0(InviteByPhoneScreen inviteByPhoneScreen, CharSequence charSequence) {
        if (inviteByPhoneScreen.u0 == null && charSequence != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(inviteByPhoneScreen.getContext(), null);
            dpg.l.b(appCompatTextView, t75.b);
            appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().b);
            kt3 kt3Var = new kt3(0, -2);
            float f = 24;
            kt3Var.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(4 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), 0);
            kt3Var.j = s5b.h;
            kt3Var.t = 0;
            kt3Var.v = 0;
            appCompatTextView.setGravity(8388611);
            appCompatTextView.setLayoutParams(kt3Var);
            View view = inviteByPhoneScreen.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(appCompatTextView);
            }
            inviteByPhoneScreen.u0 = appCompatTextView;
        }
        AppCompatTextView appCompatTextView2 = inviteByPhoneScreen.u0;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(charSequence);
        }
        AppCompatTextView appCompatTextView3 = inviteByPhoneScreen.u0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
        }
    }

    public final j8b A0() {
        return (j8b) this.s0.D(this, z0[4]);
    }

    public final wr7 B0() {
        return (wr7) this.d.getValue();
    }

    @Override // defpackage.c94
    public final void O(x2b x2bVar) {
        B0().C0.m(null, x2bVar);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == u9b.d) {
            getRouter().C();
            return;
        }
        if (i == s5b.b) {
            wr7 wr7VarB0 = B0();
            t9f t9fVar = wr7VarB0.G0;
            yy7[] yy7VarArr = wr7.K0;
            qt7 qt7Var = (qt7) t9fVar.D(wr7VarB0, yy7VarArr[2]);
            if (qt7Var == null || !qt7Var.isActive()) {
                wr7VarB0.G0.O(wr7VarB0, yy7VarArr[2], xfh.o(wr7VarB0, ((q2b) ((lzf) wr7VarB0.Y.getValue())).c().plus((a84) wr7VarB0.t0.getValue()), new tr7(wr7VarB0, null), 2));
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.b;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        A0().postDelayed(new ue(27, this), 200L);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jr7 jr7Var = new jr7(this, getContext());
        yfb yfbVar = new yfb(jr7Var.getContext(), 6);
        int i = s5b.j;
        yfbVar.setId(i);
        kt3 kt3Var = new kt3(-1, -2);
        kt3Var.i = 0;
        kt3Var.t = 0;
        kt3Var.v = 0;
        yfbVar.setLayoutParams(kt3Var);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new d92(29, this)));
        jr7Var.addView(yfbVar);
        TextView textView = new TextView(jr7Var.getContext());
        int i2 = s5b.i;
        textView.setId(i2);
        dpg.c.b(textView, t75.b);
        textView.setText(u5b.j);
        kt3 kt3Var2 = new kt3(0, -2);
        float f = 28;
        float f2 = 24;
        kt3Var2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        kt3Var2.j = i;
        kt3Var2.t = 0;
        kt3Var2.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(kt3Var2);
        jr7Var.addView(textView);
        TextView textView2 = new TextView(jr7Var.getContext());
        int i3 = s5b.g;
        textView2.setId(i3);
        dpg.i.b(textView2, t75.b);
        textView2.setText(u5b.h);
        kt3 kt3Var3 = new kt3(0, -2);
        float f3 = 12;
        kt3Var3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f * vw4.d().getDisplayMetrics().density), 0);
        kt3Var3.j = i2;
        kt3Var3.t = 0;
        kt3Var3.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(kt3Var3);
        jr7Var.addView(textView2);
        j8b j8bVar = new j8b(jr7Var.getContext());
        j8bVar.setId(s5b.h);
        kt3 kt3Var4 = new kt3(0, -2);
        kt3Var4.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(f2 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f3), 0);
        kt3Var4.j = i3;
        kt3Var4.t = 0;
        kt3Var4.v = 0;
        j8bVar.setLayoutParams(kt3Var4);
        j8bVar.setPhoneFormatterProvider(new dq4(this, 8, j8bVar));
        j8bVar.setOnCountryViewClickListener(new fr7(0, this));
        jr7Var.addView(j8bVar);
        OneMeButton oneMeButton = new OneMeButton(jr7Var.getContext(), null);
        oneMeButton.setId(s5b.f);
        oneMeButton.setMode(iza.a);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.d);
        kt3 kt3Var5 = new kt3(0, -2);
        kt3Var5.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), 0, kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(f3 * vw4.d().getDisplayMetrics().density));
        kt3Var5.l = 0;
        kt3Var5.t = 0;
        kt3Var5.v = 0;
        oneMeButton.setLayoutParams(kt3Var5);
        oneMeButton.setText(u5b.g);
        jr7Var.addView(oneMeButton);
        return jr7Var;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.u0 = null;
        j8b j8bVarA0 = A0();
        j8bVarA0.v0.removeTextChangedListener(this.x0);
        this.x0 = null;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        api.e(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        u6g u6gVar = view instanceof u6g ? (u6g) view : null;
        if (u6gVar != null) {
            u6gVar.onThemeChanged(a93.s0.y(view));
        }
        hbd hbdVar = B0().A0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new kr7(null, this), 1), getViewLifecycleScope());
        j8b j8bVarA0 = A0();
        yy7[] yy7VarArr = z0;
        yy7 yy7Var = yy7VarArr[0];
        hs hsVar = this.o;
        j8bVarA0.setText((String) hsVar.a(this));
        OneMeButton oneMeButtonZ0 = z0();
        yy7 yy7Var2 = yy7VarArr[0];
        oneMeButtonZ0.setEnabled(((String) hsVar.a(this)).length() > 0);
        f8j.d(z0(), 300L, new ye6(7, this));
        A0().v0.addTextChangedListener(this.y0);
        gw0.w(new g56(aw0.a(B0().w0, getViewLifecycleOwner().p(), l38Var), new ir7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().v0, getViewLifecycleOwner().p(), l38Var), new hr7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().y0, this.lifecycleOwner.p(), l38Var), new lr7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().D0, getViewLifecycleOwner().p(), l38Var), new gr7(null, this), 1), getViewLifecycleScope());
    }

    public final OneMeButton z0() {
        return (OneMeButton) this.Z.D(this, z0[3]);
    }
}
