package com.avito.android.horizontal_list;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.horizontal_list.HorizontalListWidgetListItem;
import com.avito.android.horizontal_list.widget.HorizontalListWidgetListItemNetworkModel;
import com.avito.android.horizontal_list.widget.HorizontalListWidgetNetworkModel;
import com.avito.android.horizontal_list.widget.HorizontalWidgetType;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HorizontalListWidgetConverter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/horizontal_list/a;", "Lcom/avito/android/serp/b;", "Lcom/avito/android/horizontal_list/widget/HorizontalListWidgetNetworkModel;", "Lcom/avito/android/horizontal_list/HorizontalListWidgetItem;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.serp.b<HorizontalListWidgetNetworkModel, HorizontalListWidgetItem> {
    @Override // com.avito.android.serp.b
    @k
    public final Class<? extends HorizontalListWidgetNetworkModel> a() {
        return HorizontalListWidgetNetworkModel.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        HorizontalListWidgetNetworkModel horizontalListWidgetNetworkModel = (HorizontalListWidgetNetworkModel) serpElement;
        HorizontalWidgetType.a aVar = HorizontalWidgetType.f162604c;
        HorizontalWidgetType type = horizontalListWidgetNetworkModel.getType();
        String str3 = type != null ? type.f162607b : null;
        aVar.getClass();
        HorizontalWidgetType horizontalWidgetType = HorizontalWidgetType.RECENT_SEARCH;
        if (!L.f(str3, horizontalWidgetType.f162607b)) {
            horizontalWidgetType = HorizontalWidgetType.NONE;
        }
        HorizontalWidgetType horizontalWidgetType2 = horizontalWidgetType;
        boolean isRedesignAb = horizontalListWidgetNetworkModel.getIsRedesignAb();
        List<HorizontalListWidgetListItemNetworkModel> listC = horizontalListWidgetNetworkModel.c();
        ArrayList arrayList = new ArrayList();
        for (HorizontalListWidgetListItemNetworkModel horizontalListWidgetListItemNetworkModel : listC) {
            String itemTitle = horizontalListWidgetListItemNetworkModel.getItemTitle();
            String description = horizontalListWidgetListItemNetworkModel.getDescription();
            DeepLink deeplink = horizontalListWidgetListItemNetworkModel.getDeeplink();
            com.avito.conveyor_item.a recentSearch = (description == null || deeplink == null || (deeplink instanceof NoMatchLink)) ? null : (horizontalWidgetType2 == HorizontalWidgetType.RECENT_SEARCH && isRedesignAb) ? new HorizontalListWidgetListItem.RecentSearch(i12, itemTitle, description, deeplink, horizontalListWidgetListItemNetworkModel.getFormattedDate(), null, horizontalListWidgetNetworkModel.getAnalytics(), 32, null) : horizontalWidgetType2 == HorizontalWidgetType.NONE ? new HorizontalListWidgetListItem.Default(i12, itemTitle, description, deeplink, null, horizontalListWidgetNetworkModel.getAnalytics(), 16, null) : new HorizontalListWidgetListItem.Default(i12, itemTitle, description, deeplink, null, horizontalListWidgetNetworkModel.getAnalytics(), 16, null);
            if (recentSearch != null) {
                arrayList.add(recentSearch);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new HorizontalListWidgetItem(2, horizontalListWidgetNetworkModel.getTitle(), arrayList, horizontalWidgetType2, horizontalListWidgetNetworkModel.getAnalytics(), horizontalListWidgetNetworkModel.getSettings());
    }
}
