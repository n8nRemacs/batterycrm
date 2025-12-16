package com.avito.android.inline_filters.dialog.location_group;

import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.dialog.location_group.C31013b;
import com.avito.android.inline_filters.dialog.location_group.adapter.GroupFilterItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.WidgetType;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: LocationGroupFilterDialog.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/inline_filters/dialog/location_group/adapter/GroupFilterItem;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/inline_filters/dialog/location_group/adapter/GroupFilterItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class y<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31013b f171846b;

    public y(C31013b c31013b) {
        this.f171846b = c31013b;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InlineFilterValue inlineFilterLocationValue;
        InlineFilterValue inlineFilterValue;
        SearchParams searchParams;
        String str;
        GroupFilterItem groupFilterItem = (GroupFilterItem) obj;
        InlineFilterValue value = groupFilterItem.f171704c.getValue();
        C31013b c31013b = this.f171846b;
        if (value instanceof InlineFilterValue.InlineFilterLocationValue) {
            c31013b.f171786I = true;
        }
        Filter.Widget widget = groupFilterItem.f171704c.getWidget();
        WidgetType type = widget != null ? widget.getType() : null;
        switch (type == null ? -1 : C31013b.a.f171811a[type.ordinal()]) {
            case 1:
                inlineFilterLocationValue = new InlineFilterValue.InlineFilterLocationValue("621540");
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 2:
                inlineFilterLocationValue = new InlineFilterValue.InlineFilterSuggestLocationValue(null, null, 2, null);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 3:
                inlineFilterLocationValue = new InlineFilterValue.InlineFilterMetroValue(C42784z0.f406748b);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 4:
                inlineFilterLocationValue = new InlineFilterValue.InlineFilterDistrictValue(C42784z0.f406748b);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 5:
                inlineFilterLocationValue = new InlineFilterValue.InlineFilterDirectionValue(C42784z0.f406748b);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 6:
                inlineFilterLocationValue = new InlineFilterValue.InlineRadiusValue(null);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 7:
                inlineFilterLocationValue = new InlineFilterValue.InlineFilterAddressesValue(C42784z0.f406748b);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 8:
                inlineFilterLocationValue = new InlineFilterValue.InlineRadiusValue(null);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            case 9:
                inlineFilterLocationValue = new InlineFilterValue.InlineFilterBooleanValue(false);
                inlineFilterValue = inlineFilterLocationValue;
                break;
            default:
                inlineFilterValue = null;
                break;
        }
        if (inlineFilterValue != null) {
            Filter filter = groupFilterItem.f171704c;
            ItemsSearchLink itemsSearchLink = c31013b.f171781D;
            if (itemsSearchLink == null || (searchParams = itemsSearchLink.f133403b) == null) {
                searchParams = c31013b.f171779B;
            }
            SearchParams searchParams2 = searchParams;
            if (itemsSearchLink == null || (str = itemsSearchLink.f133404c) == null) {
                str = c31013b.f171797m;
            }
            c31013b.g(filter, inlineFilterValue, searchParams2, c31013b.f171796l, str);
        }
    }
}
