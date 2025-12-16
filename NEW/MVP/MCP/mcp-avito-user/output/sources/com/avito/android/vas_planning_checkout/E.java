package com.avito.android.vas_planning_checkout;

import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.V;
import com.avito.android.analytics.X;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.TopUpFormLink;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.vas_planning_checkout.A;
import com.avito.android.vas_planning_checkout.item.checkout.PlanCheckoutItem;
import com.avito.android.vas_planning_checkout.item.disclaimer.VasPlanningDisclaimerItem;
import com.avito.android.vas_planning_checkout.item.price.PriceItem;
import com.avito.android.vas_planning_checkout.item.result_warning.VasPlanningResultWarningItem;
import com.avito.android.vas_planning_checkout.model.VasPlanCheckoutContent;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import jM0.InterfaceC42284a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import lM0.C43658c;

/* compiled from: VasPlanCheckoutViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_checkout/E;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/vas_planning_checkout/A;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E extends M0 implements A {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final VasPlanCheckoutFragmentArgument f322767E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322768J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.g f322769K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.n f322770L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.d f322771M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.k f322772N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.item.price.k f322773O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_planning_checkout.domain.r f322774P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322775Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42284a f322776R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<VasPlanCheckoutContent> f322777S = new C23038g0<>();

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f322778T = new C23038g0<>();

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f322779U = new C23038g0<>();

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final C23038g0<J> f322780V = new C23038g0<>();

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> f322781W = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<A.a> f322782X = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f322783Y = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f322784Z = new C23038g0<>();

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f322785a0 = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> f322786b0 = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public AtomicReference f322787c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f322788d0;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.d f322789e0;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public Object f322790f0;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public Object f322791g0;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.k
    public Object f322792h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public com.avito.conveyor_item.a f322793i0;

    /* compiled from: VasPlanCheckoutViewModel.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LlM0/c;", "it", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "apply", "(Lcom/avito/android/util/P2;)Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.a) {
                return new VasPlanCheckoutContent.a(((P2.a) p22).f318719a);
            }
            if (p22 instanceof P2.b) {
                return E.this.f322769K.a((C43658c) ((P2.b) p22).f318720a);
            }
            if (p22 instanceof P2.c) {
                return VasPlanCheckoutContent.b.f323015b;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: VasPlanCheckoutViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.ke(E.this, (VasPlanCheckoutContent) obj);
        }
    }

    /* compiled from: VasPlanCheckoutViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            E.ke(E.this, new VasPlanCheckoutContent.a(com.avito.android.error.z.n((Throwable) obj)));
        }
    }

    public E(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k VasPlanCheckoutFragmentArgument vasPlanCheckoutFragmentArgument, @Y61.k com.avito.android.vas_planning_checkout.domain.d dVar, @Y61.k com.avito.android.vas_planning_checkout.domain.g gVar, @Y61.k com.avito.android.vas_planning_checkout.domain.k kVar, @Y61.k com.avito.android.vas_planning_checkout.domain.n nVar, @Y61.k com.avito.android.vas_planning_checkout.domain.r rVar, @Y61.k com.avito.android.vas_planning_checkout.item.price.k kVar2, @Y61.k InterfaceC42284a interfaceC42284a) {
        this.f322767E = vasPlanCheckoutFragmentArgument;
        this.f322768J = interfaceC35745a5;
        this.f322769K = gVar;
        this.f322770L = nVar;
        this.f322771M = dVar;
        this.f322772N = kVar;
        this.f322773O = kVar2;
        this.f322774P = rVar;
        this.f322775Q = interfaceC28373a;
        this.f322776R = interfaceC42284a;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f322787c0 = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f322788d0 = new io.reactivex.rxjava3.disposables.c();
        this.f322789e0 = io.reactivex.rxjava3.disposables.d.E(runnable);
        EmptyDisposable emptyDisposable = EmptyDisposable.f401988b;
        this.f322790f0 = emptyDisposable;
        this.f322791g0 = emptyDisposable;
        this.f322792h0 = C42784z0.f406748b;
        me();
    }

    public static final void ke(E e12, VasPlanCheckoutContent vasPlanCheckoutContent) {
        e12.f322777S.setValue(vasPlanCheckoutContent);
        if (vasPlanCheckoutContent instanceof VasPlanCheckoutContent.Data) {
            VasPlanCheckoutContent.Data data = (VasPlanCheckoutContent.Data) vasPlanCheckoutContent;
            e12.f322778T.setValue(data.f323008b);
            e12.f322784Z.setValue(data.f323009c);
            e12.f322780V.postValue(e12.ne(data.f323011e));
            DeepLink deepLink = data.f323013g;
            if (deepLink != null) {
                e12.f322791g0 = io.reactivex.rxjava3.core.z.c0(deepLink).z(300L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).t0(new D(e12));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public static final void le(E e12, VasPlanCheckoutContent vasPlanCheckoutContent) {
        e12.getClass();
        boolean z12 = vasPlanCheckoutContent instanceof VasPlanCheckoutContent.a;
        C23038g0<Boolean> c23038g0 = e12.f322779U;
        if (z12) {
            c23038g0.postValue(Boolean.FALSE);
            VasPlanCheckoutContent.a aVar = (VasPlanCheckoutContent.a) vasPlanCheckoutContent;
            e12.f322782X.postValue(new A.a(aVar.f323014b, com.avito.android.error.z.k(aVar.f323014b)));
            return;
        }
        if (vasPlanCheckoutContent instanceof VasPlanCheckoutContent.b) {
            c23038g0.postValue(Boolean.TRUE);
            return;
        }
        if (vasPlanCheckoutContent instanceof VasPlanCheckoutContent.c) {
            e12.f322777S.setValue(vasPlanCheckoutContent);
            VasPlanCheckoutContent.c cVar = (VasPlanCheckoutContent.c) vasPlanCheckoutContent;
            C36086g c36086g = new C36086g(cVar.f323016b, e12.f322792h0);
            ArrayList arrayList = cVar.f323016b;
            e12.f322792h0 = arrayList;
            boolean z13 = true;
            e12.f322780V.postValue(new J(arrayList, C23424o.a(c36086g, true)));
            c23038g0.postValue(Boolean.FALSE);
            e12.f322778T.postValue(cVar.f323017c.getTitle());
            e12.f322784Z.postValue("");
            VasPlanCheckoutFragmentArgument vasPlanCheckoutFragmentArgument = e12.f322767E;
            String str = vasPlanCheckoutFragmentArgument.f322814b;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((com.avito.conveyor_item.a) it.next()) instanceof VasPlanningResultWarningItem) {
                        z13 = false;
                        break;
                    }
                }
            }
            V v12 = new V(str, vasPlanCheckoutFragmentArgument.f322816d, z13);
            InterfaceC28373a interfaceC28373a = e12.f322775Q;
            interfaceC28373a.c(v12);
            interfaceC28373a.c(new WL0.a(vasPlanCheckoutFragmentArgument.f322814b, vasPlanCheckoutFragmentArgument.f322816d, cVar.f323018d, null, 8, null));
            if (e12.f322776R.a()) {
                e12.f322783Y.postValue(G0.f406611a);
            }
        }
    }

    public static ArrayList oe(ArrayList arrayList, PlanCheckoutItem planCheckoutItem, boolean z12) {
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a planCheckoutItem2 = (com.avito.conveyor_item.a) it.next();
            if ((planCheckoutItem2 instanceof PlanCheckoutItem) && L.f(((PlanCheckoutItem) planCheckoutItem2).f322911b, planCheckoutItem.f322911b)) {
                PlanCheckoutItem planCheckoutItem3 = (PlanCheckoutItem) planCheckoutItem2;
                planCheckoutItem2 = new PlanCheckoutItem(planCheckoutItem3.f322911b, planCheckoutItem3.f322912c, planCheckoutItem3.f322913d, planCheckoutItem3.f322914e, planCheckoutItem3.f322915f, planCheckoutItem3.f322916g, planCheckoutItem3.f322917h, z12, planCheckoutItem3.f322919j, planCheckoutItem3.f322920k);
            }
            arrayList2.add(planCheckoutItem2);
        }
        return arrayList2;
    }

    @Override // com.avito.android.vas_planning_checkout.A
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> Fc() {
        return this.f322786b0;
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.a
    public final void I2(@Y61.k PlanCheckoutItem planCheckoutItem) {
        C23038g0<J> c23038g0 = this.f322780V;
        J value = c23038g0.getValue();
        if (value == null) {
            return;
        }
        c23038g0.postValue(ne(oe(value.f322800a, planCheckoutItem, true)));
    }

    @Override // com.avito.android.vas_planning_checkout.A
    /* renamed from: I7, reason: from getter */
    public final C23038g0 getF322784Z() {
        return this.f322784Z;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.vas_planning_checkout.A
    public final void L8() {
        DeepLink uri;
        VasPlanCheckoutContent value = this.f322777S.getValue();
        if (!(value instanceof VasPlanCheckoutContent.Data)) {
            if (!(value instanceof VasPlanCheckoutContent.c) || (uri = ((VasPlanCheckoutContent.c) value).f323017c.getUri()) == null) {
                return;
            }
            this.f322781W.postValue(uri);
            return;
        }
        Iterable iterable = (Iterable) this.f322792h0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof PlanCheckoutItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((PlanCheckoutItem) next).f322918i) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((PlanCheckoutItem) it2.next()).f322911b);
        }
        if (arrayList3.isEmpty()) {
            this.f322785a0.postValue(G0.f406611a);
        } else if (this.f322790f0.getF318621e()) {
            this.f322790f0 = this.f322774P.a(this.f322767E.f322815c, arrayList3).d0(new F(this)).j0(this.f322768J.e()).v0(new G(this), new H(this), io.reactivex.rxjava3.internal.functions.a.f401993c);
        }
    }

    @Override // com.avito.android.vas_planning_checkout.A
    /* renamed from: N5, reason: from getter */
    public final com.avito.android.util.architecture_components.D getF322783Y() {
        return this.f322783Y;
    }

    @Override // com.avito.android.vas_planning_checkout.A
    @Y61.k
    public final com.avito.android.util.architecture_components.D<G0> O4() {
        return this.f322785a0;
    }

    @Override // com.avito.android.vas_planning_checkout.A
    public final void S6() {
        if (this.f322777S.getValue() instanceof VasPlanCheckoutContent.c) {
            this.f322785a0.postValue(G0.f406611a);
        } else {
            this.f322786b0.postValue(G0.f406611a);
        }
    }

    @Override // com.avito.android.vas_planning_checkout.A
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF322777S() {
        return this.f322777S;
    }

    @Override // com.avito.android.vas_planning_checkout.A
    public final void h0() {
        me();
    }

    @Override // com.avito.android.deep_linking.links.w
    public final void i7(@Y61.k DeepLink deepLink) {
        if (deepLink instanceof TopUpFormLink) {
            this.f322775Q.c(new X());
        }
        this.f322781W.postValue(deepLink);
    }

    @Override // com.avito.android.vas_planning_checkout.A
    @Y61.k
    public final com.avito.android.util.architecture_components.D<DeepLink> k0() {
        return this.f322781W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void me() {
        this.f322787c0.dispose();
        this.f322787c0 = (AtomicReference) this.f322772N.a(this.f322767E.f322815c).d0(new a()).j0(this.f322768J.e()).v0(new b(), new c(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.vas_planning_checkout.A
    /* renamed from: n0, reason: from getter */
    public final C23038g0 getF322780V() {
        return this.f322780V;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.List] */
    public final J ne(ArrayList arrayList) {
        int iNextIndex;
        VasPlanCheckoutContent value = this.f322777S.getValue();
        VasPlanCheckoutContent.Data data = value instanceof VasPlanCheckoutContent.Data ? (VasPlanCheckoutContent.Data) value : null;
        PriceItem priceItemA = this.f322773O.a(this.f322771M.a(arrayList), data != null ? data.f323012f : null);
        if (data != null) {
            String str = priceItemA != null ? data.f323008b : data.f323010d;
            if (str != null) {
                this.f322778T.postValue(str);
            }
        }
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((com.avito.conveyor_item.a) listIterator.previous()) instanceof VasPlanningDisclaimerItem) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int i12 = iNextIndex - 1;
        if (i12 <= 0 || !(arrayList2.get(i12) instanceof PriceItem) || priceItemA == null) {
            com.avito.conveyor_item.a aVar = this.f322793i0;
            if (aVar != null) {
                arrayList2.add(priceItemA);
                arrayList2.add(aVar);
                this.f322793i0 = null;
            } else if (i12 > 0 && (arrayList2.get(i12) instanceof PriceItem) && priceItemA == null) {
                this.f322793i0 = (com.avito.conveyor_item.a) arrayList2.remove(iNextIndex);
                arrayList2.remove(i12);
            }
        } else {
            arrayList2.set(i12, priceItemA);
        }
        C36086g c36086g = new C36086g(arrayList2, this.f322792h0);
        this.f322792h0 = arrayList2;
        return new J(arrayList2, C23424o.a(c36086g, true));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f322788d0.dispose();
        this.f322787c0.dispose();
        this.f322789e0.dispose();
        this.f322790f0.dispose();
        this.f322791g0.dispose();
    }

    @Override // com.avito.android.vas_planning_checkout.A
    /* renamed from: q0, reason: from getter */
    public final C23038g0 getF322778T() {
        return this.f322778T;
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.a
    public final void r4(@Y61.k PlanCheckoutItem planCheckoutItem) {
        C23038g0<J> c23038g0 = this.f322780V;
        J value = c23038g0.getValue();
        if (value == null) {
            return;
        }
        c23038g0.postValue(ne(oe(value.f322800a, planCheckoutItem, false)));
    }

    @Override // com.avito.android.vas_planning_checkout.A
    @Y61.k
    public final com.avito.android.util.architecture_components.D<A.a> x1() {
        return this.f322782X;
    }

    @Override // com.avito.android.vas_planning_checkout.A
    /* renamed from: xc, reason: from getter */
    public final C23038g0 getF322779U() {
        return this.f322779U;
    }
}
