package com.avito.android.favorite_comparison.presentation.items.comparison_list_item;

import Y61.k;
import com.avito.android.comparison.remote.model.ComparisonCategoryItem;
import com.avito.android.comparison.remote.model.ComparisonListResponse;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonListItemFactory.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/e;", "Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/d;", "<init>", "()V", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {
    @Inject
    public e() {
    }

    @Override // com.avito.android.favorite_comparison.presentation.items.comparison_list_item.d
    @k
    public final List<a> a(@k ComparisonListResponse comparisonListResponse) throws NumberFormatException {
        List<ComparisonCategoryItem> listC = comparisonListResponse.c();
        if (listC == null) {
            return C42784z0.f406748b;
        }
        List<ComparisonCategoryItem> list = listC;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (ComparisonCategoryItem comparisonCategoryItem : list) {
            arrayList.add(new a(Long.parseLong(comparisonCategoryItem.getId()), comparisonCategoryItem.getImages(), comparisonCategoryItem.getLink(), comparisonCategoryItem.getTitle(), comparisonCategoryItem.getSubtitle()));
        }
        return arrayList;
    }
}
