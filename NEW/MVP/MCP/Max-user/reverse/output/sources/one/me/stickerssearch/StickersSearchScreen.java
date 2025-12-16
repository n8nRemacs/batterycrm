package one.me.stickerssearch;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.a08;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bzb;
import defpackage.c19;
import defpackage.eo7;
import defpackage.fb5;
import defpackage.fb6;
import defpackage.fbb;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gt;
import defpackage.gw0;
import defpackage.h54;
import defpackage.hbd;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i54;
import defpackage.k18;
import defpackage.khf;
import defpackage.kme;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.ma1;
import defpackage.mgb;
import defpackage.mhf;
import defpackage.nhf;
import defpackage.nt3;
import defpackage.qk8;
import defpackage.rdb;
import defpackage.rk8;
import defpackage.sdb;
import defpackage.sn0;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.whf;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssearch/StickersSearchScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-search_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickersSearchScreen extends Widget {
    public static final /* synthetic */ yy7[] t0 = {new toc(StickersSearchScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), ho7.d(vid.a, StickersSearchScreen.class, "stickersRecycler", "getStickersRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new toc(StickersSearchScreen.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0)};
    public final bbd X;
    public final sn0 Y;
    public final sn0 Z;
    public final hs a;
    public final k18 b;
    public final k18 c;
    public final qk8 d;
    public final bbd o;
    public final fb6 s0;

    public StickersSearchScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(Long.class, "chat_id");
        this.b = createViewModelLazy(whf.class, new vdc(29, new mhf(this, 0)));
        khf khfVar = khf.a;
        this.c = khfVar.getAccessor().d(476);
        this.d = new qk8();
        this.o = viewBinding(rdb.a);
        this.X = viewBinding(rdb.b);
        this.Y = binding(new mhf(this, 1));
        this.Z = binding(new mhf(this, 2));
        this.s0 = new fb6(((g4b) khfVar.getAccessor().c(56)).a(), new kme(3, this));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getT0() {
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
        tqi.c(new c19(3, null, 3), frameLayout);
        fbb fbbVar = new fbb(frameLayout.getContext());
        fbbVar.setId(rdb.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = 12;
        layoutParams.rightMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        fbbVar.setLayoutParams(layoutParams);
        fbbVar.setSearchHint(fbbVar.getContext().getString(sdb.a));
        fbbVar.c(true);
        fbbVar.setListener(new nhf(this));
        frameLayout.addView(fbbVar);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(rdb.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int iD = kti.d(f * vw4.d().getDisplayMetrics().density);
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
        fbb fbbVar = (fbb) this.X.D(this, t0[2]);
        mgb.a(fbbVar, new nt3(fbbVar, endlessRecyclerView2Y0, this, 8));
        int iB = gt.b(endlessRecyclerView2Y0.getContext());
        endlessRecyclerView2Y0.getContext();
        endlessRecyclerView2Y0.setLayoutManager(new GridLayoutManager(iB));
        endlessRecyclerView2Y0.setItemAnimator(null);
        endlessRecyclerView2Y0.j(new fb5(iB, kti.d(4 * vw4.d().getDisplayMetrics().density), 6));
        endlessRecyclerView2Y0.k(new a08(4, this));
        endlessRecyclerView2Y0.setPager(new ma1(this, 8));
        endlessRecyclerView2Y0.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2Y0.setAdapter(this.s0);
        hbd hbdVar = z0().Y;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        int i = 4;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new bzb(2, this, StickersSearchScreen.class, "handleNewState", "handleNewState(Lone/me/stickerssearch/model/SearchState;)V", i, 16), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(z0().Z, this.lifecycleOwner.p(), l38Var), new bzb(2, this, StickersSearchScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", i, 17), 1), getLifecycleScope());
    }

    public final EndlessRecyclerView2 y0() {
        return (EndlessRecyclerView2) this.o.D(this, t0[1]);
    }

    public final whf z0() {
        return (whf) this.b.getValue();
    }
}
