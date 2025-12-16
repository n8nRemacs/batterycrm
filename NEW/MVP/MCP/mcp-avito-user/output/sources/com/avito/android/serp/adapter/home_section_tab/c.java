package com.avito.android.serp.adapter.home_section_tab;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.HomeTabItem;
import com.avito.android.remote.model.serp.FeedsTab;
import com.avito.android.remote.model.serp.FeedsWidget;
import com.avito.android.remote.model.serp.TagFiltersItem;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SectionTabsItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/home_section_tab/c;", "Lcom/avito/android/serp/adapter/home_section_tab/b;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {
    @Inject
    public c() {
    }

    @Override // com.avito.android.serp.adapter.home_section_tab.b
    @k
    public final l1 a(@k FeedsWidget feedsWidget) {
        List arrayList;
        FeedsTab feedsTab;
        String feedId = null;
        if (feedsWidget.getQuickFilters() == null) {
            List<FeedsTab> tabs = feedsWidget.getTabs();
            if (tabs != null) {
                List<FeedsTab> list = tabs;
                arrayList = new ArrayList(C42745f0.q(list, 10));
                for (FeedsTab feedsTab2 : list) {
                    arrayList.add(new HomeTabItem(feedsTab2.getFeedId(), feedsTab2.getTitle()));
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = C42784z0.f406748b;
            }
            List<FeedsTab> tabs2 = feedsWidget.getTabs();
            if (tabs2 != null && (feedsTab = (FeedsTab) C42745f0.G(tabs2)) != null) {
                feedId = feedsTab.getFeedId();
            }
            if (feedId == null) {
                feedId = "";
            }
            return new a(arrayList, feedId, feedsWidget.getAnalytics(), feedsWidget.getSettings());
        }
        List<TagFiltersItem> items = feedsWidget.getQuickFilters().getItems();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(items, 10));
        int i12 = 0;
        for (Object obj : items) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            TagFiltersItem tagFiltersItem = (TagFiltersItem) obj;
            String str = tagFiltersItem.getFeedId() + '_' + tagFiltersItem.getFilters();
            String feedId2 = tagFiltersItem.getFeedId();
            String title = tagFiltersItem.getTitle();
            String filters = tagFiltersItem.getFilters();
            String unsetTagId = feedsWidget.getQuickFilters().getUnsetTagId();
            arrayList2.add(new SectionTag(str, feedId2, title, i12 == 0, filters, !L.f(tagFiltersItem.getFeedId(), unsetTagId) ? unsetTagId : null));
            i12 = i13;
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((SectionTag) it.next()).f270145c);
        }
        return new SectionTagsItem(null, 0, arrayList2, arrayList3, feedsWidget.getAnalytics(), feedsWidget.getSettings(), 3, null);
    }
}
