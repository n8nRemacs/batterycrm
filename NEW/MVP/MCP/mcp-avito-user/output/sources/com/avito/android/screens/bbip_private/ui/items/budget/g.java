package com.avito.android.screens.bbip_private.ui.items.budget;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import hh.InterfaceC40936d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateBudgetItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/g;", "Lcom/avito/android/screens/bbip_private/ui/items/budget/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<BbipPrivateBudgetItem.Budget, G0> f260677b;

    /* compiled from: BbipPrivateBudgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$Budget;", "budget", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$Budget;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<BbipPrivateBudgetItem.Budget, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f260679m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetItem f260680n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f260681o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, BbipPrivateBudgetItem bbipPrivateBudgetItem, List<BbipPrivateBudgetItem.Budget> list) {
            super(1);
            this.f260679m = jVar;
            this.f260680n = bbipPrivateBudgetItem;
            this.f260681o = list;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(BbipPrivateBudgetItem.Budget budget) {
            BbipPrivateBudgetItem.Budget budget2 = budget;
            boolean z12 = budget2.f260649o;
            g gVar = g.this;
            if (z12) {
                g.k(gVar, this.f260679m, this.f260680n, this.f260681o, budget2);
            }
            gVar.f260677b.invoke(budget2);
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateBudgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$Budget;", "budget", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$Budget;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<BbipPrivateBudgetItem.Budget, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f260683m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetItem f260684n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f260685o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, BbipPrivateBudgetItem bbipPrivateBudgetItem, List<BbipPrivateBudgetItem.Budget> list) {
            super(1);
            this.f260683m = jVar;
            this.f260684n = bbipPrivateBudgetItem;
            this.f260685o = list;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(BbipPrivateBudgetItem.Budget budget) {
            BbipPrivateBudgetItem.Budget budget2 = budget;
            if (budget2.f260649o) {
                g.k(g.this, this.f260683m, this.f260684n, this.f260685o, budget2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateBudgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j f260687m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetItem f260688n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f260689o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetItem.Budget f260690p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j jVar, BbipPrivateBudgetItem bbipPrivateBudgetItem, List<BbipPrivateBudgetItem.Budget> list, BbipPrivateBudgetItem.Budget budget) {
            super(0);
            this.f260687m = jVar;
            this.f260688n = bbipPrivateBudgetItem;
            this.f260689o = list;
            this.f260690p = budget;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // Y41.a
        public final G0 invoke() {
            g.k(g.this, this.f260687m, this.f260688n, this.f260689o, this.f260690p);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k @InterfaceC40936d Y41.l<? super BbipPrivateBudgetItem.Budget, G0> lVar) {
        this.f260677b = lVar;
    }

    public static final void k(g gVar, j jVar, BbipPrivateBudgetItem bbipPrivateBudgetItem, List list, BbipPrivateBudgetItem.Budget budget) {
        gVar.getClass();
        String str = bbipPrivateBudgetItem.f260632i;
        Integer numValueOf = budget != null ? Integer.valueOf(budget.f260636b) : null;
        List<BbipPrivateBudgetItem.Budget> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (BbipPrivateBudgetItem.Budget budget2 : list2) {
            int i12 = budget2.f260636b;
            arrayList.add(new n(budget2.f260638d, budget2.f260640f, budget2.f260647m, i12, numValueOf != null && i12 == numValueOf.intValue()));
        }
        jVar.ve(str, bbipPrivateBudgetItem.f260634k, bbipPrivateBudgetItem.f260633j, bbipPrivateBudgetItem.f260626c, arrayList, new f(list, gVar));
    }

    public final void O(@Y61.k j jVar, @Y61.k BbipPrivateBudgetItem bbipPrivateBudgetItem) {
        List<BbipPrivateBudgetItem.Budget> list;
        BbipPrivateBudgetItem.Budget budget;
        BbipPrivateBudgetItem.a aVar = (BbipPrivateBudgetItem.a) C42745f0.G(bbipPrivateBudgetItem.f260635l);
        boolean z12 = ((aVar == null || (list = aVar.f260652b) == null || (budget = (BbipPrivateBudgetItem.Budget) C42745f0.G(list)) == null) ? null : budget.f260642h) != null;
        jVar.setTitle(bbipPrivateBudgetItem.f260625b);
        jVar.jd(z12);
        V(jVar, bbipPrivateBudgetItem, bbipPrivateBudgetItem.f260627d, bbipPrivateBudgetItem.f260629f);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((j) eVar, (BbipPrivateBudgetItem) aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public final void V(j jVar, BbipPrivateBudgetItem bbipPrivateBudgetItem, BbipPrivateBudgetItem.Budget budget, Integer num) {
        Object next;
        ArrayList arrayList;
        Object next2;
        Iterable arrayList2;
        Object next3;
        Object next4;
        List<BbipPrivateBudgetItem.Budget> list;
        List<BbipPrivateBudgetItem.Budget> list2;
        int i12 = bbipPrivateBudgetItem.f260626c;
        List<BbipPrivateBudgetItem.a> list3 = bbipPrivateBudgetItem.f260635l;
        Iterator it = list3.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((BbipPrivateBudgetItem.a) next).f260651a == i12) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BbipPrivateBudgetItem.a aVar = (BbipPrivateBudgetItem.a) next;
        if (aVar == null || (list2 = aVar.f260652b) == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list2) {
                if (!((BbipPrivateBudgetItem.Budget) obj).f260649o) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList3);
        }
        Iterator it2 = list3.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (((BbipPrivateBudgetItem.a) next2).f260651a == i12) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        BbipPrivateBudgetItem.a aVar2 = (BbipPrivateBudgetItem.a) next2;
        if (aVar2 == null || (list = aVar2.f260652b) == null) {
            arrayList2 = C42784z0.f406748b;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((BbipPrivateBudgetItem.Budget) obj2).f260649o) {
                    arrayList2.add(obj2);
                }
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            int i13 = ((BbipPrivateBudgetItem.Budget) next3).f260636b;
            if (num != null && i13 == num.intValue()) {
                break;
            }
        }
        BbipPrivateBudgetItem.Budget budget2 = (BbipPrivateBudgetItem.Budget) next3;
        if (budget2 != null) {
            arrayList.add(0, budget2);
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
            BbipPrivateBudgetItem.Budget budget3 = (BbipPrivateBudgetItem.Budget) next4;
            if (budget != null && budget3.f260636b == budget.f260636b) {
                break;
            }
        }
        jVar.Pl(arrayList, (BbipPrivateBudgetItem.Budget) next4, new a(jVar, bbipPrivateBudgetItem, arrayList2), new b(jVar, bbipPrivateBudgetItem, arrayList2));
        if (arrayList.size() == 4) {
            jVar.Rc();
        } else {
            jVar.u7(bbipPrivateBudgetItem.f260631h, bbipPrivateBudgetItem.f260630g, new c(jVar, bbipPrivateBudgetItem, arrayList2, budget));
        }
        BbipPrivateBudgetItem.Budget budget4 = (BbipPrivateBudgetItem.Budget) C42745f0.G(arrayList2);
        String str = budget4 != null ? budget4.f260638d : null;
        if (str == null || str.length() == 0) {
            jVar.e9();
        } else {
            jVar.Bd();
        }
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        BbipPrivateBudgetItem bbipPrivateBudgetItem = (BbipPrivateBudgetItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            O(jVar, bbipPrivateBudgetItem);
            return;
        }
        if (bundle.containsKey("payload_bbip_private_budget_selected") && bundle.containsKey("payload_bbip_private_budget_chosen_id")) {
            V(jVar, bbipPrivateBudgetItem, (BbipPrivateBudgetItem.Budget) bundle.getParcelable("payload_bbip_private_budget_selected"), Integer.valueOf(bundle.getInt("payload_bbip_private_budget_chosen_id")));
            jVar.Rc();
        } else if (bundle.containsKey("payload_bbip_private_budget_selected")) {
            V(jVar, bbipPrivateBudgetItem, (BbipPrivateBudgetItem.Budget) bundle.getParcelable("payload_bbip_private_budget_selected"), bbipPrivateBudgetItem.f260629f);
        }
    }
}
