package one.me.android.root;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.a3b;
import defpackage.a93;
import defpackage.b3b;
import defpackage.c54;
import defpackage.cm6;
import defpackage.czi;
import defpackage.d74;
import defpackage.dqi;
import defpackage.eud;
import defpackage.f82;
import defpackage.fni;
import defpackage.ho7;
import defpackage.j0b;
import defpackage.jn1;
import defpackage.kti;
import defpackage.l8j;
import defpackage.msd;
import defpackage.nsd;
import defpackage.o98;
import defpackage.oc3;
import defpackage.osd;
import defpackage.r5j;
import defpackage.sn0;
import defpackage.t1b;
import defpackage.toc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w52;
import defpackage.wqi;
import defpackage.wxc;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/root/RootController;", "Lone/me/sdk/arch/Widget;", "Leud;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RootController extends Widget implements eud {
    public static final /* synthetic */ yy7[] s0 = {new toc(RootController.class, "fullScreenContainer", "getFullScreenContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), ho7.d(vid.a, RootController.class, "topIndicatorView", "getTopIndicatorView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new z8a(RootController.class, "fullScreenRouter", "getFullScreenRouter()Lcom/bluelinelabs/conductor/Router;"), new z8a(RootController.class, "dialogsRouter", "getDialogsRouter()Lcom/bluelinelabs/conductor/Router;"), new z8a(RootController.class, "topIndicatorRouter", "getTopIndicatorRouter()Lcom/bluelinelabs/conductor/Router;")};
    public final r5j X;
    public boolean Y;
    public final oc3 Z;
    public AnimatorSet a;
    public final sn0 b;
    public final sn0 c;
    public final r5j d;
    public final r5j o;

    /* JADX WARN: Multi-variable type inference failed */
    public RootController() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        final int i = 0;
        this.b = binding(new cm6(this) { // from class: lsd
            public final /* synthetic */ RootController b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                RootController rootController = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = RootController.s0;
                        f82 f82VarA = czi.a(rootController.getContext());
                        f82VarA.setId(wxc.root_screen);
                        d74 d74Var = new d74(-1, -1);
                        d74Var.b(new AppBarLayout$ScrollingViewBehavior());
                        f82VarA.setLayoutParams(d74Var);
                        return f82VarA;
                    default:
                        yy7[] yy7VarArr2 = RootController.s0;
                        f82 f82VarA2 = czi.a(rootController.getContext());
                        f82VarA2.setId(wxc.root_top_indicator);
                        f82VarA2.setLayoutParams(new d74(-1, -2));
                        f82VarA2.setTranslationY(-kti.d(100 * vw4.d().getDisplayMetrics().density));
                        return f82VarA2;
                }
            }
        });
        final int i2 = 1;
        this.c = binding(new cm6(this) { // from class: lsd
            public final /* synthetic */ RootController b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                RootController rootController = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RootController.s0;
                        f82 f82VarA = czi.a(rootController.getContext());
                        f82VarA.setId(wxc.root_screen);
                        d74 d74Var = new d74(-1, -1);
                        d74Var.b(new AppBarLayout$ScrollingViewBehavior());
                        f82VarA.setLayoutParams(d74Var);
                        return f82VarA;
                    default:
                        yy7[] yy7VarArr2 = RootController.s0;
                        f82 f82VarA2 = czi.a(rootController.getContext());
                        f82VarA2.setId(wxc.root_top_indicator);
                        f82VarA2.setLayoutParams(new d74(-1, -2));
                        f82VarA2.setTranslationY(-kti.d(100 * vw4.d().getDisplayMetrics().density));
                        return f82VarA2;
                }
            }
        });
        int i3 = 29;
        boolean z = false;
        this.d = new r5j(i3, z);
        this.o = new r5j(i3, z);
        this.X = new r5j(i3, z);
        this.Z = new oc3(3, this);
    }

    public static final boolean y0(RootController rootController, f82 f82Var) {
        Object tag = f82Var.getTag(j0b.n);
        boolean zA = fni.a(tag, "SHOW_ANIMATION_TAG");
        boolean zA2 = fni.a(tag, "HIDE_ANIMATION_TAG");
        if (tag == null) {
            return f82Var.getVisibility() == 0;
        }
        if (zA) {
            return true;
        }
        return !zA2 && f82Var.getVisibility() == 0;
    }

    public static final void z0(RootController rootController, boolean z) {
        if (z) {
            if (rootController.I0().getTranslationY() == vw4.d().getDisplayMetrics().density * 0.0f) {
                return;
            }
        } else if (rootController.I0().getTranslationY() == (-(vw4.d().getDisplayMetrics().density * 100.0f))) {
            return;
        }
        wqi.c("RootController", "validateStateIsNeeded for isVisible=" + z + ".", new Object[0]);
        rootController.D0(z);
    }

    public final void A0(boolean z, c54 c54Var) {
        String str = z ? "SHOW_ANIMATION_TAG" : "HIDE_ANIMATION_TAG";
        if (z && !H0().n() && c54Var != null) {
            H0().S(l8j.a(c54Var, null, null));
        }
        I0().setTag(j0b.n, str);
        I0().setVisibility(0);
    }

    public final void B0(boolean z, boolean z2, CallIndicatorWidget callIndicatorWidget) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.a;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.a) != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        A0(z, callIndicatorWidget);
        animatorSet3.setDuration(z2 ? 0L : 250L);
        Integer numN = dqi.n(I0());
        int iIntValue = numN != null ? numN.intValue() : 0;
        o98 o98VarD = ve3.d();
        if (z) {
            o98VarD.add(ObjectAnimator.ofFloat(I0(), (Property<f82, Float>) View.Y, I0().getY(), vw4.d().getDisplayMetrics().density * 0.0f));
            f82 f82VarF0 = F0();
            float y = F0().getY();
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("topMarginProp", y, (F0().getY() + kti.d(100 * vw4.d().getDisplayMetrics().density)) - iIntValue));
            valueAnimatorOfPropertyValuesHolder.addUpdateListener(new msd(f82VarF0, y));
            o98VarD.add(valueAnimatorOfPropertyValuesHolder);
        } else {
            float f = 100;
            o98VarD.add(ObjectAnimator.ofFloat(I0(), (Property<f82, Float>) View.Y, I0().getY(), -kti.d(vw4.d().getDisplayMetrics().density * f)));
            f82 f82VarF02 = F0();
            float y2 = F0().getY();
            ValueAnimator valueAnimatorOfPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("topMarginProp", y2, (F0().getY() - kti.d(f * vw4.d().getDisplayMetrics().density)) + iIntValue));
            valueAnimatorOfPropertyValuesHolder2.addUpdateListener(new msd(f82VarF02, y2));
            o98VarD.add(valueAnimatorOfPropertyValuesHolder2);
        }
        animatorSet3.playTogether(ve3.a(o98VarD));
        animatorSet3.addListener(new w52(this, z));
        animatorSet3.start();
        this.a = animatorSet3;
    }

    public final void C0(boolean z, boolean z2, CallIndicatorWidget callIndicatorWidget) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.a;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.a) != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        A0(z, callIndicatorWidget);
        KeyEvent.Callback callbackFindViewById = I0().findViewById(j0b.S);
        jn1 jn1Var = callbackFindViewById instanceof jn1 ? (jn1) callbackFindViewById : null;
        animatorSet3.setDuration(z2 ? 0L : 250L);
        o98 o98VarD = ve3.d();
        if (jn1Var != null) {
            jn1Var.g(o98VarD, z, animatorSet3.getDuration());
        }
        animatorSet3.playTogether(ve3.a(o98VarD));
        animatorSet3.addListener(new nsd(jn1Var, z, this));
        animatorSet3.start();
        this.a = animatorSet3;
    }

    public final void D0(boolean z) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            KeyEvent.Callback callbackFindViewById = I0().findViewById(j0b.S);
            jn1 jn1Var = callbackFindViewById instanceof jn1 ? (jn1) callbackFindViewById : null;
            if (jn1Var != null) {
                jn1Var.a(z);
            }
            I0().setTag(j0b.n, null);
            I0().setVisibility(z ? 0 : 8);
            I0().setTranslationY(z ? vw4.d().getDisplayMetrics().density * 0.0f : -(vw4.d().getDisplayMetrics().density * 100.0f));
            K0(z);
        }
        if (z || !H0().n()) {
            return;
        }
        H0().C();
        wqi.c("RootController", "call indicator was destroyed", new Object[0]);
    }

    public final ytd E0() {
        return (ytd) this.o.D(this, s0[3]);
    }

    public final f82 F0() {
        yy7 yy7Var = s0[0];
        return (f82) this.b.getValue();
    }

    public final ytd G0() {
        return (ytd) this.d.D(this, s0[2]);
    }

    public final ytd H0() {
        return (ytd) this.X.D(this, s0[4]);
    }

    public final f82 I0() {
        yy7 yy7Var = s0[1];
        return (f82) this.c.getValue();
    }

    public final void J0(View view) {
        if (this.Y) {
            return;
        }
        wqi.c("RootController", "Initializing routers", new Object[0]);
        ytd childRouter = getChildRouter((ViewGroup) view.findViewById(wxc.root_dialogs_container), "root:dialog");
        childRouter.e = 3;
        childRouter.R(true);
        yy7[] yy7VarArr = s0;
        yy7 yy7Var = yy7VarArr[3];
        this.o.b = childRouter;
        ytd childRouter2 = getChildRouter((ViewGroup) view.findViewById(wxc.root_top_indicator), "root:topindicator");
        childRouter2.e = 1;
        childRouter2.R(false);
        yy7 yy7Var2 = yy7VarArr[4];
        this.X.b = childRouter2;
        ytd childRouter3 = getChildRouter((ViewGroup) view.findViewById(wxc.root_screen), "root:screen");
        childRouter3.e = 1;
        childRouter3.R(true);
        yy7 yy7Var3 = yy7VarArr[2];
        this.d.b = childRouter3;
        G0().a(this.Z);
        a3b a3bVar = t1b.a.k().d;
        yy7 yy7Var4 = b3b.f[0];
        a3bVar.getClass();
        wqi.c(a3b.class.getName(), "set new router", new Object[0]);
        a3bVar.b = this;
        this.Y = true;
    }

    public final void K0(boolean z) {
        Integer numN = dqi.n(I0());
        int iD = z ? kti.d(100 * vw4.d().getDisplayMetrics().density) - (numN != null ? numN.intValue() : 0) : kti.d(0 * vw4.d().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = F0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) == iD) {
            return;
        }
        f82 f82VarF0 = F0();
        ViewGroup.LayoutParams layoutParams2 = f82VarF0.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = iD;
        f82VarF0.setLayoutParams(marginLayoutParams2);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        ho7.q("RootController::onActivityResumed was called, dialog router initialized: ", "RootController", this.Y);
        a3b a3bVar = t1b.a.k().d;
        yy7 yy7Var = b3b.f[0];
        a3bVar.getClass();
        wqi.c(a3b.class.getName(), "set new router", new Object[0]);
        a3bVar.b = this;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        osd osdVar = new osd(viewGroup.getContext(), null);
        osdVar.setId(wxc.root_view_group);
        osdVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        osdVar.addView(F0());
        osdVar.addView(I0());
        f82 f82VarA = czi.a(osdVar.getContext());
        f82VarA.setId(wxc.root_dialogs_container);
        osdVar.addView(f82VarA, new d74(-1, -1));
        osdVar.onThemeChanged(a93.s0.x(osdVar.getContext()).k());
        return osdVar;
    }

    @Override // defpackage.c54
    public final void onRestoreViewState(View view, Bundle bundle) {
        super.onRestoreViewState(view, bundle);
        wqi.c("RootController", "RootController::onRestoreViewState was called, routers initialized: " + this.Y, new Object[0]);
        J0(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        J0(view);
        wqi.c("RootController", "RootController::onViewCreated was called: routers initialized", new Object[0]);
    }
}
