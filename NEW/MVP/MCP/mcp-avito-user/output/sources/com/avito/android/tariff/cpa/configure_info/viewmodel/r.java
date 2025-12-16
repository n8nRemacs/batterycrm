package com.avito.android.tariff.cpa.configure_info.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CpaConfigureInfoViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/viewmodel/r;", "Lcom/avito/android/tariff/cpa/configure_info/viewmodel/k;", "Landroidx/lifecycle/M0;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r extends M0 implements k {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f294550E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final g f294551J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff.cpa.configure_info.viewmodel.a f294552K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f294553L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f294554M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public AtomicReference f294555N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public AtomicReference f294556O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f294557P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f294558Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f294559R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f294560S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public ButtonAction f294561T;

    /* compiled from: CpaConfigureInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r.this.f294558Q.setValue((DeepLink) obj);
        }
    }

    /* compiled from: CpaConfigureInfoViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f294563b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public r(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.tariff.cpa.configure_info.viewmodel.a aVar, @Y61.k g gVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k String str) {
        this.f294550E = str;
        this.f294551J = gVar;
        this.f294552K = aVar;
        this.f294553L = interfaceC35745a5;
        this.f294554M = screenPerformanceTracker;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f294555N = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f294556O = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f294557P = new C23038g0<>();
        this.f294558Q = new D<>();
        this.f294559R = new C23038g0<>();
        this.f294560S = new C23038g0<>();
        ke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.k
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        this.f294556O.dispose();
        this.f294556O = (AtomicReference) com.avito.android.mnz_common.extensions.h.a(set).j0(this.f294553L.e()).v0(new a(), b.f294563b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.k
    public final void e6() {
        DeepLink deeplink;
        ButtonAction buttonAction = this.f294561T;
        if (buttonAction == null || (deeplink = buttonAction.getDeeplink()) == null) {
            return;
        }
        this.f294558Q.setValue(deeplink);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.k
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF294557P() {
        return this.f294557P;
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.k
    public final void h0() {
        ke();
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.k
    @Y61.k
    public final D<DeepLink> k0() {
        return this.f294558Q;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f294554M, null, 3);
        this.f294555N.dispose();
        this.f294555N = (AtomicReference) this.f294551J.d(this.f294550E).r0(P2.c.f318721a).K(new l(this)).N(m.f294545b).d0(n.f294546b).d0(new o(this)).j0(this.f294553L.e()).v0(new p(this), new q(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.k
    /* renamed from: n1, reason: from getter */
    public final C23038g0 getF294559R() {
        return this.f294559R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f294556O.dispose();
        this.f294555N.dispose();
    }

    @Override // com.avito.android.tariff.cpa.configure_info.viewmodel.k
    public final AbstractC22991Y t0() {
        return this.f294560S;
    }
}
