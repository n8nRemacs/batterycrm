package one.me.stickersshowcase;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bzb;
import defpackage.c19;
import defpackage.cjf;
import defpackage.dse;
import defpackage.ejf;
import defpackage.eo7;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.h54;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i54;
import defpackage.k18;
import defpackage.kti;
import defpackage.lfb;
import defpackage.llc;
import defpackage.m01;
import defpackage.ma1;
import defpackage.mg6;
import defpackage.mgb;
import defpackage.njf;
import defpackage.nt3;
import defpackage.qfb;
import defpackage.qk8;
import defpackage.r91;
import defpackage.rfb;
import defpackage.rk8;
import defpackage.sn0;
import defpackage.tfb;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uif;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w7c;
import defpackage.wdb;
import defpackage.xdb;
import defpackage.y9b;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickersshowcase/StickersShowcaseScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-showcase_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickersShowcaseScreen extends Widget {
    public static final /* synthetic */ yy7[] u0 = {new toc(StickersShowcaseScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, StickersShowcaseScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(StickersShowcaseScreen.class, "setsRecycler", "getSetsRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    public final bbd X;
    public final sn0 Y;
    public final sn0 Z;
    public final hs a;
    public final k18 b;
    public final k18 c;
    public final qk8 d;
    public final bbd o;
    public bcb s0;
    public final r91 t0;

    public StickersShowcaseScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, 0L, "chat_id");
        this.b = createViewModelLazy(njf.class, new uif(1, new ejf(this, 0)));
        cjf cjfVar = cjf.a;
        this.c = cjfVar.getAccessor().d(476);
        qk8 qk8Var = new qk8();
        this.d = qk8Var;
        this.o = viewBinding(wdb.b);
        this.X = viewBinding(wdb.a);
        this.Y = binding(new ejf(this, 1));
        this.Z = binding(new ejf(this, 2));
        this.t0 = new r91(((g4b) cjfVar.getAccessor().c(56)).a(), qk8Var, new w7c(this));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getA() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityPaused(Activity activity) {
        ((rk8) this.c.getValue()).a(this.d);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onActivityResumed(Activity activity) {
        ((rk8) this.c.getValue()).b(this.d);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        i54 i54Var2 = i54.POP_ENTER;
        k18 k18Var = this.c;
        qk8 qk8Var = this.d;
        if (i54Var == i54Var2 || i54Var == i54.PUSH_ENTER) {
            ((rk8) k18Var.getValue()).b(qk8Var);
        } else if (i54Var == i54.PUSH_EXIT) {
            ((rk8) k18Var.getValue()).a(qk8Var);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        tqi.c(new c19(3, null, 4), frameLayout);
        yfb yfbVar = new yfb(frameLayout.getContext(), 6);
        yfbVar.setId(wdb.b);
        yfbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        yfbVar.setTitle(xdb.a);
        yfbVar.setForm(qfb.a);
        yfbVar.setRightActions(new lfb(new tfb(new mg6(this, 1)), new rfb(y9b.y, new llc(17)), null));
        yfbVar.setLeftActions(new gfb(new dse(5, this)));
        frameLayout.addView(yfbVar);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(wdb.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int iD = kti.d(12 * vw4.d().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(iD, endlessRecyclerView2.getPaddingTop(), iD, endlessRecyclerView2.getPaddingBottom());
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.d.b();
        EndlessRecyclerView2 endlessRecyclerView2Y0 = y0();
        endlessRecyclerView2Y0.setAdapter(null);
        endlessRecyclerView2Y0.setPager(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        EndlessRecyclerView2 endlessRecyclerView2Y0 = y0();
        yfb yfbVar = (yfb) this.o.D(this, u0[1]);
        mgb.a(yfbVar, new nt3(yfbVar, endlessRecyclerView2Y0, this, 9));
        endlessRecyclerView2Y0.getContext();
        endlessRecyclerView2Y0.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2Y0.setItemAnimator(null);
        endlessRecyclerView2Y0.j(new m01(kti.d(6 * vw4.d().getDisplayMetrics().density), kti.d(8 * vw4.d().getDisplayMetrics().density), 9));
        endlessRecyclerView2Y0.setPager(new ma1(this, 9));
        endlessRecyclerView2Y0.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2Y0.setAdapter(this.t0);
        int i = 4;
        gw0.w(new g56(z0().u0, new bzb(2, this, StickersShowcaseScreen.class, "handleNewState", "handleNewState(Lone/me/stickersshowcase/model/ShowcaseState;)V", i, 21), 1), getViewLifecycleScope());
        gw0.w(new g56(z0().Z, new bzb(2, this, StickersShowcaseScreen.class, "handleEvents", "handleEvents(Lone/me/stickersshowcase/ShowcaseEvent;)V", i, 22), 1), getViewLifecycleScope());
        gw0.w(new g56(z0().s0, new bzb(2, this, StickersShowcaseScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", i, 23), 1), getViewLifecycleScope());
    }

    public final EndlessRecyclerView2 y0() {
        return (EndlessRecyclerView2) this.X.D(this, u0[2]);
    }

    public final njf z0() {
        return (njf) this.b.getValue();
    }
}
