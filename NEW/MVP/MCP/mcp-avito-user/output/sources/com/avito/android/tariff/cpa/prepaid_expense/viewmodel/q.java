package com.avito.android.tariff.cpa.prepaid_expense.viewmodel;

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

/* compiled from: PublicationAdvanceViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/viewmodel/q;", "Lcom/avito/android/tariff/cpa/prepaid_expense/viewmodel/p;", "Landroidx/lifecycle/M0;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q extends M0 implements p {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public String f295099E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final j f295100J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35206a f295101K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f295102L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f295103M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final g f295104N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final v50.g f295105O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f295106P;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.tariff.cpa.prepaid_expense.ui.c f295119c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public Integer f295120d0;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public AtomicReference f295107Q = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f295108R = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<List<com.avito.conveyor_item.a>> f295109S = new C23038g0<>();

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f295110T = new C23038g0<>();

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f295111U = new C23038g0<>();

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f295112V = new C23038g0<>();

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f295113W = new D<>();

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f295114X = new D<>();

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final D<String> f295115Y = new D<>();

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final D<Boolean> f295116Z = new D<>();

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D<com.avito.android.tariff.cpa.prepaid_expense.ui.a> f295117a0 = new D<>();

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public Object f295118b0 = C42784z0.f406748b;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f295121e0 = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PublicationAdvanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.tariff.cpa.prepaid_expense.viewmodel.PublicationAdvanceViewModelImpl$1", f = "PublicationAdvanceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<Q<? extends DeepLink, ? extends Boolean>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f295122q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = q.this.new a(continuation);
            aVar.f295122q = obj;
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
            Q q12 = (Q) this.f295122q;
            DeepLink deepLink = (DeepLink) q12.f406619b;
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            q qVar = q.this;
            if (zBooleanValue) {
                qVar.f295114X.setValue(deepLink);
            } else {
                qVar.f295113W.setValue(deepLink);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PublicationAdvanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "value", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String str = (String) obj;
            Integer numY0 = !C43066x.K(str) ? C43066x.y0(str) : null;
            q qVar = q.this;
            qVar.f295120d0 = numY0;
            com.avito.android.tariff.cpa.prepaid_expense.ui.c cVar = qVar.f295119c0;
            if (cVar != null) {
                boolean zA2 = qVar.f295104N.a(cVar.f295069d, numY0);
                qVar.f295112V.setValue(Boolean.valueOf(zA2));
                Iterable<com.avito.conveyor_item.a> iterable = (Iterable) qVar.f295118b0;
                ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                for (com.avito.conveyor_item.a aVar : iterable) {
                    if (aVar instanceof com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.a) {
                        com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.a aVar2 = (com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.a) aVar;
                        aVar = new com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.a(aVar2.f295013b, aVar2.f295014c, aVar2.f295015d, aVar2.f295016e, zA2);
                    }
                    arrayList.add(aVar);
                }
                qVar.f295118b0 = arrayList;
                qVar.f295109S.setValue(arrayList);
            }
        }
    }

    /* compiled from: PublicationAdvanceViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f295125b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public q(@Y61.k String str, @Y61.k j jVar, @Y61.k InterfaceC35206a interfaceC35206a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k g gVar, @Y61.k v50.g gVar2, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f295099E = str;
        this.f295100J = jVar;
        this.f295101K = interfaceC35206a;
        this.f295102L = interfaceC35745a5;
        this.f295103M = screenPerformanceTracker;
        this.f295104N = gVar;
        this.f295105O = gVar2;
        this.f295106P = aVar;
        ke();
        C43175k.K(new C43197r1(new a(null), gVar2.a()), N0.a(this));
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    /* renamed from: A0, reason: from getter */
    public final D getF295116Z() {
        return this.f295116Z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    public final void E0() {
        Integer num;
        com.avito.android.tariff.cpa.prepaid_expense.ui.c cVar = this.f295119c0;
        if (cVar == null || (num = this.f295120d0) == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (this.f295104N.a(cVar.f295069d, Integer.valueOf(iIntValue))) {
            this.f295107Q.dispose();
            this.f295107Q = (AtomicReference) this.f295100J.b(iIntValue, this.f295099E).j0(this.f295102L.e()).v0(new x(this), new y(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    /* renamed from: J0, reason: from getter */
    public final C23038g0 getF295112V() {
        return this.f295112V;
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    public final void M1() {
        com.avito.android.tariff.cpa.prepaid_expense.ui.c cVar = this.f295119c0;
        if (cVar != null) {
            DeepLink deeplink = cVar.f295067b.getDeeplink();
            if (deeplink == null) {
                this.f295117a0.setValue(cVar.f295071f);
            } else {
                Integer num = this.f295120d0;
                b.a.a(this.f295106P, deeplink, null, num != null ? AK.c.e(num.intValue(), "keyCpaPublicationAdvance") : null, 2);
            }
        }
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f295108R;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            if (dVar instanceof com.avito.android.tariff.cpa.prepaid_expense.items.extra_info.d) {
                I0 i0J0 = com.avito.android.mnz_common.extensions.h.b(((K) dVar).k()).j0(this.f295102L.e());
                final D<DeepLink> d12 = this.f295113W;
                l41.g gVar = new l41.g() { // from class: com.avito.android.tariff.cpa.prepaid_expense.viewmodel.z
                    @Override // l41.g
                    public final void accept(Object obj) {
                        d12.setValue((DeepLink) obj);
                    }
                };
                final V2 v22 = V2.f318762a;
                cVar.b(i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.tariff.cpa.prepaid_expense.viewmodel.A
                    @Override // l41.g
                    public final void accept(Object obj) {
                        v22.f((Throwable) obj);
                    }
                }, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.d) {
                com.jakewharton.rxrelay3.c f295024c = ((com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.d) dVar).getF295024c();
                b bVar = new b();
                l41.g<? super Throwable> gVar2 = c.f295125b;
                f295024c.getClass();
                cVar.b(f295024c.v0(bVar, gVar2, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF295110T() {
        return this.f295110T;
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    public final void h0() {
        ke();
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    @Y61.k
    public final D<DeepLink> k0() {
        return this.f295113W;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void ke() {
        ScreenPerformanceTracker.a.b(this.f295103M, null, 3);
        this.f295107Q.dispose();
        this.f295107Q = (AtomicReference) this.f295100J.c(this.f295099E).r0(P2.c.f318721a).K(new r(this)).N(s.f295127b).d0(t.f295128b).d0(new u(this)).j0(this.f295102L.e()).v0(new v(this), new w(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    /* renamed from: n0, reason: from getter */
    public final C23038g0 getF295109S() {
        return this.f295109S;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f295107Q.dispose();
        this.f295108R.dispose();
        this.f295121e0.dispose();
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    @Y61.k
    public final D<com.avito.android.tariff.cpa.prepaid_expense.ui.a> p1() {
        return this.f295117a0;
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    public final AbstractC22991Y t0() {
        return this.f295111U;
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    @Y61.k
    public final D<DeepLink> u1() {
        return this.f295114X;
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.viewmodel.p
    @Y61.k
    public final D<String> w1() {
        return this.f295115Y;
    }
}
