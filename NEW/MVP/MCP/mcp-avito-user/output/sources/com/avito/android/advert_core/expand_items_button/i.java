package com.avito.android.advert_core.expand_items_button;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExpandItemsButtonPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/expand_items_button/i;", "Lcom/avito/android/advert_core/expand_items_button/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f f83585b;

    @Inject
    public i(@Y61.k f fVar) {
        this.f83585b = fVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ExpandItemsButtonItem expandItemsButtonItem = (ExpandItemsButtonItem) aVar;
        this.f83585b.Y0(expandItemsButtonItem);
        ((k) eVar).PZ(expandItemsButtonItem.f83564h, new h(this, expandItemsButtonItem));
    }
}
