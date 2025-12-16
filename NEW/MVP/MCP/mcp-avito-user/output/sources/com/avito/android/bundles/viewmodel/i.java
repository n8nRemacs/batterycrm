package com.avito.android.bundles.viewmodel;

import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VasBundlesViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/viewmodel/i;", "Landroidx/lifecycle/M0;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f108752E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.b f108753J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bundles.repository.a f108754K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f108755L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f108756M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final C23038g0<k> f108757N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f108758O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f108759P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f108760Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f108761R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f108762S;

    public i(@Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.bundles.b bVar, @Y61.k com.avito.android.bundles.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k String str) {
        this.f108752E = str;
        this.f108753J = bVar;
        this.f108754K = aVar;
        this.f108755L = interfaceC35745a5;
        this.f108756M = screenPerformanceTracker;
        C23038g0<k> c23038g0 = new C23038g0<>();
        c23038g0.setValue(new k(null, null, null, 7, null));
        this.f108757N = c23038g0;
        this.f108758O = new D<>();
        this.f108759P = new D<>();
        this.f108760Q = new D<>();
        this.f108761R = new io.reactivex.rxjava3.disposables.c();
        this.f108762S = new io.reactivex.rxjava3.disposables.c();
        ke();
    }

    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f108756M, null, 3);
        I0 i0J0 = this.f108754K.a(this.f108752E).j0(this.f108755L.e());
        l41.g gVar = new l41.g() { // from class: com.avito.android.bundles.viewmodel.a
            /* JADX WARN: Multi-variable type inference failed */
            @Override // l41.g
            public final void accept(Object obj) {
                P2 p22 = (P2) obj;
                i iVar = this.f108744b;
                iVar.getClass();
                boolean z12 = p22 instanceof P2.b;
                C23038g0<k> c23038g0 = iVar.f108757N;
                ScreenPerformanceTracker screenPerformanceTracker = iVar.f108756M;
                ScreenPerformanceTracker screenPerformanceTracker2 = iVar.f108756M;
                if (z12) {
                    ScreenPerformanceTracker.a.d(screenPerformanceTracker2, null, null, null, null, 15);
                    screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
                    com.avito.android.bundles.f fVarA = iVar.f108753J.a((Dk.h) ((P2.b) p22).f318720a);
                    ArrayList arrayList = fVarA.f108324a;
                    Action action = fVarA.f108325b;
                    ButtonAction buttonAction = action != null ? new ButtonAction(action.getTitle(), action.getDeepLink(), null, null, 12, null) : null;
                    if (c23038g0.getValue() != null) {
                        c23038g0.postValue(new k(p22, arrayList, buttonAction));
                    }
                    ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
                    return;
                }
                if (!(p22 instanceof P2.a)) {
                    k value = c23038g0.getValue();
                    if (value != null) {
                        c23038g0.postValue(new k(p22, null, value.f108765c));
                        return;
                    }
                    return;
                }
                ApiError apiError = ((P2.a) p22).f318719a;
                ScreenPerformanceTracker.a.d(iVar.f108756M, null, null, new J.a(apiError), null, 11);
                screenPerformanceTracker2.m(screenPerformanceTracker2.getF90716d());
                k value2 = c23038g0.getValue();
                if (value2 != null) {
                    c23038g0.postValue(new k(p22, null, value2.f108765c));
                }
                ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, new J.a(apiError), null, 5);
            }
        };
        final V2 v22 = V2.f318762a;
        this.f108761R.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.bundles.viewmodel.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void le(@Y61.k Set<TV0.d<?, ?>> set, @Y61.k com.avito.android.bundles.ui.view.b bVar) {
        io.reactivex.rxjava3.disposables.c cVar = this.f108762S;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.bundles.ui.recycler.item.bundle.d;
            InterfaceC35745a5 interfaceC35745a5 = this.f108755L;
            if (z12) {
                z<DeepLink> zVarK = ((K) dVar).k();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                zVarK.getClass();
                I0 i0J0 = zVarK.C0(100L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                final D<DeepLink> d12 = this.f108758O;
                l41.g gVar = new l41.g() { // from class: com.avito.android.bundles.viewmodel.e
                    @Override // l41.g
                    public final void accept(Object obj) {
                        d12.setValue((DeepLink) obj);
                    }
                };
                final V2 v22 = V2.f318762a;
                cVar.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.bundles.viewmodel.f
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.bundles.ui.recycler.item.skip_button.d) {
                me((K) dVar);
            } else if (dVar instanceof com.avito.android.bundles.ui.recycler.item.benefit.b) {
                z<DeepLink> zVarK2 = ((K) dVar).k();
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                zVarK2.getClass();
                I0 i0J02 = zVarK2.C0(100L, timeUnit2, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e());
                final D<DeepLink> d13 = this.f108760Q;
                l41.g gVar2 = new l41.g() { // from class: com.avito.android.bundles.viewmodel.c
                    @Override // l41.g
                    public final void accept(Object obj) {
                        d13.setValue((DeepLink) obj);
                    }
                };
                final V2 v23 = V2.f318762a;
                cVar.b(i0J02.v0(gVar2, new l41.g() { // from class: com.avito.android.bundles.viewmodel.d
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v23.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
        me(bVar);
    }

    public final void me(K k12) {
        z<DeepLink> zVarK = k12.k();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        zVarK.getClass();
        I0 i0J0 = zVarK.C0(100L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).j0(this.f108755L.e());
        final D<DeepLink> d12 = this.f108759P;
        l41.g gVar = new l41.g() { // from class: com.avito.android.bundles.viewmodel.g
            @Override // l41.g
            public final void accept(Object obj) {
                d12.setValue((DeepLink) obj);
            }
        };
        final V2 v22 = V2.f318762a;
        this.f108762S.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.bundles.viewmodel.h
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f108761R.dispose();
        super.onCleared();
    }
}
