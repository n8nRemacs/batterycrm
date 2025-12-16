package com.avito.android.serp.adapter.vertical_main.collectionsRecommendations.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.consultation.C;
import com.avito.android.serp.analytics.widgets_tracker.g;
import com.avito.android.util.C35949t5;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: CollectionRecommendationItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/item/a;", "LTV0/d;", "Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/item/c;", "Lcom/avito/android/serp/adapter/vertical_main/collectionsRecommendations/item/CollectionsRecommendationItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.d<c, CollectionsRecommendationItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC47690b> f272724b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f272725c;

    @Inject
    public a(@k g gVar, @k h31.e eVar) {
        this.f272724b = eVar;
        this.f272725c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        CollectionsRecommendationItem collectionsRecommendationItem = (CollectionsRecommendationItem) aVar;
        C c12 = new C(this, collectionsRecommendationItem, i12, 14);
        C35949t5.c(cVar.f272730d, com.avito.android.image_loader.b.b(collectionsRecommendationItem.f272722f), null, null, null, 14);
        cVar.f272729c.setText(collectionsRecommendationItem.f272720d);
        cVar.f272728b.setOnClickListener(c12);
    }
}
