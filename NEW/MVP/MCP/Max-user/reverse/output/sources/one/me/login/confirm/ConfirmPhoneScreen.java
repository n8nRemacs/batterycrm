package one.me.login.confirm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.c7j;
import defpackage.cm6;
import defpackage.d53;
import defpackage.dpg;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fp3;
import defpackage.fu2;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gp3;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hh8;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i84;
import defpackage.imb;
import defpackage.ip3;
import defpackage.ipi;
import defpackage.iq3;
import defpackage.iza;
import defpackage.j6;
import defpackage.jp3;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kp3;
import defpackage.kti;
import defpackage.l38;
import defpackage.lp3;
import defpackage.lwf;
import defpackage.lzf;
import defpackage.mgb;
import defpackage.mq3;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qp3;
import defpackage.qq3;
import defpackage.qt7;
import defpackage.rw;
import defpackage.s5g;
import defpackage.t3d;
import defpackage.t75;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tqi;
import defpackage.tw6;
import defpackage.u6g;
import defpackage.up3;
import defpackage.vid;
import defpackage.vp3;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.x9;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.xyc;
import defpackage.yfb;
import defpackage.yo3;
import defpackage.yy7;
import defpackage.z8a;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/confirm/ConfirmPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Liq3;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "verifyToken", "phone", "", "codeLength", "(Ljava/lang/String;Ljava/lang/String;I)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ConfirmPhoneScreen extends Widget implements iq3, qq3 {
    public static final /* synthetic */ yy7[] B0 = {new toc(ConfirmPhoneScreen.class, "verifyToken", "getVerifyToken()Ljava/lang/String;", 0), ho7.d(vid.a, ConfirmPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;", 0), new toc(ConfirmPhoneScreen.class, "codeLength", "getCodeLength()I", 0), new toc(ConfirmPhoneScreen.class, "phoneDescTextView", "getPhoneDescTextView()Landroid/widget/TextView;", 0), new toc(ConfirmPhoneScreen.class, "timerTextView", "getTimerTextView()Landroid/widget/TextView;", 0), new toc(ConfirmPhoneScreen.class, "resendButton", "getResendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(ConfirmPhoneScreen.class, "smsInputView", "getSmsInputView()Lone/me/sdk/codeinput/ConfirmSmsInputView;", 0), new z8a(ConfirmPhoneScreen.class, "loginAnimationJob", "getLoginAnimationJob()Lkotlinx/coroutines/Job;")};
    public final t9f A0;
    public final ka5 X;
    public final k18 Y;
    public final Object Z;
    public final /* synthetic */ lwf a;
    public final eo7 b;
    public final hs c;
    public final hs d;
    public final hs o;
    public final k18 s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public TextView x0;
    public final Object y0;
    public AppCompatTextView z0;

    public ConfirmPhoneScreen(String str, String str2, int i) {
        this(gwi.b(new imb("screen:confirm_phone:verify_token", str), new imb("screen:confirm_phone:phone", str2), new imb("screen:confirm_phone:code_length", Integer.valueOf(i))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fa, code lost:
    
        if (defpackage.s8j.c(1000, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y0(one.me.login.confirm.ConfirmPhoneScreen r9, defpackage.n5f r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.y0(one.me.login.confirm.ConfirmPhoneScreen, n5f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final OneMeButton A0() {
        return (OneMeButton) this.v0.D(this, B0[5]);
    }

    public final mq3 B0() {
        return (mq3) this.w0.D(this, B0[6]);
    }

    public final TextView C0() {
        return (TextView) this.u0.D(this, B0[4]);
    }

    public final vp3 D0() {
        return (vp3) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    public final void E0(String str) {
        boolean z = str != null;
        A0().setVisibility(!z ? 0 : 8);
        C0().setVisibility(z ? 0 : 8);
        A0().setAlpha(z ? 0.0f : 1.0f);
        C0().setAlpha(z ? 1.0f : 0.0f);
        if (str != null) {
            C0().setText(((String) this.y0.getValue()) + " " + str);
        }
    }

    public final void F0() {
        yy7[] yy7VarArr = B0;
        yy7 yy7Var = yy7VarArr[7];
        t9f t9fVar = this.A0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[7], null);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.z0);
        }
        this.z0 = null;
        E0((String) D0().y0.a.getValue());
    }

    public final void G0(s5g s5gVar) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        if (this.x0 == null && s5gVar != null) {
            int iIndexOfChild = ((ViewGroup) getView()).indexOfChild(B0());
            TextView textView = new TextView(getContext());
            dpg.l.b(textView, t75.b);
            textView.setTextColor(a93.s0.y(textView).getText().b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f = 12;
            layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(f * vw4.d().getDisplayMetrics().density), 0);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            View view = getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(textView, iIndexOfChild + 1);
            }
            this.x0 = textView;
        }
        float f2 = s5gVar != null ? 1.0f : 0.0f;
        TextView textView2 = this.x0;
        if (textView2 != null) {
            textView2.setText(s5gVar != null ? s5gVar.b(getContext()) : null);
        }
        TextView textView3 = this.x0;
        if (textView3 == null || (viewPropertyAnimatorAnimate = textView3.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(200L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f2)) == null) {
            return;
        }
        viewPropertyAnimatorAlpha.start();
    }

    @Override // defpackage.iq3
    public final void a(String str) {
        vp3 vp3VarD0 = D0();
        vp3VarD0.getClass();
        String str2 = vp3.F0;
        wqi.c(str2, "onCodeEntered", new Object[0]);
        if (str.length() == 0) {
            wqi.q(str2, "empty sms", new Object[0]);
            return;
        }
        if (str.equals(vp3VarD0.B0)) {
            return;
        }
        vp3VarD0.B0 = str;
        vp3VarD0.D0.O(vp3VarD0, vp3.E0[0], (x9f) vp3VarD0.b.a(vp3VarD0.a, ((q2b) ((lzf) vp3VarD0.s0.getValue())).b(), i84.b, new qp3(vp3VarD0, str, null)));
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == xyc.oneme_login_sms_code_exceeded_ok_btn) {
            getRouter().C();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.X;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        B0().requestFocus();
        vp3 vp3VarD0 = D0();
        x9f x9fVar = vp3VarD0.C0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        vp3VarD0.C0 = xfh.o(vp3VarD0, null, new up3(vp3VarD0, null), 3);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new fp3(this, 0)));
        linearLayout.setGravity(17);
        linearLayout.addView(yfbVar);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(xyc.oneme_login_confirm_title);
        textView.setText(t3d.oneme_login_confirm_title);
        dpg.c.b(textView, t75.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(24 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        textView.setLayoutParams(layoutParams);
        tqi.c(new x9(3, null, 8), textView);
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(xyc.oneme_login_confirm_description);
        dpg.i.b(textView2, t75.b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        textView2.setLayoutParams(layoutParams2);
        tqi.c(new x9(3, null, 9), textView2);
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        mq3 mq3Var = new mq3(linearLayout.getContext(), 0);
        mq3Var.setId(xyc.oneme_login_confirm_sms_input);
        mq3Var.setListener(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(vw4.d().getDisplayMetrics().density * f), 0);
        mq3Var.setLayoutParams(layoutParams3);
        mgb.a(mq3Var, new ip3(mq3Var, mq3Var, 0));
        mq3Var.setKeyboardOpen(new fu2(28));
        yy7 yy7Var = B0[2];
        mq3Var.setCountCells(((Number) this.o.a(this)).intValue());
        linearLayout.setGravity(17);
        linearLayout.addView(mq3Var);
        View space = new Space(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 0);
        layoutParams4.weight = 1.0f;
        space.setLayoutParams(layoutParams4);
        linearLayout.addView(space);
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setId(xyc.oneme_login_confirm_timer);
        dpg.l.b(textView3, t75.b);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 16;
        layoutParams5.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView3.setLayoutParams(layoutParams5);
        tqi.c(new x9(3, null, 7), textView3);
        textView3.setGravity(17);
        linearLayout.addView(textView3);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(xyc.oneme_login_confirm_resend_code);
        oneMeButton.setText(t3d.oneme_login_confirm_resend);
        oneMeButton.setMode(iza.d);
        oneMeButton.setAppearance(gza.a);
        oneMeButton.setSize(jza.a);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams6);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        F0();
        this.x0 = null;
        B0().setListener(null);
        super.onDestroyView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        u6g u6gVar = view instanceof u6g ? (u6g) view : null;
        if (u6gVar != null) {
            u6gVar.onThemeChanged(a93.s0.y(view));
        }
        yy7[] yy7VarArr = B0;
        TextView textView = (TextView) this.t0.D(this, yy7VarArr[3]);
        Context context = getContext();
        int i = t3d.oneme_login_confirm_description;
        yy7 yy7Var = yy7VarArr[1];
        textView.setText(context.getString(i, (String) this.d.a(this)));
        f8j.d(A0(), 300L, new j6(16, this));
        B0().setOnAnimationEnded(new fp3(this, 1));
        gw0.w(new g56(aw0.a(D0().w0, getViewLifecycleOwner().p(), l38.d), new jp3(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(D0().y0, new kp3(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(new d53(D0().z0, 12), new lp3(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(D0().v0, new rw(2, this, ConfirmPhoneScreen.class, "processSmsEvent", "processSmsEvent(Lone/me/login/confirm/SmsCodeResultEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 1), getViewLifecycleScope());
        vp3 vp3VarD0 = D0();
        tw6 tw6Var = (tw6) vp3VarD0.t0.getValue();
        tw6Var.g = vp3VarD0.c;
        tw6Var.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(android.widget.TextView r12, int r13, boolean r14, defpackage.q44 r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.hp3
            if (r0 == 0) goto L13
            r0 = r15
            hp3 r0 = (defpackage.hp3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            hp3 r0 = new hp3
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.X
            int r1 = r0.Z
            qqg r2 = defpackage.qqg.a
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 800(0x320, double:3.953E-321)
            g84 r8 = defpackage.g84.a
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L37
            if (r1 != r4) goto L2f
            defpackage.g8j.b(r15)
            return r2
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            boolean r14 = r0.o
            android.widget.TextView r12 = r0.d
            defpackage.g8j.b(r15)
            goto L68
        L3f:
            defpackage.g8j.b(r15)
            r12.setText(r13)
            r12.setAlpha(r3)
            android.view.ViewPropertyAnimator r13 = r12.animate()
            r15 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r13 = r13.alpha(r15)
            android.view.ViewPropertyAnimator r13 = r13.setDuration(r6)
            r13.start()
            r0.d = r12
            r0.o = r14
            r0.Z = r5
            r9 = 2800(0xaf0, double:1.3834E-320)
            java.lang.Object r13 = defpackage.s8j.c(r9, r0)
            if (r13 != r8) goto L68
            goto L84
        L68:
            if (r14 != 0) goto L85
            android.view.ViewPropertyAnimator r12 = r12.animate()
            android.view.ViewPropertyAnimator r12 = r12.alpha(r3)
            android.view.ViewPropertyAnimator r12 = r12.setDuration(r6)
            r12.start()
            r12 = 0
            r0.d = r12
            r0.Z = r4
            java.lang.Object r12 = defpackage.s8j.c(r6, r0)
            if (r12 != r8) goto L85
        L84:
            return r8
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.z0(android.widget.TextView, int, boolean, q44):java.lang.Object");
    }

    public ConfirmPhoneScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new lwf();
        this.b = eo7.f;
        Class<String> cls = String.class;
        this.c = new hs(cls, "screen:confirm_phone:verify_token");
        this.d = new hs(cls, "screen:confirm_phone:phone");
        this.o = new hs(Integer.class, "screen:confirm_phone:code_length");
        this.X = new ka5(new fu2(29), (cm6) null, 6);
        this.Y = createViewModelLazy(vp3.class, new yo3(1, new gp3(this, 0)));
        this.Z = ipi.b(3, new gp3(this, 1));
        this.s0 = hh8.a.a();
        this.t0 = viewBinding(xyc.oneme_login_confirm_description);
        this.u0 = viewBinding(xyc.oneme_login_confirm_timer);
        this.v0 = viewBinding(xyc.oneme_login_confirm_resend_code);
        this.w0 = viewBinding(xyc.oneme_login_confirm_sms_input);
        this.y0 = ipi.b(3, new gp3(this, 2));
        this.A0 = c7j.c();
    }
}
