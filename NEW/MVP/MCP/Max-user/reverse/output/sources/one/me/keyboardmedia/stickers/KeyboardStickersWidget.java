package one.me.keyboardmedia.stickers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a08;
import defpackage.b08;
import defpackage.bbd;
import defpackage.c08;
import defpackage.ckf;
import defpackage.dkf;
import defpackage.e91;
import defpackage.ekf;
import defpackage.er;
import defpackage.er5;
import defpackage.eze;
import defpackage.fb5;
import defpackage.fif;
import defpackage.fze;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gt;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h62;
import defpackage.ho7;
import defpackage.i84;
import defpackage.ikf;
import defpackage.imb;
import defpackage.jx0;
import defpackage.k18;
import defpackage.kti;
import defpackage.mz7;
import defpackage.nm0;
import defpackage.ora;
import defpackage.oz7;
import defpackage.ps5;
import defpackage.pz7;
import defpackage.q2b;
import defpackage.qk8;
import defpackage.qq3;
import defpackage.qra;
import defpackage.rf5;
import defpackage.s8j;
import defpackage.sgf;
import defpackage.su1;
import defpackage.svi;
import defpackage.t09;
import defpackage.tef;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uxb;
import defpackage.vid;
import defpackage.vr5;
import defpackage.vw4;
import defpackage.w5b;
import defpackage.wj1;
import defpackage.wqi;
import defpackage.wu7;
import defpackage.y03;
import defpackage.yo3;
import defpackage.yy7;
import defpackage.z41;
import defpackage.zz7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/keyboardmedia/stickers/KeyboardStickersWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lb1e;", "scopeId", "(JLjava/lang/String;Ltk4;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class KeyboardStickersWidget extends Widget implements qq3 {
    public static final /* synthetic */ yy7[] s0 = {new toc(KeyboardStickersWidget.class, "contentRecyclerView", "getContentRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), ho7.d(vid.a, KeyboardStickersWidget.class, "stickersTabsRecyclerView", "getStickersTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final y03 X;
    public final sgf Y;
    public final h62 Z;
    public final k18 a;
    public final k18 b;
    public qk8 c;
    public final bbd d;
    public final bbd o;

    public KeyboardStickersWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = createViewModelLazy(ikf.class, new yo3(24, new wj1(bundle, 6)));
        this.b = m39getSharedViewModelcp94BC8(bundle.getString(Widget.ARG_SCOPE_ID), t09.class, null);
        this.d = viewBinding(w5b.n);
        this.o = viewBinding(w5b.o);
        mz7 mz7Var = mz7.a;
        this.X = new y03(((g4b) mz7Var.getAccessor().c(56)).a(), new wu7(2, this), (byte) 0);
        sgf sgfVar = new sgf(((g4b) mz7Var.getAccessor().c(56)).a(), new c08(this, bundle));
        this.Y = sgfVar;
        ikf ikfVarA0 = A0();
        ikfVarA0.getClass();
        wqi.c(ikf.class.getName(), "loadStickers", new Object[0]);
        su1 su1VarA = s8j.a(((tef) ikfVarA0.c.getValue()).a());
        su1 su1VarA2 = s8j.a(((ps5) ikfVarA0.o.getValue()).a());
        nm0 nm0Var = ((vr5) ikfVarA0.X.getValue()).Y;
        nm0Var.getClass();
        su1 su1VarA3 = s8j.a(new ora(new qra(nm0Var, 0), new er5(28), 5));
        fze fzeVar = (fze) ikfVarA0.Y.getValue();
        gw0.w(gw0.u(new g56(gw0.j(su1VarA, su1VarA2, su1VarA3, new z41(new uxb(s8j.a(((tef) fzeVar.a.getValue()).l), fzeVar, 17), ((fif) fzeVar.b.getValue()).e, eze.Z, 3), new ckf(5, null)), new dkf(ikfVarA0, null), 1), ((q2b) ikfVarA0.b).b()), ikfVarA0.a);
        gw0.w(new g56(A0().s0, new zz7(this, null), 1), getLifecycleScope());
        this.Z = new h62(sgfVar, new jx0(1, A0(), ikf.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 24));
    }

    public final ikf A0() {
        return (ikf) this.a.getValue();
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == w5b.g) {
            ikf ikfVarA0 = A0();
            ikfVarA0.y0.O(ikfVarA0, ikf.z0[2], svi.d(ikfVarA0.a, ((q2b) ikfVarA0.b).b(), i84.b, new ekf(ikfVarA0, null)));
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(w5b.l);
        int iD = kti.d(44 * vw4.d().getDisplayMetrics().density);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(w5b.o);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, iD));
        int iD2 = kti.d(4 * vw4.d().getDisplayMetrics().density);
        int iD3 = kti.d(8 * vw4.d().getDisplayMetrics().density);
        recyclerView.setPadding(iD3, iD2, iD3, iD2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        int i = 3;
        tqi.c(new pz7(i, continuation, 2), recyclerView);
        frameLayout.addView(recyclerView);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(w5b.n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iD;
        endlessRecyclerView2.setLayoutParams(layoutParams);
        tqi.c(new er(i, continuation, 7), endlessRecyclerView2);
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int iD4 = kti.d(12 * vw4.d().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(iD4, endlessRecyclerView2.getPaddingTop(), iD4, kti.d(48 * vw4.d().getDisplayMetrics().density));
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        y0().setAdapter(null);
        y0().s0(this.Z);
        z0().setAdapter(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        z0().setAdapter(this.X);
        z0().j(new e91(kti.d(2 * vw4.d().getDisplayMetrics().density), 3));
        EndlessRecyclerView2 endlessRecyclerView2Y0 = y0();
        qk8 qk8Var = this.c;
        sgf sgfVar = this.Y;
        sgfVar.Y = qk8Var;
        int iB = gt.b(endlessRecyclerView2Y0.getContext());
        endlessRecyclerView2Y0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(iB);
        gridLayoutManager.K = new oz7(gridLayoutManager, sgfVar);
        endlessRecyclerView2Y0.setLayoutManager(gridLayoutManager);
        endlessRecyclerView2Y0.j(new fb5(iB, kti.d(4 * vw4.d().getDisplayMetrics().density), 6));
        endlessRecyclerView2Y0.m(this.Z);
        endlessRecyclerView2Y0.m(new rf5(2, this));
        endlessRecyclerView2Y0.k(new a08(0, this));
        endlessRecyclerView2Y0.setAdapter(sgfVar);
        gw0.w(new g56(A0().v0, new b08(this, null), 1), getViewLifecycleScope());
    }

    public final EndlessRecyclerView2 y0() {
        return (EndlessRecyclerView2) this.d.D(this, s0[0]);
    }

    public final RecyclerView z0() {
        return (RecyclerView) this.o.D(this, s0[1]);
    }

    public KeyboardStickersWidget(long j, String str, tk4 tk4Var) {
        this(gwi.b(new imb("arg_key_chat_id", Long.valueOf(j)), new imb(Widget.ARG_SCOPE_ID, str)));
    }
}
