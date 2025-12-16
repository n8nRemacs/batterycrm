package com.avito.android.favorite_sellers.adapter.recommendation.advert_details;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.favorite_sellers.AdvertDetailsRecommendationItem;
import com.avito.android.favorite_sellers.adapter.recommendation.A;
import com.avito.android.favorite_sellers.adapter.recommendation.B;
import com.avito.android.favorite_sellers.adapter.recommendation.InterfaceC30575a;
import com.avito.android.favorite_sellers.adapter.recommendation.h;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsRecommendationItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/advert_details/a;", "LTV0/b;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/A;", "Lcom/avito/android/favorite_sellers/AdvertDetailsRecommendationItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<A, AdvertDetailsRecommendationItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f155619a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f155620b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f155621c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f155622d = new g.a<>(R.layout.advert_details_recommendation_item, new C4559a());

    /* compiled from: AdvertDetailsRecommendationItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/favorite_sellers/adapter/recommendation/B;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/favorite_sellers/adapter/recommendation/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.favorite_sellers.adapter.recommendation.advert_details.a$a, reason: collision with other inner class name */
    public static final class C4559a extends N implements p<ViewGroup, View, B> {
        public C4559a() {
            super(2);
        }

        @Override // Y41.p
        public final B invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new B(view, aVar.f155621c, aVar.f155620b);
        }
    }

    @Inject
    public a(@k h hVar, @k @InterfaceC30575a com.avito.konveyor.adapter.a aVar, @k @InterfaceC30575a com.avito.konveyor.a aVar2) {
        this.f155619a = hVar;
        this.f155620b = aVar;
        this.f155621c = aVar2;
    }

    @Override // TV0.b
    public final d a() {
        return this.f155619a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f155622d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertDetailsRecommendationItem;
    }
}
