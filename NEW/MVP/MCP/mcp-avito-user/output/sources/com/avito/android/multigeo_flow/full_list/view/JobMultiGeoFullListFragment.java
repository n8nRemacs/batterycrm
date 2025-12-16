package com.avito.android.multigeo_flow.full_list.view;

import Cd.C13243a;
import Q20.a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.I5;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import z1.AbstractC50339a;

/* compiled from: JobMultiGeoFullListFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/view/JobMultiGeoFullListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class JobMultiGeoFullListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public final C35968w3 f206924n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f206925o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f206926p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public i f206927q0;

    /* renamed from: r0, reason: collision with root package name */
    @k
    public final O0 f206928r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public View f206929s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public Button f206930t0;

    /* renamed from: u0, reason: collision with root package name */
    @l
    public RecyclerView f206931u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public View f206932v0;

    /* renamed from: w0, reason: collision with root package name */
    @l
    public com.avito.android.multigeo_flow.edit_address.a f206933w0;

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f206923y0 = {m0.f406844a.e(new Y(JobMultiGeoFullListFragment.class, "openParams", "getOpenParams()Lcom/avito/android/multigeo_flow/full_list/view/JobMultiGeoParams;", 0))};

    /* renamed from: x0, reason: collision with root package name */
    @k
    public static final a f206922x0 = new a(null);

    /* compiled from: JobMultiGeoFullListFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/view/JobMultiGeoFullListFragment$a;", "", "<init>", "()V", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: JobMultiGeoFullListFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/multigeo_flow/domain/AddressItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/multigeo_flow/domain/AddressItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<AddressItem, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(AddressItem addressItem) {
            a aVar = JobMultiGeoFullListFragment.f206922x0;
            JobMultiGeoFullListFragment.this.r5().accept(new a.c(addressItem));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f206935l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f206935l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f206935l);
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
            return JobMultiGeoFullListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f206937l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f206937l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f206937l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f206938l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f206938l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f206938l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f206939l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f206939l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f206939l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: JobMultiGeoFullListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/full_list/view/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/multigeo_flow/full_list/view/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.multigeo_flow.full_list.view.h> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.multigeo_flow.full_list.view.h invoke() {
            i iVar = JobMultiGeoFullListFragment.this.f206927q0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.multigeo_flow.full_list.view.h) iVar.get();
        }
    }

    public JobMultiGeoFullListFragment() {
        super(R.layout.job_multigeo_full_list_fragment);
        this.f206924n0 = new C35968w3(this);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f206928r0 = new O0(m0.f406844a.b(com.avito.android.multigeo_flow.full_list.view.h.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = requireView().findViewById(R.id.close_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f206929s0 = viewFindViewById;
        View viewFindViewById2 = requireView().findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        I5.a((TextView) viewFindViewById2, q5().f206943d, false);
        View viewFindViewById3 = requireView().findViewById(R.id.add_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        this.f206930t0 = button;
        com.avito.android.lib.design.button.b.a(button, q5().f206944e, false);
        View viewFindViewById4 = requireView().findViewById(R.id.full_address_list);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById4;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.d dVar = this.f206925o0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        this.f206931u0 = recyclerView;
        View viewFindViewById5 = requireView().findViewById(R.id.full_address_progress);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f206932v0 = viewFindViewById5;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.multigeo_flow.full_list.view.e(this, null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.multigeo_flow.full_list.di.a.a().a(cv.c.b(this), (com.avito.android.multigeo_flow.full_list.di.c) C29972i.a(C29972i.b(this), Object.class), new b(), new JobMultiGeoState(q5().f206941b, q5().f206946g, q5().f206942c, null, false)).a(this);
    }

    public final JobMultiGeoParams q5() {
        return (JobMultiGeoParams) this.f206924n0.getValue(this, f206923y0[0]);
    }

    public final com.avito.android.multigeo_flow.full_list.view.h r5() {
        return (com.avito.android.multigeo_flow.full_list.view.h) this.f206928r0.getValue();
    }
}
