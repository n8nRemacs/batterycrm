package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
import hh.InterfaceC40937e;
import hh.InterfaceC40938f;
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

/* compiled from: BbipPrivateBudgetWidgetItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/h;", "Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<BbipPrivateBudgetWidgetItem.Budget, G0> f260779b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f260780c;

    /* compiled from: BbipPrivateBudgetWidgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$Budget;", "budget", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$Budget;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<BbipPrivateBudgetWidgetItem.Budget, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k f260782m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetWidgetItem f260783n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f260784o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem, List<BbipPrivateBudgetWidgetItem.Budget> list) {
            super(1);
            this.f260782m = kVar;
            this.f260783n = bbipPrivateBudgetWidgetItem;
            this.f260784o = list;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(BbipPrivateBudgetWidgetItem.Budget budget) {
            BbipPrivateBudgetWidgetItem.Budget budget2 = budget;
            boolean z12 = budget2.f260753p;
            h hVar = h.this;
            if (z12) {
                h.k(hVar, this.f260782m, this.f260783n, this.f260784o, budget2);
            }
            hVar.f260779b.invoke(budget2);
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateBudgetWidgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$Budget;", "budget", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$Budget;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<BbipPrivateBudgetWidgetItem.Budget, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k f260786m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetWidgetItem f260787n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f260788o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem, List<BbipPrivateBudgetWidgetItem.Budget> list) {
            super(1);
            this.f260786m = kVar;
            this.f260787n = bbipPrivateBudgetWidgetItem;
            this.f260788o = list;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(BbipPrivateBudgetWidgetItem.Budget budget) {
            BbipPrivateBudgetWidgetItem.Budget budget2 = budget;
            if (budget2.f260753p) {
                h.k(h.this, this.f260786m, this.f260787n, this.f260788o, budget2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BbipPrivateBudgetWidgetItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k f260790m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetWidgetItem f260791n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f260792o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ BbipPrivateBudgetWidgetItem.Budget f260793p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar, BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem, List<BbipPrivateBudgetWidgetItem.Budget> list, BbipPrivateBudgetWidgetItem.Budget budget) {
            super(0);
            this.f260790m = kVar;
            this.f260791n = bbipPrivateBudgetWidgetItem;
            this.f260792o = list;
            this.f260793p = budget;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // Y41.a
        public final G0 invoke() {
            h.k(h.this, this.f260790m, this.f260791n, this.f260792o, this.f260793p);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public h(@InterfaceC40937e @Y61.k Y41.l<? super BbipPrivateBudgetWidgetItem.Budget, G0> lVar, @InterfaceC40938f @Y61.k Y41.l<? super DeepLink, G0> lVar2) {
        this.f260779b = lVar;
        this.f260780c = lVar2;
    }

    public static final void k(h hVar, k kVar, BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem, List list, BbipPrivateBudgetWidgetItem.Budget budget) {
        hVar.getClass();
        String str = bbipPrivateBudgetWidgetItem.f260737l;
        Integer numValueOf = budget != null ? Integer.valueOf(budget.f260739b) : null;
        List<BbipPrivateBudgetWidgetItem.Budget> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (BbipPrivateBudgetWidgetItem.Budget budget2 : list2) {
            int i12 = budget2.f260739b;
            arrayList.add(new o(i12, budget2.f260741d, budget2.f260743f, budget2.f260750m, budget2.f260751n, numValueOf != null && i12 == numValueOf.intValue()));
        }
        kVar.jZ(bbipPrivateBudgetWidgetItem.f260729d, new g(list, hVar), str, bbipPrivateBudgetWidgetItem.f260736k, arrayList);
    }

    public final void O(@Y61.k k kVar, @Y61.k BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem) {
        List<BbipPrivateBudgetWidgetItem.Budget> list;
        BbipPrivateBudgetWidgetItem.Budget budget;
        BbipPrivateBudgetWidgetItem.a aVar = (BbipPrivateBudgetWidgetItem.a) C42745f0.G(bbipPrivateBudgetWidgetItem.f260738m);
        boolean z12 = ((aVar == null || (list = aVar.f260756b) == null || (budget = (BbipPrivateBudgetWidgetItem.Budget) C42745f0.G(list)) == null) ? null : budget.f260745h) != null;
        kVar.mk(bbipPrivateBudgetWidgetItem.f260727b, new f(this, bbipPrivateBudgetWidgetItem));
        kVar.jd(z12);
        V(kVar, bbipPrivateBudgetWidgetItem, bbipPrivateBudgetWidgetItem.f260730e, bbipPrivateBudgetWidgetItem.f260732g);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((k) eVar, (BbipPrivateBudgetWidgetItem) aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public final void V(k kVar, BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem, BbipPrivateBudgetWidgetItem.Budget budget, Integer num) {
        Object next;
        ArrayList arrayList;
        Object next2;
        Iterable arrayList2;
        Object next3;
        Object next4;
        List<BbipPrivateBudgetWidgetItem.Budget> list;
        List<BbipPrivateBudgetWidgetItem.Budget> list2;
        int i12 = bbipPrivateBudgetWidgetItem.f260729d;
        List<BbipPrivateBudgetWidgetItem.a> list3 = bbipPrivateBudgetWidgetItem.f260738m;
        Iterator it = list3.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((BbipPrivateBudgetWidgetItem.a) next).f260755a == i12) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        BbipPrivateBudgetWidgetItem.a aVar = (BbipPrivateBudgetWidgetItem.a) next;
        if (aVar == null || (list2 = aVar.f260756b) == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list2) {
                if (!((BbipPrivateBudgetWidgetItem.Budget) obj).f260753p) {
                    arrayList3.add(obj);
                }
            }
            arrayList = new ArrayList(arrayList3);
        }
        Iterator it2 = list3.iterator();
        while (true) {
            if (it2.hasNext()) {
                next2 = it2.next();
                if (((BbipPrivateBudgetWidgetItem.a) next2).f260755a == i12) {
                    break;
                }
            } else {
                next2 = null;
                break;
            }
        }
        BbipPrivateBudgetWidgetItem.a aVar2 = (BbipPrivateBudgetWidgetItem.a) next2;
        if (aVar2 == null || (list = aVar2.f260756b) == null) {
            arrayList2 = C42784z0.f406748b;
        } else {
            arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((BbipPrivateBudgetWidgetItem.Budget) obj2).f260753p) {
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
            int i13 = ((BbipPrivateBudgetWidgetItem.Budget) next3).f260739b;
            if (num != null && i13 == num.intValue()) {
                break;
            }
        }
        BbipPrivateBudgetWidgetItem.Budget budget2 = (BbipPrivateBudgetWidgetItem.Budget) next3;
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
            BbipPrivateBudgetWidgetItem.Budget budget3 = (BbipPrivateBudgetWidgetItem.Budget) next4;
            if (budget != null && budget3.f260739b == budget.f260739b) {
                break;
            }
        }
        kVar.Sz(arrayList, (BbipPrivateBudgetWidgetItem.Budget) next4, new a(kVar, bbipPrivateBudgetWidgetItem, arrayList2), new b(kVar, bbipPrivateBudgetWidgetItem, arrayList2));
        if (arrayList.size() == 4) {
            kVar.Rc();
        } else {
            kVar.u7(bbipPrivateBudgetWidgetItem.f260734i, bbipPrivateBudgetWidgetItem.f260733h, new c(kVar, bbipPrivateBudgetWidgetItem, arrayList2, budget));
        }
        BbipPrivateBudgetWidgetItem.Budget budget4 = (BbipPrivateBudgetWidgetItem.Budget) C42745f0.G(arrayList2);
        String str = budget4 != null ? budget4.f260741d : null;
        if (str == null || str.length() == 0) {
            kVar.e9();
        } else {
            kVar.Bd();
        }
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem = (BbipPrivateBudgetWidgetItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            O(kVar, bbipPrivateBudgetWidgetItem);
            return;
        }
        if (bundle.containsKey("payload_bbip_private_budget_selected") && bundle.containsKey("payload_bbip_private_budget_chosen_id")) {
            V(kVar, bbipPrivateBudgetWidgetItem, (BbipPrivateBudgetWidgetItem.Budget) bundle.getParcelable("payload_bbip_private_budget_selected"), Integer.valueOf(bundle.getInt("payload_bbip_private_budget_chosen_id")));
            kVar.Rc();
        } else if (bundle.containsKey("payload_bbip_private_budget_selected")) {
            V(kVar, bbipPrivateBudgetWidgetItem, (BbipPrivateBudgetWidgetItem.Budget) bundle.getParcelable("payload_bbip_private_budget_selected"), bbipPrivateBudgetWidgetItem.f260732g);
        }
    }
}
