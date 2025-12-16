package com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar;

import com.avito.android.bxcontent.vertical_toolbar.category_filter_toolbar.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item.CategoryVerticalFilterItem;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerticalCategoryFilterToolbarPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f113077l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar) {
        super(0);
        this.f113077l = bVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Filter filter;
        b bVar = this.f113077l;
        b.C3319b c3319b = bVar.f113066k;
        if (c3319b != null && (filter = c3319b.f113072c) != null) {
            InlineFilterValue value = filter.getValue();
            if (value instanceof InlineFilterValue.InlineFilterShortcutValue) {
                DeepLink deepLink = ((InlineFilterValue.InlineFilterShortcutValue) value).getDeepLink();
                if (deepLink != null) {
                    b.a.a(bVar.f113057b, deepLink, null, null, 6);
                }
            } else {
                String displayTitle = filter.getDisplayTitle();
                CategoryVerticalFilterItem categoryVerticalFilterItem = bVar.f113065j;
                d.a.a(bVar.f113058c, -1, "category_vertical_filter", displayTitle, null, null, null, null, categoryVerticalFilterItem != null ? categoryVerticalFilterItem.f272672f : null, 120);
                bVar.f113059d.j(filter);
            }
        }
        return G0.f406611a;
    }
}
