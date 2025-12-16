package com.avito.android.sbc.autodispatcheslist;

import Cd.C13243a;
import Ro0.InterfaceC15067a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.HelpCenterShowLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.sbc.autodispatches.x;
import com.avito.android.sbc.autodispatcheslist.adapter.c;
import com.avito.android.sbc.autodispatcheslist.adapter.i;
import com.avito.android.sbc.autodispatcheslist.mvi.m;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import md.InterfaceC44055a;
import z1.AbstractC50339a;

/* compiled from: SbcAutoDispatchesListFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/SbcAutoDispatchesListFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SbcAutoDispatchesListFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @k
    public static final a f258990w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public m f258991n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f258992o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f258993p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f258994q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public com.avito.android.sbc.autodispatcheslist.h f258995r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public AutoDispatchListInfo f258996s0;

    /* renamed from: t0, reason: collision with root package name */
    @l
    public x f258997t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final b f258998u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final c f258999v0;

    /* compiled from: SbcAutoDispatchesListFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/SbcAutoDispatchesListFragment$a;", "", "<init>", "()V", "", "AUTO_DISPATCH_LIST_INFO_KEY", "Ljava/lang/String;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SbcAutoDispatchesListFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/sbc/autodispatcheslist/SbcAutoDispatchesListFragment$b", "Lcom/avito/android/sbc/autodispatcheslist/adapter/i$a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements i.a {
        public b() {
        }

        @Override // com.avito.android.sbc.autodispatcheslist.adapter.i.a
        public final void a(@k com.avito.android.sbc.autodispatcheslist.adapter.f fVar) {
            a aVar = SbcAutoDispatchesListFragment.f258990w0;
            SbcAutoDispatchesListFragment.this.q5().accept(new InterfaceC15067a.b(fVar));
        }

        @Override // com.avito.android.sbc.autodispatcheslist.adapter.i.a
        public final void b(@k com.avito.android.sbc.autodispatcheslist.adapter.f fVar) {
            a aVar = SbcAutoDispatchesListFragment.f258990w0;
            SbcAutoDispatchesListFragment.this.q5().accept(new InterfaceC15067a.C0980a(fVar));
        }

        @Override // com.avito.android.sbc.autodispatcheslist.adapter.i.a
        public final void c(@k com.avito.android.sbc.autodispatcheslist.adapter.f fVar) {
            a aVar = SbcAutoDispatchesListFragment.f258990w0;
            SbcAutoDispatchesListFragment.this.q5().accept(new InterfaceC15067a.d(fVar));
        }
    }

    /* compiled from: SbcAutoDispatchesListFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/sbc/autodispatcheslist/SbcAutoDispatchesListFragment$c", "Lcom/avito/android/sbc/autodispatcheslist/adapter/c$a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements c.a {
        public c() {
        }

        @Override // com.avito.android.sbc.autodispatcheslist.adapter.c.a
        public final void a() {
            com.avito.android.deeplink_handler.handler.composite.a aVar = SbcAutoDispatchesListFragment.this.f258994q0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, new HelpCenterShowLink(), null, null, 6);
        }
    }

    /* compiled from: SbcAutoDispatchesListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SbcAutoDispatchesListFragment.f258990w0;
            SbcAutoDispatchesListFragment.this.q5().accept(InterfaceC15067a.c.f14636a);
            return G0.f406611a;
        }
    }

    /* compiled from: SbcAutoDispatchesListFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/mvi/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/sbc/autodispatcheslist/mvi/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.sbc.autodispatcheslist.mvi.l> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.sbc.autodispatcheslist.mvi.l invoke() {
            m mVar = SbcAutoDispatchesListFragment.this.f258991n0;
            if (mVar == null) {
                mVar = null;
            }
            return (com.avito.android.sbc.autodispatcheslist.mvi.l) mVar.get();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f259004l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f259004l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f259004l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SbcAutoDispatchesListFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f259006l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f259006l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f259006l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f259007l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f259007l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f259007l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f259008l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f259008l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f259008l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public SbcAutoDispatchesListFragment() {
        super(R.layout.sbc_auto_dispatches_list_fragment_layout);
        f fVar = new f(new e());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f258992o0 = new O0(m0.f406844a.b(com.avito.android.sbc.autodispatcheslist.mvi.l.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f258998u0 = new b();
        this.f258999v0 = new c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        boolean z12 = context instanceof x;
        Object obj = context;
        if (!z12) {
            obj = null;
        }
        this.f258997t0 = (x) obj;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.d dVar = this.f258993p0;
        if (dVar == null) {
            dVar = null;
        }
        AutoDispatchListInfo autoDispatchListInfo = this.f258996s0;
        this.f258995r0 = new com.avito.android.sbc.autodispatcheslist.h(view, dVar, autoDispatchListInfo != null ? Boolean.valueOf(autoDispatchListInfo.f258987b) : null, new d());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.sbc.autodispatcheslist.a(this, q5(), null), 3);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        Parcelable parcelable = requireArguments().getParcelable("auto_dispatch_list_info");
        AutoDispatchListInfo autoDispatchListInfo = parcelable instanceof AutoDispatchListInfo ? (AutoDispatchListInfo) parcelable : null;
        if (autoDispatchListInfo == null) {
            throw new IllegalArgumentException();
        }
        this.f258996s0 = autoDispatchListInfo;
        ((com.avito.android.sbc.autodispatches.di.b) ((InterfaceC44055a) getParentFragment()).r0()).a().a(autoDispatchListInfo, this.f258998u0, this.f258999v0).a(this);
    }

    public final com.avito.android.sbc.autodispatcheslist.mvi.l q5() {
        return (com.avito.android.sbc.autodispatcheslist.mvi.l) this.f258992o0.getValue();
    }
}
