package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import android.content.Intent;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import qD0.C47283a;

/* compiled from: ConstructorConfigureSizeViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/viewmodel/E;", "Lcom/avito/android/tariff_lf_constructor/configure/size/viewmodel/i;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class E extends M0 implements i {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f300349E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f300350J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35224a f300351K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35228e f300352L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_lf_constructor.configure.a f300353M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f300354N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f300355O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public AtomicReference f300356P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f300357Q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f300358R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.tariff_lf_constructor.configure.size.ui.b> f300359S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f300360T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.tariff_lf_constructor.configure.size.ui.h> f300361U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f300362V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Integer> f300363W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f300364X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Boolean> f300365Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Intent> f300366Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f300367a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.tariff_lf_constructor.configure.size.ui.b> f300368b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f300369c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.tariff_lf_constructor.configure.size.ui.h> f300370d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final C23038g0<C47283a> f300371e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Integer> f300372f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.l
    public List<? extends com.avito.conveyor_item.a> f300373g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public String f300374h0;

    public E(@Y61.k String str, @Y61.k String str2, @Y61.k InterfaceC35224a interfaceC35224a, @Y61.k InterfaceC35228e interfaceC35228e, @Y61.k com.avito.android.tariff_lf_constructor.configure.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f300349E = str;
        this.f300350J = str2;
        this.f300351K = interfaceC35224a;
        this.f300352L = interfaceC35228e;
        this.f300353M = aVar;
        this.f300354N = interfaceC35745a5;
        this.f300355O = screenPerformanceTracker;
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f300358R = c23038g0;
        com.avito.android.util.architecture_components.D<Boolean> d12 = new com.avito.android.util.architecture_components.D<>();
        C23038g0<com.avito.android.tariff_lf_constructor.configure.size.ui.b> c23038g02 = new C23038g0<>();
        this.f300359S = c23038g02;
        C23038g0<List<com.avito.conveyor_item.a>> c23038g03 = new C23038g0<>();
        this.f300360T = c23038g03;
        C23038g0<com.avito.android.tariff_lf_constructor.configure.size.ui.h> c23038g04 = new C23038g0<>();
        this.f300361U = c23038g04;
        com.avito.android.util.architecture_components.D<String> d13 = new com.avito.android.util.architecture_components.D<>();
        this.f300362V = d13;
        com.avito.android.util.architecture_components.D<Intent> d14 = new com.avito.android.util.architecture_components.D<>();
        C23038g0<C47283a> c23038g05 = new C23038g0<>();
        com.avito.android.util.architecture_components.D<Integer> d15 = new com.avito.android.util.architecture_components.D<>();
        this.f300363W = d15;
        this.f300364X = c23038g0;
        this.f300365Y = d12;
        this.f300366Z = d14;
        this.f300367a0 = d13;
        this.f300368b0 = c23038g02;
        this.f300369c0 = c23038g03;
        this.f300370d0 = c23038g04;
        this.f300371e0 = c23038g05;
        this.f300372f0 = d15;
        me();
    }

    public static final void ke(E e12, com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar) {
        ScreenPerformanceTracker screenPerformanceTracker = e12.f300355O;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        e12.f300361U.setValue(hVar);
        ScreenPerformanceTracker.a.c(e12.f300355O, null, null, null, 7);
    }

    public static final void le(E e12, String str, boolean z12) {
        List<? extends com.avito.conveyor_item.a> list = e12.f300373g0;
        e12.f300373g0 = list != null ? C43033p.D(new o0(new C42770s0(list), new z(str, z12))) : null;
        ScreenPerformanceTracker screenPerformanceTracker = e12.f300355O;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        e12.f300360T.postValue(e12.f300373g0);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: F6, reason: from getter */
    public final C23038g0 getF300370d0() {
        return this.f300370d0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: G2, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF300372f0() {
        return this.f300372f0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: L, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF300367a0() {
        return this.f300367a0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: M, reason: from getter */
    public final C23038g0 getF300369c0() {
        return this.f300369c0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: N, reason: from getter */
    public final C23038g0 getF300371e0() {
        return this.f300371e0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: R, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF300365Y() {
        return this.f300365Y;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: S5, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF300366Z() {
        return this.f300366Z;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f300357Q;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.d) {
                cVar.b(com.avito.android.mnz_common.extensions.h.b(((com.avito.android.tariff_lf_constructor.configure.size.items.size.d) dVar).getF300321c()).j0(this.f300354N.e()).v0(new x(this), y.f300412b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF300364X() {
        return this.f300364X;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    public final void h0() {
        me();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void me() {
        ScreenPerformanceTracker.a.b(this.f300355O, null, 3);
        this.f300356P.dispose();
        this.f300356P = (AtomicReference) this.f300352L.d(this.f300349E, this.f300350J).r0(P2.c.f318721a).K(new l(this)).N(m.f300397b).d0(n.f300398b).d0(new o(this)).j0(this.f300354N.e()).v0(new p(this), new q(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f300357Q.dispose();
        this.f300356P.dispose();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    public final void r0() {
        this.f300356P.dispose();
        this.f300356P = (AtomicReference) this.f300353M.a(this.f300349E, this.f300350J, (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : this.f300374h0).j0(this.f300354N.e()).v0(new C(this), new D(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.size.viewmodel.i
    /* renamed from: u0, reason: from getter */
    public final C23038g0 getF300368b0() {
        return this.f300368b0;
    }
}
