package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a93;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bvf;
import defpackage.bwf;
import defpackage.cbc;
import defpackage.cm6;
import defpackage.e9b;
import defpackage.ebc;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.fbc;
import defpackage.fdc;
import defpackage.fni;
import defpackage.fzc;
import defpackage.g44;
import defpackage.g56;
import defpackage.g9b;
import defpackage.gfb;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.icc;
import defpackage.imb;
import defpackage.ipi;
import defpackage.iqb;
import defpackage.iv8;
import defpackage.j2e;
import defpackage.j4i;
import defpackage.jcc;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kbc;
import defpackage.ki0;
import defpackage.l38;
import defpackage.l48;
import defpackage.lbc;
import defpackage.lzf;
import defpackage.m9b;
import defpackage.mbc;
import defpackage.nfb;
import defpackage.obc;
import defpackage.pdc;
import defpackage.q2b;
import defpackage.qfb;
import defpackage.rt5;
import defpackage.sa1;
import defpackage.toc;
import defpackage.ts9;
import defpackage.ue3;
import defpackage.vid;
import defpackage.wj1;
import defpackage.xbc;
import defpackage.xfh;
import defpackage.y3b;
import defpackage.ybc;
import defpackage.yeb;
import defpackage.yfb;
import defpackage.yi5;
import defpackage.yy7;
import defpackage.zbc;
import defpackage.zfi;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarsScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lebc;", "Lg44;", "Lj2e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lpdc;", "type", "(JLpdc;)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileAvatarsScreen extends SwipeWidget implements ebc, g44, j2e {
    public static final /* synthetic */ yy7[] y0 = {new toc(ProfileAvatarsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, ProfileAvatarsScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new toc(ProfileAvatarsScreen.class, "progressIndication", "getProgressIndication()Landroid/view/View;", 0)};
    public final eo7 X;
    public final ka5 Y;
    public final k18 Z;
    public final k18 d;
    public final bwf o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final obc v0;
    public final Object w0;
    public final Object x0;

    public ProfileAvatarsScreen(Bundle bundle) {
        super(bundle);
        this.d = fdc.a.f();
        final int i = 0;
        this.o = new bwf(new cm6(this) { // from class: wbc
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = ProfileAvatarsScreen.y0;
                        return a93.s0.z(profileAvatarsScreen.getContext()).c;
                    case 1:
                        yy7[] yy7VarArr2 = ProfileAvatarsScreen.y0;
                        ln lnVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new j4i(lnVarRequireActivity.getWindow(), lnVarRequireActivity.getWindow().getDecorView());
                    default:
                        yy7[] yy7VarArr3 = ProfileAvatarsScreen.y0;
                        return profileAvatarsScreen.requireResources().getString(c5d.tt_of);
                }
            }
        });
        this.X = eo7.e;
        this.Y = new ka5(f1e.AVATAR_VIEWER);
        this.Z = createViewModelLazy(jcc.class, new iv8(28, new wj1(bundle, 8)));
        this.s0 = viewBinding(fzc.profile_contact_avatars_toolbar);
        this.t0 = viewBinding(fzc.profile_contact_avatars_viewpager);
        this.u0 = viewBinding(fzc.profile_contact_avatars_progress_indicator);
        obc obcVar = new obc(this);
        obcVar.v0 = hd5.a;
        this.v0 = obcVar;
        final int i2 = 1;
        this.w0 = ipi.b(3, new cm6(this) { // from class: wbc
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = ProfileAvatarsScreen.y0;
                        return a93.s0.z(profileAvatarsScreen.getContext()).c;
                    case 1:
                        yy7[] yy7VarArr2 = ProfileAvatarsScreen.y0;
                        ln lnVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new j4i(lnVarRequireActivity.getWindow(), lnVarRequireActivity.getWindow().getDecorView());
                    default:
                        yy7[] yy7VarArr3 = ProfileAvatarsScreen.y0;
                        return profileAvatarsScreen.requireResources().getString(c5d.tt_of);
                }
            }
        });
        final int i3 = 2;
        this.x0 = ipi.b(3, new cm6(this) { // from class: wbc
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i3;
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = ProfileAvatarsScreen.y0;
                        return a93.s0.z(profileAvatarsScreen.getContext()).c;
                    case 1:
                        yy7[] yy7VarArr2 = ProfileAvatarsScreen.y0;
                        ln lnVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new j4i(lnVarRequireActivity.getWindow(), lnVarRequireActivity.getWindow().getDecorView());
                    default:
                        yy7[] yy7VarArr3 = ProfileAvatarsScreen.y0;
                        return profileAvatarsScreen.requireResources().getString(c5d.tt_of);
                }
            }
        });
    }

    public static final View H0(ProfileAvatarsScreen profileAvatarsScreen) {
        return (View) profileAvatarsScreen.u0.D(profileAvatarsScreen, y0[2]);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    public static final void I0(ProfileAvatarsScreen profileAvatarsScreen, mbc mbcVar, int i) {
        if (mbcVar instanceof lbc) {
            CharSequence charSequenceB = ((lbc) mbcVar).a.b(profileAvatarsScreen.getContext());
            CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
            if (fni.a(profileAvatarsScreen.M0().getTitle().getText(), charSequence)) {
                return;
            }
            profileAvatarsScreen.M0().setTitle(charSequence);
            return;
        }
        if (!fni.a(mbcVar, kbc.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int size = profileAvatarsScreen.v0.v0.size();
        if (i < 0 || size <= 0) {
            profileAvatarsScreen.M0().setTitle("");
            return;
        }
        profileAvatarsScreen.M0().setTitle((i + 1) + " " + ((String) profileAvatarsScreen.x0.getValue()) + " " + size);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void A0() {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(((yeb) this.o.getValue()).b().k);
        }
        K0(true);
        L0(true);
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        jcc jccVarN0 = N0();
        int currentItem = O0().getCurrentItem();
        cbc cbcVar = (cbc) ue3.J(currentItem, (List) jccVarN0.b.c().a.getValue());
        if (cbcVar == null) {
            return;
        }
        try {
            String str = (String) ue3.G(cbcVar.b);
            fbc fbcVar = (fbc) ue3.J(i, fbc.s0);
            if (fbcVar == null) {
                return;
            }
            xfh.o(jccVarN0, ((q2b) ((lzf) jccVarN0.o.getValue())).b(), new icc(jccVarN0, fbcVar, cbcVar, str, currentItem, null), 2);
        } catch (NoSuchElementException e) {
            ((y3b) ((yi5) jccVarN0.d.getValue())).a(new IllegalStateException("model.urls.isNotEmpty() == false", e));
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void C0() {
        View view = getView();
        if (view != null) {
            ((yeb) this.o.getValue()).b();
            view.setBackgroundColor(0);
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void D0() {
        if (getView() != null) {
            M0().setVisibility(8);
            M0().setAlpha(0.0f);
            K0(true);
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long F0() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer G0() {
        return Integer.valueOf(((yeb) this.o.getValue()).b().k);
    }

    public final void J0(boolean z) {
        if (getView() != null) {
            float f = z ? 1.0f : 0.0f;
            if (H0(this).getAlpha() == f) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = H0(this).animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.alpha(f).setDuration(200L).setListener(new xbc(this, z, 0)).start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void K0(boolean z) {
        ?? r0 = this.w0;
        if (z) {
            ((j4i) r0.getValue()).a.o(3);
        } else {
            ((j4i) r0.getValue()).a.j(3);
        }
    }

    public final void L0(boolean z) {
        if (getView() != null) {
            if ((M0().getVisibility() == 0) == z) {
                return;
            }
            float f = z ? 1.0f : 0.0f;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = M0().animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.alpha(f).setDuration(200L).setListener(new xbc(this, z, 1)).start();
        }
    }

    public final yfb M0() {
        return (yfb) this.s0.D(this, y0[0]);
    }

    public final jcc N0() {
        return (jcc) this.Z.getValue();
    }

    public final ViewPager2 O0() {
        return (ViewPager2) this.t0.D(this, y0[1]);
    }

    @Override // defpackage.zuf
    public final boolean Y() {
        return ((gu5) ((rt5) this.d.getValue())).y();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // defpackage.j2e
    public final void c(Window window) {
        super.c(window);
        ((j4i) this.w0.getValue()).a.n();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.X;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.Y;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bvf bvfVar = new bvf(getContext());
        bvfVar.setId(-1);
        bvfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        bvfVar.setBackgroundColor(a93.s0.z(layoutInflater.getContext()).c.b().k);
        int i = fzc.profile_contact_avatars_viewpager;
        ViewPager2 viewPager2 = new ViewPager2(bvfVar.getContext());
        viewPager2.setId(i);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setLayoutDirection(0);
        viewPager2.setOffscreenPageLimit(1);
        bvfVar.addView(viewPager2);
        int i2 = fzc.profile_contact_avatars_toolbar;
        yfb yfbVar = new yfb(bvfVar.getContext(), 6);
        yfbVar.setId(i2);
        bwf bwfVar = this.o;
        yfbVar.setCustomTheme((yeb) bwfVar.getValue());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        yfbVar.setLayoutParams(layoutParams);
        yfbVar.setForm(qfb.a);
        yfbVar.setLeftActions(new gfb(new iqb(9, this)));
        yfbVar.setRightActions(new nfb(new ts9(1, this, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 7)));
        zfi.c(yfbVar);
        bvfVar.addView(yfbVar);
        int i3 = fzc.profile_contact_avatars_progress_indicator;
        FrameLayout frameLayout = new FrameLayout(bvfVar.getContext());
        frameLayout.setId(i3);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(((yeb) bwfVar.getValue()).b().g);
        m9b m9bVar = new m9b(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        m9bVar.setLayoutParams(layoutParams2);
        m9bVar.setAppearance(e9b.a);
        m9bVar.setSize(g9b.a);
        frameLayout.addView(m9bVar);
        frameLayout.setOnClickListener(new sa1(3));
        frameLayout.setVisibility(8);
        bvfVar.addView(frameLayout);
        return bvfVar;
    }

    @Override // defpackage.c54
    public final void onDestroy() {
        super.onDestroy();
        K0(true);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        O0().setAdapter(this.v0);
        O0().b(new ki0(9, this));
        hbd hbdVarC = N0().b.c();
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVarC, l48VarP, l38Var), new ybc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(N0().Y, getViewLifecycleOwner().p(), l38Var), new zbc(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final boolean z0() {
        return false;
    }

    public ProfileAvatarsScreen(long j, pdc pdcVar) {
        this(gwi.b(new imb("EXTRA_ID", Long.valueOf(j)), new imb("EXTRA_TYPE", pdcVar.a)));
    }
}
