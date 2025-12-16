package one.me.settings.twofa.creation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.cm6;
import defpackage.d53;
import defpackage.dpg;
import defpackage.dse;
import defpackage.e0d;
import defpackage.emg;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fkg;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.ilg;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jlg;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.klg;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.llg;
import defpackage.mgb;
import defpackage.mlg;
import defpackage.nlg;
import defpackage.olg;
import defpackage.oog;
import defpackage.owf;
import defpackage.plg;
import defpackage.pog;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.qlg;
import defpackage.qq3;
import defpackage.r4d;
import defpackage.rlg;
import defpackage.sue;
import defpackage.t75;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uif;
import defpackage.up7;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.wlg;
import defpackage.wqi;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.xlg;
import defpackage.xz7;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.twofa.creation.TwoFACreationScreen;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0010\u0011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000f¨\u0006\u0012"}, d2 = {"Lone/me/settings/twofa/creation/TwoFACreationScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Loog;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "type", "step", "source", "trackId", "Lup7;", "navData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lup7;)V", "jlg", "ilg", "settings-twofa_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class TwoFACreationScreen extends Widget implements qq3, oog {
    public static final /* synthetic */ yy7[] w0 = {new toc(TwoFACreationScreen.class, "twoFAView", "getTwoFAView()Lone/me/settings/twofa/creation/TwoFAView;", 0), ho7.d(vid.a, TwoFACreationScreen.class, "scrollContentView", "getScrollContentView()Landroid/widget/ScrollView;", 0), new toc(TwoFACreationScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(TwoFACreationScreen.class, "resendCodeTimerView", "getResendCodeTimerView()Landroid/widget/TextView;", 0), new toc(TwoFACreationScreen.class, "resendCodeButton", "getResendCodeButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final Object X;
    public final k18 Y;
    public final bbd Z;
    public final eo7 a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final ka5 o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;

    public TwoFACreationScreen(String str, String str2, String str3, String str4, up7 up7Var) {
        this(gwi.b(new imb("creation_2fa_type_key", str), new imb("creation_2fa_step_key", str2), new imb("creation_2fa_source_key", str3), new imb("creation_2fa_track_id_key", str4), new imb("creation_2fa_nav_data_key", up7Var)));
    }

    public final pog A0() {
        return (pog) this.Z.D(this, w0[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final jlg B0() {
        return (jlg) this.c.getValue();
    }

    public final emg C0() {
        return (emg) this.Y.getValue();
    }

    @Override // defpackage.oog
    public final void T(CharSequence charSequence) {
        emg emgVarC0 = C0();
        String string = charSequence.toString();
        emgVarC0.getClass();
        emgVarC0.H0.O(emgVarC0, emg.O0[1], xfh.o(emgVarC0, null, new wlg(emgVarC0, string, null), 1));
    }

    @Override // defpackage.oog
    public final void a(String str) {
        emg emgVarC0 = C0();
        emgVarC0.getClass();
        if (str.length() == 0) {
            wqi.q(emgVarC0.Y, "Add email step: Can't check code because is empty", new Object[0]);
            return;
        }
        x9f x9fVar = emgVarC0.L0;
        if (x9fVar == null || !x9fVar.isActive()) {
            emgVarC0.L0 = xfh.o(emgVarC0, ((q2b) emgVarC0.w()).b(), new rlg(emgVarC0, str, null), 2);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        emg emgVarC0 = C0();
        emgVarC0.getClass();
        if (i == e0d.oneme_settings_twofa_empty_email_confirmation_action || i != e0d.oneme_settings_twofa_empty_email_confirmation_skip) {
            return;
        }
        emgVarC0.t(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.o;
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
        if (B0() == jlg.a) {
            yfbVar.setTitle(yfbVar.getContext().getString(r4d.oneme_settings_twofa_creation_toolbar_steps, Integer.valueOf(z0().ordinal() + 1)));
        }
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        yfbVar.setTranslationZ(1000.0f);
        yfbVar.setLeftActions(new gfb(new dse(8, this)));
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
        mgb.a(yfbVar, new fkg(yfbVar, scrollView, 1));
        if (z0() != ilg.b) {
            OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), null);
            oneMeButton.setId(e0d.oneme_settings_twofa_action);
            oneMeButton.setSize(jza.c);
            oneMeButton.setMode(iza.a);
            oneMeButton.setAppearance(gza.d);
            oneMeButton.setText(z0() == ilg.a ? r4d.oneme_settings_twofa_creation_password_action : r4d.oneme_settings_twofa_creation_other_action);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
            layoutParams.setMarginStart(iD);
            layoutParams.setMarginEnd(iD);
            layoutParams.bottomMargin = iD;
            oneMeButton.setLayoutParams(layoutParams);
            final int i = 0;
            f8j.d(oneMeButton, 300L, new View.OnClickListener(this) { // from class: glg
                public final /* synthetic */ TwoFACreationScreen b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    i84 i84Var = i84.b;
                    TwoFACreationScreen twoFACreationScreen = this.b;
                    switch (i2) {
                        case 0:
                            yy7[] yy7VarArr = TwoFACreationScreen.w0;
                            emg emgVarC0 = twoFACreationScreen.C0();
                            imb inputTexts = twoFACreationScreen.A0().getInputTexts();
                            yy7[] yy7VarArr2 = emg.O0;
                            ContextScope contextScope = emgVarC0.a;
                            CharSequence charSequence = (CharSequence) inputTexts.a;
                            CharSequence charSequence2 = (CharSequence) inputTexts.b;
                            int iOrdinal = emgVarC0.c.ordinal();
                            if (iOrdinal == 0) {
                                emgVarC0.G0.O(emgVarC0, yy7VarArr2[0], svi.d(contextScope, ((q2b) emgVarC0.w()).b(), i84Var, new amg(charSequence != null ? vmf.c0(charSequence) : null, emgVarC0, charSequence2 != null ? vmf.c0(charSequence2) : null, null)));
                                return;
                            }
                            if (iOrdinal == 1) {
                                emgVarC0.I0.O(emgVarC0, yy7VarArr2[2], svi.d(contextScope, ((q2b) emgVarC0.w()).b(), i84Var, new zlg(emgVarC0, charSequence, null)));
                                return;
                            }
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return;
                            } else if (charSequence != null && charSequence.length() != 0) {
                                emgVarC0.J0.O(emgVarC0, yy7VarArr2[3], svi.d(contextScope, ((q2b) emgVarC0.w()).b(), i84Var, new ylg(emgVarC0, charSequence, null)));
                                return;
                            } else {
                                if (emgVarC0.b != jlg.a) {
                                    return;
                                }
                                xfh.r(emgVarC0.C0, new kmg(new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_title), new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_description), ve3.j(new pq3(e0d.oneme_settings_twofa_empty_email_confirmation_action, new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_email_action), 3, true, 3, 3), new pq3(e0d.oneme_settings_twofa_empty_email_confirmation_skip, new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_skip_action), 2, 32)), null));
                                return;
                            }
                        default:
                            yy7[] yy7VarArr3 = TwoFACreationScreen.w0;
                            emg emgVarC02 = twoFACreationScreen.C0();
                            emgVarC02.K0.O(emgVarC02, emg.O0[4], svi.d(emgVarC02.a, ((q2b) emgVarC02.w()).b(), i84Var, new bmg(emgVarC02, null)));
                            return;
                    }
                }
            });
            mgb.a(oneMeButton, new owf(oneMeButton, scrollView, false, 2));
            frameLayout.addView(oneMeButton);
            return frameLayout;
        }
        TextView textView = new TextView(frameLayout.getContext());
        textView.setId(e0d.oneme_settings_twofa_verify_email_resend_timer);
        dpg.l.b(textView, t75.b);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
        float f = 12;
        int iD2 = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams2.setMarginStart(iD2);
        layoutParams2.setMarginEnd(iD2);
        layoutParams2.bottomMargin = iD2;
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        frameLayout.addView(textView);
        OneMeButton oneMeButton2 = new OneMeButton(frameLayout.getContext(), null);
        oneMeButton2.setId(e0d.oneme_settings_twofa_verify_email_resend_action);
        oneMeButton2.setText(r4d.oneme_settings_twofa_creation_email_verify_resend_code);
        oneMeButton2.setMode(iza.d);
        oneMeButton2.setAppearance(gza.a);
        oneMeButton2.setSize(jza.a);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        int iD3 = kti.d(f * vw4.d().getDisplayMetrics().density);
        layoutParams3.setMarginStart(iD3);
        layoutParams3.setMarginEnd(iD3);
        layoutParams3.bottomMargin = iD3;
        oneMeButton2.setLayoutParams(layoutParams3);
        final int i2 = 1;
        f8j.d(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: glg
            public final /* synthetic */ TwoFACreationScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                i84 i84Var = i84.b;
                TwoFACreationScreen twoFACreationScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = TwoFACreationScreen.w0;
                        emg emgVarC0 = twoFACreationScreen.C0();
                        imb inputTexts = twoFACreationScreen.A0().getInputTexts();
                        yy7[] yy7VarArr2 = emg.O0;
                        ContextScope contextScope = emgVarC0.a;
                        CharSequence charSequence = (CharSequence) inputTexts.a;
                        CharSequence charSequence2 = (CharSequence) inputTexts.b;
                        int iOrdinal = emgVarC0.c.ordinal();
                        if (iOrdinal == 0) {
                            emgVarC0.G0.O(emgVarC0, yy7VarArr2[0], svi.d(contextScope, ((q2b) emgVarC0.w()).b(), i84Var, new amg(charSequence != null ? vmf.c0(charSequence) : null, emgVarC0, charSequence2 != null ? vmf.c0(charSequence2) : null, null)));
                            return;
                        }
                        if (iOrdinal == 1) {
                            emgVarC0.I0.O(emgVarC0, yy7VarArr2[2], svi.d(contextScope, ((q2b) emgVarC0.w()).b(), i84Var, new zlg(emgVarC0, charSequence, null)));
                            return;
                        }
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            return;
                        } else if (charSequence != null && charSequence.length() != 0) {
                            emgVarC0.J0.O(emgVarC0, yy7VarArr2[3], svi.d(contextScope, ((q2b) emgVarC0.w()).b(), i84Var, new ylg(emgVarC0, charSequence, null)));
                            return;
                        } else {
                            if (emgVarC0.b != jlg.a) {
                                return;
                            }
                            xfh.r(emgVarC0.C0, new kmg(new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_title), new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_description), ve3.j(new pq3(e0d.oneme_settings_twofa_empty_email_confirmation_action, new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_email_action), 3, true, 3, 3), new pq3(e0d.oneme_settings_twofa_empty_email_confirmation_skip, new n5g(r4d.oneme_settings_twofa_creation_email_empty_confirmation_skip_action), 2, 32)), null));
                            return;
                        }
                    default:
                        yy7[] yy7VarArr3 = TwoFACreationScreen.w0;
                        emg emgVarC02 = twoFACreationScreen.C0();
                        emgVarC02.K0.O(emgVarC02, emg.O0[4], svi.d(emgVarC02.a, ((q2b) emgVarC02.w()).b(), i84Var, new bmg(emgVarC02, null)));
                        return;
                }
            }
        });
        frameLayout.addView(oneMeButton2);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        tqi.c(new qlg(this, null, 0), view);
        d53 d53Var = new d53(C0().x0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new klg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().D0, getViewLifecycleOwner().p(), l38Var), new llg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().E0, getViewLifecycleOwner().p(), l38Var), new mlg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().C0, getViewLifecycleOwner().p(), l38Var), new nlg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().B0, getViewLifecycleOwner().p(), l38Var), new olg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(xz7.f, getViewLifecycleOwner().p(), l38Var), new plg(null, this), 1), getViewLifecycleScope());
    }

    @Override // defpackage.oog
    public final void t(CharSequence charSequence) {
        emg emgVarC0 = C0();
        String string = charSequence.toString();
        emgVarC0.getClass();
        emgVarC0.H0.O(emgVarC0, emg.O0[1], xfh.o(emgVarC0, null, new xlg(emgVarC0, string, null), 1));
    }

    public final OneMeButton y0() {
        return (OneMeButton) this.t0.D(this, w0[2]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final ilg z0() {
        return (ilg) this.b.getValue();
    }

    public TwoFACreationScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = ipi.b(3, new wj1(bundle, 14));
        this.c = ipi.b(3, new wj1(bundle, 15));
        this.d = ipi.b(3, new wj1(bundle, 16));
        final int i = 0;
        this.o = new ka5(new cm6(this) { // from class: hlg
            public final /* synthetic */ TwoFACreationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                TwoFACreationScreen twoFACreationScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = TwoFACreationScreen.w0;
                        int iOrdinal = twoFACreationScreen.B0().ordinal();
                        if (iOrdinal == 0) {
                            int iOrdinal2 = twoFACreationScreen.z0().ordinal();
                            if (iOrdinal2 == 0) {
                                return f1e.AUTH_2FA_PASSWORD_CREATE;
                            }
                            if (iOrdinal2 == 1) {
                                return f1e.AUTH_2FA_SUGGEST;
                            }
                            if (iOrdinal2 == 2) {
                                return f1e.AUTH_2FA_EMAIL;
                            }
                            if (iOrdinal2 == 3) {
                                return f1e.AUTH_2FA_EMAIL_CODE;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (iOrdinal == 1) {
                            int iOrdinal3 = twoFACreationScreen.z0().ordinal();
                            if (iOrdinal3 == 0) {
                                return f1e.SETTINGS_2FA_PASSWORD_CHANGE;
                            }
                            if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    return f1e.SETTINGS_2FA_CHANGE_EMAIL;
                                }
                                if (iOrdinal3 == 3) {
                                    return f1e.SETTINGS_2FA_EMAIL_CODE;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int iOrdinal4 = twoFACreationScreen.z0().ordinal();
                            if (iOrdinal4 == 0) {
                                return f1e.SETTINGS_2FA_PASSWORD_RESET_INPUT_NEW;
                            }
                            if (iOrdinal4 != 1 && iOrdinal4 != 2 && iOrdinal4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return null;
                    default:
                        yy7[] yy7VarArr2 = TwoFACreationScreen.w0;
                        return new sp7(twoFACreationScreen.getRouter());
                }
            }
        }, (cm6) null, 6);
        final int i2 = 1;
        this.X = ipi.b(3, new cm6(this) { // from class: hlg
            public final /* synthetic */ TwoFACreationScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                TwoFACreationScreen twoFACreationScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = TwoFACreationScreen.w0;
                        int iOrdinal = twoFACreationScreen.B0().ordinal();
                        if (iOrdinal == 0) {
                            int iOrdinal2 = twoFACreationScreen.z0().ordinal();
                            if (iOrdinal2 == 0) {
                                return f1e.AUTH_2FA_PASSWORD_CREATE;
                            }
                            if (iOrdinal2 == 1) {
                                return f1e.AUTH_2FA_SUGGEST;
                            }
                            if (iOrdinal2 == 2) {
                                return f1e.AUTH_2FA_EMAIL;
                            }
                            if (iOrdinal2 == 3) {
                                return f1e.AUTH_2FA_EMAIL_CODE;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (iOrdinal == 1) {
                            int iOrdinal3 = twoFACreationScreen.z0().ordinal();
                            if (iOrdinal3 == 0) {
                                return f1e.SETTINGS_2FA_PASSWORD_CHANGE;
                            }
                            if (iOrdinal3 != 1) {
                                if (iOrdinal3 == 2) {
                                    return f1e.SETTINGS_2FA_CHANGE_EMAIL;
                                }
                                if (iOrdinal3 == 3) {
                                    return f1e.SETTINGS_2FA_EMAIL_CODE;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int iOrdinal4 = twoFACreationScreen.z0().ordinal();
                            if (iOrdinal4 == 0) {
                                return f1e.SETTINGS_2FA_PASSWORD_RESET_INPUT_NEW;
                            }
                            if (iOrdinal4 != 1 && iOrdinal4 != 2 && iOrdinal4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                        return null;
                    default:
                        yy7[] yy7VarArr2 = TwoFACreationScreen.w0;
                        return new sp7(twoFACreationScreen.getRouter());
                }
            }
        });
        this.Y = createViewModelLazy(emg.class, new uif(4, new sue(this, 9, bundle)));
        this.Z = viewBinding(e0d.oneme_settings_twofa_onboarding_content);
        this.s0 = viewBinding(e0d.oneme_settings_twofa_onboarding_scroll_content);
        this.t0 = viewBinding(e0d.oneme_settings_twofa_action);
        this.u0 = viewBinding(e0d.oneme_settings_twofa_verify_email_resend_timer);
        this.v0 = viewBinding(e0d.oneme_settings_twofa_verify_email_resend_action);
    }

    public /* synthetic */ TwoFACreationScreen(String str, String str2, String str3, String str4, up7 up7Var, int i, tk4 tk4Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : up7Var);
    }
}
