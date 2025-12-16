package qp0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
import com.avito.android.util.A4;
import com.google.gson.Gson;
import hh.InterfaceC40935c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qp0.C47426a;
import qp0.b;

/* compiled from: BbipPrivateMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqp0/d;", "Lqp0/c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f429367a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Gson f429368b;

    /* compiled from: BbipPrivateMapper.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001¨\u0006\u0005"}, d2 = {"qp0/d$a", "Lcom/google/gson/reflect/a;", "", "", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<Map<String, ? extends Object>> {
    }

    @Inject
    public d(@InterfaceC40935c @k String str, @k Gson gson) {
        this.f429367a = str;
        this.f429368b = gson;
    }

    @Override // qp0.c
    @k
    public final Map<String, String> a(@k Object obj) {
        Gson gson = this.f429368b;
        return A4.j(A4.f318516a, (Map) gson.e(gson.l(obj), new a().getType()));
    }

    @Override // qp0.c
    @k
    public final b b(@l String str, @k List<? extends com.avito.conveyor_item.a> list) {
        Integer numValueOf;
        Object next;
        Object next2;
        Object next3;
        BbipPrivateBudgetItem.a aVar;
        List arrayList;
        List<BbipPrivateBudgetItem.Budget> list2;
        BbipPrivateBudgetItem.Budget budget;
        List<BbipPrivateBudgetItem.a> list3;
        Object next4;
        Object next5;
        List<BbipPrivateBudgetWidgetItem.Budget> list4;
        List<Integer> list5;
        List<? extends com.avito.conveyor_item.a> list6 = list;
        Iterator<T> it = list6.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.screens.bbip_private.ui.items.duration.b) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.screens.bbip_private.ui.items.duration.b)) {
            next = null;
        }
        com.avito.android.screens.bbip_private.ui.items.duration.b bVar = (com.avito.android.screens.bbip_private.ui.items.duration.b) next;
        Integer numValueOf2 = bVar != null ? Integer.valueOf(bVar.f260837h) : null;
        boolean z12 = false;
        if (bVar != null && (list5 = bVar.f260834e) != null && !C42745f0.r(list5, numValueOf2)) {
            z12 = true;
        }
        boolean z13 = z12;
        Iterator<T> it2 = list6.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (next2 instanceof BbipPrivateBudgetWidgetItem) {
                break;
            }
        }
        if (!(next2 instanceof BbipPrivateBudgetWidgetItem)) {
            next2 = null;
        }
        BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem = (BbipPrivateBudgetWidgetItem) next2;
        if (bbipPrivateBudgetWidgetItem != null) {
            Iterator<T> it3 = bbipPrivateBudgetWidgetItem.f260738m.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it3.next();
                int i12 = ((BbipPrivateBudgetWidgetItem.a) next5).f260755a;
                if (numValueOf2 != null && i12 == numValueOf2.intValue()) {
                    break;
                }
            }
            BbipPrivateBudgetWidgetItem.a aVar2 = (BbipPrivateBudgetWidgetItem.a) next5;
            BbipPrivateBudgetWidgetItem.Budget budget2 = bbipPrivateBudgetWidgetItem.f260730e;
            numValueOf = budget2 != null ? Integer.valueOf(budget2.f260739b) : null;
            if (aVar2 == null || (list4 = aVar2.f260756b) == null) {
                arrayList = C42784z0.f406748b;
            } else {
                List<BbipPrivateBudgetWidgetItem.Budget> list7 = list4;
                arrayList = new ArrayList(C42745f0.q(list7, 10));
                for (BbipPrivateBudgetWidgetItem.Budget budget3 : list7) {
                    int i13 = budget3.f260739b;
                    Long l12 = budget3.f260747j;
                    if (l12 == null) {
                        l12 = budget3.f260746i;
                    }
                    arrayList.add(new b.a(i13, l12));
                }
            }
        } else {
            Iterator<T> it4 = list6.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
                if (next3 instanceof BbipPrivateBudgetItem) {
                    break;
                }
            }
            if (!(next3 instanceof BbipPrivateBudgetItem)) {
                next3 = null;
            }
            BbipPrivateBudgetItem bbipPrivateBudgetItem = (BbipPrivateBudgetItem) next3;
            if (bbipPrivateBudgetItem == null || (list3 = bbipPrivateBudgetItem.f260635l) == null) {
                aVar = null;
            } else {
                Iterator<T> it5 = list3.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it5.next();
                    int i14 = ((BbipPrivateBudgetItem.a) next4).f260651a;
                    if (numValueOf2 != null && i14 == numValueOf2.intValue()) {
                        break;
                    }
                }
                aVar = (BbipPrivateBudgetItem.a) next4;
            }
            if (bbipPrivateBudgetItem != null && (budget = bbipPrivateBudgetItem.f260627d) != null) {
                numValueOf = Integer.valueOf(budget.f260636b);
            }
            if (aVar == null || (list2 = aVar.f260652b) == null) {
                arrayList = C42784z0.f406748b;
            } else {
                List<BbipPrivateBudgetItem.Budget> list8 = list2;
                arrayList = new ArrayList(C42745f0.q(list8, 10));
                for (BbipPrivateBudgetItem.Budget budget4 : list8) {
                    int i15 = budget4.f260636b;
                    Long l13 = budget4.f260644j;
                    if (l13 == null) {
                        l13 = budget4.f260643i;
                    }
                    arrayList.add(new b.a(i15, l13));
                }
            }
        }
        return new b(this.f429367a, str, numValueOf, numValueOf2, z13, arrayList);
    }

    @Override // qp0.c
    @k
    public final C47426a c(@l String str, @k List<? extends com.avito.conveyor_item.a> list) {
        Object next;
        Object next2;
        Object next3;
        C47426a.d dVar;
        C47426a.b bVar;
        List<Integer> list2;
        List<? extends com.avito.conveyor_item.a> list3 = list;
        Iterator<T> it = list3.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.screens.bbip_private.ui.items.duration.b) {
                break;
            }
        }
        if (!(next instanceof com.avito.android.screens.bbip_private.ui.items.duration.b)) {
            next = null;
        }
        com.avito.android.screens.bbip_private.ui.items.duration.b bVar2 = (com.avito.android.screens.bbip_private.ui.items.duration.b) next;
        Integer numValueOf = bVar2 != null ? Integer.valueOf(bVar2.f260837h) : null;
        boolean zR2 = (bVar2 == null || (list2 = bVar2.f260834e) == null) ? false : C42745f0.r(list2, numValueOf);
        boolean zF2 = L.f(bVar2 != null ? Integer.valueOf(bVar2.f260836g) : null, numValueOf);
        Iterator<T> it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (next2 instanceof BbipPrivateBudgetWidgetItem) {
                break;
            }
        }
        if (!(next2 instanceof BbipPrivateBudgetWidgetItem)) {
            next2 = null;
        }
        BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem = (BbipPrivateBudgetWidgetItem) next2;
        if (bbipPrivateBudgetWidgetItem != null) {
            BbipPrivateBudgetWidgetItem.Budget budget = bbipPrivateBudgetWidgetItem.f260730e;
            Integer numValueOf2 = budget != null ? Integer.valueOf(budget.f260739b) : null;
            Long l12 = budget != null ? budget.f260740c : null;
            BbipPrivateBudgetWidgetItem.Budget budget2 = bbipPrivateBudgetWidgetItem.f260731f;
            dVar = new C47426a.d(new C47426a.C12336a(numValueOf2, l12, budget2 != null ? Integer.valueOf(budget2.f260739b) : null, budget2 != null ? budget2.f260740c : null));
            bVar = new C47426a.b(budget != null ? budget.f260746i : null, budget != null ? budget.f260747j : null, budget != null ? budget.f260744g : null, L.f(budget != null ? Integer.valueOf(budget.f260739b) : null, budget2 != null ? Integer.valueOf(budget2.f260739b) : null));
        } else {
            Iterator<T> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                if (next3 instanceof BbipPrivateBudgetItem) {
                    break;
                }
            }
            if (!(next3 instanceof BbipPrivateBudgetItem)) {
                next3 = null;
            }
            BbipPrivateBudgetItem bbipPrivateBudgetItem = (BbipPrivateBudgetItem) next3;
            BbipPrivateBudgetItem.Budget budget3 = bbipPrivateBudgetItem != null ? bbipPrivateBudgetItem.f260627d : null;
            BbipPrivateBudgetItem.Budget budget4 = bbipPrivateBudgetItem != null ? bbipPrivateBudgetItem.f260628e : null;
            dVar = new C47426a.d(new C47426a.C12336a(budget3 != null ? Integer.valueOf(budget3.f260636b) : null, budget3 != null ? budget3.f260637c : null, budget4 != null ? Integer.valueOf(budget4.f260636b) : null, budget4 != null ? budget4.f260637c : null));
            bVar = new C47426a.b(budget3 != null ? budget3.f260643i : null, budget3 != null ? budget3.f260644j : null, budget3 != null ? budget3.f260641g : null, L.f(budget3 != null ? Integer.valueOf(budget3.f260636b) : null, budget4 != null ? Integer.valueOf(budget4.f260636b) : null));
        }
        return new C47426a(this.f429367a, str, dVar, bVar, new C47426a.c(numValueOf, zR2, zF2), null, 32, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027b  */
    @Override // qp0.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(@Y61.k jh.v r38, @Y61.l jh.w r39) {
        /*
            Method dump skipped, instructions count: 1358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp0.d.d(jh.v, jh.w):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // qp0.c
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qp0.b e(@Y61.k jh.v r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qp0.d.e(jh.v):qp0.b");
    }
}
