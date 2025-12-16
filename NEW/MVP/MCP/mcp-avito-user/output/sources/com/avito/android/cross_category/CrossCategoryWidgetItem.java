package com.avito.android.cross_category;

import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.PersistableSerpItem;
import kotlin.Metadata;

/* compiled from: CrossCategoryWidgetItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cross_category/CrossCategoryWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_bx-content_widget_cross-category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CrossCategoryWidgetItem extends PersistableSerpItem {

    /* compiled from: CrossCategoryWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    /* renamed from: getAction */
    Action getF131046e();

    @Y61.l
    /* renamed from: getAnalyticParams */
    AnalyticParams getF131048g();

    @Y61.l
    /* renamed from: getAnalytics */
    Analytics getF131049h();

    @Y61.l
    /* renamed from: getImage */
    Image getF131047f();

    @Y61.l
    /* renamed from: getQuery */
    String getF131045d();

    @Y61.l
    /* renamed from: getTitle */
    String getF131044c();
}
