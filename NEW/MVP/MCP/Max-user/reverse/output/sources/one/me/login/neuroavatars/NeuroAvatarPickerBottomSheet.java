package one.me.login.neuroavatars;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.bfa;
import defpackage.cfa;
import defpackage.dfa;
import defpackage.ec6;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hfa;
import defpackage.hh8;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hu1;
import defpackage.i6c;
import defpackage.imb;
import defpackage.k18;
import defpackage.kkf;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.m01;
import defpackage.nd6;
import defpackage.neb;
import defpackage.oga;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tx3;
import defpackage.uha;
import defpackage.v1a;
import defpackage.v9;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wu7;
import defpackage.xyc;
import defpackage.yy7;
import defpackage.z11;
import defpackage.z41;
import defpackage.zfa;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\f"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarPickerBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "", "viewHeight", "(Ljava/lang/String;ILtk4;)V", "s52", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class NeuroAvatarPickerBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] N0 = {new toc(NeuroAvatarPickerBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), ho7.d(vid.a, NeuroAvatarPickerBottomSheet.class, "viewHeight", "getViewHeight()I", 0), new toc(NeuroAvatarPickerBottomSheet.class, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0), new toc(NeuroAvatarPickerBottomSheet.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(NeuroAvatarPickerBottomSheet.class, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0)};
    public final hs C0;
    public final k18 D0;
    public final k18 E0;
    public final ExecutorService F0;
    public final b0i G0;
    public final zfa H0;
    public final v1a I0;
    public final nd6 J0;
    public final bbd K0;
    public final bbd L0;
    public final bbd M0;

    public NeuroAvatarPickerBottomSheet(String str, int i, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("arg_view_height", Integer.valueOf(i))));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        Context context = getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        Context context2 = linearLayout.getContext();
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        frameLayout2.setLayoutParams(layoutParams2);
        uha.C(frameLayout2);
        linearLayout.addView(frameLayout2);
        ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(-1, -1);
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        recyclerView.setId(xyc.oneme_login_neuro_avatars_recycler_view);
        recyclerView.setLayoutParams(layoutParams3);
        recyclerView.setClipToPadding(false);
        recyclerView.setItemAnimator(null);
        recyclerView.setOverScrollMode(2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(4));
        b0i b0iVar = this.G0;
        recyclerView.setAdapter(b0iVar);
        tx3 tx3Var = new tx3(recyclerView, b0iVar, new hu1(b0iVar, 5, this));
        ec6 ec6Var = new ec6(new z11(12, b0iVar), recyclerView.getContext());
        recyclerView.j(tx3Var);
        recyclerView.j(ec6Var);
        recyclerView.j(new m01(kti.d(16 * vw4.d().getDisplayMetrics().density), kti.d(12 * vw4.d().getDisplayMetrics().density), 7));
        linearLayout.addView(recyclerView);
        recyclerView.m(this.H0);
        return linearLayout;
    }

    public final neb O0() {
        return (neb) this.K0.D(this, N0[2]);
    }

    public final oga P0() {
        return (oga) this.D0.getValue();
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        O0().k(this.J0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        z41 z41Var = P0().x0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(z41Var, l48VarP, l38Var), new bfa(null, this), 1), getViewLifecycleScope());
        O0().a(this.J0);
        gw0.w(new g56(aw0.a(P0().z0, getViewLifecycleOwner().p(), l38Var), new cfa(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(P0().w0, getViewLifecycleOwner().p(), l38Var), new dfa(null, this), 1), getViewLifecycleScope());
        b0i b0iVar = this.G0;
        b0iVar.z(new kkf(this, 1, b0iVar));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new v9(this, 4);
    }

    public NeuroAvatarPickerBottomSheet(Bundle bundle) {
        super(bundle);
        hs hsVar = new hs(b1e.class, new b1e("default"), Widget.ARG_SCOPE_ID);
        this.C0 = new hs(Integer.class, 0, "arg_view_height");
        yy7 yy7Var = N0[0];
        this.D0 = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, oga.class, null);
        hh8 hh8Var = hh8.a;
        this.E0 = hh8Var.getAccessor().d(77);
        ExecutorService executorServiceA = ((g4b) hh8Var.getAccessor().c(56)).a();
        this.F0 = executorServiceA;
        b0i b0iVar = new b0i(executorServiceA, new hfa() { // from class: afa
            @Override // defpackage.hfa
            public final void a(zea zeaVar) {
                yy7[] yy7VarArr = NeuroAvatarPickerBottomSheet.N0;
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = this.a;
                neuroAvatarPickerBottomSheet.P0().y(zeaVar);
                neuroAvatarPickerBottomSheet.E0(true);
            }
        }, 8);
        this.G0 = b0iVar;
        this.H0 = new zfa(b0iVar, new wu7(23, this));
        this.I0 = new v1a(25);
        this.J0 = new nd6(1, this);
        this.K0 = viewBinding(xyc.oneme_login_neuro_avatars_tabs);
        this.L0 = viewBinding(xyc.oneme_login_neuro_avatars_recycler_view);
        this.M0 = viewBinding(xyc.oneme_login_neuro_avatars_tabs_shimmer);
    }
}
