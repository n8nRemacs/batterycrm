package com.avito.android.delivery_location_suggest;

import Cd.C13243a;
import Fv.C13838a;
import Gv.InterfaceC13920a;
import Gv.InterfaceC13921b;
import Gv.c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatEditText;
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
import com.avito.android.analytics.screens.DeliveryLocationSuggestScreen;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.error.z;
import com.avito.android.suggest_locations.SuggestLocationsToolbarImpl;
import com.avito.android.ui.fragments.BaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import qK0.C47312b;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: DeliveryLocationSuggestFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryLocationSuggestFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f135018v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f135019w0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public s f135020n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f135021o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f135022p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f135023q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135024r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final C47312b f135025s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f135026t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f135027u0;

    /* compiled from: DeliveryLocationSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestFragment$a;", "", "<init>", "()V", "", "PARAMS_EXTRA", "Ljava/lang/String;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DeliveryLocationSuggestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC13921b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13921b interfaceC13921b) {
            InterfaceC13921b interfaceC13921b2 = interfaceC13921b;
            DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = (DeliveryLocationSuggestFragment) this.receiver;
            a aVar = DeliveryLocationSuggestFragment.f135018v0;
            deliveryLocationSuggestFragment.getClass();
            if (interfaceC13921b2 instanceof InterfaceC13921b.a) {
                Intent intent = new Intent();
                C13838a c13838a = ((InterfaceC13921b.a) interfaceC13921b2).f6772a;
                intent.putExtra("extra_coordinates", c13838a.f6019c);
                intent.putExtra("extra_address", c13838a.f6018b);
                intent.putExtra("extra_city", c13838a.f6017a);
                ActivityC22955m activityC22955mL1 = deliveryLocationSuggestFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.setResult(-1, intent);
                }
                ActivityC22955m activityC22955mL12 = deliveryLocationSuggestFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryLocationSuggestFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Gv.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Gv.c cVar) {
            Gv.c cVar2 = cVar;
            DeliveryLocationSuggestFragment deliveryLocationSuggestFragment = (DeliveryLocationSuggestFragment) this.receiver;
            a aVar = DeliveryLocationSuggestFragment.f135018v0;
            deliveryLocationSuggestFragment.getClass();
            String strValueOf = String.valueOf(deliveryLocationSuggestFragment.q5().f292157b.getText());
            String str = cVar2.f6773b;
            if (!strValueOf.equals(str)) {
                deliveryLocationSuggestFragment.q5().a(str);
            }
            c.a aVar2 = cVar2.f6774c;
            boolean z12 = aVar2 instanceof c.a.C0380a;
            C47313c c47313c = deliveryLocationSuggestFragment.f135026t0;
            if (z12) {
                com.avito.konveyor.adapter.d dVar = deliveryLocationSuggestFragment.f135023q0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(((c.a.C0380a) aVar2).f6775a, null);
                kotlin.reflect.n<Object> nVar = DeliveryLocationSuggestFragment.f135019w0[2];
                ((com.avito.android.progress_overlay.l) c47313c.a()).j();
            } else if (aVar2 instanceof c.a.b) {
                kotlin.reflect.n<Object> nVar2 = DeliveryLocationSuggestFragment.f135019w0[2];
                ((com.avito.android.progress_overlay.l) c47313c.a()).a(z.k(((c.a.b) aVar2).f6776a));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DeliveryLocationSuggestFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/delivery_location_suggest/DeliveryLocationSuggestParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<DeliveryLocationSuggestParams> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final DeliveryLocationSuggestParams invoke() {
            Bundle bundleRequireArguments = DeliveryLocationSuggestFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("location_suggest_params", DeliveryLocationSuggestParams.class) : bundleRequireArguments.getParcelable("location_suggest_params");
            if (parcelable != null) {
                return (DeliveryLocationSuggestParams) parcelable;
            }
            throw new IllegalArgumentException("SuggestParams required parameter");
        }
    }

    /* compiled from: DeliveryLocationSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGv/a;", "action", "Lkotlin/G0;", "invoke", "(LGv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC13920a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13920a interfaceC13920a) {
            a aVar = DeliveryLocationSuggestFragment.f135018v0;
            DeliveryLocationSuggestFragment.this.r5().accept(interfaceC13920a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f135030l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f135030l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f135030l);
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
            return DeliveryLocationSuggestFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f135032l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f135032l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f135032l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f135033l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f135033l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f135033l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f135034l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f135034l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f135034l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DeliveryLocationSuggestFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/delivery_location_suggest/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/delivery_location_suggest/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<r> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            s sVar = DeliveryLocationSuggestFragment.this.f135020n0;
            if (sVar == null) {
                sVar = null;
            }
            return (r) sVar.get();
        }
    }

    static {
        Y y12 = new Y(DeliveryLocationSuggestFragment.class, "toolbar", "getToolbar()Lcom/avito/android/suggest_locations/SuggestLocationsToolbarImpl;", 0);
        n0 n0Var = m0.f406844a;
        f135019w0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(DeliveryLocationSuggestFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(DeliveryLocationSuggestFragment.class, "progressOverlay", "getProgressOverlay()Lcom/avito/android/progress_overlay/ProgressOverlay;", 0, n0Var)};
        f135018v0 = new a(null);
    }

    public DeliveryLocationSuggestFragment() {
        super(R.layout.delivery_suggest_fragment);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f135021o0 = new O0(m0.f406844a.b(r.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f135024r0 = new C47313c(null, 1, null);
        this.f135025s0 = new C47312b(null, 1, null);
        this.f135026t0 = new C47313c(null, 1, null);
        this.f135027u0 = C42727D.c(new d());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f135022p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        SuggestLocationsToolbarImpl suggestLocationsToolbarImpl = (SuggestLocationsToolbarImpl) view.findViewById(R.id.suggest_toolbar);
        C47313c c47313c = this.f135024r0;
        kotlin.reflect.n<Object>[] nVarArr = f135019w0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, suggestLocationsToolbarImpl);
        q5().i0();
        q5().setHint(getString(R.string.delivery_courier_suggest_location_hint));
        C43259k.d(C22981N.a(getLifecycle()), null, null, new com.avito.android.delivery_location_suggest.f(this, view, null), 3);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.location_suggests_recycler);
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        C47312b c47312b = this.f135025s0;
        c47312b.b(this, recyclerView);
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        RecyclerView recyclerView2 = (RecyclerView) c47312b.a();
        view.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        kotlin.reflect.n<Object> nVar4 = nVarArr[1];
        RecyclerView recyclerView3 = (RecyclerView) c47312b.a();
        com.avito.konveyor.adapter.d dVar = this.f135023q0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView3.setAdapter(dVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f135022p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        kotlin.reflect.n<Object> nVar5 = nVarArr[1];
        screenPerformanceTracker.b((RecyclerView) c47312b.a());
        View viewFindViewById = view.findViewById(R.id.content_holder);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById, R.id.location_suggests_recycler, null, 0, 0, 28, null);
        C47313c c47313c2 = this.f135026t0;
        kotlin.reflect.n<Object> nVar6 = nVarArr[2];
        c47313c2.b(this, lVar);
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        ((com.avito.android.progress_overlay.l) c47313c2.a()).f231600j = new com.avito.android.delivery_location_suggest.e(this);
        com.avito.android.lib.design.input.n.b((AppCompatEditText) q5().findViewById(R.id.query), com.avito.android.delivery_location_suggest.d.f135046l);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f135022p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, r5(), new b(1, this, DeliveryLocationSuggestFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestOneTimeEvent;)V", 0), new c(1, this, DeliveryLocationSuggestFragment.class, "render", "render(Lcom/avito/android/delivery_location_suggest/mvi/entity/DeliveryLocationSuggestState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f135022p0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.delivery_location_suggest.di.a.a().a((DeliveryLocationSuggestParams) this.f135027u0.getValue(), new C28478k(DeliveryLocationSuggestScreen.f90337d, com.avito.android.analytics.screens.s.c(this), "delivery-location-suggest"), new e(), (com.avito.android.delivery_location_suggest.di.e) C29972i.a(C29972i.b(this), com.avito.android.delivery_location_suggest.di.e.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f135022p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f135022p0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final SuggestLocationsToolbarImpl q5() {
        C47313c c47313c = this.f135024r0;
        kotlin.reflect.n<Object> nVar = f135019w0[0];
        return (SuggestLocationsToolbarImpl) c47313c.a();
    }

    public final r r5() {
        return (r) this.f135021o0.getValue();
    }
}
