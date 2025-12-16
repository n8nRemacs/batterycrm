package com.avito.android.vas_performance.ui.stickers.buy;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.DeepLinkResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: StickersBuyVasViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/buy/v;", "Landroidx/lifecycle/M0;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class v extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f321967E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f321968J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.r f321969K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321970L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321971M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f321972N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f321973O = new D<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D<com.avito.android.vas_performance.ui.items.stickers.a> f321974P = new D<>();

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f321975Q = new C23038g0<>();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Q<Integer, Boolean>> f321976R = new C23038g0<>();

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public Integer f321977S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<z> f321978T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<FL0.d>> f321979U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<DeepLinkResponse>> f321980V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public FL0.d f321981W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321982X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321983Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321984Z;

    public v(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.android.vas_performance.r rVar, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f321967E = str;
        this.f321968J = str2;
        this.f321969K = rVar;
        this.f321970L = aVar;
        this.f321971M = interfaceC35745a5;
        this.f321972N = screenPerformanceTracker;
        C23038g0<z> c23038g0 = new C23038g0<>();
        c23038g0.setValue(new z(null, null, null, null, null, null, null, 127, null));
        this.f321978T = c23038g0;
        C23038g0<P2<FL0.d>> c23038g02 = new C23038g0<>();
        c23038g02.setValue(P2.c.f318721a);
        this.f321979U = c23038g02;
        this.f321980V = new C23038g0<>();
        this.f321982X = new io.reactivex.rxjava3.disposables.c();
        this.f321983Y = new io.reactivex.rxjava3.disposables.c();
        this.f321984Z = new io.reactivex.rxjava3.disposables.c();
        ke();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c6(@Y61.l java.lang.Integer r5) {
        /*
            r4 = this;
            r4.f321977S = r5
            FL0.d r5 = r4.f321981W
            if (r5 == 0) goto Ld8
            java.util.List r5 = r5.j()
            if (r5 == 0) goto Ld8
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L1d
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            goto Ld8
        L1d:
            java.util.Iterator r5 = r5.iterator()
        L21:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Ld8
            java.lang.Object r0 = r5.next()
            EL0.a r0 = (EL0.a) r0
            java.lang.Boolean r0 = r0.getIsSelected()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.L.f(r0, r1)
            if (r0 == 0) goto L21
            FL0.d r5 = r4.f321981W
            if (r5 == 0) goto L94
            java.util.List r5 = r5.j()
            if (r5 == 0) goto L94
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4e:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r5.next()
            r2 = r1
            EL0.a r2 = (EL0.a) r2
            java.lang.Boolean r2 = r2.getIsSelected()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 == 0) goto L4e
            r0.add(r1)
            goto L4e
        L6b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8e
            java.lang.Object r1 = r0.next()
            EL0.a r1 = (EL0.a) r1
            java.lang.String r1 = r1.getId()
            r5.add(r1)
            goto L7a
        L8e:
            java.util.Set r5 = kotlin.collections.C42745f0.P0(r5)
            if (r5 != 0) goto L96
        L94:
            kotlin.collections.B0 r5 = kotlin.collections.B0.f406639b
        L96:
            com.avito.android.vas_performance.repository.a r0 = r4.f321970L
            java.lang.String r1 = r4.f321967E
            java.lang.String r2 = r4.f321968J
            io.reactivex.rxjava3.core.z r5 = r0.d(r1, r2, r5)
            com.avito.android.vas_performance.ui.stickers.buy.o r0 = new com.avito.android.vas_performance.ui.stickers.buy.o
            r0.<init>(r4)
            l41.a r1 = io.reactivex.rxjava3.internal.functions.a.f401993c
            io.reactivex.rxjava3.internal.operators.observable.P r5 = r5.J(r1, r0)
            com.avito.android.messenger.blacklist.mvi.n r0 = new com.avito.android.messenger.blacklist.mvi.n
            r2 = 21
            r0.<init>(r4, r2)
            l41.g<java.lang.Object> r2 = io.reactivex.rxjava3.internal.functions.a.f401994d
            io.reactivex.rxjava3.internal.operators.observable.O r5 = r5.H(r2, r2, r1, r0)
            com.avito.android.util.a5 r0 = r4.f321971M
            io.reactivex.rxjava3.core.H r0 = r0.e()
            io.reactivex.rxjava3.internal.operators.observable.I0 r5 = r5.j0(r0)
            com.avito.android.vas_performance.ui.stickers.buy.p r0 = new com.avito.android.vas_performance.ui.stickers.buy.p
            r0.<init>()
            com.avito.android.util.V2 r2 = com.avito.android.util.V2.f318762a
            com.avito.android.vas_performance.ui.stickers.buy.q r3 = new com.avito.android.vas_performance.ui.stickers.buy.q
            r3.<init>()
            io.reactivex.rxjava3.disposables.d r5 = r5.v0(r0, r3, r1)
            io.reactivex.rxjava3.disposables.c r0 = r4.f321982X
            r0.b(r5)
            goto Led
        Ld8:
            FL0.d r5 = r4.f321981W
            if (r5 == 0) goto Led
            FL0.a r5 = r5.getEmptyAction()
            if (r5 == 0) goto Led
            com.avito.android.deep_linking.links.DeepLink r5 = r5.getDeepLink()
            if (r5 == 0) goto Led
            com.avito.android.util.architecture_components.D<com.avito.android.deep_linking.links.DeepLink> r0 = r4.f321973O
            r0.postValue(r5)
        Led:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.vas_performance.ui.stickers.buy.v.c6(java.lang.Integer):void");
    }

    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f321972N, null, 3);
        I0 i0J0 = this.f321970L.f(this.f321967E, this.f321968J).j0(this.f321971M.e());
        l41.g gVar = new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.buy.m
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) {
                P2<FL0.d> p22 = (P2) obj;
                v vVar = this.f321958b;
                vVar.getClass();
                if (p22 instanceof P2.b) {
                    ScreenPerformanceTracker.a.d(vVar.f321972N, null, null, null, null, 15);
                    vVar.le((FL0.d) ((P2.b) p22).f318720a);
                    G0 g02 = G0.f406611a;
                    return;
                }
                boolean z12 = p22 instanceof P2.a;
                C23038g0<P2<FL0.d>> c23038g0 = vVar.f321979U;
                C23038g0<z> c23038g02 = vVar.f321978T;
                if (!z12) {
                    if (!(p22 instanceof P2.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c23038g0.postValue(p22);
                    z value = c23038g02.getValue();
                    if (value != null) {
                        c23038g02.postValue(z.a(value, null, C42784z0.f406748b, null, null, null, 125));
                        G0 g03 = G0.f406611a;
                        return;
                    }
                    return;
                }
                ApiError apiError = ((P2.a) p22).f318719a;
                ScreenPerformanceTracker.a.d(vVar.f321972N, null, null, new J.a(apiError), null, 11);
                ScreenPerformanceTracker screenPerformanceTracker = vVar.f321972N;
                screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
                c23038g0.postValue(p22);
                z value2 = c23038g02.getValue();
                if (value2 != null) {
                    c23038g02.postValue(z.a(value2, null, C42784z0.f406748b, null, null, null, 125));
                }
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
                G0 g04 = G0.f406611a;
            }
        };
        final V2 v22 = V2.f318762a;
        this.f321982X.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.buy.n
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void le(FL0.d dVar) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f321972N;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        this.f321981W = dVar;
        com.avito.android.vas_performance.r rVar = this.f321969K;
        ArrayList arrayListB = rVar.b(dVar);
        com.avito.android.vas_performance.ui.a aVarC = rVar.c(dVar);
        MnzFloatingFooter mnzFloatingFooterA = rVar.a(dVar);
        this.f321975Q.setValue(Boolean.valueOf(dVar.getBblFooter() != null));
        this.f321979U.postValue(new P2.b(dVar));
        C23038g0<z> c23038g0 = this.f321978T;
        z value = c23038g0.getValue();
        if (value != null) {
            c23038g0.postValue(z.a(value, dVar.getProgress(), arrayListB, dVar.getInfoSection(), aVarC, mnzFloatingFooterA, 68));
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f321983Y.dispose();
        this.f321982X.dispose();
        super.onCleared();
    }
}
