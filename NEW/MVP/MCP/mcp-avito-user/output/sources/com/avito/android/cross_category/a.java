package com.avito.android.cross_category;

import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CrossCategoryWidgetConverter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/cross_category/a;", "Lcom/avito/android/serp/b;", "Lcom/avito/android/cross_category/CrossCategoryWidget;", "Lcom/avito/android/cross_category/CrossCategoryWidgetItem;", "<init>", "()V", "_avito_bx-content_widget_cross-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.serp.b<CrossCategoryWidget, CrossCategoryWidgetItem> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.serp.b
    @Y61.k
    public final Class<CrossCategoryWidget> a() {
        return CrossCategoryWidget.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        if (!(serpElement instanceof CrossCategoryWidget)) {
            return null;
        }
        CrossCategoryWidget crossCategoryWidget = (CrossCategoryWidget) serpElement;
        if (crossCategoryWidget.getTitle() == null || crossCategoryWidget.getQuery() == null || crossCategoryWidget.getAction() == null) {
            return null;
        }
        return new CrossCategoryWidgetItemImpl(UUID.randomUUID().toString(), crossCategoryWidget.getTitle(), crossCategoryWidget.getQuery(), crossCategoryWidget.getAction(), crossCategoryWidget.getImage(), crossCategoryWidget.getAnalyticParams(), crossCategoryWidget.getAnalytics(), crossCategoryWidget.getSettings());
    }
}
