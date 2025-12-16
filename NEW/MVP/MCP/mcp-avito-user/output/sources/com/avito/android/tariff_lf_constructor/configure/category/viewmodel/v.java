package com.avito.android.tariff_lf_constructor.configure.category.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qD0.C47283a;

/* compiled from: ConstructorConfigureCategoryViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/viewmodel/v;", "Lcom/avito/android/tariff_lf_constructor/configure/category/viewmodel/i;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class v extends M0 implements i {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f299440E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f299441J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final a f299442K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final e f299443L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f299444M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f299445N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f299446O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public AtomicReference f299447P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f299448Q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f299449R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final D<String> f299450S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f299451T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f299452U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f299453V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final D<String> f299454W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final D<Boolean> f299455X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C47283a> f299456Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f299457Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f299458a0;

    public v(@Y61.k String str, @Y61.k String str2, @Y61.k a aVar, @Y61.k e eVar, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f299440E = str;
        this.f299441J = str2;
        this.f299442K = aVar;
        this.f299443L = eVar;
        this.f299444M = aVar2;
        this.f299445N = interfaceC35745a5;
        this.f299446O = screenPerformanceTracker;
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f299449R = c23038g0;
        D<String> d12 = new D<>();
        this.f299450S = d12;
        C23038g0<List<com.avito.conveyor_item.a>> c23038g02 = new C23038g0<>();
        this.f299451T = c23038g02;
        D<DeepLink> d13 = new D<>();
        this.f299452U = d13;
        D<Boolean> d14 = new D<>();
        C23038g0<C47283a> c23038g03 = new C23038g0<>();
        this.f299453V = c23038g0;
        this.f299454W = d12;
        this.f299455X = d14;
        this.f299456Y = c23038g03;
        this.f299457Z = c23038g02;
        this.f299458a0 = d13;
        ke();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    /* renamed from: L, reason: from getter */
    public final D getF299454W() {
        return this.f299454W;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    /* renamed from: M, reason: from getter */
    public final C23038g0 getF299457Z() {
        return this.f299457Z;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    /* renamed from: N, reason: from getter */
    public final C23038g0 getF299456Y() {
        return this.f299456Y;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    /* renamed from: R, reason: from getter */
    public final D getF299455X() {
        return this.f299455X;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f299448Q;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.tariff_lf_constructor.configure.category.items.content.d) {
                cVar.b(com.avito.android.mnz_common.extensions.h.b(((com.avito.android.tariff_lf_constructor.configure.category.items.content.d) dVar).getF299404c()).j0(this.f299445N.e()).v0(new r(this), s.f299437b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF299453V() {
        return this.f299453V;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    public final void h0() {
        ke();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.viewmodel.i
    @Y61.k
    public final D<DeepLink> k0() {
        return this.f299458a0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f299446O, null, 3);
        this.f299447P.dispose();
        B0 b0D0 = this.f299443L.a(this.f299440E, this.f299441J).r0(P2.c.f318721a).K(new l(this)).N(m.f299431b).d0(n.f299432b).d0(new o(this));
        InterfaceC35745a5 interfaceC35745a5 = this.f299445N;
        this.f299447P = (AtomicReference) b0D0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new p(this), new q(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f299448Q.dispose();
        this.f299447P.dispose();
    }
}
