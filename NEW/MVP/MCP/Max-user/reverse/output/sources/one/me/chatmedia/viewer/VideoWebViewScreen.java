package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.aeh;
import defpackage.ak2;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.beh;
import defpackage.bvf;
import defpackage.ceh;
import defpackage.cgb;
import defpackage.cqi;
import defpackage.d1b;
import defpackage.d53;
import defpackage.deh;
import defpackage.dgb;
import defpackage.dk7;
import defpackage.dpg;
import defpackage.dqi;
import defpackage.dse;
import defpackage.eeh;
import defpackage.eo7;
import defpackage.es0;
import defpackage.es7;
import defpackage.eza;
import defpackage.f8j;
import defpackage.feh;
import defpackage.fgb;
import defpackage.g44;
import defpackage.g56;
import defpackage.g9b;
import defpackage.geh;
import defpackage.gfb;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.heh;
import defpackage.ho7;
import defpackage.hs;
import defpackage.ieh;
import defpackage.imb;
import defpackage.iza;
import defpackage.j2e;
import defpackage.j4i;
import defpackage.k18;
import defpackage.keh;
import defpackage.kti;
import defpackage.kvf;
import defpackage.l38;
import defpackage.l48;
import defpackage.l6b;
import defpackage.ldf;
import defpackage.leh;
import defpackage.lfb;
import defpackage.lg8;
import defpackage.m1h;
import defpackage.m9b;
import defpackage.ml1;
import defpackage.ms0;
import defpackage.mvd;
import defpackage.o98;
import defpackage.pcc;
import defpackage.qfb;
import defpackage.r34;
import defpackage.rt5;
import defpackage.sfb;
import defpackage.sid;
import defpackage.sue;
import defpackage.t75;
import defpackage.tcf;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ts9;
import defpackage.uif;
import defpackage.v1a;
import defpackage.ve3;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wqi;
import defpackage.yeb;
import defpackage.yfb;
import defpackage.yud;
import defpackage.yy7;
import defpackage.z8b;
import defpackage.zfi;
import defpackage.zid;
import kotlin.Metadata;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chatmedia/viewer/VideoWebViewScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lg44;", "Lj2e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "videoUrl", "msgId", "(JLjava/lang/String;J)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoWebViewScreen extends SwipeWidget implements g44, j2e {
    public static final /* synthetic */ yy7[] H0 = {new toc(VideoWebViewScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, VideoWebViewScreen.class, "videoUrl", "getVideoUrl()Ljava/lang/String;", 0), new toc(VideoWebViewScreen.class, "msgId", "getMsgId()J", 0), new toc(VideoWebViewScreen.class, "webView", "getWebView()Lone/me/sdk/uikit/common/views/OneMeWebView;", 0), new toc(VideoWebViewScreen.class, "webViewContainer", "getWebViewContainer()Landroid/widget/FrameLayout;", 0), new toc(VideoWebViewScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(VideoWebViewScreen.class, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0), new toc(VideoWebViewScreen.class, "progressBar", "getProgressBar()Lone/me/sdk/uikit/common/progressbar/OneMeProgressBar;", 0), new toc(VideoWebViewScreen.class, "errorView", "getErrorView()Landroid/widget/LinearLayout;", 0)};
    public final k18 A0;
    public j4i B0;
    public ldf C0;
    public Bundle D0;
    public final Handler E0;
    public final m1h F0;
    public AnimatorSet G0;
    public final hs X;
    public final k18 Y;
    public final bbd Z;
    public final hs d;
    public final hs o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public final k18 x0;
    public final eo7 y0;
    public final eo7 z0;

    public VideoWebViewScreen(Bundle bundle) {
        super(bundle);
        this.d = new hs(Long.class, 0L, "chat.media.viewer.chat_id");
        this.o = new hs(String.class, "", "chat.media.viewer.attach_url");
        this.X = new hs(Long.class, 0L, "chat.media.viewer.message_id");
        this.Y = createViewModelLazy(aeh.class, new uif(10, new kvf(21, this)));
        this.Z = viewBinding(d1b.A);
        this.s0 = viewBinding(d1b.z);
        this.t0 = viewBinding(d1b.l);
        this.u0 = viewBinding(d1b.f);
        this.v0 = viewBinding(d1b.w);
        this.w0 = viewBinding(d1b.u);
        ak2 ak2Var = ak2.a;
        this.x0 = ak2Var.getAccessor().d(48);
        this.y0 = new eo7(3, null, 13);
        this.z0 = new eo7(0, new ms0(3, 1, false), 7);
        this.A0 = ak2Var.getAccessor().d(81);
        this.E0 = new Handler(Looper.getMainLooper());
        this.F0 = new m1h(5, this);
    }

    public static final void H0(VideoWebViewScreen videoWebViewScreen, int i) {
        Object value;
        leh lehVar;
        String name = VideoWebViewScreen.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ho7.f(i, "videoWebView: handleNewOrientation: "), null);
            }
        }
        tcf tcfVar = videoWebViewScreen.O0().A0;
        do {
            value = tcfVar.getValue();
            lehVar = (leh) value;
        } while (!tcfVar.c(value, lehVar != null ? new leh(i, lehVar.b) : new leh(i, false)));
    }

    public static final boolean I0(VideoWebViewScreen videoWebViewScreen) {
        Activity activity;
        Activity activity2;
        return (videoWebViewScreen.getActivity() == null || (activity = videoWebViewScreen.getActivity()) == null || activity.isDestroyed() || (activity2 = videoWebViewScreen.getActivity()) == null || activity2.isFinishing() || !videoWebViewScreen.isAttached()) ? false : true;
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
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        window.setNavigationBarColor(v1aVar.z(getContext()).c.b().k);
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        O0().u(i);
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
        if (getView() == null || N0().getVisibility() != 0) {
            return;
        }
        N0().setVisibility(8);
        M0().setVisibility(8);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long F0() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer G0() {
        return Integer.valueOf(a93.s0.z(getContext()).c.b().k);
    }

    public final void J0(boolean z) {
        Activity activity;
        Window window;
        if (z) {
            j4i j4iVar = this.B0;
            if (j4iVar != null) {
                j4iVar.a.o(7);
            }
        } else {
            j4i j4iVar2 = this.B0;
            if (j4iVar2 != null) {
                j4iVar2.a.j(3);
            }
        }
        if (Build.VERSION.SDK_INT < 29 || (activity = getActivity()) == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setNavigationBarContrastEnforced(!z);
    }

    public final void K0(boolean z) {
        AnimatorSet animatorSet;
        boolean z2 = false;
        if ((N0().getVisibility() == 0) == z) {
            boolean z3 = M0().getVisibility() == 0;
            if (z && getContext().getResources().getConfiguration().orientation != 2) {
                z2 = true;
            }
            if (z3 == z2) {
                return;
            }
        }
        AnimatorSet animatorSet2 = this.G0;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.G0) != null) {
            animatorSet.cancel();
        }
        this.G0 = new AnimatorSet();
        float f = z ? 1.0f : 0.0f;
        float f2 = z ? -N0().getHeight() : 0.0f;
        float f3 = z ? 0.0f : -N0().getHeight();
        float height = z ? M0().getHeight() : 0.0f;
        float height2 = z ? 0.0f : M0().getHeight();
        o98 o98VarD = ve3.d();
        yfb yfbVarN0 = N0();
        Property property = View.ALPHA;
        o98VarD.add(cqi.b(yfbVarN0, property, N0().getAlpha(), f, 200L, 0L, 112));
        yfb yfbVarN02 = N0();
        Property property2 = View.TRANSLATION_Y;
        o98VarD.add(cqi.b(yfbVarN02, property2, f2, f3, 200L, 0L, 112));
        o98VarD.add(cqi.b(M0(), property, M0().getAlpha(), f, 200L, 0L, 112));
        o98VarD.add(cqi.b(M0(), property2, height, height2, 200L, 0L, 112));
        o98 o98VarA = ve3.a(o98VarD);
        AnimatorSet animatorSet3 = this.G0;
        if (animatorSet3 != null) {
            animatorSet3.playTogether(o98VarA);
        }
        if (z) {
            AnimatorSet animatorSet4 = this.G0;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new beh(this, 1));
            }
        } else {
            AnimatorSet animatorSet5 = this.G0;
            if (animatorSet5 != null) {
                animatorSet5.addListener(new beh(this, 0));
            }
        }
        AnimatorSet animatorSet6 = this.G0;
        if (animatorSet6 != null) {
            animatorSet6.start();
        }
    }

    public final rt5 L0() {
        return (rt5) this.x0.getValue();
    }

    public final dk7 M0() {
        return (dk7) this.u0.D(this, H0[6]);
    }

    public final yfb N0() {
        return (yfb) this.t0.D(this, H0[5]);
    }

    public final aeh O0() {
        return (aeh) this.Y.getValue();
    }

    public final fgb P0() {
        return (fgb) this.Z.D(this, H0[3]);
    }

    public final FrameLayout Q0() {
        return (FrameLayout) this.s0.D(this, H0[4]);
    }

    public final void R0(bvf bvfVar) {
        dk7 dk7Var = new dk7(bvfVar.getContext());
        dk7Var.setId(d1b.f);
        dk7Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 80));
        dk7Var.setClipToPadding(false);
        float f = 9;
        dk7Var.setPadding(dk7Var.getPaddingLeft(), kti.d(vw4.d().getDisplayMetrics().density * f), dk7Var.getPaddingRight(), kti.d(f * vw4.d().getDisplayMetrics().density));
        dk7Var.setBackgroundColor(a93.s0.B(dk7Var).c.b().k);
        zfi.b(dk7Var, this.z0, null);
        bvfVar.addView(dk7Var);
    }

    public final void S0() {
        Handler handler = this.E0;
        m1h m1hVar = this.F0;
        handler.removeCallbacks(m1hVar);
        handler.postDelayed(m1hVar, 2000L);
    }

    public final void T0(bvf bvfVar) {
        yfb yfbVar = new yfb(bvfVar.getContext(), 6);
        yfbVar.setId(d1b.l);
        yfbVar.setForm(qfb.a);
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        yfbVar.setLeftActions(new gfb(new dse(14, this)));
        yfbVar.setRightActions(new lfb(null, new sfb(yud.v0, new ts9(1, this, VideoWebViewScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 19), 14), null));
        v1a v1aVar = a93.s0;
        yfbVar.setCustomTheme(v1aVar.B(yfbVar).c);
        yfbVar.setBackgroundColor(v1aVar.B(yfbVar).c.b().b.d.a);
        zfi.b(yfbVar, this.y0, null);
        bvfVar.addView(yfbVar);
    }

    public final void U0(bvf bvfVar) {
        Bundle bundle;
        FrameLayout frameLayout = new FrameLayout(bvfVar.getContext());
        frameLayout.setId(d1b.z);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-16777216);
        m9b m9bVar = new m9b(frameLayout.getContext());
        m9bVar.setId(d1b.w);
        m9bVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        m9bVar.setAppearance(z8b.a);
        m9bVar.setSize(g9b.a);
        m9bVar.setVisibility(0);
        frameLayout.addView(m9bVar);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setId(d1b.u);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        Drawable drawableMutate = r34.b(linearLayout.getContext(), yud.x0).mutate();
        ImageView imageView = new ImageView(linearLayout.getContext());
        imageView.setImageDrawable(drawableMutate);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        imageView.setLayoutParams(layoutParams);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setText(mvd.r2);
        textView.setSingleLine();
        dpg.d.b(textView, t75.b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setText(mvd.q2);
        textView2.setSingleLine();
        dpg.j.b(textView2, t75.b);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = kti.d(2 * vw4.d().getDisplayMetrics().density);
        layoutParams3.bottomMargin = kti.d(24 * vw4.d().getDisplayMetrics().density);
        layoutParams3.gravity = 1;
        textView2.setLayoutParams(layoutParams3);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        oneMeButton.setLayoutParams(layoutParams4);
        oneMeButton.setText(mvd.p2);
        oneMeButton.setMode(iza.b);
        oneMeButton.setAppearance(gza.d);
        f8j.d(oneMeButton, 300L, new pcc(27, this));
        tqi.c(new es7(textView, textView2, drawableMutate, null, 1), linearLayout);
        linearLayout.addView(imageView);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(oneMeButton);
        frameLayout.addView(linearLayout);
        fgb fgbVar = new fgb(frameLayout.getContext(), 14);
        fgbVar.setId(d1b.A);
        fgbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        fgbVar.setVisibility(8);
        fgbVar.setBackgroundColor(-16777216);
        fgbVar.getSettings().setDomStorageEnabled(true);
        fgbVar.getSettings().setJavaScriptEnabled(true);
        fgbVar.getSettings().setAllowContentAccess(true);
        fgbVar.getSettings().setAllowFileAccess(false);
        fgbVar.getSettings().setMixedContentMode(0);
        fgbVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        String userAgentString = fgbVar.getSettings().getUserAgentString();
        k18 k18Var = this.A0;
        ((eza) k18Var.getValue()).getClass();
        fgbVar.getSettings().setUserAgentString(userAgentString + " MAX/25.19.0");
        ((eza) k18Var.getValue()).getClass();
        WebView.setWebContentsDebuggingEnabled(false);
        zid zidVar = new zid(O0());
        if (((gu5) L0()).z() && (bundle = this.D0) != null) {
            fgbVar.restoreState(bundle);
        }
        fgbVar.setInteractionListener(new keh(this));
        fgbVar.setWebViewClient(new cgb(zidVar));
        fgbVar.setWebChromeClient(new dgb(fgbVar));
        frameLayout.addView(fgbVar);
        bvfVar.addView(frameLayout);
    }

    @Override // defpackage.zuf
    public final boolean Y() {
        return ((gu5) L0()).y();
    }

    @Override // defpackage.j2e
    public final void l(Window window) {
        super.l(window);
        J0(true);
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        Activity activity;
        super.onAttach(view);
        if (!((Boolean) ((gu5) L0()).u.j()).booleanValue() && (activity = getActivity()) != null) {
            activity.setRequestedOrientation(4);
        }
        Context context = view.getContext();
        sid sidVar = new sid();
        sidVar.a = context.getResources().getConfiguration().orientation;
        ldf ldfVar = new ldf(sidVar, this, 2);
        context.registerComponentCallbacks(ldfVar);
        H0(this, sidVar.a);
        this.C0 = ldfVar;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bvf bvfVar;
        Activity activity = getActivity();
        if (activity != null) {
            j4i j4iVar = new j4i(activity.getWindow(), activity.getWindow().getDecorView());
            j4iVar.a.n();
            this.B0 = j4iVar;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            bvfVar = new bvf(getContext());
            bvfVar.setId(d1b.t);
            bvfVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            bvfVar.setBackgroundColor(-16777216);
            T0(bvfVar);
            U0(bvfVar);
            R0(bvfVar);
        } else {
            ceh cehVar = new ceh(getContext());
            cehVar.setId(d1b.t);
            cehVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            cehVar.setBackgroundColor(-16777216);
            T0(cehVar);
            U0(cehVar);
            R0(cehVar);
            bvfVar = cehVar;
        }
        bvfVar.setOnTouchListener(new ml1(6, this));
        if (!bvfVar.isLaidOut() || bvfVar.isLayoutRequested()) {
            bvfVar.addOnLayoutChangeListener(new es0(18, this));
        } else {
            S0();
        }
        dqi.e(bvfVar, new sue(bvfVar, 16, this));
        return bvfVar;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.E0.removeCallbacks(this.F0);
        P0().destroy();
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        Activity activity;
        super.onDetach(view);
        if (!((Boolean) ((gu5) L0()).u.j()).booleanValue() && (activity = getActivity()) != null) {
            activity.setRequestedOrientation(1);
        }
        ldf ldfVar = this.C0;
        if (ldfVar != null) {
            view.getContext().unregisterComponentCallbacks(ldfVar);
        }
    }

    @Override // defpackage.c54
    public final void onRestoreViewState(View view, Bundle bundle) {
        Bundle bundle2;
        Window window;
        super.onRestoreViewState(view, bundle);
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            c(window);
        }
        if (((gu5) L0()).z() && (bundle2 = bundle.getBundle("web_view_state_key")) != null) {
            this.D0 = bundle2;
        }
    }

    @Override // defpackage.c54
    public final void onSaveViewState(View view, Bundle bundle) {
        super.onSaveViewState(view, bundle);
        if (((gu5) L0()).z()) {
            String name = VideoWebViewScreen.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "videoWebView: onSaveViewState with webViewCacheEnabled", null);
                }
            }
            Bundle bundleA = gwi.a();
            P0().saveState(bundleA);
            bundle.putBundle("web_view_state_key", bundleA);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        d53 d53Var = new d53(O0().t0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new deh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(O0().z0, getViewLifecycleOwner().p(), l38Var), new eeh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(O0().w0, getViewLifecycleOwner().p(), l38Var), new feh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(O0().v0, getViewLifecycleOwner().p(), l38Var), new geh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(O0().B0, getViewLifecycleOwner().p(), l38Var), new heh(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(M0().getEvents(), getViewLifecycleOwner().p(), l38Var), new ieh(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final boolean z0() {
        return false;
    }

    public VideoWebViewScreen(long j, String str, long j2) {
        this(gwi.b(new imb("chat.media.viewer.chat_id", Long.valueOf(j)), new imb("chat.media.viewer.attach_url", str), new imb("chat.media.viewer.message_id", Long.valueOf(j2))));
    }
}
