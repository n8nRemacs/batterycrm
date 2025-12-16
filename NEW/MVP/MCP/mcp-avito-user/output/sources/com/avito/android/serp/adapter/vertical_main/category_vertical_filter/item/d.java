package com.avito.android.serp.adapter.vertical_main.category_vertical_filter.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.vertical_main.p;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoryVerticalFilterPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/item/d;", "Lcom/avito/android/serp/adapter/vertical_main/category_vertical_filter/item/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f272683b;

    @Inject
    public d(@k p pVar) {
        this.f272683b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        CategoryVerticalFilterItem categoryVerticalFilterItem = (CategoryVerticalFilterItem) aVar;
        this.f272683b.h(fVar, categoryVerticalFilterItem.f272673g, i12);
        fVar.b(categoryVerticalFilterItem.f272669c);
    }
}
