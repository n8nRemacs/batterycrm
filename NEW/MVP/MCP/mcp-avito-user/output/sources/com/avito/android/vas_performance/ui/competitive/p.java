package com.avito.android.vas_performance.ui.competitive;

import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_performance.InterfaceC36051e;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import sL0.C48068a;
import uZ.C49006c;

/* compiled from: CompetitiveVasViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/ui/competitive/p;", "Landroidx/lifecycle/M0;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class p extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f321495E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f321496J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36051e f321497K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321498L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321499M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f321500N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f321501O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<t> f321502P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f321503Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f321504R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public CL0.c f321505S;

    /* renamed from: T, reason: collision with root package name */
    public int f321506T;

    /* renamed from: U, reason: collision with root package name */
    public int f321507U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final ArrayList f321508V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321509W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321510X;

    public p(@Y61.k String str, @Y61.k String str2, @Y61.k InterfaceC36051e interfaceC36051e, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f321495E = str;
        this.f321496J = str2;
        this.f321497K = interfaceC36051e;
        this.f321498L = aVar;
        this.f321499M = interfaceC35745a5;
        this.f321500N = screenPerformanceTracker;
        this.f321501O = interfaceC28373a;
        C23038g0<t> c23038g0 = new C23038g0<>();
        c23038g0.setValue(new t(null, null, null, null, false, 31, null));
        this.f321502P = c23038g0;
        this.f321503Q = new D<>();
        this.f321504R = new D<>();
        this.f321506T = -1;
        this.f321507U = -1;
        this.f321508V = new ArrayList();
        this.f321509W = new io.reactivex.rxjava3.disposables.c();
        this.f321510X = new io.reactivex.rxjava3.disposables.c();
        ke();
    }

    public final void L8() {
        List<CL0.d> listD;
        CL0.d dVar;
        List<CL0.a> listB;
        CL0.a aVar;
        DeepLink deepLink;
        CL0.c cVar = this.f321505S;
        if (cVar == null || (listD = cVar.d()) == null || (dVar = (CL0.d) C42745f0.K(this.f321506T, listD)) == null || (listB = dVar.b()) == null || (aVar = (CL0.a) C42745f0.K(this.f321507U, listB)) == null || (deepLink = aVar.getDeepLink()) == null) {
            return;
        }
        ArrayList arrayList = this.f321508V;
        this.f321501O.c(new C48068a(this.f321495E, C42745f0.M0(arrayList)));
        arrayList.clear();
        this.f321503Q.postValue(deepLink);
    }

    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f321500N, null, 3);
        I0 i0J0 = this.f321498L.b(this.f321495E, this.f321496J).j0(this.f321499M.e());
        l41.g gVar = new l41.g() { // from class: com.avito.android.vas_performance.ui.competitive.g
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) {
                P2 p22 = (P2) obj;
                p pVar = this.f321486b;
                pVar.getClass();
                if (p22 instanceof P2.b) {
                    ScreenPerformanceTracker.a.d(pVar.f321500N, null, null, null, null, 15);
                    pVar.le((CL0.c) ((P2.b) p22).f318720a);
                    G0 g02 = G0.f406611a;
                    return;
                }
                boolean z12 = p22 instanceof P2.a;
                C23038g0<t> c23038g0 = pVar.f321502P;
                if (!z12) {
                    t value = c23038g0.getValue();
                    if (value != null) {
                        c23038g0.postValue(t.a(value, p22, C42784z0.f406748b));
                        G0 g03 = G0.f406611a;
                        return;
                    }
                    return;
                }
                ApiError apiError = ((P2.a) p22).f318719a;
                ScreenPerformanceTracker.a.d(pVar.f321500N, null, null, new J.a(apiError), null, 11);
                ScreenPerformanceTracker screenPerformanceTracker = pVar.f321500N;
                screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
                t value2 = c23038g0.getValue();
                if (value2 != null) {
                    c23038g0.postValue(t.a(value2, p22, C42784z0.f406748b));
                }
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
                G0 g04 = G0.f406611a;
            }
        };
        final V2 v22 = V2.f318762a;
        this.f321509W.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.vas_performance.ui.competitive.h
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void le(CL0.c cVar) {
        MnzFloatingFooterContact contact;
        List<CL0.d> listD;
        CL0.d dVar;
        List<CL0.a> listB;
        CL0.a aVar;
        ScreenPerformanceTracker screenPerformanceTracker = this.f321500N;
        screenPerformanceTracker.m(screenPerformanceTracker.getF305951e());
        this.f321505S = cVar;
        List<CL0.d> listD2 = cVar.d();
        int i12 = this.f321506T;
        InterfaceC36051e interfaceC36051e = this.f321497K;
        int iC2 = interfaceC36051e.c(i12, listD2);
        this.f321506T = iC2;
        int iA2 = interfaceC36051e.a(iC2, this.f321507U, cVar.d());
        this.f321507U = iA2;
        ArrayList arrayListB = interfaceC36051e.b(cVar, this.f321506T, iA2);
        String actionTitle = cVar.getActionTitle();
        MnzFloatingFooter bblFooter = cVar.getBblFooter();
        CL0.c cVar2 = this.f321505S;
        if (cVar2 == null || (listD = cVar2.d()) == null || (dVar = (CL0.d) C42745f0.K(this.f321506T, listD)) == null || (listB = dVar.b()) == null || (aVar = (CL0.a) C42745f0.K(this.f321507U, listB)) == null) {
            contact = null;
        } else {
            this.f321508V.add(aVar.getId());
            contact = aVar.getContact();
        }
        C23038g0<t> c23038g0 = this.f321502P;
        if (c23038g0.getValue() != null) {
            c23038g0.postValue(new t(new P2.b(cVar), arrayListB, actionTitle, C49006c.a(bblFooter, contact, true), bblFooter != null));
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f321510X.dispose();
        this.f321509W.dispose();
        super.onCleared();
    }
}
