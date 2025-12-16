package com.avito.android.user_adverts_filters.main;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.user_adverts_filters.UserAdvertsFiltersData;
import com.avito.android.user_adverts_filters.main.di.b;
import com.avito.android.user_adverts_filters.main.view.a;
import com.avito.android.user_adverts_filters.main.view.d;
import com.avito.android.user_adverts_filters.main.vm.h;
import gj.m;
import gj.n;
import gj.o;
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
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import z1.AbstractC50339a;

/* compiled from: UserAdvertsFiltersMainMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/UserAdvertsFiltersMainMviFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "<init>", "()V", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsFiltersMainMviFragment extends BaseFragment implements InterfaceC28477j.b, gj.i {

    /* renamed from: A0, reason: collision with root package name */
    @k
    public final Object f315964A0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h.e f315965n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public d.b f315966o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public a.InterfaceC9823a f315967p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f315968q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public n f315969r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC25659b f315970s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f315971t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f315972u0;

    /* renamed from: v0, reason: collision with root package name */
    public com.avito.android.user_adverts_filters.main.view.a f315973v0;

    /* renamed from: w0, reason: collision with root package name */
    public gj.k f315974w0;

    /* renamed from: x0, reason: collision with root package name */
    public ViewGroup f315975x0;

    /* renamed from: y0, reason: collision with root package name */
    @l
    public com.avito.android.user_adverts_filters.main.view.d f315976y0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public final Object f315977z0;

    /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return UserAdvertsFiltersMainMviFragment.this.getResources().getString(R.string.user_adverts_filters_default_error);
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            UserAdvertsFiltersMainMviFragment.this.r5().accept(h.b.c.f316420a);
            return G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.UserAdvertsFiltersMainMviFragment$onViewCreated$2", f = "UserAdvertsFiltersMainMviFragment.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f315980q;

        /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.UserAdvertsFiltersMainMviFragment$onViewCreated$2$1", f = "UserAdvertsFiltersMainMviFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315982q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsFiltersMainMviFragment f315983r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f315983r = userAdvertsFiltersMainMviFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(this.f315983r, continuation);
                aVar.f315982q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f315982q;
                UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = this.f315983r;
                C43259k.d(t12, null, null, new com.avito.android.user_adverts_filters.main.b(userAdvertsFiltersMainMviFragment, null), 3);
                C43259k.d(t12, null, null, new com.avito.android.user_adverts_filters.main.a(userAdvertsFiltersMainMviFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return UserAdvertsFiltersMainMviFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f315980q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = UserAdvertsFiltersMainMviFragment.this;
                a aVar = new a(userAdvertsFiltersMainMviFragment, null);
                this.f315980q = 1;
                if (C23056p0.b(userAdvertsFiltersMainMviFragment, state, aVar, this) == coroutine_suspended) {
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
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f315984l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f315984l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f315984l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return UserAdvertsFiltersMainMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f315986l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f315986l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f315986l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f315987l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f315987l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f315987l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f315988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f315988l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f315988l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i extends H implements Y41.a<Y41.l<? super com.avito.android.user_adverts_filters.main.view.g, ? extends G0>> {
        @Override // Y41.a
        @k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Y41.l<com.avito.android.user_adverts_filters.main.view.g, G0> invoke() {
            UserAdvertsFiltersMainMviFragment userAdvertsFiltersMainMviFragment = (UserAdvertsFiltersMainMviFragment) this.receiver;
            userAdvertsFiltersMainMviFragment.getClass();
            return new com.avito.android.user_adverts_filters.main.c(userAdvertsFiltersMainMviFragment);
        }
    }

    /* compiled from: UserAdvertsFiltersMainMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/vm/h;", "invoke", "()Lcom/avito/android/user_adverts_filters/main/vm/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.user_adverts_filters.main.vm.h> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.user_adverts_filters.main.vm.h invoke() {
            h.e eVar = UserAdvertsFiltersMainMviFragment.this.f315965n0;
            if (eVar == null) {
                eVar = null;
            }
            return eVar.create();
        }
    }

    public UserAdvertsFiltersMainMviFragment() {
        super(R.layout.user_adverts_filters_main_fragment_layout);
        d dVar = new d(new j());
        e eVar = new e();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new f(eVar));
        this.f315972u0 = new O0(m0.f406844a.b(com.avito.android.user_adverts_filters.main.vm.h.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f315977z0 = C42727D.b(lazyThreadSafetyMode, new i(0, this, UserAdvertsFiltersMainMviFragment.class, "createViewActionListener", "createViewActionListener()Lkotlin/jvm/functions/Function1;", 0));
        this.f315964A0 = C42727D.b(lazyThreadSafetyMode, new a());
    }

    @Override // gj.i
    @l
    public final RecyclerView B0(@k String str) {
        com.avito.android.user_adverts_filters.main.view.d dVar = this.f315976y0;
        if (dVar == null) {
            return null;
        }
        com.avito.android.user_adverts_filters.main.view.h hVar = dVar.f316350n;
        if (str.equals(hVar != null ? hVar.f316360b : null)) {
            return dVar.f316345i;
        }
        com.avito.android.user_adverts_filters.main.view.h hVar2 = dVar.f316350n;
        if (str.equals(hVar2 != null ? hVar2.f316361c : null)) {
            return dVar.f316346j;
        }
        com.avito.android.user_adverts_filters.main.view.h hVar3 = dVar.f316350n;
        if (str.equals(hVar3 != null ? hVar3.f316362d : null)) {
            return dVar.f316347k;
        }
        return null;
    }

    @Override // gj.i
    @l
    public final View b3(@k String str) {
        return B0(str);
    }

    @Override // gj.i
    @k
    public final o c1() {
        return new o(new o.a(requireView(), ToastBarPosition.f181047e), new o.a(requireView(), ToastBarPosition.f181046d));
    }

    @Override // gj.i
    @k
    public final String m0() {
        return "main";
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f315971t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f315976y0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        n nVar = this.f315969r0;
        if (nVar == null) {
            nVar = null;
        }
        gj.k kVarA = m.a(nVar, this);
        this.f315974w0 = kVarA;
        ((com.avito.android.beduin.view.c) kVarA).l(r5().f316411U);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.user_adverts_filters_main_container);
        this.f315975x0 = viewGroup;
        a.InterfaceC9823a interfaceC9823a = this.f315967p0;
        if (interfaceC9823a == null) {
            interfaceC9823a = null;
        }
        this.f315973v0 = interfaceC9823a.a(viewGroup, new b());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new c(null), 3);
        ScreenPerformanceTracker screenPerformanceTracker = this.f315971t0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.user_adverts_filters.main.di.a.a();
        UserAdvertsFiltersData.a aVar = UserAdvertsFiltersData.f315950e;
        Bundle bundleRequireArguments = requireArguments();
        aVar.getClass();
        UserAdvertsFiltersData userAdvertsFiltersData = (UserAdvertsFiltersData) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arg_user_adverts_filters_host_data", UserAdvertsFiltersData.class) : bundleRequireArguments.getParcelable("arg_user_adverts_filters_host_data"));
        aVarA.a(this, userAdvertsFiltersData == null ? new UserAdvertsFiltersData(null, null, null, 7, null) : userAdvertsFiltersData, s.c(this), (com.avito.android.user_adverts_filters.main.di.c) C29972i.a(C29972i.b(this), com.avito.android.user_adverts_filters.main.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f315971t0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f315971t0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }

    public final void q5() {
        Fragment parentFragment = getParentFragment();
        G0 g02 = null;
        DialogFragment dialogFragment = parentFragment instanceof DialogFragment ? (DialogFragment) parentFragment : null;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            requireActivity().finish();
        }
    }

    public final com.avito.android.user_adverts_filters.main.vm.h r5() {
        return (com.avito.android.user_adverts_filters.main.vm.h) this.f315972u0.getValue();
    }

    @Override // gj.i
    public final void t0() {
        q5();
    }
}
