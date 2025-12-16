package com.avito.android.screens.bbip_v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jh.n;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import up0.InterfaceC49091c;
import vp0.C49366c;

/* compiled from: BbipV2Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lvp0/c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements u<BbipV2InternalAction, C49366c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49091c f261563b;

    @Inject
    public l(@Y61.k InterfaceC49091c interfaceC49091c) {
        this.f261563b = interfaceC49091c;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C49366c a(BbipV2InternalAction bbipV2InternalAction, C49366c c49366c) {
        Object next;
        b.a aVar;
        Object next2;
        b.a aVar2;
        List<b.a> list;
        Object obj;
        List<b.a> list2;
        Object next3;
        BbipV2InternalAction bbipV2InternalAction2 = bbipV2InternalAction;
        C49366c c49366c2 = c49366c;
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ConfiguratorLoading) {
            return C49366c.a(c49366c2, null, null, null, null, null, null, null, null, true, false, false, 1663);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ConfiguratorContent) {
            jh.j jVar = ((BbipV2InternalAction.ConfiguratorContent) bbipV2InternalAction2).f261532b;
            ArrayList arrayListC = this.f261563b.c(jVar);
            Iterator it = arrayListC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next instanceof com.avito.android.screens.bbip_v2.ui.items.budget.b) {
                    break;
                }
            }
            if (!(next instanceof com.avito.android.screens.bbip_v2.ui.items.budget.b)) {
                next = null;
            }
            com.avito.android.screens.bbip_v2.ui.items.budget.b bVar = (com.avito.android.screens.bbip_v2.ui.items.budget.b) next;
            if (bVar == null || (list2 = bVar.f261572d) == null) {
                aVar = null;
            } else {
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                    if (((b.a) next3).f261577e) {
                        break;
                    }
                }
                aVar = (b.a) next3;
            }
            Iterator it3 = arrayListC.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
                if (next2 instanceof com.avito.android.screens.bbip_v2.ui.items.duration.b) {
                    break;
                }
            }
            if (!(next2 instanceof com.avito.android.screens.bbip_v2.ui.items.duration.b)) {
                next2 = null;
            }
            com.avito.android.screens.bbip_v2.ui.items.duration.b bVar2 = (com.avito.android.screens.bbip_v2.ui.items.duration.b) next2;
            if (bVar2 == null || (list = bVar2.f261614c) == null) {
                aVar2 = null;
            } else {
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next4 = it4.next();
                    if (((b.a) next4).f261623e) {
                        obj = next4;
                        break;
                    }
                }
                aVar2 = (b.a) obj;
            }
            return C49366c.a(c49366c2, jVar.getNavBar(), arrayListC, jVar.getActions().getSkipAction(), jVar.getActions().getNextAction(), jVar.getCheckoutContext(), aVar, aVar2, null, false, false, false, 1536);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ConfiguratorError) {
            return C49366c.a(c49366c2, null, null, null, null, null, null, null, ((BbipV2InternalAction.ConfiguratorError) bbipV2InternalAction2).f261534b, false, false, false, 1663);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ForecastLoading) {
            return C49366c.a(c49366c2, null, null, null, null, null, null, null, null, false, true, false, 1535);
        }
        boolean z12 = bbipV2InternalAction2 instanceof BbipV2InternalAction.ForecastContent;
        List<com.avito.conveyor_item.a> list3 = c49366c2.f440988c;
        int i12 = 10;
        if (z12) {
            List<com.avito.conveyor_item.a> list4 = list3;
            ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
            for (com.avito.conveyor_item.a aVar3 : list4) {
                if (aVar3 instanceof com.avito.android.screens.bbip_v2.ui.items.forecast.a) {
                    com.avito.android.screens.bbip_v2.ui.items.forecast.a aVar4 = (com.avito.android.screens.bbip_v2.ui.items.forecast.a) aVar3;
                    n nVar = ((BbipV2InternalAction.ForecastContent) bbipV2InternalAction2).f261542b;
                    aVar3 = new com.avito.android.screens.bbip_v2.ui.items.forecast.a(aVar4.f261657b, aVar4.f261658c, nVar.getValue(), aVar4.f261660e, nVar.getTotalPrice(), nVar.getTotalBudget());
                }
                arrayList.add(aVar3);
            }
            return C49366c.a(c49366c2, null, arrayList, null, null, null, null, null, null, false, false, false, 1533);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ForecastError) {
            return C49366c.a(c49366c2, null, null, null, null, null, null, null, null, false, false, false, 1535);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ContextLoading) {
            return C49366c.a(c49366c2, null, null, null, null, null, null, null, null, false, false, true, 1023);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ContextContent) {
            return C49366c.a(c49366c2, null, null, null, null, null, null, null, null, false, false, false, 1023);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ContextError) {
            return C49366c.a(c49366c2, null, null, null, null, null, null, null, null, false, false, false, 1023);
        }
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.BudgetClicked) {
            List<com.avito.conveyor_item.a> list5 = list3;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(list5, 10));
            for (TV0.a aVarA : list5) {
                if (aVarA instanceof com.avito.android.screens.bbip_v2.ui.items.budget.b) {
                    com.avito.android.screens.bbip_v2.ui.items.budget.b bVar3 = (com.avito.android.screens.bbip_v2.ui.items.budget.b) aVarA;
                    List<b.a> list6 = bVar3.f261572d;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list6, i12));
                    for (b.a aVar5 : list6) {
                        int i13 = aVar5.f261576d;
                        arrayList3.add(new b.a(aVar5.f261573a, aVar5.f261574b, aVar5.f261575c, i13, aVar5.f261577e, i13 == ((BbipV2InternalAction.BudgetClicked) bbipV2InternalAction2).f261530b.f261576d, aVar5.f261579g, aVar5.f261580h));
                    }
                    aVarA = com.avito.android.screens.bbip_v2.ui.items.budget.b.a(bVar3, false, arrayList3, 7);
                } else if (aVarA instanceof com.avito.android.screens.bbip_v2.ui.items.duration.b) {
                    aVarA = com.avito.android.screens.bbip_v2.ui.items.duration.b.a((com.avito.android.screens.bbip_v2.ui.items.duration.b) aVarA, null, ((BbipV2InternalAction.BudgetClicked) bbipV2InternalAction2).f261530b.f261580h != null, 63);
                }
                arrayList2.add(aVarA);
                i12 = 10;
            }
            return C49366c.a(c49366c2, null, arrayList2, null, null, null, ((BbipV2InternalAction.BudgetClicked) bbipV2InternalAction2).f261530b, null, null, false, false, false, 2013);
        }
        if (!(bbipV2InternalAction2 instanceof BbipV2InternalAction.DurationClicked)) {
            return c49366c2;
        }
        List<com.avito.conveyor_item.a> list7 = list3;
        ArrayList arrayList4 = new ArrayList(C42745f0.q(list7, 10));
        for (TV0.a aVarA2 : list7) {
            if (aVarA2 instanceof com.avito.android.screens.bbip_v2.ui.items.duration.b) {
                com.avito.android.screens.bbip_v2.ui.items.duration.b bVar4 = (com.avito.android.screens.bbip_v2.ui.items.duration.b) aVarA2;
                List<b.a> list8 = bVar4.f261614c;
                ArrayList arrayList5 = new ArrayList(C42745f0.q(list8, 10));
                for (b.a aVar6 : list8) {
                    arrayList5.add(aVar6.f261619a == ((BbipV2InternalAction.DurationClicked) bbipV2InternalAction2).f261541b.f261619a ? b.a.a(aVar6, true, 91) : b.a.a(aVar6, false, 123));
                }
                aVarA2 = com.avito.android.screens.bbip_v2.ui.items.duration.b.a(bVar4, arrayList5, false, 123);
            } else {
                if (aVarA2 instanceof com.avito.android.screens.bbip_v2.ui.items.budget.b) {
                    aVarA2 = com.avito.android.screens.bbip_v2.ui.items.budget.b.a((com.avito.android.screens.bbip_v2.ui.items.budget.b) aVarA2, ((BbipV2InternalAction.DurationClicked) bbipV2InternalAction2).f261541b.f261625g != null, null, 11);
                }
                arrayList4.add(aVarA2);
            }
            arrayList4.add(aVarA2);
        }
        return C49366c.a(c49366c2, null, arrayList4, null, null, null, null, ((BbipV2InternalAction.DurationClicked) bbipV2InternalAction2).f261541b, null, false, false, false, 1981);
    }
}
