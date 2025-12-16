package com.avito.android.advert_core.price_list.dialog;

import Cd.C13243a;
import Y41.l;
import Y41.p;
import Y61.k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.advert_core.price_list.dialog.perfomance.AdvertPriceListBottomSheetDialogScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35968w3;
import com.avito.konveyor.adapter.j;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.n2;
import nN.InterfaceC44295a;
import z1.AbstractC50339a;

/* compiled from: AdvertPriceListBottomSheetDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_core/price_list/dialog/AdvertPriceListBottomSheetDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertPriceListBottomSheetDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f84034p0 = {m0.f406844a.e(new Y(AdvertPriceListBottomSheetDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/advert_core/price_list/dialog/AdvertPriceListBottomSheetDialogOpenParams;", 0))};

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final C35968w3 f84035h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f84036i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public j f84037j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public InterfaceC44295a f84038k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_core.price_list.dialog.e f84039l0;

    /* renamed from: m0, reason: collision with root package name */
    @k
    public final O0 f84040m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f84041n0;

    /* renamed from: o0, reason: collision with root package name */
    public RecyclerView f84042o0;

    /* compiled from: AdvertPriceListBottomSheetDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<View, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View viewFindViewById = view.findViewById(R.id.advert_price_list_recycler);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            RecyclerView recyclerView = (RecyclerView) viewFindViewById;
            AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment = AdvertPriceListBottomSheetDialogFragment.this;
            advertPriceListBottomSheetDialogFragment.requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            j jVar = advertPriceListBottomSheetDialogFragment.f84037j0;
            if (jVar == null) {
                jVar = null;
            }
            recyclerView.setAdapter(jVar);
            recyclerView.l(new M9.a(), -1);
            advertPriceListBottomSheetDialogFragment.f84042o0 = recyclerView;
            return G0.f406611a;
        }
    }

    /* compiled from: AdvertPriceListBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogFragment$onCreateView$1", f = "AdvertPriceListBottomSheetDialogFragment.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f84044q;

        /* compiled from: AdvertPriceListBottomSheetDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogFragment$onCreateView$1$1", f = "AdvertPriceListBottomSheetDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f84046q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AdvertPriceListBottomSheetDialogFragment f84047r;

            /* compiled from: AdvertPriceListBottomSheetDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogFragment$onCreateView$1$1$1", f = "AdvertPriceListBottomSheetDialogFragment.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogFragment$b$a$a, reason: collision with other inner class name */
            public static final class C2491a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f84048q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ AdvertPriceListBottomSheetDialogFragment f84049r;

                /* compiled from: AdvertPriceListBottomSheetDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.advert_core.price_list.dialog.AdvertPriceListBottomSheetDialogFragment$b$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C2492a extends H implements l<N9.a, G0> {
                    @Override // Y41.l
                    public final G0 invoke(N9.a aVar) {
                        N9.a aVar2 = aVar;
                        AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment = (AdvertPriceListBottomSheetDialogFragment) this.receiver;
                        com.avito.konveyor.adapter.h hVar = advertPriceListBottomSheetDialogFragment.f84036i0;
                        if (hVar == null) {
                            hVar = null;
                        }
                        hVar.f338510e = new UV0.c(aVar2.f11241b);
                        RecyclerView recyclerView = advertPriceListBottomSheetDialogFragment.f84042o0;
                        RecyclerView.Adapter adapter = (recyclerView != null ? recyclerView : null).getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                        return G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2491a(AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment, Continuation<? super C2491a> continuation) {
                    super(2, continuation);
                    this.f84049r = advertPriceListBottomSheetDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                    return new C2491a(this.f84049r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C2491a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f84048q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment = this.f84049r;
                        n2<N9.a> state = ((com.avito.android.advert_core.price_list.dialog.d) advertPriceListBottomSheetDialogFragment.f84040m0.getValue()).getState();
                        ScreenPerformanceTracker screenPerformanceTracker = advertPriceListBottomSheetDialogFragment.f84041n0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        C2492a c2492a = new C2492a(1, advertPriceListBottomSheetDialogFragment, AdvertPriceListBottomSheetDialogFragment.class, "render", "render(Lcom/avito/android/advert_core/price_list/dialog/mvi/entity/AdvertPriceListBottomSheetDialogState;)V", 0);
                        this.f84048q = 1;
                        if (com.avito.android.analytics.screens.mvi.a.a(state, screenPerformanceTracker, c2492a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f84047r = advertPriceListBottomSheetDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f84047r, continuation);
                aVar.f84046q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                C43259k.d((T) this.f84046q, null, null, new C2491a(this.f84047r, null), 3);
                return G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return AdvertPriceListBottomSheetDialogFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f84044q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment = AdvertPriceListBottomSheetDialogFragment.this;
                a aVar = new a(advertPriceListBottomSheetDialogFragment, null);
                this.f84044q = 1;
                if (C23056p0.b(advertPriceListBottomSheetDialogFragment, state, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f84050l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f84050l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f84050l);
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
            return AdvertPriceListBottomSheetDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f84052l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f84052l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f84052l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f84053l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f84053l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f84053l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f84054l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f84054l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f84054l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AdvertPriceListBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/advert_core/price_list/dialog/d;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/advert_core/price_list/dialog/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.advert_core.price_list.dialog.d> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.advert_core.price_list.dialog.d invoke() {
            com.avito.android.advert_core.price_list.dialog.e eVar = AdvertPriceListBottomSheetDialogFragment.this.f84039l0;
            if (eVar == null) {
                eVar = null;
            }
            return (com.avito.android.advert_core.price_list.dialog.d) eVar.get();
        }
    }

    public AdvertPriceListBottomSheetDialogFragment() {
        super(0, 1, null);
        this.f84035h0 = new C35968w3(this);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f84040m0 = new O0(m0.f406844a.b(com.avito.android.advert_core.price_list.dialog.d.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.avito.android.advert_core.price_list.dialog.a] */
    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(AdvertPriceListBottomSheetDialogScreen.f84091d, s.b(this), null, 4, null);
        com.avito.android.advert_core.price_list.dialog.di.g.a().a((AdvertPriceListBottomSheetDialogOpenParams) this.f84035h0.getValue(this, f84034p0[0]), new com.avito.android.advert_core.price_list.dialog.f() { // from class: com.avito.android.advert_core.price_list.dialog.a
            @Override // com.avito.android.advert_core.price_list.dialog.f
            public final void a(String str, ImvServices imvServices) {
                AdvertPriceListBottomSheetDialogFragment advertPriceListBottomSheetDialogFragment = this.f84057a;
                InterfaceC44295a interfaceC44295a = advertPriceListBottomSheetDialogFragment.f84038k0;
                if (interfaceC44295a == null) {
                    interfaceC44295a = null;
                }
                interfaceC44295a.a(str, imvServices).show(advertPriceListBottomSheetDialogFragment.getParentFragmentManager(), "ImvServicesBottomSheetDialog");
            }
        }, c28478k, (com.avito.android.advert_core.price_list.dialog.di.b) C29972i.a(C29972i.b(this), com.avito.android.advert_core.price_list.dialog.di.b.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f84041n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f84041n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.C(R.layout.advert_price_list_bottom_sheet_layout, new a());
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, true, true, 3);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.K(true);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        C43259k.d(C22981N.a(getLifecycle()), null, null, new b(null), 3);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f84041n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
