package com.avito.android.advert.item.other_categories.item;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CategoryItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/other_categories/item/d;", "Lcom/avito/android/advert/item/other_categories/item/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f77868b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k l<? super DeepLink, G0> lVar) {
        this.f77868b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        CategoryItem categoryItem = (CategoryItem) aVar;
        eVar2.setTitle(categoryItem.f77858b);
        eVar2.f(categoryItem.f77860d);
        eVar2.i(categoryItem.f77861e);
        eVar2.yV(categoryItem.f77863g);
        eVar2.a(new c(this, categoryItem));
    }
}
