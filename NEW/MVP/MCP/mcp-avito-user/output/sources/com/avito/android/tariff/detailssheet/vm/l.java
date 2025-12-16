package com.avito.android.tariff.detailssheet.vm;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffDetailsSheetViewModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/detailssheet/vm/l;", "Landroidx/lifecycle/M0;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final DeepLink f297445E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f297446J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f297447K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final e f297448L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final a f297449M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public AtomicReference f297450N = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<d>> f297451O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D<G0> f297452P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f297453Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final D f297454R;

    @Inject
    public l(@Y61.k DeepLink deepLink, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k e eVar, @Y61.k a aVar) {
        this.f297445E = deepLink;
        this.f297446J = interfaceC35745a5;
        this.f297447K = fVar;
        this.f297448L = eVar;
        this.f297449M = aVar;
        C23038g0<P2<d>> c23038g0 = new C23038g0<>();
        this.f297451O = c23038g0;
        D<G0> d12 = new D<>();
        this.f297452P = d12;
        this.f297453Q = c23038g0;
        this.f297454R = d12;
        ke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        this.f297450N.dispose();
        W wA2 = this.f297448L.a(this.f297445E);
        Object objX = wA2 != null ? g1.a(wA2).j(new h(this)).r(new i(this)).s(this.f297446J.e()).x(new j(this), new k(this)) : null;
        if (objX == null) {
            return;
        }
        this.f297450N = (AtomicReference) objX;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f297450N.dispose();
    }
}
