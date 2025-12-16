package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import Ju.InterfaceC14249c;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.tariff_lf_constructor.configure.deeplink.ConstructorTariffBottomSheetLink;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kv.C43501a;
import l41.InterfaceC43543a;

/* compiled from: ConstructorSettingViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/viewmodel/m;", "Lcom/avito/android/tariff_lf_constructor/configure/setting/viewmodel/j;", "Landroidx/lifecycle/M0;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m extends M0 implements j {

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public String f300198E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35215a f300199J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35219e f300200K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f300201L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f300202M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public AtomicReference f300203N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f300204O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final AtomicReference f300205P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f300206Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f300207R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Q<List<com.avito.conveyor_item.a>, C23424o.e>> f300208S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f300209T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f300210U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f300211V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f300212W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f300213X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f300214Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Q<List<com.avito.conveyor_item.a>, C23424o.e>> f300215Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<String> f300216a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<Boolean> f300217b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f300218c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f300219d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f300220e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public Object f300221f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f300222g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public DeepLink f300223h0;

    /* compiled from: ConstructorSettingViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
            boolean z12 = interfaceC14249c instanceof PaymentSessionLink.b.C4013b;
            G0 g02 = null;
            m mVar = m.this;
            if (z12) {
                DeepLink deepLink = mVar.f300223h0;
                if (deepLink != null) {
                    mVar.f300211V.setValue(deepLink);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    mVar.f300212W.setValue(G0.f406611a);
                    return;
                }
                return;
            }
            if (!(interfaceC14249c instanceof ConstructorTariffBottomSheetLink.a.b)) {
                V2.f318762a.e("Unknown result " + interfaceC14249c, null);
                return;
            }
            String str = ((ConstructorTariffBottomSheetLink.a.b) interfaceC14249c).f299611b;
            if (str == null) {
                mVar.getClass();
            } else {
                mVar.f300198E = str;
                mVar.me();
            }
        }
    }

    public m(@Y61.l String str, @Y61.k InterfaceC35215a interfaceC35215a, @Y61.k InterfaceC35219e interfaceC35219e, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f300198E = str;
        this.f300199J = interfaceC35215a;
        this.f300200K = interfaceC35219e;
        this.f300201L = interfaceC35745a5;
        this.f300202M = screenPerformanceTracker;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f300203N = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f300204O = new io.reactivex.rxjava3.disposables.c();
        this.f300205P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f300206Q = c23038g0;
        C23038g0<String> c23038g02 = new C23038g0<>();
        this.f300207R = c23038g02;
        C23038g0<Q<List<com.avito.conveyor_item.a>, C23424o.e>> c23038g03 = new C23038g0<>();
        this.f300208S = c23038g03;
        com.avito.android.util.architecture_components.D<DeepLink> d12 = new com.avito.android.util.architecture_components.D<>();
        this.f300209T = d12;
        com.avito.android.util.architecture_components.D<Boolean> d13 = new com.avito.android.util.architecture_components.D<>();
        com.avito.android.util.architecture_components.D<String> d14 = new com.avito.android.util.architecture_components.D<>();
        this.f300210U = d14;
        com.avito.android.util.architecture_components.D<DeepLink> d15 = new com.avito.android.util.architecture_components.D<>();
        this.f300211V = d15;
        com.avito.android.util.architecture_components.D<G0> d16 = new com.avito.android.util.architecture_components.D<>();
        this.f300212W = d16;
        this.f300213X = c23038g0;
        this.f300214Y = c23038g02;
        this.f300215Z = c23038g03;
        this.f300216a0 = d14;
        this.f300217b0 = d13;
        this.f300218c0 = d12;
        this.f300219d0 = d15;
        this.f300220e0 = d16;
        this.f300221f0 = C42784z0.f406748b;
        me();
        this.f300205P = (AtomicReference) aVar.d9().t0(new a());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
    public static final void ke(m mVar, String str, P2 p22) {
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (com.avito.conveyor_item.a aVar : (Iterable) mVar.f300221f0) {
            if (aVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) {
                com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a aVar2 = (com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a) aVar;
                String str2 = aVar2.f300101b;
                boolean z12 = aVar2.f300109j;
                ConfigureAttributeModel configureAttributeModel = aVar2.f300107h;
                ConfigureAttributeModel configureAttributeModel2 = aVar2.f300108i;
                String str3 = aVar2.f300102c;
                com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a aVar3 = new com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.a(str2, str3, aVar2.f300103d, aVar2.f300104e, aVar2.f300105f, aVar2.f300106g, configureAttributeModel, configureAttributeModel2, z12);
                if (str3.equals(str)) {
                    aVar3.f300109j = L.f(p22, P2.c.f318721a);
                }
                aVar = aVar3;
            }
            arrayList.add(aVar);
        }
        Q<List<com.avito.conveyor_item.a>, C23424o.e> q12 = new Q<>(arrayList, C23424o.a(new BD0.a(arrayList, mVar.f300221f0), true));
        mVar.f300221f0 = arrayList;
        mVar.f300208S.postValue(q12);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public static final void le(m mVar, BD0.d dVar) {
        mVar.f300207R.setValue(dVar.f1256a);
        String str = dVar.f1258c;
        if (str == null) {
            str = mVar.f300198E;
        }
        mVar.f300198E = str;
        ?? r12 = mVar.f300221f0;
        ArrayList arrayList = dVar.f1257b;
        Q<List<com.avito.conveyor_item.a>, C23424o.e> q12 = new Q<>(arrayList, C23424o.a(new BD0.a(arrayList, r12), true));
        mVar.f300221f0 = arrayList;
        ScreenPerformanceTracker screenPerformanceTracker = mVar.f300202M;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        mVar.f300208S.setValue(q12);
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> Jc() {
        return this.f300220e0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    /* renamed from: K8, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF300217b0() {
        return this.f300217b0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    /* renamed from: L, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF300216a0() {
        return this.f300216a0;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f300204O;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.placing.d) {
                cVar.b(ne((K) dVar));
            } else {
                boolean z12 = dVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.f;
                InterfaceC35745a5 interfaceC35745a5 = this.f300201L;
                if (z12) {
                    com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.f fVar = (com.avito.android.tariff_lf_constructor.configure.setting.items.total_info.f) dVar;
                    I0 i0J0 = fVar.getF300164e().C0(2000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                    E e12 = new E(this);
                    l41.g<? super Throwable> gVar = F.f300175b;
                    InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
                    cVar.b(i0J0.v0(e12, gVar, interfaceC43543a));
                    cVar.b(com.avito.android.mnz_common.extensions.h.b(fVar.getF300163d()).j0(interfaceC35745a5.e()).v0(new u(this), v.f300233b, interfaceC43543a));
                    cVar.b(ne((K) dVar));
                } else if (dVar instanceof com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.d) {
                    cVar.b(com.avito.android.mnz_common.extensions.h.b(((com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package.d) dVar).getF300117c()).j0(interfaceC35745a5.e()).v0(new w(this), x.f300235b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                }
            }
        }
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF300213X() {
        return this.f300213X;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    public final void h0() {
        me();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> k0() {
        return this.f300218c0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void me() {
        ScreenPerformanceTracker.a.b(this.f300202M, null, 3);
        this.f300203N.dispose();
        this.f300203N = (AtomicReference) this.f300200K.d(this.f300198E).r0(P2.c.f318721a).K(new n(this)).N(o.f300226b).d0(p.f300227b).K(new q(this)).d0(new r(this)).j0(this.f300201L.e()).v0(new s(this), new t(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    /* renamed from: n1, reason: from getter */
    public final C23038g0 getF300215Z() {
        return this.f300215Z;
    }

    public final io.reactivex.rxjava3.internal.observers.y ne(K k12) {
        return (io.reactivex.rxjava3.internal.observers.y) com.avito.android.mnz_common.extensions.h.b(k12.k()).j0(this.f300201L.e()).v0(new G(this), H.f300177b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f300204O.e();
        this.f300203N.dispose();
        this.f300205P.dispose();
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    /* renamed from: qc, reason: from getter */
    public final C23038g0 getF300214Y() {
        return this.f300214Y;
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.setting.viewmodel.j
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> y8() {
        return this.f300219d0;
    }
}
