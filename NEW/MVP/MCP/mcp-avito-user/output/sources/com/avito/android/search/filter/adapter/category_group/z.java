package com.avito.android.search.filter.adapter.category_group;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.util.L0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryGroupItemWidthProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/category_group/z;", "Lcom/avito/android/search/filter/adapter/category_group/y;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class z implements y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L0 f262107a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f262108b;

    /* renamed from: c, reason: collision with root package name */
    public final int f262109c;

    @Inject
    public z(@Y61.k Resources resources, @Y61.k L0 l02) {
        this.f262107a = l02;
        this.f262108b = l02.getF318655a();
        this.f262109c = resources.getDimensionPixelOffset(R.dimen.filter_item_horizontal_padding);
    }

    @Override // com.avito.android.search.filter.adapter.category_group.y
    public final int getWidth() {
        int iC2 = this.f262107a.c();
        int i12 = iC2 - (this.f262109c * 2);
        if (i12 > 0) {
            return i12;
        }
        this.f262108b.o().getClass();
        return iC2;
    }
}
