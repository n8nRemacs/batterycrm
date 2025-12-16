package com.avito.android.ab_groups;

import androidx.compose.foundation.H;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.InterfaceC43543a;
import q3.C47189a;

/* compiled from: AbExperimentsViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ab_groups/q;", "Landroidx/lifecycle/M0;", "d", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class q extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final q3.e f67675E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final ArrayList<C47189a> f67676J = new ArrayList<>();

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final C23038g0<d> f67677K = new C23038g0<>(d.b.f67687a);

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Boolean> f67678L = new C23038g0<>(Boolean.TRUE);

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final D<C47189a> f67679M = new D<>();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final D<G0> f67680N = new D<>();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D<String> f67681O = new D<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f67682P;

    /* compiled from: AbExperimentsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            q.this.f67677K.postValue(d.b.f67687a);
        }
    }

    /* compiled from: AbExperimentsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq3/g;", "experimentsResponse", "Lkotlin/G0;", "accept", "(Lq3/g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            String strC;
            C47189a c47189a;
            q3.g gVar = (q3.g) obj;
            boolean zIsEmpty = gVar.a().isEmpty();
            q qVar = q.this;
            if (zIsEmpty) {
                qVar.f67677K.postValue(d.a.f67686a);
                return;
            }
            List<C47189a> listA = gVar.a();
            qVar.getClass();
            HashMap map = new HashMap();
            List listQ0 = C42745f0.q0(listA);
            ArrayList arrayList = new ArrayList();
            for (T t12 : listQ0) {
                C47189a c47189a2 = (C47189a) t12;
                if (map.keySet().contains(c47189a2.getLabel())) {
                    C47189a c47189a3 = (C47189a) map.get(c47189a2.getLabel());
                    if (c47189a3 != null && (strC = c47189a3.getTitle()) != null && !C43066x.q(strC, c47189a2.getTitle(), false) && (c47189a = (C47189a) map.get(c47189a2.getLabel())) != null) {
                        StringBuilder sb2 = new StringBuilder();
                        C47189a c47189a4 = (C47189a) map.get(c47189a2.getLabel());
                        sb2.append(c47189a4 != null ? c47189a4.getTitle() : null);
                        sb2.append(", ");
                        sb2.append(c47189a2.getTitle());
                        c47189a.d(sb2.toString());
                    }
                } else {
                    map.put(c47189a2.getLabel(), c47189a2);
                    arrayList.add(t12);
                }
            }
            ArrayList<C47189a> arrayList2 = qVar.f67676J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            qVar.f67677K.postValue(new d.c(arrayList));
        }
    }

    /* compiled from: AbExperimentsViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Throwable) obj).printStackTrace();
            q.this.f67677K.postValue(d.a.f67686a);
        }
    }

    /* compiled from: AbExperimentsViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/ab_groups/q$d;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/ab_groups/q$d$a;", "Lcom/avito/android/ab_groups/q$d$b;", "Lcom/avito/android/ab_groups/q$d$c;", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class d {

        /* compiled from: AbExperimentsViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_groups/q$d$a;", "Lcom/avito/android/ab_groups/q$d;", "<init>", "()V", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f67686a = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: AbExperimentsViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_groups/q$d$b;", "Lcom/avito/android/ab_groups/q$d;", "<init>", "()V", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f67687a = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: AbExperimentsViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ab_groups/q$d$c;", "Lcom/avito/android/ab_groups/q$d;", "_avito_ab-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends d {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final Object f67688a;

            public c(@Y61.k List<C47189a> list) {
                super(null);
                this.f67688a = list;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f67688a, ((c) obj).f67688a);
            }

            public final int hashCode() {
                return this.f67688a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return H.n(new StringBuilder("Success(experiments="), this.f67688a, ')');
            }
        }

        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    public q(@Y61.k q3.e eVar) {
        this.f67675E = eVar;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f67682P = cVar;
        I0 i0J0 = eVar.f429004a.a().x0(io.reactivex.rxjava3.schedulers.b.f404943c).j0(io.reactivex.rxjava3.android.schedulers.b.b());
        a aVar = new a();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        cVar.b(i0J0.J(interfaceC43543a, aVar).v0(new b(), new c(), interfaceC43543a));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f67682P.e();
    }
}
