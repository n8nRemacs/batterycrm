package com.avito.android.tariff.cpa.configure_advance.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.AbstractC22991Y;
import androidx.view.C23038g0;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;

/* compiled from: ConfigureAdvanceViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/viewmodel/q;", "Lcom/avito/android/tariff/cpa/configure_advance/viewmodel/p;", "Landroidx/lifecycle/M0;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q extends M0 implements p {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f294403E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final j f294404J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35205a f294405K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f294406L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f294407M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final g f294408N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f294409O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final v50.g f294410P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public AtomicReference f294411Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f294412R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.d f294413S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f294414T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f294415U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f294416V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f294417W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f294418X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<String> f294419Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final D<Boolean> f294420Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D<com.avito.android.tariff.cpa.configure_advance.ui.a> f294421a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public Object f294422b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.tariff.cpa.configure_advance.ui.c f294423c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public Integer f294424d0;

    /* compiled from: ConfigureAdvanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpa.configure_advance.viewmodel.ConfigureAdvanceViewModelImpl$1", f = "ConfigureAdvanceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Q<? extends DeepLink, ? extends Boolean>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f294425q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = q.this.new a(continuation);
            aVar.f294425q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Q<? extends DeepLink, ? extends Boolean> q12, Continuation<? super G0> continuation) {
            return ((a) create(q12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            Q q12 = (Q) this.f294425q;
            DeepLink deepLink = (DeepLink) q12.f406619b;
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            q qVar = q.this;
            if (zBooleanValue) {
                qVar.f294418X.setValue(deepLink);
            } else {
                b.a.a(qVar.f294409O, deepLink, null, null, 6);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ConfigureAdvanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            Integer numY0 = !C43066x.K(str) ? C43066x.y0(str) : null;
            q qVar = q.this;
            qVar.f294424d0 = numY0;
            com.avito.android.tariff.cpa.configure_advance.ui.c cVar = qVar.f294423c0;
            if (cVar != null) {
                boolean zA2 = qVar.f294408N.a(cVar.f294374d, numY0);
                qVar.f294417W.setValue(Boolean.valueOf(zA2));
                Iterable<com.avito.conveyor_item.a> iterable = (Iterable) qVar.f294422b0;
                ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                for (com.avito.conveyor_item.a aVar : iterable) {
                    if (aVar instanceof com.avito.android.tariff.cpa.configure_advance.items.advance_info.a) {
                        com.avito.android.tariff.cpa.configure_advance.items.advance_info.a aVar2 = (com.avito.android.tariff.cpa.configure_advance.items.advance_info.a) aVar;
                        aVar = new com.avito.android.tariff.cpa.configure_advance.items.advance_info.a(aVar2.f294319b, aVar2.f294320c, aVar2.f294321d, aVar2.f294322e, zA2);
                    }
                    arrayList.add(aVar);
                }
                qVar.f294422b0 = arrayList;
                qVar.f294414T.setValue(arrayList);
            }
        }
    }

    /* compiled from: ConfigureAdvanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f294428b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public q(@Y61.k String str, @Y61.k j jVar, @Y61.k InterfaceC35205a interfaceC35205a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k v50.g gVar2) {
        this.f294403E = str;
        this.f294404J = jVar;
        this.f294405K = interfaceC35205a;
        this.f294406L = interfaceC35745a5;
        this.f294407M = screenPerformanceTracker;
        this.f294408N = gVar;
        this.f294409O = aVar;
        this.f294410P = gVar2;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f294411Q = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f294412R = new io.reactivex.rxjava3.disposables.c();
        this.f294413S = io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f294414T = new C23038g0<>();
        this.f294415U = new C23038g0<>();
        this.f294416V = new C23038g0<>();
        this.f294417W = new C23038g0<>();
        this.f294418X = new D<>();
        this.f294419Y = new D<>();
        this.f294420Z = new D<>();
        this.f294421a0 = new D<>();
        this.f294422b0 = C42784z0.f406748b;
        ke();
        C43175k.K(new C43197r1(new a(null), gVar2.a()), N0.a(this));
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    /* renamed from: A0, reason: from getter */
    public final D getF294420Z() {
        return this.f294420Z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    public final void E0() {
        Integer num;
        com.avito.android.tariff.cpa.configure_advance.ui.c cVar = this.f294423c0;
        if (cVar == null || (num = this.f294424d0) == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (this.f294408N.a(cVar.f294374d, Integer.valueOf(iIntValue))) {
            this.f294411Q.dispose();
            this.f294411Q = (AtomicReference) this.f294404J.e(iIntValue, this.f294403E).j0(this.f294406L.e()).v0(new x(this), new y(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    /* renamed from: J0, reason: from getter */
    public final C23038g0 getF294417W() {
        return this.f294417W;
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    public final void M1() {
        com.avito.android.tariff.cpa.configure_advance.ui.c cVar = this.f294423c0;
        if (cVar != null) {
            DeepLink deeplink = cVar.f294372b.getDeeplink();
            if (deeplink == null) {
                this.f294421a0.setValue(cVar.f294375e);
            } else {
                Integer num = this.f294424d0;
                b.a.a(this.f294409O, deeplink, null, num != null ? AK.c.e(num.intValue(), "keyCpaConfigureAdvance") : null, 2);
            }
        }
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f294412R;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.tariff.cpa.configure_advance.items.extra_info.d) {
                I0 i0J0 = com.avito.android.mnz_common.extensions.h.b(((K) dVar).k()).j0(this.f294406L.e());
                final com.avito.android.deeplink_handler.handler.composite.a aVar = this.f294409O;
                l41.g gVar = new l41.g() { // from class: com.avito.android.tariff.cpa.configure_advance.viewmodel.z
                    @Override // l41.g
                    public final void accept(Object obj) {
                        b.a.a(aVar, (DeepLink) obj, null, null, 6);
                    }
                };
                final V2 v22 = V2.f318762a;
                cVar.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.tariff.cpa.configure_advance.viewmodel.A
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.tariff.cpa.configure_advance.items.advance_info.d) {
                com.jakewharton.rxrelay3.c f294330c = ((com.avito.android.tariff.cpa.configure_advance.items.advance_info.d) dVar).getF294330c();
                b bVar = new b();
                l41.g<? super Throwable> gVar2 = c.f294428b;
                f294330c.getClass();
                cVar.b(f294330c.v0(bVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF294415U() {
        return this.f294415U;
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    public final void h0() {
        ke();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f294407M, null, 3);
        this.f294411Q.dispose();
        this.f294411Q = (AtomicReference) this.f294404J.a(this.f294403E).r0(P2.c.f318721a).K(new r(this)).N(s.f294430b).d0(t.f294431b).d0(new u(this)).j0(this.f294406L.e()).v0(new v(this), new w(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    /* renamed from: n0, reason: from getter */
    public final C23038g0 getF294414T() {
        return this.f294414T;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f294411Q.dispose();
        this.f294412R.dispose();
        this.f294413S.dispose();
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    @Y61.k
    public final D<com.avito.android.tariff.cpa.configure_advance.ui.a> p1() {
        return this.f294421a0;
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    public final AbstractC22991Y t0() {
        return this.f294416V;
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    @Y61.k
    public final D<DeepLink> u1() {
        return this.f294418X;
    }

    @Override // com.avito.android.tariff.cpa.configure_advance.viewmodel.p
    @Y61.k
    public final D<String> w1() {
        return this.f294419Y;
    }
}
