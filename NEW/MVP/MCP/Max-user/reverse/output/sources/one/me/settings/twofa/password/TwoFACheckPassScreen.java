package one.me.settings.twofa.password;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.cm6;
import defpackage.d53;
import defpackage.dkg;
import defpackage.dse;
import defpackage.e0d;
import defpackage.ekg;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fkg;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gkg;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hkg;
import defpackage.ho7;
import defpackage.i84;
import defpackage.ikg;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jkg;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kga;
import defpackage.kkg;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.lzf;
import defpackage.mgb;
import defpackage.nkg;
import defpackage.omg;
import defpackage.oog;
import defpackage.pog;
import defpackage.q2b;
import defpackage.q9;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.r4d;
import defpackage.rp7;
import defpackage.sue;
import defpackage.svi;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uif;
import defpackage.up7;
import defpackage.vid;
import defpackage.vkg;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.xfh;
import defpackage.xkg;
import defpackage.xs0;
import defpackage.xz7;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/settings/twofa/password/TwoFACheckPassScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Loog;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "source", "trackId", "Lup7;", "navData", "(Ljava/lang/String;Ljava/lang/String;Lup7;)V", "settings-twofa_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class TwoFACheckPassScreen extends Widget implements qq3, oog {
    public static final /* synthetic */ yy7[] t0 = {new toc(TwoFACheckPassScreen.class, "twoFAView", "getTwoFAView()Lone/me/settings/twofa/creation/TwoFAView;", 0), ho7.d(vid.a, TwoFACheckPassScreen.class, "scrollContentView", "getScrollContentView()Landroid/widget/ScrollView;", 0), new toc(TwoFACheckPassScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(TwoFACheckPassScreen.class, "bottomActionsWrapper", "getBottomActionsWrapper()Landroid/view/View;", 0)};
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final eo7 a;
    public final Object b;
    public final ka5 c;
    public final k18 d;
    public final Object o;
    public final bbd s0;

    public TwoFACheckPassScreen(String str, String str2, up7 up7Var) {
        this(gwi.b(new imb("twofa_check_password_source_key", str), new imb("twofa_check_password_track_id_key", str2), new imb("twofa_check_password_nav_data_key", up7Var)));
    }

    @Override // defpackage.oog
    public final void T(CharSequence charSequence) {
        xkg xkgVarY0 = y0();
        String string = charSequence.toString();
        xkgVarY0.getClass();
        xkgVarY0.F0.O(xkgVarY0, xkg.G0[2], xfh.o(xkgVarY0, null, new vkg(xkgVarY0, string, null), 1));
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        xkg xkgVarY0 = y0();
        xkgVarY0.getClass();
        if (i == e0d.oneme_settings_twofa_delete_user_confirmation_skip || i != e0d.oneme_settings_twofa_delete_user_confirmation_action) {
            return;
        }
        xkgVarY0.E0.O(xkgVarY0, xkg.G0[1], svi.d(xkgVarY0.a, ((q2b) ((lzf) xkgVarY0.s0.getValue())).b(), i84.b, new nkg(xkgVarY0, null)));
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final boolean handleBack() {
        if (((rp7) this.b.getValue()) != rp7.a) {
            return super.handleBack();
        }
        omg.c.p0().b(":login", null);
        return true;
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
        yfbVar.setLeftActions(new gfb(new dse(7, this)));
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
        mgb.a(yfbVar, new fkg(yfbVar, scrollView, 0));
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setId(e0d.oneme_settings_twofa_action_wrapper);
        linearLayout.setOrientation(1);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(e0d.oneme_settings_twofa_action);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setText(r4d.oneme_settings_twofa_creation_other_action);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams2.setMarginStart(iD);
        layoutParams2.setMarginEnd(iD);
        layoutParams2.bottomMargin = iD;
        oneMeButton.setLayoutParams(layoutParams2);
        f8j.d(oneMeButton, 300L, new dkg(this, 0));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton2.setId(e0d.oneme_settings_twofa_forget_password_action);
        oneMeButton2.setText(r4d.oneme_settings_twofa_forget_password_action);
        oneMeButton2.setMode(iza.d);
        oneMeButton2.setAppearance(gza.a);
        oneMeButton2.setSize(jza.a);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density);
        layoutParams3.setMarginStart(iD2);
        layoutParams3.setMarginEnd(iD2);
        layoutParams3.bottomMargin = iD2;
        oneMeButton2.setLayoutParams(layoutParams3);
        f8j.d(oneMeButton2, 300L, new dkg(this, 1));
        linearLayout.addView(oneMeButton2);
        mgb.a(linearLayout, new ekg(linearLayout, scrollView, 0));
        frameLayout.addView(linearLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        tqi.c(new kga(this, (Continuation) null, 29), view);
        d53 d53Var = new d53(y0().x0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new gkg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().A0, getViewLifecycleOwner().p(), l38Var), new hkg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().B0, getViewLifecycleOwner().p(), l38Var), new ikg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().z0, getViewLifecycleOwner().p(), l38Var), new jkg(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(xz7.f, getViewLifecycleOwner().p(), l38Var), new kkg(null, this), 1), getViewLifecycleScope());
    }

    public final xkg y0() {
        return (xkg) this.d.getValue();
    }

    public TwoFACheckPassScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        this.b = ipi.b(3, new wj1(bundle, 13));
        final int i = 0;
        this.c = new ka5(new cm6(this) { // from class: ckg
            public final /* synthetic */ TwoFACheckPassScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
                        int iOrdinal = ((rp7) twoFACheckPassScreen.b.getValue()).ordinal();
                        if (iOrdinal == 0) {
                            return f1e.AUTH_2FA_PASSWORD_INPUT;
                        }
                        if (iOrdinal == 1) {
                            return f1e.SETTINGS_2FA_PASSWORD_INPUT;
                        }
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        yy7[] yy7VarArr2 = TwoFACheckPassScreen.t0;
                        return new sp7(twoFACheckPassScreen.getRouter());
                    default:
                        yy7[] yy7VarArr3 = TwoFACheckPassScreen.t0;
                        if (((rp7) twoFACheckPassScreen.b.getValue()) == rp7.b) {
                            cpi.b(twoFACheckPassScreen.getActivity());
                        }
                        return qqg.a;
                }
            }
        }, (cm6) null, 6);
        this.d = createViewModelLazy(xkg.class, new uif(3, new sue(this, 8, bundle)));
        final int i2 = 1;
        this.o = ipi.b(3, new cm6(this) { // from class: ckg
            public final /* synthetic */ TwoFACheckPassScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
                        int iOrdinal = ((rp7) twoFACheckPassScreen.b.getValue()).ordinal();
                        if (iOrdinal == 0) {
                            return f1e.AUTH_2FA_PASSWORD_INPUT;
                        }
                        if (iOrdinal == 1) {
                            return f1e.SETTINGS_2FA_PASSWORD_INPUT;
                        }
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        yy7[] yy7VarArr2 = TwoFACheckPassScreen.t0;
                        return new sp7(twoFACheckPassScreen.getRouter());
                    default:
                        yy7[] yy7VarArr3 = TwoFACheckPassScreen.t0;
                        if (((rp7) twoFACheckPassScreen.b.getValue()) == rp7.b) {
                            cpi.b(twoFACheckPassScreen.getActivity());
                        }
                        return qqg.a;
                }
            }
        });
        this.X = viewBinding(e0d.oneme_settings_twofa_onboarding_content);
        this.Y = viewBinding(e0d.oneme_settings_twofa_onboarding_scroll_content);
        this.Z = viewBinding(e0d.oneme_settings_twofa_action);
        this.s0 = viewBinding(e0d.oneme_settings_twofa_action_wrapper);
        final int i3 = 2;
        xs0 xs0Var = new xs0(this, new cm6(this) { // from class: ckg
            public final /* synthetic */ TwoFACheckPassScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, k18] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                TwoFACheckPassScreen twoFACheckPassScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
                        int iOrdinal = ((rp7) twoFACheckPassScreen.b.getValue()).ordinal();
                        if (iOrdinal == 0) {
                            return f1e.AUTH_2FA_PASSWORD_INPUT;
                        }
                        if (iOrdinal == 1) {
                            return f1e.SETTINGS_2FA_PASSWORD_INPUT;
                        }
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        yy7[] yy7VarArr2 = TwoFACheckPassScreen.t0;
                        return new sp7(twoFACheckPassScreen.getRouter());
                    default:
                        yy7[] yy7VarArr3 = TwoFACheckPassScreen.t0;
                        if (((rp7) twoFACheckPassScreen.b.getValue()) == rp7.b) {
                            cpi.b(twoFACheckPassScreen.getActivity());
                        }
                        return qqg.a;
                }
            }
        });
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 15, xs0Var));
        }
    }

    public /* synthetic */ TwoFACheckPassScreen(String str, String str2, up7 up7Var, int i, tk4 tk4Var) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : up7Var);
    }
}
