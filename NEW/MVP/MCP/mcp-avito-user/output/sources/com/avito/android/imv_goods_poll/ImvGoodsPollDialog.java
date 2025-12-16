package com.avito.android.imv_goods_poll;

import Cd.C13243a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.GoodsImvPollScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.imv_goods_poll.ImvGoodsPollDialog;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import eN.InterfaceC40024a;
import fN.InterfaceC40319a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ImvGoodsPollDialog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/imv_goods_poll/ImvGoodsPollDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImvGoodsPollDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f170583s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f170584t0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public n f170585h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f170586i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f170587j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f170588k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f170589l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f170590m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170591n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170592o0;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170593p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C47313c f170594q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f170595r0;

    /* compiled from: ImvGoodsPollDialog.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/imv_goods_poll/ImvGoodsPollDialog$a;", "", "<init>", "()V", "", "DIALOG_DONE_TAG", "Ljava/lang/String;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImvGoodsPollDialog.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/imv_goods_poll/ImvGoodsPollDialog$b", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.lib.design.bottom_sheet.d {
        public b(Context context) {
            super(context, 0, 2, null);
            a aVar = ImvGoodsPollDialog.f170583s0;
            com.avito.android.lib.design.bottom_sheet.j.c(this, ImvGoodsPollDialog.this.f5().f170610b.getTitle(), true, 0, 0, 0, 120);
            T();
            setCanceledOnTouchOutside(true);
            com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        }

        @Override // androidx.view.r, android.app.Dialog
        @SuppressLint({"MissingSuperCall"})
        @InterfaceC42830m
        public final void onBackPressed() {
            a aVar = ImvGoodsPollDialog.f170583s0;
            ActivityC22955m activityC22955mL1 = ImvGoodsPollDialog.this.l1();
            if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
                return;
            }
            activityC22955mL1.finish();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f170597l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f170597l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f170597l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ImvGoodsPollDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f170599l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f170599l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f170599l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170600l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170600l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f170600l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f170601l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f170601l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f170601l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ImvGoodsPollDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/imv_goods_poll/m;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/imv_goods_poll/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<m> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final m invoke() {
            n nVar = ImvGoodsPollDialog.this.f170585h0;
            if (nVar == null) {
                nVar = null;
            }
            return (m) nVar.get();
        }
    }

    static {
        Y y12 = new Y(ImvGoodsPollDialog.class, "openParams", "getOpenParams()Lcom/avito/android/imv_goods_poll/ImvGoodsPollParams;", 0);
        n0 n0Var = m0.f406844a;
        f170584t0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsPollDialog.class, "root", "getRoot()Landroidx/core/widget/NestedScrollView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsPollDialog.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsPollDialog.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ImvGoodsPollDialog.class, "input", "getInput()Lcom/avito/android/lib/design/input/Input;", 0, n0Var)};
        f170583s0 = new a(null);
    }

    public ImvGoodsPollDialog() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f170586i0 = new O0(m0.f406844a.b(m.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f170590m0 = new C35968w3(this);
        this.f170591n0 = new C47313c(null, 1, null);
        this.f170592o0 = new C47313c(null, 1, null);
        this.f170593p0 = new C47313c(null, 1, null);
        this.f170594q0 = new C47313c(null, 1, null);
    }

    public final ImvGoodsPollParams f5() {
        return (ImvGoodsPollParams) this.f170590m0.getValue(this, f170584t0[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.avito.android.imv_goods_poll.c] */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        ((InterfaceC40024a.b) C29972i.a(C29972i.b(this), InterfaceC40024a.b.class)).Kf().a(getF42820b(), getResources(), f5(), new C28478k(GoodsImvPollScreen.f90365d, s.b(this), "goodsIMVFeedback"), new com.avito.android.imv_goods_poll.mvi.a() { // from class: com.avito.android.imv_goods_poll.c
            @Override // com.avito.android.imv_goods_poll.mvi.a
            public final void a(InterfaceC40319a.b bVar) {
                ImvGoodsPollDialog.a aVar = ImvGoodsPollDialog.f170583s0;
                ((m) this.f170618a.f170586i0.getValue()).accept(bVar);
            }
        }, cv.c.d(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170589l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        return new b(requireContext());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f170589l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.dialog_imv_goods_poll, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        ActivityC22955m activityC22955mL1;
        super.onDismiss(dialogInterface);
        if (this.f170595r0 || (activityC22955mL1 = l1()) == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        C47313c c47313c = this.f170591n0;
        kotlin.reflect.n<Object>[] nVarArr = f170584t0;
        kotlin.reflect.n<Object> nVar = nVarArr[1];
        c47313c.b(this, (NestedScrollView) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.comment_input);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        C47313c c47313c2 = this.f170594q0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[4];
        c47313c2.b(this, (Input) viewFindViewById2);
        View viewFindViewById3 = view.findViewById(R.id.button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        C47313c c47313c3 = this.f170593p0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[3];
        c47313c3.b(this, (Button) viewFindViewById3);
        View viewFindViewById4 = view.findViewById(R.id.recycler);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        C47313c c47313c4 = this.f170592o0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c4.b(this, (RecyclerView) viewFindViewById4);
        kotlin.reflect.n<Object> nVar5 = nVarArr[2];
        RecyclerView recyclerView = (RecyclerView) c47313c4.a();
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        kotlin.reflect.n<Object> nVar6 = nVarArr[2];
        RecyclerView recyclerView2 = (RecyclerView) c47313c4.a();
        com.avito.konveyor.adapter.j jVar = this.f170587j0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        kotlin.reflect.n<Object> nVar7 = nVarArr[3];
        ((Button) c47313c3.a()).setText(String.valueOf(f5().f170610b.getActionTitle()));
        kotlin.reflect.n<Object> nVar8 = nVarArr[3];
        ((Button) c47313c3.a()).setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 27));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new com.avito.android.imv_goods_poll.d(this, null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f170589l0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }
}
