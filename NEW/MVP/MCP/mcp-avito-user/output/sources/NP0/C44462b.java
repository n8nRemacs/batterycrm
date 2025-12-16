package np0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mnz_common.data.MnzFloatingFooter;
import com.avito.android.screens.bbip.ui.items.budget.b;
import com.avito.android.util.InterfaceC35863o4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import jh.C42383d;
import jh.e;
import jh.f;
import jh.i;
import jh.n;
import jh.o;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import op0.C44839a;
import op0.C44840b;
import op0.C44841c;
import op0.g;

/* compiled from: BbipConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnp0/b;", "Lnp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: np0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44462b implements InterfaceC44461a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC35863o4 f419159a;

    @Inject
    public C44462b(@k InterfaceC35863o4 interfaceC35863o4) {
        this.f419159a = interfaceC35863o4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // np0.InterfaceC44461a
    @k
    public final g a(@k i iVar, @k C44840b c44840b) {
        Object next;
        Object[] objArr;
        Object[] objArr2;
        int i12 = 2;
        List<e> listA = iVar.getBudgetSection().a();
        Iterator<T> it = listA.iterator();
        while (true) {
            objArr2 = 0;
            objArr = 0;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((e) next).getRecommended()) {
                break;
            }
        }
        e eVar = (e) next;
        if (eVar == null) {
            eVar = (e) C42745f0.E(listA);
        }
        c44840b.f420194c.f420188a = eVar.getPrice();
        c44840b.f420194c.f420189b = eVar.getBudget();
        c44840b.f420194c.f420190c = eVar.getDiscountPct();
        C44841c c44841c = c44840b.f420195d;
        jh.k durationsSection = iVar.getDurationsSection();
        c44841c.f420196a = durationsSection != null ? Integer.valueOf(durationsSection.getPreselected()) : iVar.getCurrentDuration();
        c44840b.f420193b = iVar.getCheckoutContext();
        InterfaceC35863o4 interfaceC35863o4 = this.f419159a;
        com.avito.android.screens.bbip.ui.items.title.a aVar = new com.avito.android.screens.bbip.ui.items.title.a(interfaceC35863o4.a(), iVar.getTitle(), iVar.getSubTitle());
        o forecastSection = iVar.getForecastSection();
        com.avito.android.screens.bbip.ui.items.forecast.a aVar2 = new com.avito.android.screens.bbip.ui.items.forecast.a(interfaceC35863o4.a(), forecastSection.getForecastBlock().getTitle(), forecastSection.getForecastBlock().getValue(), forecastSection.getTotalBudgetBlock().getTitle(), forecastSection.getTotalBudgetBlock().getTotalPriceFormatted(), forecastSection.getTotalBudgetBlock().getTotalBudgetFormatted());
        f budgetSection = iVar.getBudgetSection();
        String strA = interfaceC35863o4.a();
        String title = budgetSection.getTitle();
        List<e> listA2 = budgetSection.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA2, 10));
        for (e eVar2 : listA2) {
            arrayList.add(new b.a(eVar2.getPriceFormatted(), eVar2.getBudgetFormatted(), eVar2.getDiscountPct(), eVar2.getPrice(), eVar2.getRecommended(), eVar2.getRecommended(), eVar2.getBudget()));
        }
        com.avito.android.screens.bbip.ui.items.budget.b bVar = new com.avito.android.screens.bbip.ui.items.budget.b(strA, title, arrayList);
        jh.k durationsSection2 = iVar.getDurationsSection();
        ArrayList arrayListB = C42756l.B(new com.avito.conveyor_item.a[]{aVar, aVar2, bVar, durationsSection2 != null ? new com.avito.android.screens.bbip.ui.items.duration.b(interfaceC35863o4.a(), durationsSection2.getTitle(), durationsSection2.getMin(), durationsSection2.getMax(), durationsSection2.e(), durationsSection2.e(), durationsSection2.getPreselected(), durationsSection2.getPreselected(), durationsSection2.getMoreButtonLabel()) : null});
        String title2 = iVar.getActions().getHelpBbipAction().getTitle();
        g.a aVar3 = new g.a(iVar.getActions().getHelpBbipAction().getUri(), title2 != null ? com.avito.android.printable_text.b.f(title2) : com.avito.android.printable_text.b.c(R.string.bbip_help_button, new Serializable[0]));
        String title3 = iVar.getActions().getNextBbipAction().getTitle();
        g.a aVar4 = new g.a(title3 != null ? com.avito.android.printable_text.b.f(title3) : null, objArr == true ? 1 : 0, i12, objArr2 == true ? 1 : 0);
        String title4 = iVar.getActions().getSkipBbipAction().getTitle();
        g.a aVar5 = new g.a(iVar.getActions().getSkipBbipAction().getUri(), title4 != null ? com.avito.android.printable_text.b.f(title4) : null);
        MnzFloatingFooter bblFooter = iVar.getBblFooter();
        C42383d bblUxFeedback = iVar.getBblUxFeedback();
        String successCampaign = bblUxFeedback != null ? bblUxFeedback.getSuccessCampaign() : null;
        C42383d bblUxFeedback2 = iVar.getBblUxFeedback();
        String rejectCampaign = bblUxFeedback2 != null ? bblUxFeedback2.getRejectCampaign() : null;
        g gVar = new g();
        gVar.f420209a = arrayListB;
        gVar.f420210b = aVar3;
        gVar.f420211c = aVar4;
        gVar.f420212d = aVar5;
        gVar.f420213e = c44840b;
        gVar.f420214f = bblFooter;
        gVar.f420215g = successCampaign;
        gVar.f420216h = rejectCampaign;
        return gVar;
    }

    @Override // np0.InterfaceC44461a
    @k
    public final C44841c b(int i12, @k List list) {
        Object next;
        List<Integer> list2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof com.avito.android.screens.bbip.ui.items.duration.b) {
                break;
            }
        }
        com.avito.android.screens.bbip.ui.items.duration.b bVar = (com.avito.android.screens.bbip.ui.items.duration.b) (next instanceof com.avito.android.screens.bbip.ui.items.duration.b ? next : null);
        Integer numValueOf = Integer.valueOf(i12);
        boolean z12 = false;
        boolean zContains = (bVar == null || (list2 = bVar.f260344f) == null) ? false : list2.contains(Integer.valueOf(i12));
        if (bVar != null && bVar.f260346h == i12) {
            z12 = true;
        }
        return new C44841c(numValueOf, zContains, z12);
    }

    @Override // np0.InterfaceC44461a
    @k
    public final LinkedHashMap c(@k C44840b c44840b) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("itemId", c44840b.f420192a);
        linkedHashMap.put("checkoutContext", c44840b.f420193b);
        linkedHashMap.put("budget[price]", String.valueOf(c44840b.f420194c.f420188a));
        Integer num = c44840b.f420194c.f420189b;
        if (num != null) {
            linkedHashMap.put("budget[budget]", String.valueOf(num.intValue()));
        }
        Integer num2 = c44840b.f420194c.f420190c;
        if (num2 != null) {
            linkedHashMap.put("budget[discountPct]", String.valueOf(num2.intValue()));
        }
        linkedHashMap.put("budget[recommended]", String.valueOf(c44840b.f420194c.f420191d));
        linkedHashMap.put("duration[value]", String.valueOf(c44840b.f420195d.f420196a));
        linkedHashMap.put("duration[recommended]", String.valueOf(c44840b.f420195d.f420197b));
        linkedHashMap.put("duration[preselected]", String.valueOf(c44840b.f420195d.f420198c));
        return linkedHashMap;
    }

    @Override // np0.InterfaceC44461a
    @k
    public final ArrayList d(@k List list, @k n nVar) {
        ArrayList arrayList = new ArrayList(list);
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (aVar instanceof com.avito.android.screens.bbip.ui.items.forecast.a) {
                com.avito.android.screens.bbip.ui.items.forecast.a aVar2 = (com.avito.android.screens.bbip.ui.items.forecast.a) aVar;
                arrayList.set(i12, new com.avito.android.screens.bbip.ui.items.forecast.a(aVar2.f260373b, aVar2.f260374c, nVar.getValue(), aVar2.f260376e, nVar.getTotalPrice(), nVar.getTotalBudget()));
            }
            i12 = i13;
        }
        return arrayList;
    }

    @Override // np0.InterfaceC44461a
    @k
    public final C44839a e(@k b.a aVar) {
        return new C44839a(aVar.f260310d, aVar.f260313g, aVar.f260309c, aVar.f260311e);
    }
}
