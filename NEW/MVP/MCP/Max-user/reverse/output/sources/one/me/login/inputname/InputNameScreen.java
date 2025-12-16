package one.me.login.inputname;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bud;
import defpackage.bz2;
import defpackage.c54;
import defpackage.cm6;
import defpackage.d73;
import defpackage.dpg;
import defpackage.eo7;
import defpackage.eud;
import defpackage.fua;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hh8;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i77;
import defpackage.ii8;
import defpackage.imb;
import defpackage.ipi;
import defpackage.jp7;
import defpackage.jva;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5j;
import defpackage.lwf;
import defpackage.n5g;
import defpackage.o8c;
import defpackage.oq3;
import defpackage.p23;
import defpackage.p5g;
import defpackage.qf;
import defpackage.qfb;
import defpackage.qm7;
import defpackage.qq3;
import defpackage.qrb;
import defpackage.rm7;
import defpackage.sm7;
import defpackage.t3d;
import defpackage.t75;
import defpackage.toc;
import defpackage.tqi;
import defpackage.txe;
import defpackage.u6g;
import defpackage.u92;
import defpackage.um7;
import defpackage.ut3;
import defpackage.veb;
import defpackage.vid;
import defpackage.vm7;
import defpackage.vw4;
import defpackage.w9b;
import defpackage.wa3;
import defpackage.x9;
import defpackage.xfh;
import defpackage.xyc;
import defpackage.yfb;
import defpackage.ym7;
import defpackage.yo3;
import defpackage.ys;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z44;
import defpackage.z7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/inputname/InputNameScreen;", "Lone/me/sdk/arch/Widget;", "", "Lqrb;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.KEY_TOKEN, "phone", "Lo8c;", "presetAvatars", "(Ljava/lang/String;Ljava/lang/String;Lo8c;)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class InputNameScreen extends Widget implements qrb, qq3 {
    public static final /* synthetic */ yy7[] A0 = {new toc(InputNameScreen.class, ApiProtocol.KEY_TOKEN, "getToken()Ljava/lang/String;", 0), ho7.d(vid.a, InputNameScreen.class, "phone", "getPhone()Ljava/lang/String;", 0), new toc(InputNameScreen.class, "nameInput", "getNameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new toc(InputNameScreen.class, "surnameInput", "getSurnameInput()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new toc(InputNameScreen.class, "buttonsContainer", "getButtonsContainer()Lone/me/login/inputname/AnimatedOneMeButton;", 0), new z8a(InputNameScreen.class, "nameText", "getNameText()Ljava/lang/String;"), new z8a(InputNameScreen.class, "surnameText", "getSurnameText()Ljava/lang/String;")};
    public final k18 X;
    public final k18 Y;
    public final Object Z;
    public final /* synthetic */ lwf a;
    public final hs b;
    public final hs c;
    public final ka5 d;
    public final eo7 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final bbd v0;
    public final bbd w0;
    public final bbd x0;
    public final hs y0;
    public final hs z0;

    public InputNameScreen(String str, String str2, o8c o8cVar) {
        this(gwi.b(new imb("screen:input_name:token", str), new imb("screen:input_name:phone", str2), new imb("screen:input_name:avatars", o8cVar)));
    }

    public final veb A0() {
        return (veb) this.w0.D(this, A0[3]);
    }

    public final String B0() {
        yy7 yy7Var = A0[6];
        return (String) this.z0.a(this);
    }

    public final ym7 C0() {
        return (ym7) this.u0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0() {
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarE = az1.e(t3d.oneme_login_input_name_confirmation_title, null, null, 6);
        int i = t3d.oneme_login_input_name_confirmation_description;
        yy7 yy7Var = A0[1];
        oq3VarE.f(new p5g(i, ys.D(new Object[]{(String) this.c.a(this)})));
        oq3VarE.d(xyc.oneme_login_input_name_confirmation_cancel, new n5g(t3d.oneme_login_input_name_confirmation_cancel));
        oq3VarE.b(xyc.oneme_login_input_name_confirmation_return, new n5g(t3d.oneme_login_input_name_confirmation_return));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
        confirmationBottomSheetE.setTargetController(this);
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        confirmationBottomSheetE.N0(this);
        if (ytdVarE0 != null) {
            bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
            az1.u(false, budVar, true, "BottomSheetWidget");
            ytdVarE0.H(budVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == xyc.oneme_login_input_name_confirmation_return) {
            ((jp7) this.Z.getValue()).a(true);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getO() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.d;
    }

    @Override // defpackage.qrb
    public final void i0(boolean z) {
        ((ii8) this.t0.getValue()).b.m(null, Boolean.FALSE);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        constraintLayout.setLayoutParams(new kt3(-1, -1));
        yfb yfbVar = new yfb(constraintLayout.getContext(), 6);
        yfbVar.setId(xyc.oneme_login_input_name_toolbar);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new rm7(this, 0)));
        constraintLayout.addView(yfbVar);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(xyc.oneme_login_input_name_title);
        textView.setLayoutParams(new kt3(-1, -2));
        textView.setGravity(17);
        dpg.c.b(textView, t75.b);
        tqi.c(new x9(3, null, 13), textView);
        textView.setText(z7.e(getContext(), t3d.oneme_login_input_name_title));
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(xyc.oneme_login_input_name_description);
        textView2.setLayoutParams(new kt3(-1, -2));
        textView2.setGravity(17);
        dpg.i.b(textView2, t75.b);
        tqi.c(new x9(3, null, 14), textView2);
        textView2.setText(z7.e(getContext(), t3d.oneme_login_input_name_description));
        constraintLayout.addView(textView2);
        veb vebVar = new veb(constraintLayout.getContext());
        vebVar.setId(xyc.oneme_login_input_name);
        vebVar.setLayoutParams(new kt3(-1, -2));
        float f = 76;
        vebVar.setMinimumHeight(kti.d(vw4.d().getDisplayMetrics().density * f));
        vebVar.setHint(z7.e(getContext(), t3d.oneme_login_input_name_hint_name));
        yy7 yy7Var = A0[5];
        vebVar.setText((String) this.y0.a(this));
        vebVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        int i = w9b.M;
        vebVar.setBackgroundColorAttr(Integer.valueOf(i));
        tqi.c(new bz2(3, null, 1), vebVar);
        constraintLayout.addView(vebVar);
        veb vebVar2 = new veb(constraintLayout.getContext());
        vebVar2.setId(xyc.oneme_login_input_surname);
        vebVar2.setLayoutParams(new kt3(-1, -2));
        vebVar2.setBackgroundColorAttr(Integer.valueOf(i));
        vebVar2.setMinimumHeight(kti.d(f * vw4.d().getDisplayMetrics().density));
        vebVar2.setHint(z7.e(getContext(), t3d.oneme_login_input_name_hint_surname));
        vebVar2.setText(B0());
        vebVar2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(60)});
        tqi.c(new bz2(3, null, 2), vebVar2);
        constraintLayout.addView(vebVar2);
        qf qfVar = new qf(constraintLayout.getContext());
        qfVar.setId(xyc.oneme_login_input_name_btn_container);
        qfVar.setLayoutParams(new kt3(-1, -2));
        qfVar.setupDisabledButton(new d73(28));
        qfVar.setupActiveButton(new d73(29));
        constraintLayout.addView(qfVar);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int i2 = xyc.oneme_login_input_name_toolbar;
        ut3VarG.d(i2, 6, 0, 6);
        ut3VarG.d(i2, 3, 0, 3);
        ut3VarG.d(i2, 7, 0, 7);
        int i3 = xyc.oneme_login_input_name_title;
        ut3VarG.d(i3, 6, 0, 6);
        float f2 = 12;
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, i3, 5));
        ut3VarG.d(i3, 3, xyc.oneme_login_input_name_toolbar, 4);
        float f3 = 24;
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, i3, 5));
        ut3VarG.d(i3, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, i3, 5));
        int i4 = xyc.oneme_login_input_name_description;
        ut3VarG.d(i4, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, i4, 5));
        ut3VarG.d(i4, 3, xyc.oneme_login_input_name_title, 4);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, i4, 5));
        ut3VarG.d(i4, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, i4, 5));
        int i5 = xyc.oneme_login_input_name;
        ut3VarG.d(i5, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, i5, 5));
        ut3VarG.d(i5, 3, xyc.oneme_login_input_name_description, 4);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, i5, 5));
        ut3VarG.d(i5, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, i5, 5));
        int i6 = xyc.oneme_login_input_surname;
        ut3VarG.d(i6, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, i6, 5));
        ut3VarG.d(i6, 3, xyc.oneme_login_input_name, 4);
        az1.q(8, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, i6, 5));
        ut3VarG.d(i6, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, i6, 5));
        int i7 = xyc.oneme_login_input_name_btn_container;
        ut3VarG.d(i7, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, i7, 5));
        ut3VarG.d(i7, 4, 0, 4);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 4, i7, 5));
        ut3VarG.d(i7, 7, 0, 7);
        new fua(ut3VarG, 7, i7, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        A0().a.setOnFocusChangeListener(null);
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 156 || getView() == null) {
            return;
        }
        xfh.r(C0().Z, txe.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        u6g u6gVar = view instanceof u6g ? (u6g) view : null;
        if (u6gVar != null) {
            u6gVar.onThemeChanged(a93.s0.y(view));
        }
        y0().setActiveButtonClickListener(new qm7(this, 2));
        qf qfVarY0 = y0();
        yy7 yy7Var = A0[5];
        qfVarY0.setEnabled(((String) this.y0.a(this)).length() > 0);
        z0().f(new rm7(this, 1));
        A0().f(new rm7(this, 2));
        C0().t(B0(), A0().a.isFocused());
        A0().a.setOnFocusChangeListener(new wa3(4, new rm7(this, 3)));
        jva jvaVarH = getRouter().h();
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), new z44(this, 7));
        }
        u92 u92Var = C0().s0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(u92Var, l48VarP, l38Var), new vm7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(new p23(aw0.a(C0().X, getViewLifecycleOwner().p(), l38Var), 2), new um7(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((ii8) this.t0.getValue()).c, getViewLifecycleOwner().p(), l38Var), new sm7(null, this), 1), getViewLifecycleScope());
    }

    public final qf y0() {
        return (qf) this.x0.D(this, A0[4]);
    }

    public final veb z0() {
        return (veb) this.v0.D(this, A0[2]);
    }

    public InputNameScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new lwf();
        this.b = new hs(String.class, "screen:input_name:token");
        this.c = new hs(String.class, "screen:input_name:phone");
        this.d = new ka5(new i77(7), (cm6) null, 6);
        this.o = eo7.f;
        hh8 hh8Var = hh8.a;
        this.X = hh8Var.getAccessor().d(10);
        this.Y = hh8Var.getAccessor().d(46);
        this.Z = ipi.b(3, new qm7(this, 0));
        this.s0 = hh8Var.a();
        this.t0 = m39getSharedViewModelcp94BC8("LoginScope", ii8.class, null);
        this.u0 = createViewModelLazy(ym7.class, new yo3(17, new qm7(this, 1)));
        this.v0 = viewBinding(xyc.oneme_login_input_name);
        this.w0 = viewBinding(xyc.oneme_login_input_surname);
        this.x0 = viewBinding(xyc.oneme_login_input_name_btn_container);
        this.y0 = new hs(String.class, "", "screen:input_name:name");
        this.z0 = new hs(String.class, "", "screen:input_name:surname");
    }
}
