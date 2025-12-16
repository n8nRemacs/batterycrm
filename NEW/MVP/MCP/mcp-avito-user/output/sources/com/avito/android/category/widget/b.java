package com.avito.android.category.widget;

import com.avito.android.J0;
import com.avito.android.category.CategoryItemLink;
import com.avito.android.category.element.ActionedImage;
import com.avito.android.category.element.CategoryWidgetElement;
import com.avito.android.category.element.CategoryWidgetElementItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryWidgetConverterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/widget/b;", "Lcom/avito/android/category/widget/a;", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f116739a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.category.element.b f116740b;

    public b(@Y61.k J0 j02, @Y61.k com.avito.android.category.element.b bVar) {
        this.f116739a = j02;
        this.f116740b = bVar;
    }

    @Override // com.avito.android.serp.b
    @Y61.k
    public final Class<? extends CategoryWidget> a() {
        return CategoryWidget.class;
    }

    @Override // com.avito.android.serp.b
    public final l1 b(SerpElement serpElement, String str, String str2, int i12) {
        CategoryWidget categoryWidget = (CategoryWidget) serpElement;
        List<CategoryWidgetElement> items = categoryWidget.getItems();
        List<CategoryWidgetElement> list = items;
        if (list == null || list.isEmpty()) {
            return null;
        }
        boolean z12 = false;
        boolean z13 = items.size() == 1;
        List<CategoryWidgetElement> list2 = items;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z12 = true;
        } else {
            for (CategoryWidgetElement categoryWidgetElement : list2) {
                ActionedImage actionedImage = categoryWidgetElement.getActionedImage();
                if ((actionedImage != null ? actionedImage.getImage() : null) != null) {
                    break;
                }
                ActionedImage actionedImage2 = categoryWidgetElement.getActionedImage();
                if ((actionedImage2 != null ? actionedImage2.getUniversalImage() : null) != null) {
                    break;
                }
            }
            z12 = true;
        }
        String title = categoryWidget.getTitle();
        CategoryItemLink titleAction = categoryWidget.getTitleAction();
        DeepLink deepLink = titleAction != null ? titleAction.getDeepLink() : null;
        String strK = com.avito.android.bxcontent.mvi.entity.f.k(this.f116739a, new StringBuilder("vertical_category"));
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (CategoryWidgetElement categoryWidgetElement2 : list2) {
            String strK2 = com.avito.android.bxcontent.mvi.entity.f.k(this.f116740b.f116604a, new StringBuilder("vertical_category_item"));
            String title2 = categoryWidgetElement2.getTitle();
            if (L.f(categoryWidgetElement2.getShouldHideTitle(), Boolean.TRUE)) {
                title2 = null;
            }
            CategoryItemLink titleAction2 = categoryWidgetElement2.getTitleAction();
            arrayList.add(new CategoryWidgetElementItem(strK2, title2, titleAction2 != null ? titleAction2.getDeepLink() : null, categoryWidgetElement2.getIsAutoHeight(), categoryWidgetElement2.getActionedImage(), categoryWidgetElement2.getActions(), z12, categoryWidgetElement2.getDisplayParams(), z13));
        }
        Analytics analytics = categoryWidget.getAnalytics();
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        if (str2 != null) {
            dVar.put("mcid", str2);
        }
        G0 g02 = G0.f406611a;
        return new CategoryWidgetItemImpl(title, deepLink, strK, arrayList, false, false, analytics, dVar.b(), categoryWidget.getF157695e(), 48, null);
    }
}
