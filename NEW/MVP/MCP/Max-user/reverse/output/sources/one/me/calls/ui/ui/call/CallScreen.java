package one.me.calls.ui.ui.call;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import defpackage.arb;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bud;
import defpackage.bwf;
import defpackage.c54;
import defpackage.c7j;
import defpackage.c83;
import defpackage.c9a;
import defpackage.cm1;
import defpackage.cm6;
import defpackage.crb;
import defpackage.e64;
import defpackage.e9a;
import defpackage.em1;
import defpackage.eud;
import defpackage.eyc;
import defpackage.f82;
import defpackage.fm1;
import defpackage.fni;
import defpackage.g31;
import defpackage.g44;
import defpackage.g56;
import defpackage.gm1;
import defpackage.gqb;
import defpackage.gw0;
import defpackage.h54;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hw1;
import defpackage.i00;
import defpackage.i1c;
import defpackage.i54;
import defpackage.i84;
import defpackage.ipi;
import defpackage.iv6;
import defpackage.j0b;
import defpackage.j2e;
import defpackage.jl1;
import defpackage.jrb;
import defpackage.jva;
import defpackage.jx1;
import defpackage.k18;
import defpackage.k1e;
import defpackage.k8j;
import defpackage.ka5;
import defpackage.kl1;
import defpackage.l38;
import defpackage.l48;
import defpackage.l8j;
import defpackage.ln;
import defpackage.lv1;
import defpackage.m11;
import defpackage.mfh;
import defpackage.nha;
import defpackage.nl1;
import defpackage.o3;
import defpackage.on1;
import defpackage.oq1;
import defpackage.or1;
import defpackage.ph0;
import defpackage.pq1;
import defpackage.pr1;
import defpackage.q;
import defpackage.qt7;
import defpackage.qv1;
import defpackage.rha;
import defpackage.rl1;
import defpackage.s3;
import defpackage.svi;
import defpackage.t9f;
import defpackage.tl1;
import defpackage.toc;
import defpackage.ud;
import defpackage.ue3;
import defpackage.ul1;
import defpackage.vc1;
import defpackage.vid;
import defpackage.vl1;
import defpackage.vpc;
import defpackage.vye;
import defpackage.w21;
import defpackage.wl1;
import defpackage.wo1;
import defpackage.wqi;
import defpackage.x4h;
import defpackage.x9f;
import defpackage.xl1;
import defpackage.ytd;
import defpackage.yy7;
import defpackage.z41;
import defpackage.z44;
import defpackage.z8a;
import defpackage.zo1;
import defpackage.zqb;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.AudioLevelListener;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/CallScreen;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Lnha;", "Lj2e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "rha", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallScreen extends Widget implements g44, nha, j2e {
    public final Object A0;
    public final t9f B0;
    public final bbd C0;
    public final bbd D0;
    public final Object E0;
    public final Object F0;
    public final Object G0;
    public final Object H0;
    public final Object I0;
    public final Object J0;
    public final Object K0;
    public final ka5 L0;
    public final Object M0;
    public final bwf X;
    public final bwf Y;
    public final k18 Z;
    public final k18 a;
    public final k18 b;
    public final bwf c;
    public final bwf d;
    public final bwf o;
    public final String s0;
    public boolean t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public final bbd x0;
    public final bbd y0;
    public final Object z0;
    public static final /* synthetic */ yy7[] O0 = {new toc(CallScreen.class, "callTopPanelRouter", "getCallTopPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), ho7.d(vid.a, CallScreen.class, "callBottomPanelRouter", "getCallBottomPanelRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(CallScreen.class, "callEventsRouter", "getCallEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(CallScreen.class, "callVpnRouter", "getCallVpnRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new toc(CallScreen.class, "callWaitingRoomEventsRouter", "getCallWaitingRoomEventsRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0), new z8a(CallScreen.class, "actionHandlerJob", "getActionHandlerJob()Lkotlinx/coroutines/Job;"), new toc(CallScreen.class, "mainView", "getMainView()Lone/me/calls/ui/view/CallScreenView;", 0), new toc(CallScreen.class, "callEventsRouterFrameLayout", "getCallEventsRouterFrameLayout()Landroid/widget/FrameLayout;", 0)};
    public static final rha N0 = new rha(15);

    public CallScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = fm1.c();
        bwf bwfVarD = gm1.a.getAccessor().d(4);
        this.b = bwfVarD;
        this.c = new bwf(new g31(29));
        this.d = new bwf(new kl1(this, 9));
        this.o = new bwf(new kl1(this, 10));
        this.X = new bwf(new jl1(0));
        this.Y = new bwf(new jl1(1));
        this.Z = createViewModelLazy(wo1.class, new q(22, new kl1(this, 0)));
        this.s0 = "CALL_SCREEN_SCOPE_ID";
        this.u0 = childSlotRouter(j0b.G1);
        this.v0 = childSlotRouter(j0b.o);
        this.w0 = childSlotRouter(eyc.call_events_view);
        this.x0 = childSlotRouter(eyc.call_screen_vpn_container_id);
        this.y0 = childSlotRouter(eyc.call_waiting_room_events_router);
        this.z0 = ipi.b(3, new jl1(2));
        this.A0 = ipi.b(3, new kl1(this, 1));
        this.B0 = c7j.c();
        this.C0 = viewBinding(eyc.call_screen_main_content_id);
        this.D0 = viewBinding(eyc.call_events_view);
        this.E0 = ipi.b(3, new kl1(this, 2));
        this.F0 = ipi.b(3, new kl1(this, 3));
        this.G0 = ipi.b(3, new kl1(this, 4));
        this.H0 = ipi.b(3, new kl1(this, 5));
        this.I0 = ipi.b(3, new kl1(this, 6));
        this.J0 = ipi.b(3, new kl1(this, 7));
        this.K0 = ipi.b(3, new jl1(3));
        this.L0 = new ka5(new jl1(4), (cm6) null, 6);
        this.M0 = ipi.b(3, new kl1(this, 8));
        jx1 jx1Var = (jx1) bwfVarD.getValue();
        jx1Var.c().getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        arb arbVar = arb.CALL_SCREEN_INIT_TO_RENDER;
        jx1Var.c.m(arbVar, new zqb(arbVar, jElapsedRealtime));
    }

    public static final c83 y0(CallScreen callScreen) {
        return (c83) callScreen.x0.D(callScreen, O0[3]);
    }

    public static void z0(CallScreen callScreen) {
        callScreen.F0().c(!callScreen.F0().g);
    }

    public final void A0(CallEventsWidget callEventsWidget) {
        F0().b(callEventsWidget);
        callEventsWidget.d.add(new nl1(this));
        callEventsWidget.a = new i00(this, 7, callEventsWidget);
    }

    public final void B0(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.a = F0();
        F0().b(callWaitingRoomEventsWidget);
        callWaitingRoomEventsWidget.Y = new i00(this, 6, callWaitingRoomEventsWidget);
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        x9f x9fVarE = svi.e(getViewLifecycleScope(), null, i84.b, new tl1(this, i, bundle, null), 1);
        this.B0.O(this, O0[5], x9fVarE);
    }

    public final void C0(boolean z) {
        if (z) {
            wo1 wo1VarH0 = H0();
            ((hw1) wo1VarH0.c.a).X0 = true;
            wo1VarH0.K0 = true;
        }
        View viewRequireView = requireView();
        if (viewRequireView.getMeasuredWidth() == 0 || viewRequireView.getMeasuredHeight() == 0) {
            requireView().post(new o3(25, this));
        } else {
            getRouter().B(this);
        }
    }

    public final c83 D0() {
        return (c83) this.w0.D(this, O0[2]);
    }

    public final c83 E0() {
        return (c83) this.y0.D(this, O0[4]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final e64 F0() {
        return (e64) this.A0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final i1c G0() {
        return (i1c) this.z0.getValue();
    }

    public final wo1 H0() {
        return (wo1) this.Z.getValue();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getD() {
        return this.s0;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.L0;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        H0().c.j.b();
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            H0().B(true, intent);
            zo1 zo1Var = (zo1) this.c.getValue();
            ln lnVarRequireActivity = requireActivity();
            zo1Var.getClass();
            zo1.c().post(new ud(lnVarRequireActivity, 19, new Intent(lnVarRequireActivity, (Class<?>) CallServiceImpl.class).putExtra("ACTION", 5)));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        H0().c.j.a();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onChangeEnded(h54 h54Var, i54 i54Var) {
        super.onChangeEnded(h54Var, i54Var);
        boolean z = false;
        this.t0 = false;
        if (i54Var.b) {
            wo1 wo1VarH0 = H0();
            e64 e64VarF0 = F0();
            if (e64VarF0.g && e64VarF0.b == null) {
                z = true;
            }
            wo1VarH0.y(z);
        }
        if (i54Var == i54.POP_EXIT) {
            ((vye) this.K0.getValue()).getClass();
            vye.a();
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        this.t0 = true;
        H0().y(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0188  */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget, defpackage.c54
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r25, android.view.ViewGroup r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.calls.ui.ui.call.CallScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        mfh.g(requireActivity(), false);
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            e64 e64VarF0 = F0();
            e64VarF0.a.clear();
            f82 f82Var = e64VarF0.c;
            if (f82Var != null) {
                f82Var.removeOnLayoutChangeListener((View.OnLayoutChangeListener) e64VarF0.e.getValue());
            }
            f82 f82Var2 = e64VarF0.d;
            if (f82Var2 != null) {
                f82Var2.removeOnLayoutChangeListener((View.OnLayoutChangeListener) e64VarF0.f.getValue());
            }
            e64VarF0.c = null;
            e64VarF0.d = null;
            ((pq1) ((oq1) this.Y.getValue())).a.clear();
            wo1 wo1VarH0 = H0();
            qv1 qv1Var = wo1VarH0.c;
            vpc vpcVar = qv1Var.j;
            ((e9a) qv1Var.s.getValue()).h(Boolean.FALSE);
            qv1Var.j.b();
            w21 w21Var = (w21) qv1Var.b;
            CallsAudioManager callsAudioManager = (CallsAudioManager) w21Var.c.get();
            if (callsAudioManager != null) {
                callsAudioManager.setOnAudioDeviceChangeListener(null);
            }
            AudioLevelListener audioLevelListener = (AudioLevelListener) qv1Var.v.getValue();
            try {
                MicrophoneManager microphoneManagerC = w21Var.c();
                if (microphoneManagerC != null) {
                    microphoneManagerC.removeAudioSampleCallback(audioLevelListener);
                }
            } catch (Exception e) {
                wqi.p("CallAudioController", "CallAudioController can't unregister mic audio listener due to: " + e.getMessage() + ".", e);
            }
            vpcVar.h.remove((lv1) qv1Var.y.getValue());
            vpcVar.g = null;
            qt7 qt7Var = (qt7) qv1Var.w.D(qv1Var, qv1.z[0]);
            if (qt7Var != null) {
                qt7Var.cancel(null);
            }
            ((x4h) wo1VarH0.J0.getValue()).b();
            ((pr1) wo1VarH0.Q0.getValue()).a.clear();
        }
        i1c i1cVarG0 = G0();
        i1cVarG0.b.clear();
        i1cVarG0.a.clear();
        F0().c(true);
        yy7[] yy7VarArr = O0;
        ((on1) this.C0.D(this, yy7VarArr[6])).A();
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        if (ytdVarE0 != null) {
            ytdVarE0.L((rl1) this.J0.getValue());
        }
        c54 c54VarB = k8j.b(D0().a);
        CallEventsWidget callEventsWidget = c54VarB instanceof CallEventsWidget ? (CallEventsWidget) c54VarB : null;
        if (callEventsWidget != null) {
            F0().a.remove(callEventsWidget);
        }
        qt7 qt7Var2 = (qt7) this.B0.D(this, yy7VarArr[5]);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        k18 k18Var = this.b;
        jx1 jx1Var = (jx1) k18Var.getValue();
        jx1Var.c().getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        arb arbVar = arb.CALL_SCREEN_VIEW_CREATED;
        jx1Var.c.m(arbVar, new zqb(arbVar, jElapsedRealtime));
        super.onViewCreated(view);
        c54 parentController = this;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        Continuation continuation = null;
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        if (ytdVarE0 != null) {
            ytdVarE0.a((rl1) this.J0.getValue());
        }
        mfh.g(requireActivity(), true);
        qv1 qv1Var = H0().c;
        qv1Var.n();
        vpc vpcVar = qv1Var.j;
        qv1Var.m();
        vpcVar.a();
        vpcVar.h.add((lv1) qv1Var.y.getValue());
        vpcVar.g = new iv6(7, qv1Var);
        qv1Var.w.O(qv1Var, qv1.z[0], gw0.w(qv1Var.x, qv1Var.k));
        yy7[] yy7VarArr = O0;
        c83 c83Var = (c83) this.v0.D(this, yy7VarArr[1]);
        ytd ytdVar = c83Var.a;
        boolean zA = fni.a(c83Var.b(), "call_bottom_panel_widget_tag");
        String str = this.s0;
        if (!zA) {
            ytdVar.R(false);
            bud budVarA = l8j.a(new CallBottomPanelWidget(str, null), null, null);
            budVarA.d("call_bottom_panel_widget_tag");
            ytdVar.S(budVarA);
        }
        yy7 yy7Var = yy7VarArr[0];
        bbd bbdVar = this.u0;
        c83 c83Var2 = (c83) bbdVar.D(this, yy7Var);
        ytd ytdVar2 = c83Var2.a;
        if (!fni.a(c83Var2.b(), "call_top_panel_widget_tag")) {
            ytdVar2.R(false);
            bud budVarA2 = l8j.a(new CallTopPanelWidget(str, null), null, null);
            budVarA2.d("call_top_panel_widget_tag");
            ytdVar2.S(budVarA2);
        }
        Object objB = k8j.b(((c83) bbdVar.D(this, yy7VarArr[0])).a);
        or1 or1Var = objB instanceof or1 ? (or1) objB : null;
        if (or1Var != null) {
            pr1 pr1Var = (pr1) H0().Q0.getValue();
            pr1Var.a.add(or1Var);
            or1Var.B(pr1Var.b);
        }
        c54 c54VarB = k8j.b(D0().a);
        CallEventsWidget callEventsWidget = c54VarB instanceof CallEventsWidget ? (CallEventsWidget) c54VarB : null;
        if (callEventsWidget != null) {
            F0().b(callEventsWidget);
        }
        jva jvaVarH = getRouter().h();
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), new z44(this, 4));
        }
        gw0.w(new z41(H0().M0, new m11(1, new ph0(H0().D0, 13)), new s3(this, continuation, 5), 3), getViewLifecycleScope());
        hbd hbdVar = H0().O0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new ul1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(H0().E0, getViewLifecycleOwner().p(), l38Var), new vl1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(H0().D0, getViewLifecycleOwner().p(), l38Var), new wl1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(H0().L0, getViewLifecycleOwner().p(), l38Var), new xl1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(gw0.m(new z41(H0().F0, H0().G0, new em1(3, null, 0), 3)), getViewLifecycleOwner().p(), l38Var), new cm1(null, this), 1), getViewLifecycleScope());
        jx1 jx1Var2 = (jx1) k18Var.getValue();
        boolean z = ((vc1) H0().A0.a.getValue()).g;
        boolean z2 = H0().w().d;
        c9a c9aVar = jx1Var2.c;
        arb arbVar2 = arb.CALL_SCREEN_INIT_TO_RENDER;
        zqb zqbVar = (zqb) c9aVar.f(arbVar2);
        if (zqbVar == null || zqbVar.c != -1) {
            return;
        }
        zqb zqbVar2 = (zqb) c9aVar.f(arbVar2);
        if (zqbVar2 != null) {
            jx1Var2.c().getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            zqbVar2.c = jElapsedRealtime2 - zqbVar2.b;
            jx1Var2.f(jElapsedRealtime2);
        }
        jx1Var2.e = z;
        jx1Var2.d = z2;
        jrb jrbVar = (jrb) jx1Var2.a.getValue();
        jx1 jx1Var3 = jrbVar.b;
        boolean z3 = jx1Var3.e;
        c9a c9aVar2 = jx1Var3.c;
        String str2 = jx1Var3.g;
        boolean z4 = jx1Var3.d;
        arb arbVar3 = arb.OPEN_CALL_SCREEN_ROOT_SPAN;
        zqb zqbVar3 = (zqb) c9aVar2.f(arbVar3);
        long j = 0;
        if (zqbVar3 != null) {
            zqbVar3.d = 0L;
            j = 1;
        }
        zqb zqbVar4 = (zqb) c9aVar2.f(arb.CALL_SCREEN_VIEW_CREATION);
        arb arbVar4 = arb.MAIN_SCREEN_INIT_TO_RENDER;
        if (zqbVar4 != null) {
            zqbVar4.d = j;
            j++;
            zqb zqbVar5 = (zqb) c9aVar2.f(arbVar4);
            zqbVar4.e = zqbVar5 != null ? zqbVar5.d : -1L;
        }
        zqb zqbVar6 = (zqb) c9aVar2.f(arbVar);
        if (zqbVar6 != null) {
            zqbVar6.d = j;
            zqb zqbVar7 = (zqb) c9aVar2.f(arbVar4);
            zqbVar6.e = zqbVar7 != null ? zqbVar7.d : -1L;
        }
        gqb gqbVar = gqb.EVENT_OPEN_CALL_SCREEN;
        crb crbVarE = jx1Var3.e(gqbVar);
        if (crbVarE == null) {
            return;
        }
        List list = crbVarE.a;
        zqb zqbVar8 = new zqb(arbVar3, -1L);
        zqbVar8.c = crbVarE.b;
        jrbVar.d(gqbVar, jrb.a(jrbVar, z4, null, Boolean.valueOf(z3), null, str2, 1, ue3.T(Collections.singletonList(zqbVar8), list), 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c9aVar2.k(((zqb) it.next()).a);
        }
    }
}
