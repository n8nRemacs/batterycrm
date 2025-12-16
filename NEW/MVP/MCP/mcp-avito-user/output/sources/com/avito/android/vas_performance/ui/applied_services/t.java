package com.avito.android.vas_performance.ui.applied_services;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DialogDeepLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_performance.InterfaceC36049c;
import com.avito.android.vas_performance.ui.applied_services.j;
import com.avito.android.vas_performance.ui.items.applied_services.AppliedServiceItem;
import com.avito.android.vas_planning.deeplink.VasPlannerRemoveLink;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: AppliedServicesViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/applied_services/t;", "Lcom/avito/android/vas_performance/ui/applied_services/j;", "Landroidx/lifecycle/M0;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t extends M0 implements j {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321445E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36049c f321446J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321447K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f321448L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f321449M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<j.b> f321450N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D<String> f321451O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321452P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public AtomicReference f321453Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f321454R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f321455S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final D f321456T;

    /* compiled from: _Sequences.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"R", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "kotlin/sequences/L", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Object, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f321457l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof K);
        }
    }

    /* compiled from: AppliedServicesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t.this.f((DeepLink) obj);
        }
    }

    /* compiled from: AppliedServicesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f321459b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public t(@Y61.k String str, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC36049c interfaceC36049c, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f321445E = aVar;
        this.f321446J = interfaceC36049c;
        this.f321447K = interfaceC35745a5;
        this.f321448L = screenPerformanceTracker;
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f321449M = c23038g0;
        C23038g0<j.b> c23038g02 = new C23038g0<>();
        this.f321450N = c23038g02;
        D<String> d12 = new D<>();
        this.f321451O = d12;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f321452P = cVar;
        this.f321453Q = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);
        ScreenPerformanceTracker.a.b(screenPerformanceTracker, null, 3);
        cVar.b(aVar.c(str).K(new m(this)).N(n.f321439b).d0(o.f321440b).d0(new p(this)).d0(q.f321442b).v0(new r(this), new s(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
        this.f321454R = c23038g02;
        this.f321455S = c23038g0;
        this.f321456T = d12;
    }

    @Override // com.avito.android.vas_performance.ui.applied_services.j
    public final void R7(@Y61.k String str) {
        this.f321451O.postValue(str);
    }

    @Override // com.avito.android.vas_performance.ui.applied_services.j
    @Y61.k
    /* renamed from: da, reason: from getter */
    public final D getF321456T() {
        return this.f321456T;
    }

    @Override // com.avito.android.vas_performance.ui.applied_services.j
    public final void f(@Y61.k DeepLink deepLink) {
        this.f321450N.postValue(new j.b.a(deepLink, ((deepLink instanceof VasPlannerRemoveLink) || (deepLink instanceof DialogDeepLink)) ? false : true));
    }

    @Override // com.avito.android.vas_performance.ui.applied_services.j
    @Y61.k
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF321455S() {
        return this.f321455S;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.vas_performance.ui.applied_services.j
    public final void ia(@Y61.k String str) {
        C23038g0<P2<?>> c23038g0 = this.f321449M;
        P2<?> value = c23038g0.getValue();
        P2.b bVar = value instanceof P2.b ? (P2.b) value : null;
        j.a aVar = bVar != null ? (j.a) bVar.f318720a : null;
        if (aVar != null) {
            List<com.avito.conveyor_item.a> list = aVar.f321428a;
            ArrayList arrayList = new ArrayList();
            for (com.avito.conveyor_item.a aVar2 : list) {
                if ((aVar2 instanceof AppliedServiceItem) && L.f(((AppliedServiceItem) aVar2).f321553f, str)) {
                    aVar2 = null;
                }
                if (aVar2 != null) {
                    arrayList.add(aVar2);
                }
            }
            c23038g0.postValue(new P2.b(new j.a(arrayList, aVar.f321429b, aVar.f321430c)));
        }
    }

    @Override // com.avito.android.vas_performance.ui.applied_services.j
    @Y61.k
    public final AbstractC22991Y<j.b> k0() {
        return this.f321454R;
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f321452P.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.vas_performance.ui.applied_services.j
    public final void z(@Y61.k Set<TV0.d<?, ?>> set) {
        List listD = C43033p.D(new o0(C43033p.i(new C42770s0(set), a.f321457l), new h0() { // from class: com.avito.android.vas_performance.ui.applied_services.t.d
            @Override // kotlin.jvm.internal.h0, kotlin.reflect.p
            @Y61.l
            public final Object get(@Y61.l Object obj) {
                return ((K) obj).k();
            }
        }));
        this.f321453Q.dispose();
        z zVarH0 = z.h0(listD);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarH0.getClass();
        io.reactivex.rxjava3.disposables.d dVarV0 = zVarH0.C0(300L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).x0(this.f321447K.e()).v0(new b(), c.f321459b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        this.f321453Q = (AtomicReference) dVarV0;
        this.f321452P.b(dVarV0);
    }
}
