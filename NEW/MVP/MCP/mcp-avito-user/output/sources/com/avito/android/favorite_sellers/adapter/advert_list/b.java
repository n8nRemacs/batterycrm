package com.avito.android.favorite_sellers.adapter.advert_list;

import TV0.g;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertListItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/advert_list/b;", "LTV0/b;", "Lcom/avito/android/favorite_sellers/adapter/advert_list/g;", "Lcom/avito/android/favorite_sellers/adapter/advert_list/AdvertListItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<g, AdvertListItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f155520a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.favorite_sellers.adapter.advert_list.di.b f155521b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.favorite_sellers.adapter.advert_list.di.c f155522c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.favorite_sellers.adapter.advert_list.di.f f155523d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f155524e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final g.a<i> f155525f = new g.a<>(R.layout.advert_list_item, new a(this));

    @Inject
    public b(@k d dVar, @com.avito.android.favorite_sellers.adapter.advert_list.di.g @k com.avito.android.favorite_sellers.adapter.advert_list.di.b bVar, @com.avito.android.favorite_sellers.adapter.advert_list.di.g @k com.avito.android.favorite_sellers.adapter.advert_list.di.c cVar, @com.avito.android.favorite_sellers.adapter.advert_list.di.g @k com.avito.android.favorite_sellers.adapter.advert_list.di.f fVar, @com.avito.android.favorite_sellers.adapter.advert_list.di.g @k com.avito.konveyor.a aVar) {
        this.f155520a = dVar;
        this.f155521b = bVar;
        this.f155522c = cVar;
        this.f155523d = fVar;
        this.f155524e = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f155520a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f155525f;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertListItem;
    }
}
