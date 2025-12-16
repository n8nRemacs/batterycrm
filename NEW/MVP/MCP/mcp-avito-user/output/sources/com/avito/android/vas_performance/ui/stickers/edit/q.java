package com.avito.android.vas_performance.ui.stickers.edit;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_performance.v;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StickersEditVasViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/stickers/edit/q;", "Landroidx/lifecycle/M0;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class q extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f322036E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final v f322037J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f322038K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322039L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f322040M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final D<String> f322041N = new D<>();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f322042O = new D<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<u> f322043P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f322044Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public GL0.c f322045R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322046S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322047T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public Set<String> f322048U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public Set<String> f322049V;

    /* renamed from: W, reason: collision with root package name */
    public int f322050W;

    public q(@Y61.k String str, @Y61.k v vVar, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f322036E = str;
        this.f322037J = vVar;
        this.f322038K = aVar;
        this.f322039L = interfaceC35745a5;
        this.f322040M = screenPerformanceTracker;
        C23038g0<u> c23038g0 = new C23038g0<>();
        c23038g0.setValue(new u(null, null, null, null, 0, null, 63, null));
        this.f322043P = c23038g0;
        C23038g0<P2<?>> c23038g02 = new C23038g0<>();
        c23038g02.setValue(P2.c.f318721a);
        this.f322044Q = c23038g02;
        this.f322046S = new io.reactivex.rxjava3.disposables.c();
        this.f322047T = new io.reactivex.rxjava3.disposables.c();
        B0 b02 = B0.f406639b;
        this.f322048U = b02;
        this.f322049V = b02;
        le();
    }

    public static Set ne(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (L.f(((EL0.a) obj).getIsSelected(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EL0.a) it.next()).getId());
        }
        return C42745f0.P0(arrayList2);
    }

    public final int ke() {
        return Math.max(b1.f(this.f322049V, this.f322048U).size(), b1.f(this.f322048U, this.f322049V).size());
    }

    public final void le() {
        ScreenPerformanceTracker.a.b(this.f322040M, null, 3);
        I0 i0J0 = this.f322038K.h(this.f322036E).j0(this.f322039L.e());
        l41.g gVar = new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.edit.k
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) {
                P2<?> p22 = (P2) obj;
                q qVar = this.f322030b;
                qVar.getClass();
                if (p22 instanceof P2.b) {
                    ScreenPerformanceTracker.a.d(qVar.f322040M, null, null, null, null, 15);
                    GL0.c cVar = (GL0.c) ((P2.b) p22).f318720a;
                    Set<String> setNe = q.ne(cVar.j());
                    qVar.f322048U = setNe;
                    qVar.f322049V = setNe;
                    qVar.me(cVar);
                    G0 g02 = G0.f406611a;
                    return;
                }
                boolean z12 = p22 instanceof P2.a;
                C23038g0<P2<?>> c23038g0 = qVar.f322044Q;
                C23038g0<u> c23038g02 = qVar.f322043P;
                if (!z12) {
                    if (!(p22 instanceof P2.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c23038g0.postValue(p22);
                    u value = c23038g02.getValue();
                    if (value != null) {
                        c23038g02.postValue(u.a(value, null, C42784z0.f406748b, null, null, 61));
                        G0 g03 = G0.f406611a;
                        return;
                    }
                    return;
                }
                ApiError apiError = ((P2.a) p22).f318719a;
                ScreenPerformanceTracker.a.d(qVar.f322040M, null, null, new J.a(apiError), null, 11);
                ScreenPerformanceTracker screenPerformanceTracker = qVar.f322040M;
                screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
                c23038g0.postValue(p22);
                u value2 = c23038g02.getValue();
                if (value2 != null) {
                    c23038g02.postValue(u.a(value2, null, C42784z0.f406748b, null, null, 61));
                }
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
                G0 g04 = G0.f406611a;
            }
        };
        final V2 v22 = V2.f318762a;
        this.f322046S.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.stickers.edit.l
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void me(GL0.c cVar) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f322040M;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        this.f322045R = cVar;
        int iKe = ke();
        v vVar = this.f322037J;
        ArrayList arrayListA = vVar.a(cVar, iKe);
        com.avito.android.vas_performance.ui.a aVarB = vVar.b(cVar, ke());
        this.f322044Q.postValue(new P2.b(cVar));
        C23038g0<u> c23038g0 = this.f322043P;
        u value = c23038g0.getValue();
        if (value != null) {
            c23038g0.postValue(u.a(value, cVar.getProgress(), arrayListA, cVar.getAlertMessage(), aVarB, 20));
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f322047T.dispose();
        this.f322046S.dispose();
        super.onCleared();
    }
}
