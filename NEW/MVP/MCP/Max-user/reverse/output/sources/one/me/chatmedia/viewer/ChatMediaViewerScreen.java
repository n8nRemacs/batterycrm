package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a93;
import defpackage.abh;
import defpackage.ak2;
import defpackage.ap2;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bia;
import defpackage.bvf;
import defpackage.ca9;
import defpackage.cbh;
import defpackage.ccb;
import defpackage.cm6;
import defpackage.d1b;
import defpackage.d52;
import defpackage.d92;
import defpackage.dk7;
import defpackage.dqi;
import defpackage.e3d;
import defpackage.ebh;
import defpackage.eo7;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h54;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i54;
import defpackage.i84;
import defpackage.imb;
import defpackage.ipi;
import defpackage.ivb;
import defpackage.j2e;
import defpackage.j4i;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kcb;
import defpackage.kce;
import defpackage.ki0;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.lo2;
import defpackage.lqi;
import defpackage.mgb;
import defpackage.ms0;
import defpackage.mwd;
import defpackage.o98;
import defpackage.ojb;
import defpackage.oo2;
import defpackage.oq2;
import defpackage.pm2;
import defpackage.po2;
import defpackage.q2b;
import defpackage.qcb;
import defpackage.qfb;
import defpackage.qo2;
import defpackage.qq2;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.rdh;
import defpackage.ro2;
import defpackage.rsb;
import defpackage.rt5;
import defpackage.s2i;
import defpackage.s65;
import defpackage.so2;
import defpackage.svi;
import defpackage.tl2;
import defpackage.to2;
import defpackage.toc;
import defpackage.und;
import defpackage.uo2;
import defpackage.v1a;
import defpackage.v3b;
import defpackage.v4j;
import defpackage.v9j;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vo2;
import defpackage.vw4;
import defpackage.w3d;
import defpackage.w54;
import defpackage.wo2;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.y65;
import defpackage.yeb;
import defpackage.yfb;
import defpackage.yn6;
import defpackage.yq2;
import defpackage.yud;
import defpackage.yy7;
import defpackage.z2f;
import defpackage.za0;
import defpackage.zb2;
import defpackage.zfi;
import defpackage.zo2;
import kotlin.Metadata;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB1\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\n\u0010\u0014¨\u0006\u0015"}, d2 = {"Lone/me/chatmedia/viewer/ChatMediaViewerScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Livb;", "Lrdh;", "Lj2e;", "Lg44;", "Lqq3;", "", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "attachId", "msgId", "", "singleMode", "descOrder", "(JLjava/lang/String;JZZ)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ChatMediaViewerScreen extends SwipeWidget implements ivb, rdh, j2e, g44, qq3 {
    public static final /* synthetic */ yy7[] Q0 = {new toc(ChatMediaViewerScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, ChatMediaViewerScreen.class, "attachId", "getAttachId()Ljava/lang/String;", 0), new toc(ChatMediaViewerScreen.class, "msgId", "getMsgId()J", 0), new toc(ChatMediaViewerScreen.class, "descOrder", "getDescOrder()Z", 0), new toc(ChatMediaViewerScreen.class, "singleMode", "getSingleMode()Z", 0), new toc(ChatMediaViewerScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new toc(ChatMediaViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ChatMediaViewerScreen.class, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0)};
    public static final eo7 R0 = new eo7(3, null, 13);
    public static final eo7 S0 = new eo7(0, new ms0(3, 1, false), 7);
    public final bbd A0;
    public ca9 B0;
    public za0 C0;
    public j4i D0;
    public AnimatorSet E0;
    public final Object F0;
    public final pm2 G0;
    public final k18 H0;
    public final Object I0;
    public final Object J0;
    public final k18 K0;
    public final k18 L0;
    public float M0;
    public boolean N0;
    public x9f O0;
    public bcb P0;
    public final hs X;
    public final hs Y;
    public final hs Z;
    public final hs d;
    public final hs o;
    public final k18 s0;
    public final ka5 t0;
    public final Object u0;
    public final String v0;
    public final k18 w0;
    public final Object x0;
    public final bbd y0;
    public final bbd z0;

    public ChatMediaViewerScreen(Bundle bundle) {
        super(bundle);
        this.d = new hs(Long.class, 0L, "chat.media.viewer.chat_id");
        this.o = new hs(String.class, "", "chat.media.viewer.attach_id");
        this.X = new hs(Long.class, 0L, "chat.media.viewer.message_id");
        Boolean bool = Boolean.FALSE;
        this.Y = new hs(Boolean.class, bool, "chat.media.viewer.desc_order");
        this.Z = new hs(Boolean.class, bool, "chat.media.viewer.single_mode");
        ak2 ak2Var = ak2.a;
        this.s0 = ak2Var.getAccessor().d(48);
        this.t0 = new ka5(new zb2(16), (cm6) null, 6);
        this.u0 = ipi.b(3, new lo2(this, 1));
        this.v0 = "chatMediaViewer";
        this.w0 = createViewModelLazy(yq2.class, new tl2(2, new lo2(this, 2)));
        this.x0 = ipi.b(3, new lo2(this, 3));
        this.y0 = viewBinding(d1b.h);
        this.z0 = viewBinding(d1b.l);
        this.A0 = viewBinding(d1b.f);
        this.F0 = ipi.b(3, new lo2(this, 4));
        this.G0 = new pm2(this, ((g4b) ak2Var.getAccessor().c(56)).a());
        this.H0 = ak2Var.getAccessor().d(127);
        this.I0 = ipi.b(3, new lo2(this, 5));
        this.J0 = ipi.b(3, new lo2(this, 6));
        this.K0 = rsb.a.a();
        this.L0 = ak2Var.getAccessor().d(500);
        this.M0 = -1.0f;
    }

    public static final void H0(ChatMediaViewerScreen chatMediaViewerScreen) {
        if (chatMediaViewerScreen.Q0().i1.a.getValue() == w54.c) {
            ca9 ca9Var = chatMediaViewerScreen.B0;
            if (ca9Var != null) {
                ca9Var.a().setVisibility(8);
                ca9Var.a().setAlpha(0.0f);
            }
            chatMediaViewerScreen.Q0().I();
        }
    }

    public static final void I0(ChatMediaViewerScreen chatMediaViewerScreen) {
        if (chatMediaViewerScreen.S0()) {
            cbh cbhVarO0 = chatMediaViewerScreen.O0();
            cbhVarO0.pause();
            cbhVarO0.a0(null);
            cbhVarO0.stop();
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void A0() {
        Window window;
        Window window2;
        v1a v1aVar = a93.s0;
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(v1aVar.z(getContext()).c.b().k);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setStatusBarColor(v1aVar.z(getContext()).c.b().k);
        }
        Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setNavigationBarColor(v1aVar.z(getContext()).c.b().k);
        }
        K0(false);
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        Q0().O(i, bundle);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void C0() {
        Window window;
        Window window2;
        v1a v1aVar = a93.s0;
        View view = getView();
        if (view != null) {
            yeb yebVar = v1aVar.z(getContext()).c;
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            yeb yebVar2 = v1aVar.z(getContext()).c;
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        yeb yebVar3 = v1aVar.z(getContext()).c;
        window.setNavigationBarColor(0);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void D0() {
        if (getView() != null) {
            if (P0().getVisibility() == 0) {
                P0().setVisibility(8);
                N0().setVisibility(8);
                d52 d52VarL0 = L0();
                if (d52VarL0 != null) {
                    d52VarL0.setVisibility(8);
                }
                za0 za0Var = this.C0;
                if (za0Var != null) {
                    za0Var.e(false);
                }
                ca9 ca9Var = this.B0;
                if (ca9Var != null) {
                    ca9Var.c(false);
                }
            }
            Q0().x();
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long F0() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer G0() {
        return Integer.valueOf(a93.s0.z(getContext()).c.b().k);
    }

    public final int J0() {
        Integer numG;
        View view = getView();
        int i = 0;
        int iIntValue = (view == null || (numG = dqi.g(view)) == null) ? 0 : numG.intValue();
        int measuredHeight = N0().getMeasuredHeight();
        if (iIntValue == 0) {
            ViewGroup.LayoutParams layoutParams = N0().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            }
        }
        return measuredHeight + i;
    }

    public final void K0(boolean z) {
        Activity activity;
        Window window;
        if (z) {
            j4i j4iVar = this.D0;
            if (j4iVar != null) {
                j4iVar.a.o(1);
            }
        } else {
            j4i j4iVar2 = this.D0;
            if (j4iVar2 != null) {
                j4iVar2.a.j(1);
            }
        }
        if (Build.VERSION.SDK_INT < 29 || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(!z);
    }

    public final d52 L0() {
        return (d52) findViewById(d1b.g);
    }

    public final rt5 M0() {
        return (rt5) this.s0.getValue();
    }

    public final dk7 N0() {
        return (dk7) this.A0.D(this, Q0[7]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final cbh O0() {
        return (cbh) this.J0.getValue();
    }

    public final yfb P0() {
        return (yfb) this.z0.D(this, Q0[6]);
    }

    public final yq2 Q0() {
        return (yq2) this.w0.getValue();
    }

    public final ViewPager2 R0() {
        return (ViewPager2) this.y0.D(this, Q0[5]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final boolean S0() {
        x9f x9fVar;
        return this.J0.e() && (x9fVar = this.O0) != null && x9fVar.isActive();
    }

    public final void T0() {
        d52 d52VarL0;
        X0(false, (P0().getVisibility() == 0 || N0().getVisibility() == 0 || ((d52VarL0 = L0()) != null && d52VarL0.getVisibility() == 0)) ? false : true);
    }

    public final void U0(boolean z) {
        bcb bcbVar = this.P0;
        if (bcbVar != null) {
            bcbVar.a();
        }
        String string = getContext().getString(z ? e3d.oneme_chatmedia_viewer_load_video_fail : e3d.oneme_chatmedia_viewer_load_photo_fail);
        ccb ccbVar = new ccb(this);
        ccbVar.h(string);
        ccbVar.c(new kcb(0, 0, J0(), 3));
        ccbVar.e(new qcb(yud.J));
        this.P0 = ccbVar.i();
    }

    public final void V0() {
        cbh cbhVarO0 = O0();
        int i = s65.d;
        this.O0 = gw0.w(aw0.a(new g56(gw0.m(new mwd(new ebh(cbhVarO0, v9j.h(50, y65.MILLISECONDS), null))), new zo2(null, this), 1), getViewLifecycleOwner().p(), l38.d), getViewLifecycleScope());
    }

    public final void W0() {
        if (((gu5) M0()).s()) {
            dk7 dk7VarN0 = N0();
            mgb.a(dk7VarN0, new yn6(dk7VarN0, 6, this));
        }
    }

    public final void X0(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.E0;
        if ((animatorSet == null || !animatorSet.isRunning()) && getView() != null) {
            float f = z2 ? 1.0f : 0.0f;
            o98 o98VarD = ve3.d();
            yfb yfbVarP0 = P0();
            Property property = View.ALPHA;
            o98VarD.add(ObjectAnimator.ofFloat(yfbVarP0, (Property<yfb, Float>) property, P0().getAlpha(), f));
            o98VarD.add(ObjectAnimator.ofFloat(N0(), (Property<dk7, Float>) property, N0().getAlpha(), f));
            d52 d52VarL0 = L0();
            if (d52VarL0 != null) {
                o98VarD.add(ObjectAnimator.ofFloat(L0(), (Property<d52, Float>) property, d52VarL0.getAlpha(), f));
            }
            ca9 ca9Var = this.B0;
            ObjectAnimator objectAnimatorOfFloat = ca9Var != null ? ObjectAnimator.ofFloat(ca9Var.a(), (Property<ImageView, Float>) property, ca9Var.a().getAlpha(), f) : null;
            if (z && objectAnimatorOfFloat != null) {
                o98VarD.add(objectAnimatorOfFloat);
            }
            za0 za0Var = this.C0;
            ObjectAnimator objectAnimatorOfFloat2 = za0Var != null ? ObjectAnimator.ofFloat(za0Var.c(), (Property<ImageView, Float>) property, za0Var.c().getAlpha(), f) : null;
            if (objectAnimatorOfFloat2 != null) {
                o98VarD.add(objectAnimatorOfFloat2);
            }
            o98 o98VarA = ve3.a(o98VarD);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(o98VarA);
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new ap2(this, z, f));
            animatorSet2.addListener(new ap2(f, this, z));
            animatorSet2.start();
            this.E0 = animatorSet2;
        }
    }

    @Override // defpackage.zuf
    public final boolean Y() {
        return ((gu5) M0()).y();
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        yq2 yq2VarQ0 = Q0();
        yy7[] yy7VarArr = yq2.u1;
        yq2VarQ0.O(i, null);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getS0() {
        return this.v0;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.t0;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.c54
    public final boolean handleBack() {
        bcb bcbVar = this.P0;
        if (bcbVar != null) {
            bcbVar.a();
        }
        return super.handleBack();
    }

    @Override // defpackage.j2e
    public final void l(Window window) {
        super.l(window);
        K0(true);
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        W0();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        if (i54Var == i54.POP_EXIT && this.J0.e()) {
            yq2 yq2VarQ0 = Q0();
            long jE = O0().e();
            yq2VarQ0.getClass();
            bia biaVar = bia.a;
            qq2 qq2Var = new qq2(yq2VarQ0, jE, null);
            svi.d(yq2VarQ0.a, biaVar, i84.c, qq2Var);
            O0().C((abh) this.I0.getValue());
            und undVar = ((z2f) this.H0.getValue()).i;
            if (undVar.e()) {
                ((cbh) undVar.getValue()).release();
                undVar.reset();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        d52 d52Var;
        bvf bvfVar = new bvf(getContext());
        bvfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(bvfVar.getContext());
        viewPager2.setId(d1b.h);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(this.G0);
        lqi.b(viewPager2);
        bvfVar.addView(viewPager2);
        yfb yfbVar = new yfb(bvfVar.getContext(), 6);
        yfbVar.setId(d1b.l);
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        yfbVar.setForm(qfb.a);
        v1a v1aVar = a93.s0;
        yfbVar.setCustomTheme(v1aVar.B(yfbVar).c);
        yfbVar.setLeftActions(new gfb(new d92(2, this)));
        yfbVar.setBackgroundColor(v4j.c(v1aVar.B(yfbVar).c.b().d, 0.84f));
        final za0 za0Var = null;
        zfi.b(yfbVar, R0, null);
        bvfVar.addView(yfbVar);
        bvfVar.setClipChildren(false);
        bvfVar.setClipToPadding(false);
        if (((gu5) M0()).s()) {
            d52Var = new d52(bvfVar.getContext(), this, (v3b) this.L0.getValue());
            d52Var.setId(d1b.g);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            d52Var.setLayoutParams(layoutParams);
            d52Var.setClipChildren(false);
            d52Var.setClipToPadding(false);
            bvfVar.addView(d52Var);
        } else {
            d52Var = null;
        }
        dk7 dk7Var = new dk7(bvfVar.getContext());
        dk7Var.setId(d1b.f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        dk7Var.setLayoutParams(layoutParams2);
        dk7Var.setClipChildren(false);
        dk7Var.setClipToPadding(false);
        float f = 9;
        dk7Var.setPadding(dk7Var.getPaddingLeft(), kti.d(vw4.d().getDisplayMetrics().density * f), dk7Var.getPaddingRight(), kti.d(f * vw4.d().getDisplayMetrics().density));
        dk7Var.setBackgroundColor(v4j.c(v1aVar.B(dk7Var).c.b().d, 0.84f));
        zfi.b(dk7Var, S0, null);
        bvfVar.addView(dk7Var);
        Activity activity = getActivity();
        if (activity != null) {
            j4i j4iVar = new j4i(activity.getWindow(), activity.getWindow().getDecorView());
            j4iVar.a.n();
            this.D0 = j4iVar;
        }
        bvfVar.setBackgroundColor(v1aVar.B(bvfVar).c.b().k);
        this.B0 = new ca9(bvfVar, new kce(10, this));
        if (((Boolean) this.F0.getValue()).booleanValue()) {
            lo2 lo2Var = new lo2(this, 7);
            za0Var = new za0();
            za0Var.b = bvfVar;
            za0Var.c = dk7Var;
            za0Var.d = d52Var;
            za0Var.e = lo2Var;
            final int i = 0;
            za0Var.f = ipi.b(3, new cm6() { // from class: am6
                /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, k18] */
                @Override // defpackage.cm6
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            bvf bvfVar2 = (bvf) za0Var.b;
                            Context context = bvfVar2.getContext();
                            int i2 = ivd.H1;
                            yeb yebVar = a93.s0.z(bvfVar2.getContext()).c;
                            return cei.h(i2, -1, context);
                        default:
                            za0 za0Var2 = za0Var;
                            ImageView imageView = new ImageView(((bvf) za0Var2.b).getContext());
                            float f2 = 52;
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density), 8388693));
                            v1a v1aVar2 = a93.s0;
                            int i3 = v1aVar2.B(imageView).c.c().a.a.i;
                            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                            yeb yebVar2 = v1aVar2.B(imageView).c;
                            cei.k(shapeDrawable, -1728053248);
                            imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), shapeDrawable, null));
                            u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                            imageView.setImageDrawable((Drawable) za0Var2.f.getValue());
                            f8j.d(imageView, 300L, new ye6(2, za0Var2));
                            return imageView;
                    }
                }
            });
            final int i2 = 1;
            za0Var.g = ipi.b(3, new cm6() { // from class: am6
                /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, k18] */
                @Override // defpackage.cm6
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            bvf bvfVar2 = (bvf) za0Var.b;
                            Context context = bvfVar2.getContext();
                            int i22 = ivd.H1;
                            yeb yebVar = a93.s0.z(bvfVar2.getContext()).c;
                            return cei.h(i22, -1, context);
                        default:
                            za0 za0Var2 = za0Var;
                            ImageView imageView = new ImageView(((bvf) za0Var2.b).getContext());
                            float f2 = 52;
                            imageView.setLayoutParams(new FrameLayout.LayoutParams(kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f2 * vw4.d().getDisplayMetrics().density), 8388693));
                            v1a v1aVar2 = a93.s0;
                            int i3 = v1aVar2.B(imageView).c.c().a.a.i;
                            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                            yeb yebVar2 = v1aVar2.B(imageView).c;
                            cei.k(shapeDrawable, -1728053248);
                            imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), shapeDrawable, null));
                            u45.n(14, vw4.d().getDisplayMetrics().density, imageView);
                            imageView.setImageDrawable((Drawable) za0Var2.f.getValue());
                            f8j.d(imageView, 300L, new ye6(2, za0Var2));
                            return imageView;
                    }
                }
            });
            za0Var.a = kti.d(12 * vw4.d().getDisplayMetrics().density);
            dqi.a(bvfVar, za0Var.c(), -1);
            mgb.a(dk7Var, new yn6(dk7Var, 13, za0Var));
        }
        this.C0 = za0Var;
        return bvfVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroy() {
        super.onDestroy();
        ?? r0 = this.J0;
        if (r0.e()) {
            ((z2f) this.H0.getValue()).a((cbh) r0.getValue());
        }
        K0(true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.B0 = null;
        this.C0 = null;
        if (((Boolean) this.F0.getValue()).booleanValue()) {
            ((ojb) this.u0.getValue()).disable();
        }
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        AnimatorSet animatorSet = this.E0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 157) {
            for (int i2 : iArr) {
                if (i2 != -1) {
                    yq2 yq2VarQ0 = Q0();
                    cm6 cm6Var = yq2VarQ0.W0;
                    yq2VarQ0.W0 = null;
                    if (cm6Var != null) {
                        cm6Var.invoke();
                        return;
                    }
                    return;
                }
            }
            Q0().W0 = null;
            qsb qsbVar = (qsb) this.K0.getValue();
            s2i s2iVar = new s2i(this, 1);
            int i3 = w3d.messages_list_request_storage_permission_title;
            int i4 = w3d.messages_list_request_storage_permission_subtitle;
            qsbVar.getClass();
            qsb.q(s2iVar, strArr, iArr, i3, i4);
        }
    }

    @Override // defpackage.c54
    public final void onRestoreViewState(View view, Bundle bundle) {
        Window window;
        super.onRestoreViewState(view, bundle);
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        c(window);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        if (((Boolean) this.F0.getValue()).booleanValue()) {
            ((ojb) this.u0.getValue()).enable();
        }
        hbd hbdVar = Q0().Y0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new oo2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Q0().c1, getViewLifecycleOwner().p(), l38Var), new po2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Q0().a1, getViewLifecycleOwner().p(), l38Var), new qo2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Q0().U0, getViewLifecycleOwner().p(), l38Var), new ro2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Q0().V0, getViewLifecycleOwner().p(), l38Var), new so2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Q0().g1, getViewLifecycleOwner().p(), l38Var), new to2(null, this), 1), getViewLifecycleScope());
        R0().b(new ki0(3, this));
        gw0.w(new g56(aw0.a(N0().getEvents(), getViewLifecycleOwner().p(), l38Var), new uo2(null, this), 1), getViewLifecycleScope());
        yq2 yq2VarQ0 = Q0();
        xfh.o(yq2VarQ0, ((q2b) yq2VarQ0.t0).a(), new oq2(yq2VarQ0, null), 2);
        gw0.w(new g56(aw0.a(Q0().l1, getViewLifecycleOwner().p(), l38Var), new vo2(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(Q0().i1, getViewLifecycleOwner().p(), l38Var), new wo2(null, this), 1), getViewLifecycleScope());
    }

    public ChatMediaViewerScreen(long j, String str, long j2, boolean z, boolean z2) {
        this(gwi.b(new imb("chat.media.viewer.chat_id", Long.valueOf(j)), new imb("chat.media.viewer.attach_id", str), new imb("chat.media.viewer.message_id", Long.valueOf(j2)), new imb("chat.media.viewer.single_mode", Boolean.valueOf(z)), new imb("chat.media.viewer.desc_order", Boolean.valueOf(z2))));
    }
}
