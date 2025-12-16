package Sq;

import Y61.k;
import com.avito.android.comparison.items.header_item.m;
import com.avito.android.comparison.items.header_item.n;
import com.avito.android.comparison.items.header_item.o;
import com.avito.android.comparison.items.header_item.p;
import com.avito.android.comparison.menu_bottom_sheet.ActionType;
import com.avito.android.comparison.remote.model.ComparisonItem;
import com.avito.android.comparison.remote.model.ComparisonItemStatus;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonHeaderItemFactory.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSq/e;", "LSq/d;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.comparison.e f15157a;

    @Inject
    public e(@k com.avito.android.comparison.e eVar) {
        this.f15157a = eVar;
    }

    @Override // Sq.d
    @k
    public final ArrayList a(@k ComparisonResponse comparisonResponse) {
        m oVar;
        Iterator it;
        n nVar;
        List<ComparisonItem> items = comparisonResponse.getItems();
        ArrayList arrayList = new ArrayList(C42745f0.q(items, 10));
        Iterator it2 = items.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            ComparisonItem comparisonItem = (ComparisonItem) next;
            ComparisonItemStatus status = comparisonItem.getStatus();
            ComparisonItemStatus comparisonItemStatus = ComparisonItemStatus.ACTIVE;
            com.avito.android.comparison.e eVar = this.f15157a;
            String valueFormatted = status == comparisonItemStatus ? comparisonItem.getPrice().getValueFormatted() : eVar.getF123907e();
            long j12 = i12;
            boolean z12 = comparisonItem.getStatus() == comparisonItemStatus;
            String id2 = comparisonItem.getId();
            String title = comparisonItem.getTitle();
            Image image = comparisonItem.getImage();
            DeepLink itemLink = comparisonItem.getItemLink();
            Boolean active = comparisonItem.getCallButton().getActive();
            Boolean bool = Boolean.TRUE;
            if (L.f(active, bool) && comparisonItem.getStatus() == comparisonItemStatus) {
                oVar = new com.avito.android.comparison.items.header_item.a(comparisonItem.getCallButton().getButtonText(), comparisonItem.getCallButton().getLink());
            } else {
                oVar = (L.f(comparisonItem.getMessageButton().getActive(), bool) && comparisonItem.getStatus() == comparisonItemStatus) ? new o(comparisonItem.getMessageButton().getButtonText(), comparisonItem.getMessageButton().getLink()) : new p(eVar.getF123906d(), comparisonItem.getId());
            }
            if (comparisonItem.getStatus() != comparisonItemStatus) {
                it = it2;
                nVar = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (L.f(comparisonItem.getCallButton().getActive(), bool) && L.f(comparisonItem.getMessageButton().getActive(), bool)) {
                    it = it2;
                    arrayList2.add(new com.avito.android.comparison.menu_bottom_sheet.a(comparisonItem.getMessageButton().getModalText(), ActionType.f124090b, comparisonItem.getMessageButton().getLink(), comparisonItem.getId()));
                } else {
                    it = it2;
                }
                arrayList2.add(new com.avito.android.comparison.menu_bottom_sheet.a(eVar.getF123906d(), ActionType.f124091c, comparisonItem.getItemLink(), comparisonItem.getId()));
                nVar = new n(arrayList2);
            }
            arrayList.add(new com.avito.android.comparison.items.header_item.b(j12, z12, id2, title, valueFormatted, image, itemLink, oVar, nVar));
            i12 = i13;
            it2 = it;
        }
        com.avito.android.comparison.items.add_more_item.a aVar = new com.avito.android.comparison.items.add_more_item.a(arrayList.size() + 1, comparisonResponse.getAddItem().getText(), comparisonResponse.getAddItem().getLink(), comparisonResponse.getAddItem().getItemsLimit(), comparisonResponse.getAddItem().getLimitedErrorText());
        ArrayList arrayList3 = new ArrayList(arrayList);
        arrayList3.add(aVar);
        return arrayList3;
    }
}
