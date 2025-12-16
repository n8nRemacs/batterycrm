package one.me.chats.list;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import defpackage.a63;
import defpackage.a93;
import defpackage.arb;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b14;
import defpackage.bbd;
import defpackage.bi0;
import defpackage.bwf;
import defpackage.c66;
import defpackage.c6i;
import defpackage.c7j;
import defpackage.ci5;
import defpackage.d53;
import defpackage.d7j;
import defpackage.d92;
import defpackage.e03;
import defpackage.ec6;
import defpackage.eq5;
import defpackage.fb6;
import defpackage.fni;
import defpackage.fu2;
import defpackage.g23;
import defpackage.g44;
import defpackage.g56;
import defpackage.gf1;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hs;
import defpackage.hyc;
import defpackage.i1b;
import defpackage.i43;
import defpackage.i62;
import defpackage.i84;
import defpackage.ia;
import defpackage.imb;
import defpackage.ipi;
import defpackage.is7;
import defpackage.j43;
import defpackage.ji0;
import defpackage.jvd;
import defpackage.k18;
import defpackage.k53;
import defpackage.ka5;
import defpackage.kge;
import defpackage.kti;
import defpackage.l14;
import defpackage.l38;
import defpackage.l53;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.lni;
import defpackage.m11;
import defpackage.ma1;
import defpackage.mgb;
import defpackage.mvd;
import defpackage.n53;
import defpackage.nm8;
import defpackage.o53;
import defpackage.p53;
import defpackage.pb2;
import defpackage.pb6;
import defpackage.q2b;
import defpackage.q53;
import defpackage.qq3;
import defpackage.qq7;
import defpackage.qsb;
import defpackage.qt7;
import defpackage.r3e;
import defpackage.r53;
import defpackage.r5j;
import defpackage.s2i;
import defpackage.s3e;
import defpackage.s53;
import defpackage.sn0;
import defpackage.sv2;
import defpackage.svi;
import defpackage.sx3;
import defpackage.t53;
import defpackage.t9f;
import defpackage.tl2;
import defpackage.toc;
import defpackage.tqi;
import defpackage.tx3;
import defpackage.u45;
import defpackage.u53;
import defpackage.uhd;
import defpackage.un4;
import defpackage.uq7;
import defpackage.usd;
import defpackage.v03;
import defpackage.v1a;
import defpackage.vc9;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wn1;
import defpackage.wqi;
import defpackage.wrb;
import defpackage.x26;
import defpackage.x3b;
import defpackage.x7j;
import defpackage.xc0;
import defpackage.xfh;
import defpackage.xx3;
import defpackage.y03;
import defpackage.y34;
import defpackage.y71;
import defpackage.y9b;
import defpackage.ym3;
import defpackage.yn6;
import defpackage.yy7;
import defpackage.z71;
import defpackage.z8a;
import defpackage.zh0;
import defpackage.zm3;
import defpackage.zqb;
import defpackage.zy3;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/chats/list/ChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Lg44;", "Lqq3;", "Lb14;", "Leq5;", "Luq7;", "Ls3e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChatsListWidget extends Widget implements g44, qq3, b14, eq5, uq7, s3e {
    public static final /* synthetic */ yy7[] L0 = {new z8a(ChatsListWidget.class, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), u45.h(vid.a, ChatsListWidget.class, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new toc(ChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new toc(ChatsListWidget.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0), new z8a(ChatsListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new toc(ChatsListWidget.class, "chatsListRecyclerViewAnalyticsListener", "getChatsListRecyclerViewAnalyticsListener()Lone/me/chats/list/ChatsListRecyclerViewAnalyticsListener;", 0)};
    public final fb6 A0;
    public final fb6 B0;
    public final ji0 C0;
    public final z71 D0;
    public final pb6 E0;
    public final zm3 F0;
    public final t9f G0;
    public final Object H0;
    public final sn0 I0;
    public final nm8 J0;
    public boolean K0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final String a;
    public final String b;
    public final hs c;
    public final hs d;
    public final bwf o;
    public final k18 s0;
    public final ExecutorService t0;
    public final bbd u0;
    public final sn0 v0;
    public final bwf w0;
    public b x0;
    public final y03 y0;
    public final ji0 z0;

    public ChatsListWidget(String str) {
        this(gwi.b(new imb("folder.id.key", str)));
    }

    public static final void y0(ChatsListWidget chatsListWidget, y34 y34Var) {
        float f = -6;
        y34Var.h(new Rect(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), 0), 0.0f);
    }

    @Override // defpackage.b14
    public final void A(int i) {
        if (n53.$EnumSwitchMapping$0[az1.v(i)] != 1) {
            x();
            return;
        }
        s2i s2iVar = new s2i(this, 1);
        k18 k18Var = this.s0;
        if (((qsb) k18Var.getValue()).d()) {
            return;
        }
        ((qsb) k18Var.getValue()).h(s2iVar, true);
    }

    public final EndlessRecyclerView2 A0() {
        return (EndlessRecyclerView2) this.u0.D(this, L0[2]);
    }

    public final k53 B0() {
        return (k53) this.Z.getValue();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        yy7[] yy7VarArr = L0;
        yy7 yy7Var = yy7VarArr[0];
        hs hsVar = this.c;
        Long l = (Long) hsVar.a(this);
        if (l != null) {
            long jLongValue = l.longValue();
            yy7 yy7Var2 = yy7VarArr[0];
            hsVar.b(this, null);
            k53 k53VarB0 = B0();
            xfh.o(k53VarB0, ((q2b) k53VarB0.Y).a().plus(k53VarB0.x()), new i43(i, k53VarB0, jLongValue, null), 2);
            return;
        }
        yy7 yy7Var3 = yy7VarArr[1];
        hs hsVar2 = this.d;
        Long l2 = (Long) hsVar2.a(this);
        if (l2 != null) {
            long jLongValue2 = l2.longValue();
            yy7 yy7Var4 = yy7VarArr[1];
            hsVar2.b(this, null);
            ((zy3) this.Y.getValue()).u(i, jLongValue2);
        }
    }

    public final void C0(long j) {
        k53 k53VarB0 = B0();
        svi.e(k53VarB0.a, ((q2b) k53VarB0.Y).a().plus(k53VarB0.x()), null, new j43(k53VarB0, j, null), 2);
    }

    @Override // defpackage.uq7
    public final void D(qq7 qq7Var) {
        int iOrdinal = qq7Var.ordinal();
        if (iOrdinal == 0) {
            a63.c.p0().b(":invite/phone", null);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ((is7) this.X.getValue()).a("click_link", "main", "invite_friends");
            B0().A();
        }
    }

    public final void D0(long j, View view) {
        yy7[] yy7VarArr = L0;
        yy7 yy7Var = yy7VarArr[1];
        if (((Long) this.d.a(this)) == null) {
            yy7 yy7Var2 = yy7VarArr[4];
            t9f t9fVar = this.G0;
            qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var2);
            if (qt7Var == null || !qt7Var.isActive()) {
                t9fVar.O(this, yy7VarArr[4], svi.e(getViewLifecycleScope(), null, i84.b, new o53(this, j, view, null), 1));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Collection] */
    public final void E0() {
        if (!this.K0 || B0().M0.a.getValue() == v03.c || ((v03) B0().M0.a.getValue()).a.isEmpty() || getView() == null) {
            return;
        }
        this.K0 = false;
        EndlessRecyclerView2 endlessRecyclerView2A0 = A0();
        mgb.a(endlessRecyclerView2A0, new yn6(endlessRecyclerView2A0, 8, this));
    }

    @Override // defpackage.s3e
    public final void f0() {
        xfh.r(B0().U0, new r3e(false));
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        boolean z = false;
        if (i == hyc.oneme_saved_messages_clear_history) {
            k53 k53VarB0 = B0();
            pb2 pb2Var = (pb2) k53VarB0.v().T().getValue();
            if (pb2Var == null) {
                return;
            }
            ((c6i) k53VarB0.F0.getValue()).b(new kge(pb2Var.a, false));
            return;
        }
        if (i == jvd.a) {
            return;
        }
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("selected.chatId.Action")) : null;
        boolean z2 = (lValueOf == null || lValueOf.longValue() != 0) && lValueOf != null;
        Long lValueOf2 = bundle != null ? Long.valueOf(bundle.getLong("selected.contactId.Action")) : null;
        if ((lValueOf2 == null || lValueOf2.longValue() != 0) && lValueOf2 != null) {
            z = true;
        }
        if (z2) {
            k53 k53VarB02 = B0();
            if (lValueOf == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            xfh.o(k53VarB02, ((q2b) k53VarB02.Y).a().plus(k53VarB02.x()), new i43(i, k53VarB02, lValueOf.longValue(), null), 2);
            return;
        }
        if (z) {
            zy3 zy3Var = (zy3) this.Y.getValue();
            if (lValueOf2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            zy3Var.u(i, lValueOf2.longValue());
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        x7j.g(A0(), this.F0, false, new gf1(28));
        B0().y();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), null, 6);
        endlessRecyclerView2.setId(i1b.k);
        endlessRecyclerView2.setTag(hyc.oneme_folder_tag, this.b);
        endlessRecyclerView2.setHasFixedSize(true);
        frameLayout.addView(endlessRecyclerView2);
        frameLayout.addView(z0(), -1, -1);
        tqi.c(new sv2(3, null, 2), frameLayout);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("ONEME-6453|chats_list_lf | list view destroy. Scope isActive: ", d7j.f(getLifecycleScope())), null);
            }
        }
        EndlessRecyclerView2 endlessRecyclerView2A0 = A0();
        sn0 sn0Var = this.I0;
        yy7 yy7Var = L0[5];
        endlessRecyclerView2A0.q0((g23) sn0Var.getValue());
        endlessRecyclerView2A0.setDelegate(null);
        endlessRecyclerView2A0.setPager(null);
        x7j.h(endlessRecyclerView2A0, null, null, 6);
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        if (getView() != null) {
            x7j.h(A0(), null, null, 4);
        }
        super.onDetach(view);
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        yy7[] yy7VarArr = L0;
        yy7 yy7Var = yy7VarArr[0];
        this.c.b(this, null);
        yy7 yy7Var2 = yy7VarArr[1];
        this.d.b(this, null);
        qt7 qt7Var = (qt7) this.G0.D(this, yy7VarArr[4]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            qsb qsbVar = (qsb) this.s0.getValue();
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
        String str = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, xc0.f("ONEME-6453|chats_list_lf | list view created. Scope isActive: ", d7j.f(getLifecycleScope())), null);
            }
        }
        EndlessRecyclerView2 endlessRecyclerView2A0 = A0();
        zm3 zm3Var = this.F0;
        String str2 = this.b;
        if (fni.a(str2, "all.chat.folder")) {
            sn0 sn0Var = this.I0;
            yy7 yy7Var = L0[5];
            endlessRecyclerView2A0.k((g23) sn0Var.getValue());
        }
        endlessRecyclerView2A0.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        if (true != linearLayoutManager.i) {
            linearLayoutManager.i = true;
            linearLayoutManager.j = 0;
            RecyclerView recyclerView = linearLayoutManager.b;
            if (recyclerView != null) {
                recyclerView.c.m();
            }
        }
        linearLayoutManager.C = 12;
        endlessRecyclerView2A0.setLayoutManager(linearLayoutManager);
        x7j.h(endlessRecyclerView2A0, zm3Var, new gf1(29), 2);
        endlessRecyclerView2A0.setHasFixedSize(true);
        endlessRecyclerView2A0.setPager(new ma1(this, 2));
        if (fni.a(str2, "all.chat.folder")) {
            endlessRecyclerView2A0.setDelegate(this.D0);
        }
        endlessRecyclerView2A0.setEmptyView(z0());
        endlessRecyclerView2A0.setClipToPadding(false);
        endlessRecyclerView2A0.setClipChildren(false);
        endlessRecyclerView2A0.setClipToOutline(false);
        endlessRecyclerView2A0.setThreshold(10);
        endlessRecyclerView2A0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.x0;
        if (bVar != null) {
            endlessRecyclerView2A0.setItemViewCacheSize(Integer.MIN_VALUE);
            endlessRecyclerView2A0.setRecycledViewPool(bVar);
        }
        uhd itemAnimator = endlessRecyclerView2A0.getItemAnimator();
        un4 un4Var = itemAnimator instanceof un4 ? (un4) itemAnimator : null;
        if (un4Var != null) {
            un4Var.g = false;
        }
        endlessRecyclerView2A0.j(new y71(1));
        v1a v1aVar = a93.s0;
        endlessRecyclerView2A0.j(new vc9(1, v1aVar.y(endlessRecyclerView2A0)));
        endlessRecyclerView2A0.j(new ec6(new ka5(this, getContext().getString(mvd.O), endlessRecyclerView2A0)));
        endlessRecyclerView2A0.j(new tx3(new r5j(24, new ia(this, 9, new xx3(0L, "", null, null, null, null, null, false, false, "", false, null, 0, false, false, false, false, 31744))), v1aVar.y(endlessRecyclerView2A0), (sx3) null));
        if (zm3Var.j() > 0) {
            endlessRecyclerView2A0.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2A0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2A0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        A0().setRefreshingNext(((v03) B0().M0.a.getValue()).b);
        ci5 ci5Var = B0().T0;
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, getViewLifecycleOwner().p(), l38Var), new p53(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(B0().U0, 1), getViewLifecycleOwner().p(), l38Var), new q53(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().S0, getViewLifecycleOwner().p(), l38Var), new r53(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((zy3) this.Y.getValue()).F0, getViewLifecycleOwner().p(), l38Var), new s53(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(((zy3) this.Y.getValue()).G0, 2), getViewLifecycleOwner().p(), l38Var), new t53(null, this), 1), getViewLifecycleScope());
        this.y0.Y = new d92(8, this);
        gw0.w(new g56(aw0.a(B0().a1, getViewLifecycleOwner().p(), l38Var), new u53(null, this), 1), getViewLifecycleScope());
        E0();
    }

    @Override // defpackage.b14
    public final void x() {
        ((qsb) this.s0.getValue()).j(new s2i(this, 1), qsb.e, 156);
    }

    public final x3b z0() {
        yy7 yy7Var = L0[3];
        return (x3b) this.v0.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ChatsListWidget(Bundle bundle) {
        int i = 0;
        super(bundle, i, 2, null);
        String name = ChatsListWidget.class.getName();
        this.a = name;
        String string = bundle.getString("folder.id.key");
        if (string != null) {
            this.b = string;
            this.c = new hs(Long.class, null, "selected.chatId.Action");
            this.d = new hs(Long.class, null, "selected.contactId.Action");
            this.o = new bwf(new l53(this, i));
            this.X = l14.a.getAccessor().d(487);
            int i2 = 10;
            this.Y = createViewModelLazy(zy3.class, new tl2(25, new fu2(i2)));
            this.Z = createViewModelLazy(k53.class, new tl2(26, new l53(this, 4)));
            k18 k18VarCreateViewModelLazy = createViewModelLazy(zh0.class, new tl2(27, new l53(this, 5)));
            this.s0 = bi0.a.getAccessor().d(10);
            e03 e03Var = e03.a;
            ExecutorService executorServiceA = e03Var.a().a();
            this.t0 = executorServiceA;
            this.u0 = viewBinding(i1b.k);
            this.v0 = binding(new l53(this, 6));
            this.w0 = new bwf(new fu2(12));
            y03 y03Var = new y03(new usd(i2, this), executorServiceA);
            this.y0 = y03Var;
            ji0 ji0Var = new ji0((b14) this, executorServiceA);
            this.z0 = ji0Var;
            int i3 = 3;
            fb6 fb6Var = new fb6(this, executorServiceA, i3);
            this.A0 = fb6Var;
            fb6 fb6Var2 = new fb6(this, executorServiceA, i3);
            this.B0 = fb6Var2;
            ji0 ji0Var2 = new ji0((uq7) this, executorServiceA);
            this.C0 = ji0Var2;
            z71 z71Var = new z71(executorServiceA, 1);
            this.D0 = z71Var;
            pb6 pb6Var = new pb6(executorServiceA, new i62(11, this), new l53(this, 7));
            this.E0 = pb6Var;
            this.F0 = new zm3(new ym3(false, 2), ji0Var, pb6Var, y03Var, z71Var, fb6Var, ji0Var2, fb6Var2);
            this.G0 = c7j.c();
            this.H0 = ipi.b(3, new l53(this, 8));
            this.I0 = binding(new l53(this, 9));
            nm8 nm8Var = (nm8) e03Var.getAccessor().c(2);
            this.J0 = nm8Var;
            this.K0 = true;
            arb arbVar = arb.CHATS_INIT_TO_RENDER;
            nm8Var.c().getClass();
            nm8Var.e.m(arbVar, new zqb(arbVar, SystemClock.elapsedRealtime()));
            B0().o.e();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, xc0.f("ONEME-6453|chats_list_lf | list subscribe on new data. Scope isActive: ", d7j.f(getLifecycleScope())), null);
                }
            }
            hbd hbdVar = B0().M0;
            hbd hbdVar2 = ((zh0) k18VarCreateViewModelLazy.getValue()).Z;
            hbd hbdVar3 = B0().P0;
            hbd hbdVar4 = B0().Q0;
            m11 m11Var = new m11(13, lni.b());
            gw0.w(new c66(new x26[]{hbdVar, hbdVar2, hbdVar3, hbdVar4, m11Var}, new wn1(this, null, 1)), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
