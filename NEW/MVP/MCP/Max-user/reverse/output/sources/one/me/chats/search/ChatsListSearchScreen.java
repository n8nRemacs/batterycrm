package one.me.chats.search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a43;
import defpackage.a63;
import defpackage.api;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b0i;
import defpackage.b14;
import defpackage.b43;
import defpackage.bbd;
import defpackage.bcb;
import defpackage.bia;
import defpackage.c14;
import defpackage.c7j;
import defpackage.cm6;
import defpackage.co2;
import defpackage.cy2;
import defpackage.d33;
import defpackage.dj6;
import defpackage.e03;
import defpackage.eo7;
import defpackage.fb6;
import defpackage.fbb;
import defpackage.fm9;
import defpackage.fu2;
import defpackage.fv6;
import defpackage.g44;
import defpackage.g56;
import defpackage.gf1;
import defpackage.gt2;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.h23;
import defpackage.h54;
import defpackage.hbd;
import defpackage.hd5;
import defpackage.hs;
import defpackage.hyc;
import defpackage.i1b;
import defpackage.i54;
import defpackage.i84;
import defpackage.ia;
import defpackage.iv6;
import defpackage.j6e;
import defpackage.ji0;
import defpackage.k18;
import defpackage.k1b;
import defpackage.k1e;
import defpackage.k23;
import defpackage.k33;
import defpackage.ka5;
import defpackage.kd5;
import defpackage.l23;
import defpackage.l38;
import defpackage.l48;
import defpackage.lfb;
import defpackage.m;
import defpackage.m23;
import defpackage.ma1;
import defpackage.mvd;
import defpackage.n23;
import defpackage.o33;
import defpackage.o91;
import defpackage.okf;
import defpackage.p23;
import defpackage.q23;
import defpackage.q2b;
import defpackage.q33;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.qt7;
import defpackage.r23;
import defpackage.rfb;
import defpackage.s23;
import defpackage.s2i;
import defpackage.sa3;
import defpackage.svi;
import defpackage.t23;
import defpackage.t9f;
import defpackage.tfb;
import defpackage.tl2;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u23;
import defpackage.u45;
import defpackage.vid;
import defpackage.wrb;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.y23;
import defpackage.y9b;
import defpackage.yfb;
import defpackage.ym3;
import defpackage.yy7;
import defpackage.z41;
import defpackage.z71;
import defpackage.z8a;
import defpackage.zh0;
import defpackage.zm3;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/search/ChatsListSearchScreen;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Lsa3;", "Lqq3;", "", "Lb14;", "Ldj6;", "<init>", "()V", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChatsListSearchScreen extends Widget implements g44, sa3, qq3, b14, dj6 {
    public static final /* synthetic */ yy7[] I0 = {new z8a(ChatsListSearchScreen.class, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), u45.h(vid.a, ChatsListSearchScreen.class, "shouldRestoreFocus", "getShouldRestoreFocus()Z"), new toc(ChatsListSearchScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ChatsListSearchScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new z8a(ChatsListSearchScreen.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;")};
    public final z71 A0;
    public final z71 B0;
    public final ji0 C0;
    public final z71 D0;
    public final zm3 E0;
    public final bbd F0;
    public final t9f G0;
    public bcb H0;
    public final bbd X;
    public final k18 Y;
    public final k18 Z;
    public final ka5 a;
    public final k18 b;
    public final eo7 c;
    public final hs d;
    public final hs o;
    public final ExecutorService s0;
    public final k18 t0;
    public final c14 u0;
    public final fb6 v0;
    public final c14 w0;
    public final b0i x0;
    public final kd5 y0;
    public final c14 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatsListSearchScreen() {
        int i = 3;
        super(null, 0, i, 0 == true ? 1 : 0);
        this.a = new ka5(new o91(0, this, ChatsListSearchScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 12), (cm6) null, 6);
        e03 e03Var = e03.a;
        this.b = e03Var.getAccessor().d(151);
        this.c = eo7.f;
        this.d = new hs(Long.class, null, "selected.chatId.Action");
        this.o = new hs(Boolean.class, Boolean.TRUE, "should.restore.focus");
        this.X = viewBinding(hyc.chats_list_search_toolbar);
        this.Y = createViewModelLazy(b43.class, new tl2(23, new fu2(8)));
        this.Z = createViewModelLazy(zh0.class, new tl2(24, new fu2(9)));
        ExecutorService executorServiceA = e03Var.a().a();
        this.s0 = executorServiceA;
        this.t0 = e03Var.getAccessor().d(10);
        c14 c14Var = new c14(new h23(this), executorServiceA);
        this.u0 = c14Var;
        fb6 fb6Var = new fb6(new t23(this), executorServiceA, 7);
        this.v0 = fb6Var;
        c14 c14Var2 = new c14(this, executorServiceA);
        this.w0 = c14Var2;
        int i2 = 2;
        b0i b0iVar = new b0i(new co2(i2, this), executorServiceA, i2);
        this.x0 = b0iVar;
        int i3 = 1;
        this.y0 = new kd5(i3, this);
        c14 c14Var3 = new c14(this, executorServiceA);
        this.z0 = c14Var3;
        z71 z71Var = new z71(executorServiceA, 4);
        this.A0 = z71Var;
        z71 z71Var2 = new z71(executorServiceA, i);
        this.B0 = z71Var2;
        ji0 ji0Var = new ji0(this, executorServiceA);
        this.C0 = ji0Var;
        z71 z71Var3 = new z71(executorServiceA, i3);
        this.D0 = z71Var3;
        this.E0 = new zm3(new ym3(false, 1), c14Var, ji0Var, fb6Var, c14Var2, b0iVar, c14Var3, z71Var3, z71Var, z71Var2);
        this.F0 = viewBinding(i1b.g);
        this.G0 = c7j.c();
    }

    @Override // defpackage.b14
    public final void A(int i) {
        ((qsb) this.t0.getValue()).j(new s2i(this, 1), qsb.e, 156);
    }

    public final void A0(j6e j6eVar) {
        api.c(this);
        int iV = az1.v(j6eVar.a);
        if (iV == 0) {
            b43 b43VarZ0 = z0();
            xfh.o(b43VarZ0, ((q2b) b43VarZ0.Y).b(), new a43(b43VarZ0, j6eVar.getItemId(), null), 2);
            a63.N0(a63.c, j6eVar.getItemId(), "local", null, null, null, null, 124);
            return;
        }
        if (iV == 1) {
            a63.N0(a63.c, j6eVar.getItemId(), "server", null, null, null, null, 124);
            return;
        }
        if (iV == 2) {
            b43 b43VarZ02 = z0();
            svi.e(b43VarZ02.a, ((q2b) b43VarZ02.Y).a(), null, new o33(b43VarZ02, j6eVar.getItemId(), null), 2);
        } else if (iV == 3) {
            b43 b43VarZ03 = z0();
            svi.e(b43VarZ03.a, ((q2b) b43VarZ03.Y).a(), null, new q33(b43VarZ03, (fv6) j6eVar, null), 2);
        } else {
            if (iV != 4) {
                throw new NoWhenBranchMatchedException();
            }
            fm9 fm9Var = (fm9) j6eVar;
            if (fm9Var.X == null) {
                return;
            }
            svi.e(getViewLifecycleScope(), null, null, new l23(this, fm9Var, null), 3);
        }
    }

    public final void B0(j6e j6eVar, View view) {
        if (j6eVar instanceof cy2) {
            long j = ((cy2) j6eVar).G0;
            api.c(this);
            x9f x9fVarE = svi.e(getViewLifecycleScope(), null, i84.b, new u23(this, j, view, null), 1);
            this.G0.O(this, I0[4], x9fVarE);
        }
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        yy7[] yy7VarArr = I0;
        yy7 yy7Var = yy7VarArr[0];
        hs hsVar = this.d;
        Long l = (Long) hsVar.a(this);
        if (l != null) {
            long jLongValue = l.longValue();
            yy7 yy7Var2 = yy7VarArr[0];
            hsVar.b(this, null);
            b43 b43VarZ0 = z0();
            xfh.o(b43VarZ0, ((q2b) b43VarZ0.Y).a(), new k33(i, b43VarZ0, jLongValue, null), 2);
        }
    }

    public final void C0() {
        if (getView() != null) {
            ((EndlessRecyclerView2) this.F0.D(this, I0[3])).x0(0);
        }
    }

    public final void D0(boolean z) {
        if (getView() != null) {
            ((EndlessRecyclerView2) this.F0.D(this, I0[3])).setRefreshingNext(z);
        }
    }

    @Override // defpackage.dj6
    public final void X(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            yy7 yy7Var = I0[1];
            this.o.b(this, Boolean.FALSE);
        }
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("selected.chatId.Action");
            b43 b43VarZ0 = z0();
            xfh.o(b43VarZ0, ((q2b) b43VarZ0.Y).a(), new k33(i, b43VarZ0, j, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getD() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onChangeEnded(h54 h54Var, i54 i54Var) {
        fbb searchView;
        super.onChangeEnded(h54Var, i54Var);
        Activity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        b43 b43VarZ0 = z0();
        b43VarZ0.getClass();
        int iOrdinal = i54Var.ordinal();
        if (iOrdinal == 2) {
            gu5 gu5Var = (gu5) b43VarZ0.w();
            gu5Var.getClass();
            if (!gu5Var.j(PmsKey.f132searchloaderv2enabled, false)) {
                b43VarZ0.d.i = b43VarZ0;
            }
        } else if (iOrdinal == 3) {
            xfh.o(b43VarZ0, bia.a.plus(((q2b) b43VarZ0.Y).a()), new d33(b43VarZ0, null), 2);
        }
        yy7[] yy7VarArr = I0;
        yy7 yy7Var = yy7VarArr[1];
        hs hsVar = this.o;
        boolean zBooleanValue = ((Boolean) hsVar.a(this)).booleanValue();
        yy7 yy7Var2 = yy7VarArr[1];
        hsVar.b(this, Boolean.TRUE);
        if (i54Var.b && zBooleanValue && (searchView = ((yfb) this.X.D(this, yy7VarArr[2])).getSearchView()) != null) {
            api.f((View) searchView.B0.getValue());
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final void onChangeStarted(h54 h54Var, i54 i54Var) {
        super.onChangeStarted(h54Var, i54Var);
        if (i54Var == i54.PUSH_EXIT) {
            api.c(this);
            yy7 yy7Var = I0[1];
            this.o.b(this, Boolean.FALSE);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(i1b.h);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        Continuation continuation = null;
        tqi.c(new m(3, null, 4), linearLayout);
        yfb yfbVar = new yfb(getContext(), 6);
        yfbVar.setId(i1b.i);
        yfbVar.setTransitionName(yfbVar.getContext().getString(k1b.q));
        yfbVar.setForm(qfb.b);
        yfbVar.setRightActions(new lfb(new tfb(new k23(this, yfbVar)), new rfb(y9b.k, new gf1(25)), null));
        yfbVar.setTitle(k1b.p);
        fbb searchView = yfbVar.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(searchView.getResources().getString(k1b.v));
            searchView.setCollapsible(false);
            searchView.setSearchText(((y23) z0().I0.a.getValue()).b);
            if (bundle != null) {
                searchView.setExpandWithAnimation(false);
                searchView.c(false);
            }
        }
        linearLayout.addView(yfbVar);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), null, 6);
        endlessRecyclerView2.setId(i1b.g);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2.setItemAnimator(null);
        zm3 zm3Var = this.E0;
        endlessRecyclerView2.setAdapter(zm3Var);
        endlessRecyclerView2.setHasFixedSize(true);
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setPager(new ma1(this, 1));
        endlessRecyclerView2.setDelegate(this.D0);
        okf okfVar = new okf(endlessRecyclerView2, zm3Var, new iv6(10, new ia(this, 7, endlessRecyclerView2)));
        endlessRecyclerView2.j(okfVar);
        tqi.c(new gt2(okfVar, continuation, 1), endlessRecyclerView2);
        linearLayout.addView(endlessRecyclerView2);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        this.H0 = null;
        this.z0.B(this.y0);
        super.onDestroyView(view);
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        yy7[] yy7VarArr = I0;
        yy7 yy7Var = yy7VarArr[0];
        this.d.b(this, null);
        qt7 qt7Var = (qt7) this.G0.D(this, yy7VarArr[4]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            qsb qsbVar = (qsb) this.t0.getValue();
            s2i s2iVar = new s2i(this, 1);
            String[] strArr2 = qsb.e;
            int i2 = mvd.a1;
            int i3 = mvd.b1;
            wrb wrbVar = new wrb(y9b.e);
            qsbVar.getClass();
            qsb.r(s2iVar, strArr, iArr, strArr2, i2, i3, wrbVar);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        this.z0.z(this.y0);
        hbd hbdVar = z0().I0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new m23(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new z41(((zh0) this.Z.getValue()).Z, z0().I0, new q23(3, 4, ChatsListSearchScreen.class, this, "combineSearchAndBanners", "combineSearchAndBanners(Ljava/util/List;Lone/me/chats/search/ChatsListSearchState;)Ljava/util/List;"), 3), getViewLifecycleOwner().p(), l38Var), new n23(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(z0().L0, getViewLifecycleOwner().p(), l38Var), new r23(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(new p23(aw0.a(z0().M0, getViewLifecycleOwner().p(), l38Var), 0), new s23(null, this), 1), getViewLifecycleScope());
    }

    public final void y0() {
        this.u0.E(null);
        fb6 fb6Var = this.v0;
        hd5 hd5Var = hd5.a;
        fb6Var.E(hd5Var);
        this.w0.E(hd5Var);
        this.x0.E(hd5Var);
    }

    public final b43 z0() {
        return (b43) this.Y.getValue();
    }
}
