package one.me.chats.tab;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a63;
import defpackage.ada;
import defpackage.ae6;
import defpackage.age;
import defpackage.arb;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bi0;
import defpackage.bud;
import defpackage.bwf;
import defpackage.c54;
import defpackage.c73;
import defpackage.czi;
import defpackage.d73;
import defpackage.d7j;
import defpackage.d92;
import defpackage.e03;
import defpackage.e73;
import defpackage.e7f;
import defpackage.ek8;
import defpackage.eo7;
import defpackage.f73;
import defpackage.fbb;
import defpackage.fde;
import defpackage.fni;
import defpackage.fu2;
import defpackage.g44;
import defpackage.g56;
import defpackage.gqb;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h54;
import defpackage.h73;
import defpackage.hf3;
import defpackage.ho7;
import defpackage.hs7;
import defpackage.i1b;
import defpackage.i40;
import defpackage.i4d;
import defpackage.i54;
import defpackage.i73;
import defpackage.imb;
import defpackage.ipi;
import defpackage.is7;
import defpackage.k18;
import defpackage.k1b;
import defpackage.k73;
import defpackage.ki0;
import defpackage.kt3;
import defpackage.l38;
import defpackage.l5c;
import defpackage.l6b;
import defpackage.l8j;
import defpackage.lfb;
import defpackage.lg8;
import defpackage.lqi;
import defpackage.mm8;
import defpackage.neb;
import defpackage.nm8;
import defpackage.od6;
import defpackage.ox1;
import defpackage.pb3;
import defpackage.phd;
import defpackage.q2b;
import defpackage.qc6;
import defpackage.qfb;
import defpackage.qmb;
import defpackage.qsb;
import defpackage.rk;
import defpackage.rsd;
import defpackage.rt5;
import defpackage.rw;
import defpackage.s2i;
import defpackage.s3e;
import defpackage.s65;
import defpackage.sfb;
import defpackage.svi;
import defpackage.td6;
import defpackage.tfb;
import defpackage.tl2;
import defpackage.toc;
import defpackage.ue3;
import defpackage.utb;
import defpackage.v9j;
import defpackage.vid;
import defpackage.w4e;
import defpackage.wqi;
import defpackage.wrb;
import defpackage.x9f;
import defpackage.xc0;
import defpackage.xq7;
import defpackage.y65;
import defpackage.y9b;
import defpackage.yfb;
import defpackage.ytd;
import defpackage.yud;
import defpackage.yy7;
import defpackage.z34;
import defpackage.zqb;
import kotlin.Metadata;
import one.me.chats.list.ChatsListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\rB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\f¨\u0006\u000e"}, d2 = {"Lone/me/chats/tab/ChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Lada;", "Lg44;", "Ls3e;", "Lrsd;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "g73", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ChatsTabWidget extends Widget implements ada, g44, s3e, rsd {
    public static final /* synthetic */ yy7[] F0 = {new toc(ChatsTabWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, ChatsTabWidget.class, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), new toc(ChatsTabWidget.class, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new toc(ChatsTabWidget.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0)};
    public final od6 A0;
    public final int B0;
    public final int C0;
    public final bwf D0;
    public x9f E0;
    public final k18 X;
    public final k18 Y;
    public final Object Z;
    public final eo7 a;
    public final String b;
    public z34 c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public final k18 x0;
    public final k18 y0;
    public i40 z0;

    public ChatsTabWidget(String str) {
        this(gwi.b(new imb("folder_id", str)));
    }

    public final neb A0() {
        return (neb) this.u0.D(this, F0[1]);
    }

    public final ViewPager2 B0() {
        return (ViewPager2) this.v0.D(this, F0[2]);
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("folder_id")) == null) {
            return;
        }
        if (i == 0) {
            a63.c.p0().b(":settings/folder/edit?id=".concat(string), null);
        } else if (i == 1) {
            ae6 ae6VarD0 = D0();
            svi.e(ae6VarD0.a, ((q2b) ae6VarD0.b).a(), null, new td6(ae6VarD0, string, null), 2);
        }
    }

    public final yfb C0() {
        return (yfb) this.t0.D(this, F0[0]);
    }

    public final ae6 D0() {
        return (ae6) this.x0.getValue();
    }

    public final void E0(int i) {
        bud budVar;
        lg8 lg8Var = lg8.d;
        ytd ytdVar = (ytd) z0().Y.get(i);
        c54 c54Var = (ytdVar == null || (budVar = (bud) ue3.I(ytdVar.e())) == null) ? null : budVar.a;
        ChatsListWidget chatsListWidget = c54Var instanceof ChatsListWidget ? (ChatsListWidget) c54Var : null;
        if (chatsListWidget == null) {
            return;
        }
        String str = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            View view = chatsListWidget.getView();
            Integer numValueOf = view != null ? Integer.valueOf(view.getMeasuredWidth()) : null;
            View view2 = chatsListWidget.getView();
            l6bVar.c(lg8Var, str, "ONEME-6873|chats_list_page_state | root width:" + numValueOf + ", root height:" + (view2 != null ? Integer.valueOf(view2.getMeasuredHeight()) : null), null);
        }
        if (chatsListWidget.getView() == null || fni.a(chatsListWidget.b, "all.chat.folder")) {
            return;
        }
        int measuredWidth = chatsListWidget.A0().getMeasuredWidth();
        int measuredHeight = chatsListWidget.A0().getMeasuredHeight();
        phd adapter = chatsListWidget.A0().getAdapter();
        Integer numValueOf2 = adapter != null ? Integer.valueOf(adapter.j()) : null;
        int childCount = chatsListWidget.A0().getChildCount();
        EndlessRecyclerView2 endlessRecyclerView2A0 = chatsListWidget.A0();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= endlessRecyclerView2A0.getChildCount()) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = endlessRecyclerView2A0.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.isAttachedToWindow()) {
                z = true;
                break;
            }
            i2 = i3;
        }
        String str2 = chatsListWidget.a;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
            StringBuilder sbM = utb.m(measuredWidth, "ONEME-6873|chats_list_page_state | chats list state. folderId:", chatsListWidget.b, " | width:", "|height:");
            hf3.g(sbM, measuredHeight, " | child:", childCount, "|childAttached:");
            sbM.append(z);
            sbM.append("|adapterCount:");
            sbM.append(numValueOf2);
            l6bVar2.c(lg8Var, str2, sbM.toString(), null);
        }
    }

    public final qmb F0() {
        return new qmb(null, 0, e7f.o, Long.valueOf(B0().getCurrentItem() == 0 ? 1L : 2L), null, null, 51);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.rsd
    public final void b() {
        if (y0()) {
            ((ox1) this.Z.getValue()).b();
        }
    }

    @Override // defpackage.s3e
    public final void f0() {
        bud budVar;
        ytd ytdVar = (ytd) z0().Y.get(B0().getCurrentItem());
        Object obj = (ytdVar == null || (budVar = (bud) ue3.I(ytdVar.e())) == null) ? null : budVar.a;
        s3e s3eVar = obj instanceof s3e ? (s3e) obj : null;
        if (s3eVar != null) {
            s3eVar.f0();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getU0() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.rsd
    public final void j() {
        if (y0()) {
            ((ox1) this.Z.getValue()).f();
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        int i;
        super.onAttach(view);
        hs7 hs7Var = (hs7) this.s0.getValue();
        w4e w4eVar = (w4e) hs7Var.a();
        fde fdeVar = w4eVar.N;
        yy7[] yy7VarArr = w4e.m0;
        if (((Boolean) fdeVar.D(w4eVar, yy7VarArr[31])).booleanValue()) {
            return;
        }
        l5c l5cVar = (l5c) ((age) hs7Var.a.getValue());
        l5cVar.getClass();
        int[] iArrC0 = ue3.c0(l5cVar.k(PmsKey.f68invitefriendssheetfrequency));
        w4e w4eVar2 = (w4e) hs7Var.a();
        int iIntValue = ((Number) w4eVar2.O.D(w4eVar2, yy7VarArr[32])).intValue();
        w4e w4eVar3 = (w4e) hs7Var.a();
        long jLongValue = ((Number) w4eVar3.P.D(w4eVar3, yy7VarArr[33])).longValue();
        w4e w4eVar4 = (w4e) hs7Var.a();
        long jLongValue2 = ((Number) w4eVar4.Q.D(w4eVar4, yy7VarArr[34])).longValue();
        if (jLongValue < 0) {
            jLongValue = jLongValue2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iArrC0.length > iIntValue && (i = iArrC0[iIntValue]) >= 0) {
            int i2 = s65.d;
            if (s65.g(v9j.h(i, y65.DAYS)) + jLongValue >= jCurrentTimeMillis) {
                return;
            }
            w4e w4eVar5 = (w4e) hs7Var.a();
            w4eVar5.O.O(w4eVar5, yy7VarArr[32], Integer.valueOf(iIntValue + 1));
            w4e w4eVar6 = (w4e) hs7Var.a();
            w4eVar6.P.O(w4eVar6, yy7VarArr[33], Long.valueOf(jCurrentTimeMillis));
            ((is7) hs7Var.c.getValue()).a("show", "main", "trigger_max");
            xq7.c.p0().b(":invite/friends_to_max_bottom_sheet", null);
        }
    }

    @Override // defpackage.c54
    public final void onChangeEnded(h54 h54Var, i54 i54Var) {
        if (!i54Var.b || y0()) {
            return;
        }
        boolean z = D0().y0;
        k18 k18Var = this.d;
        if (!z && !((qsb) k18Var.getValue()).b()) {
            D0().y0 = true;
            if (Build.VERSION.SDK_INT >= 29) {
                qsb qsbVar = (qsb) k18Var.getValue();
                s2i s2iVar = new s2i(this, 1);
                qsbVar.getClass();
                s2iVar.c(qsb.p, 180, i4d.permission_fsi_request, i4d.permission_fsi_request_rationale, i4d.permissions_fsi_request_positive_button, new wrb(y9b.c));
                return;
            }
            return;
        }
        if (((qsb) k18Var.getValue()).d()) {
            return;
        }
        k18 k18Var2 = this.o;
        w4e w4eVar = (w4e) ((pb3) k18Var2.getValue());
        fde fdeVar = w4eVar.M;
        yy7[] yy7VarArr = w4e.m0;
        if (((Boolean) fdeVar.D(w4eVar, yy7VarArr[30])).booleanValue()) {
            return;
        }
        w4e w4eVar2 = (w4e) ((pb3) k18Var2.getValue());
        w4eVar2.M.O(w4eVar2, yy7VarArr[30], Boolean.TRUE);
        ((qsb) k18Var.getValue()).h(new s2i(this, 1), false);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(i1b.c);
        yfb yfbVar = new yfb(constraintLayout.getContext(), 6);
        int i = i1b.j;
        yfbVar.setId(i);
        yfbVar.setTransitionName(yfbVar.getContext().getString(k1b.q));
        yfbVar.setForm(qfb.b);
        kt3 kt3Var = new kt3(-1, -2);
        kt3Var.i = 0;
        int i2 = i1b.e;
        kt3Var.k = i2;
        kt3Var.e = 0;
        kt3Var.h = 0;
        yfbVar.setLayoutParams(kt3Var);
        yfbVar.setTitle(k1b.p);
        yfbVar.setRightActions(new lfb(new tfb(new k73(yfbVar)), new sfb(yud.I0, new d73(0), 14), null));
        fbb searchView = yfbVar.getSearchView();
        if (searchView != null) {
            searchView.setExpandable(false);
        }
        fbb searchView2 = yfbVar.getSearchView();
        if (searchView2 != null) {
            searchView2.setExpandWithAnimation(false);
        }
        constraintLayout.addView(yfbVar);
        neb nebVar = new neb(constraintLayout.getContext(), 0);
        nebVar.setId(i2);
        nebVar.setTabMode(0);
        kt3 kt3Var2 = new kt3(0, -2);
        kt3Var2.j = i;
        int i3 = i1b.f;
        kt3Var2.k = i3;
        kt3Var2.e = 0;
        kt3Var2.h = 0;
        nebVar.setLayoutParams(kt3Var2);
        constraintLayout.addView(nebVar);
        View viewA = czi.a(constraintLayout.getContext());
        viewA.setId(i3);
        kt3 kt3Var3 = new kt3(0, -2);
        kt3Var3.j = i2;
        int i4 = i1b.d;
        kt3Var3.k = i4;
        kt3Var3.e = 0;
        kt3Var3.h = 0;
        constraintLayout.addView(viewA, kt3Var3);
        ViewPager2 viewPager2 = new ViewPager2(constraintLayout.getContext());
        viewPager2.setId(i4);
        kt3 kt3Var4 = new kt3(0, 0);
        kt3Var4.I = 1.0f;
        kt3Var4.j = i3;
        kt3Var4.l = 0;
        kt3Var4.e = 0;
        kt3Var4.h = 0;
        viewPager2.setLayoutParams(kt3Var4);
        lqi.b(viewPager2);
        constraintLayout.addView(viewPager2);
        return constraintLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        String str = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("ONEME-6453|chats_list_lf | tabs view destroy. Scope isActive: ", d7j.f(getLifecycleScope())), null);
            }
        }
        i40 i40Var = this.z0;
        if (i40Var != null) {
            i40Var.c();
        }
        this.z0 = null;
        z34 z34Var = this.c;
        if (z34Var != null) {
            z34Var.dismiss();
        }
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (y0()) {
            ox1 ox1Var = (ox1) this.Z.getValue();
            if (i != 177) {
                ox1Var.getClass();
            } else if (ox1Var.a.d()) {
                ox1Var.a();
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        D0().t(bundle2.getString("folder_id"));
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        String str = this.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("ONEME-6453|chats_list_lf | tabs view created. Scope isActive: ", d7j.f(getLifecycleScope())), null);
            }
        }
        B0().setAdapter(z0());
        qc6 qc6VarZ0 = z0();
        qc6VarZ0.X = 0;
        while (((ek8) qc6VarZ0.t0).g() > qc6VarZ0.X) {
            ((ek8) qc6VarZ0.t0).f(((Number) qc6VarZ0.o.remove(0)).longValue());
        }
        B0().setOffscreenPageLimit(this.C0);
        i40 i40VarA = this.A0.a(A0(), B0(), new d92(11, this), new rw(2, this, ChatsTabWidget.class, "handleLongClickOnFolderTab", "handleLongClickOnFolderTab(Landroid/view/View;Lone/me/common/tablayout/model/OneMeBaseTabItemModel;)V", 0, 13));
        i40VarA.a();
        this.z0 = i40VarA;
        gw0.w(new g56(aw0.a(D0().u0, getViewLifecycleOwner().p(), l38.d), new i73(null, this), 1), getViewLifecycleScope());
        ViewPager2 viewPager2B0 = B0();
        View childAt = viewPager2B0.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        viewPager2B0.b(new ki0(4, this));
        if (z0().y0.size() > 0) {
            viewPager2B0.measure(View.MeasureSpec.makeMeasureSpec(viewPager2B0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(viewPager2B0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
            if (z0().y0.size() > 1) {
                E0(1);
            }
        }
        ytd childRouter = getChildRouter((ViewGroup) this.w0.D(this, F0[3]));
        childRouter.e = 1;
        childRouter.R(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget(null, 1, null);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.S(l8j.a(pinBarsWidget, null, null));
        }
        view.addOnAttachStateChangeListener(new rk(2, this));
        D0().t(getArgs().getString("folder_id"));
        gw0.w(new g56(aw0.a(D0().w0, getViewLifecycleOwner().p(), l38.o), new h73(null, this), 1), getViewLifecycleScope());
    }

    public final boolean y0() {
        return ((Number) ((gu5) ((rt5) this.X.getValue())).p.f()).longValue() > 0;
    }

    public final qc6 z0() {
        return (qc6) this.D0.getValue();
    }

    public ChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = eo7.f;
        String name = ChatsTabWidget.class.getName();
        this.b = name;
        this.d = bi0.a.getAccessor().d(10);
        e03 e03Var = e03.a;
        this.o = e03Var.getAccessor().d(46);
        bwf bwfVarD = e03Var.getAccessor().d(48);
        this.X = bwfVarD;
        this.Y = e03Var.getAccessor().d(120);
        this.Z = ipi.b(3, new c73(this, 0));
        this.s0 = e03Var.getAccessor().d(486);
        this.t0 = viewBinding(i1b.j);
        this.u0 = viewBinding(i1b.e);
        this.v0 = viewBinding(i1b.d);
        this.w0 = viewBinding(i1b.f);
        this.x0 = createViewModelLazy(ae6.class, new tl2(28, new fu2(15)));
        this.y0 = e03Var.getAccessor().d(151);
        this.A0 = new od6(5, e03Var.a().a());
        this.B0 = 10;
        this.C0 = 3;
        this.D0 = new bwf(new c73(this, 1));
        nm8 nm8Var = (nm8) e03Var.getAccessor().c(2);
        arb arbVar = arb.FOLDERS_INIT_TO_RENDER;
        nm8Var.c().getClass();
        nm8Var.e.m(arbVar, new zqb(arbVar, SystemClock.elapsedRealtime()));
        nm8Var.f.put(gqb.EVENT_OPEN_CHATS, svi.e(nm8Var.d, null, null, new mm8(nm8Var, null), 3));
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, xc0.f("ONEME-6453|chats_list_lf | tabs subscribe on new data. Scope isActive: ", d7j.f(getLifecycleScope())), null);
            }
        }
        gw0.w(new g56(D0().u0, new e73(null, this), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(((gu5) ((rt5) bwfVarD.getValue())).p, this.lifecycleOwner.p(), l38.c), new f73(null, this), 1), getLifecycleScope());
    }
}
