package com.avito.android.select.new_metro;

import Cd.C13243a;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.SelectMetroScreen;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.new_metro.di.h;
import com.avito.android.select.new_metro.mvi.t;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.K2;
import com.avito.android.util.architecture_components.D;
import iq0.InterfaceC42091a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: SelectMetroFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/select/new_metro/SelectMetroFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/select/new_metro/r;", "Lcom/avito/android/select/new_metro/q;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectMetroFragment extends TabBaseFragment implements r, q, InterfaceC28477j.b {

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public static final a f265914C0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final D<Boolean> f265915A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public D<G0> f265916B0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public t.c f265917t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f265918u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f265919v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f265920w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public String f265921x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f265922y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final D<List<ParcelableEntity<String>>> f265923z0;

    /* compiled from: SelectMetroFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/new_metro/SelectMetroFragment$a;", "", "<init>", "()V", "", "SELECT_METRO_PARAMS", "Ljava/lang/String;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static SelectMetroFragment a(@Y61.k SelectMetroParams selectMetroParams) {
            SelectMetroFragment selectMetroFragment = new SelectMetroFragment();
            selectMetroFragment.setTargetFragment(null, 0);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("SelectMetroArguments", selectMetroParams);
            selectMetroFragment.setArguments(bundle);
            return selectMetroFragment;
        }

        public a() {
        }
    }

    /* compiled from: SelectMetroFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = SelectMetroFragment.this.f265919v0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: SelectMetroFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<G0, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            ((t) SelectMetroFragment.this.f265918u0.getValue()).accept(InterfaceC42091a.b.f405256a);
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f265927m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12) {
            super(2);
            this.f265927m = z12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                SelectMetroFragment selectMetroFragment = SelectMetroFragment.this;
                com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) selectMetroFragment.f265920w0.getValue(), androidx.compose.runtime.internal.r.c(-147406157, new com.avito.android.select.new_metro.h(selectMetroFragment, this.f265927m), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select.new_metro.SelectMetroFragment$onViewCreated$1", f = "SelectMetroFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f265928q;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = SelectMetroFragment.this.new e(continuation);
            eVar.f265928q = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
            return ((e) create(bool, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            ((t) SelectMetroFragment.this.f265918u0.getValue()).accept(new InterfaceC42091a.e(((Boolean) this.f265928q).booleanValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: SelectMetroFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f265930b;

        public f(Y41.l lVar) {
            this.f265930b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return L.f(this.f265930b, ((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f265930b;
        }

        public final int hashCode() {
            return this.f265930b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f265930b.invoke(obj);
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f265931l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f265931l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f265931l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectMetroFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f265933l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f265933l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f265933l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265934l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265934l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f265934l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f265935l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f265935l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f265935l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectMetroFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/mvi/t;", "invoke", "()Lcom/avito/android/select/new_metro/mvi/t;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<t> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final t invoke() {
            t.c cVar = SelectMetroFragment.this.f265917t0;
            if (cVar == null) {
                cVar = null;
            }
            return cVar.create();
        }
    }

    public SelectMetroFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f265918u0 = new O0(m0.f406844a.b(t.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f265920w0 = C42727D.c(new b());
        this.f265921x0 = "";
        this.f265922y0 = new NavigationState(false, null, 2, null);
        this.f265923z0 = new D<>();
        this.f265915A0 = new D<>();
        this.f265916B0 = new D<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    @Override // androidx.fragment.app.Fragment
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(@Y61.k android.view.LayoutInflater r9, @Y61.l android.view.ViewGroup r10, @Y61.l android.os.Bundle r11) {
        /*
            r8 = this;
            com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker r9 = r8.f265919v0
            if (r9 == 0) goto L5
            goto L6
        L5:
            r9 = 0
        L6:
            r9.e()
            android.os.Bundle r9 = r8.getArguments()
            if (r9 == 0) goto L29
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 34
            if (r10 < r11) goto L1c
            java.lang.Object r9 = com.avito.android.search.filter.C34587o.z(r9)
            android.os.Parcelable r9 = (android.os.Parcelable) r9
            goto L22
        L1c:
            java.lang.String r10 = "SelectMetroArguments"
            android.os.Parcelable r9 = r9.getParcelable(r10)
        L22:
            com.avito.android.select.new_metro.SelectMetroParams r9 = (com.avito.android.select.new_metro.SelectMetroParams) r9
            if (r9 == 0) goto L29
            boolean r9 = r9.f265947i
            goto L2a
        L29:
            r9 = 0
        L2a:
            if (r9 == 0) goto L3f
            com.avito.android.util.architecture_components.D<kotlin.G0> r10 = r8.f265916B0
            androidx.lifecycle.P r11 = r8.getViewLifecycleOwner()
            com.avito.android.select.new_metro.SelectMetroFragment$c r0 = new com.avito.android.select.new_metro.SelectMetroFragment$c
            r0.<init>()
            com.avito.android.select.new_metro.SelectMetroFragment$f r1 = new com.avito.android.select.new_metro.SelectMetroFragment$f
            r1.<init>(r0)
            r10.observe(r11, r1)
        L3f:
            androidx.compose.ui.platform.ComposeView r10 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r3 = r8.requireContext()
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            androidx.compose.ui.platform.u2$e r11 = androidx.compose.ui.platform.InterfaceC22532u2.e.f41618b
            r10.setViewCompositionStrategy(r11)
            com.avito.android.select.new_metro.SelectMetroFragment$d r11 = new com.avito.android.select.new_metro.SelectMetroFragment$d
            r11.<init>(r9)
            androidx.compose.runtime.internal.n r9 = new androidx.compose.runtime.internal.n
            r0 = -95435437(0xfffffffffa4fc553, float:-2.6970192E35)
            r1 = 1
            r9.<init>(r0, r11, r1)
            r10.setContent(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select.new_metro.SelectMetroFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        C43175k.K(new C43197r1(new e(null), y.a(K2.h(requireActivity()))), C22984Q.a(getViewLifecycleOwner()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f265919v0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        SelectMetroParams selectMetroParams;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            selectMetroParams = (SelectMetroParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("SelectMetroArguments", SelectMetroParams.class) : arguments.getParcelable("SelectMetroArguments"));
        } else {
            selectMetroParams = null;
        }
        if (selectMetroParams == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        List<ParcelableEntity<String>> list = selectMetroParams.f265946h;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Integer numY0 = C43066x.y0((String) ((ParcelableEntity) it.next()).getId());
            if (numY0 != null) {
                arrayList.add(numY0);
            }
        }
        h.a aVarA = com.avito.android.select.new_metro.di.b.a();
        aVarA.a(this);
        aVarA.e(selectMetroParams);
        aVarA.b(arrayList);
        aVarA.c(new C28478k(SelectMetroScreen.f90479d, s.c(this), "metroStations"));
        aVarA.d((com.avito.android.select.new_metro.di.g) C29972i.a(C29972i.b(this), com.avito.android.select.new_metro.di.g.class));
        aVarA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f265919v0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
        if (bundle == null) {
            arrayList.isEmpty();
        }
        this.f265921x0 = selectMetroParams.f265941c;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF188914F0() {
        return this.f265922y0;
    }
}
