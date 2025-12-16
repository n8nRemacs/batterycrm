package com.avito.android.developments_agency_search.screen.deal_room_development;

import Cd.C13243a;
import Dw.InterfaceC13445a;
import Dw.InterfaceC13447c;
import Dw.e;
import Y41.p;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;
import z1.AbstractC50339a;

/* compiled from: DealRoomDevelopmentFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/DealRoomDevelopmentFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DealRoomDevelopmentFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.screen.deal_room_development.j f137825n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f137826o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f137827p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f137828q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f137829r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.developments_agency_search.adapter.error_layout.d f137830s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f137831t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f137832u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f137833v0;

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f137824x0 = {m0.f406844a.e(new Y(DealRoomDevelopmentFragment.class, "arguments", "getArguments()Lcom/avito/android/developments_agency_search/screen/deal_room_development/DealRoomDevelopmentArguments;", 0))};

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f137823w0 = new a(null);

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/DealRoomDevelopmentFragment$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/h;", "invoke", "()Lcom/avito/android/developments_agency_search/screen/deal_room_development/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.developments_agency_search.screen.deal_room_development.h> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_agency_search.screen.deal_room_development.h invoke() {
            DealRoomDevelopmentFragment dealRoomDevelopmentFragment = DealRoomDevelopmentFragment.this;
            View viewRequireView = dealRoomDevelopmentFragment.requireView();
            com.avito.android.developments_agency_search.screen.deal_room_development.d dVar = new com.avito.android.developments_agency_search.screen.deal_room_development.d(1, dealRoomDevelopmentFragment.q5(), com.avito.android.developments_agency_search.screen.deal_room_development.i.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            com.avito.konveyor.adapter.j jVar = dealRoomDevelopmentFragment.f137828q0;
            if (jVar == null) {
                jVar = null;
            }
            com.avito.konveyor.adapter.a aVar = dealRoomDevelopmentFragment.f137829r0;
            return new com.avito.android.developments_agency_search.screen.deal_room_development.h(dVar, viewRequireView, aVar != null ? aVar : null, jVar);
        }
    }

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends C42801a implements Y41.l<InterfaceC13447c, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13447c interfaceC13447c) {
            InterfaceC13447c interfaceC13447c2 = interfaceC13447c;
            DealRoomDevelopmentFragment dealRoomDevelopmentFragment = (DealRoomDevelopmentFragment) this.receiver;
            a aVar = DealRoomDevelopmentFragment.f137823w0;
            dealRoomDevelopmentFragment.getClass();
            if (interfaceC13447c2 instanceof InterfaceC13447c.C0204c) {
                com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(dealRoomDevelopmentFragment.requireContext(), 0, 2, null);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
                dVar.setContentView(R.layout.dialog_agency_commission_tooltip);
                ((TextView) dVar.findViewById(R.id.tooltip_text)).setText(((InterfaceC13447c.C0204c) interfaceC13447c2).f3547a);
                com.avito.android.lib.util.g.a(dVar);
                G0 g02 = G0.f406611a;
            } else if (interfaceC13447c2 instanceof InterfaceC13447c.b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = dealRoomDevelopmentFragment.f137831t0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, ((InterfaceC13447c.b) interfaceC13447c2).f3546a, null, null, 6);
                G0 g03 = G0.f406611a;
            } else {
                if (!(interfaceC13447c2 instanceof InterfaceC13447c.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ActivityC22955m activityC22955mL1 = dealRoomDevelopmentFragment.l1();
                if (activityC22955mL1 != null) {
                    activityC22955mL1.onBackPressed();
                    G0 g04 = G0.f406611a;
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Dw.d, G0> {
        @Override // Y41.l
        public final G0 invoke(Dw.d dVar) {
            DealRoomDevelopmentFragment dealRoomDevelopmentFragment = (DealRoomDevelopmentFragment) this.receiver;
            a aVar = DealRoomDevelopmentFragment.f137823w0;
            dealRoomDevelopmentFragment.getClass();
            Dw.e eVar = dVar.f3551c;
            boolean z12 = eVar instanceof e.b;
            InterfaceC42726C interfaceC42726C = dealRoomDevelopmentFragment.f137833v0;
            if (z12) {
                ((com.avito.android.developments_agency_search.screen.deal_room_development.g) interfaceC42726C.getValue()).a();
            } else if (eVar instanceof e.a) {
                ((com.avito.android.developments_agency_search.screen.deal_room_development.g) interfaceC42726C.getValue()).b((e.a) eVar);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentFragment$onViewCreated$1", f = "DealRoomDevelopmentFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f137835q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = DealRoomDevelopmentFragment.this.new e(continuation);
            eVar.f137835q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
            return ((e) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C43501a c43501a = (C43501a) this.f137835q;
            a aVar = DealRoomDevelopmentFragment.f137823w0;
            DealRoomDevelopmentFragment.this.q5().accept(new InterfaceC13445a.c(c43501a.f413261b));
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<String, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = DealRoomDevelopmentFragment.f137823w0;
            DealRoomDevelopmentFragment.this.q5().accept(InterfaceC13445a.d.f3525a);
            return G0.f406611a;
        }
    }

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDw/a;", "action", "Lkotlin/G0;", "invoke", "(LDw/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<InterfaceC13445a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13445a interfaceC13445a) {
            a aVar = DealRoomDevelopmentFragment.f137823w0;
            DealRoomDevelopmentFragment.this.q5().accept(interfaceC13445a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f137839l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f137839l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f137839l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<Fragment> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DealRoomDevelopmentFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f137841l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(i iVar) {
            super(0);
            this.f137841l = iVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f137841l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f137842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f137842l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f137842l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f137843l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f137843l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f137843l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DealRoomDevelopmentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_agency_search/screen/deal_room_development/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<com.avito.android.developments_agency_search.screen.deal_room_development.i> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.developments_agency_search.screen.deal_room_development.i invoke() {
            com.avito.android.developments_agency_search.screen.deal_room_development.j jVar = DealRoomDevelopmentFragment.this.f137825n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.developments_agency_search.screen.deal_room_development.i) jVar.get();
        }
    }

    public DealRoomDevelopmentFragment() {
        super(0, 1, null);
        h hVar = new h(new m());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new j(new i()));
        this.f137826o0 = new O0(m0.f406844a.b(com.avito.android.developments_agency_search.screen.deal_room_development.i.class), new k(interfaceC42726CB), hVar, new l(interfaceC42726CB));
        this.f137832u0 = new C35968w3(this);
        this.f137833v0 = C42727D.c(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f137827p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f137827p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(1, this, DealRoomDevelopmentFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_agency_search/screen/deal_room_development/mvi/entity/DealRoomDevelopmentOneTimeEvent;)Lkotlin/Unit;", 8), new d(1, this, DealRoomDevelopmentFragment.class, "render", "render(Lcom/avito/android/developments_agency_search/screen/deal_room_development/mvi/entity/DealRoomDevelopmentState;)V", 0));
        return layoutInflater.inflate(R.layout.fragment_deal_room_development, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f137831t0;
        if (aVar == null) {
            aVar = null;
        }
        C43175k.K(new C43197r1(new e(null), y.a(aVar.V9())), C22984Q.a(getViewLifecycleOwner()));
        com.avito.android.developments_agency_search.adapter.error_layout.d dVar = this.f137830s0;
        if (dVar == null) {
            dVar = null;
        }
        dVar.e4(new f());
        ScreenPerformanceTracker screenPerformanceTracker = this.f137827p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(DealRoomDevelopmentScreen.f137845d, s.c(this), null, 4, null);
        com.avito.android.developments_agency_search.screen.deal_room_development.di.a.a().a((DealRoomDevelopmentArguments) this.f137832u0.getValue(this, f137824x0[0]), c28478k, new g(), (com.avito.android.developments_agency_search.screen.deal_room_development.di.c) C29972i.a(C29972i.b(this), com.avito.android.developments_agency_search.screen.deal_room_development.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f137827p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.developments_agency_search.screen.deal_room_development.i q5() {
        return (com.avito.android.developments_agency_search.screen.deal_room_development.i) this.f137826o0.getValue();
    }
}
