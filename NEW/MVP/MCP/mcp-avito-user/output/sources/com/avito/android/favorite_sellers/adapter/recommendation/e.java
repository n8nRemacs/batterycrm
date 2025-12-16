package com.avito.android.favorite_sellers.adapter.recommendation;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.favorite_sellers.RecommendationItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecommendationItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/e;", "LTV0/b;", "Lcom/avito/android/favorite_sellers/adapter/recommendation/A;", "Lcom/avito/android/favorite_sellers/RecommendationItem;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements TV0.b<A, RecommendationItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f155641a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f155642b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f155643c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f155644d = new g.a<>(R.layout.recommendation_item, new a());

    /* compiled from: RecommendationItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/favorite_sellers/adapter/recommendation/B;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/favorite_sellers/adapter/recommendation/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, B> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final B invoke(ViewGroup viewGroup, View view) {
            e eVar = e.this;
            return new B(view, eVar.f155643c, eVar.f155642b);
        }
    }

    @Inject
    public e(@Y61.k h hVar, @Y61.k @InterfaceC30575a com.avito.konveyor.adapter.a aVar, @Y61.k @InterfaceC30575a com.avito.konveyor.a aVar2) {
        this.f155641a = hVar;
        this.f155642b = aVar;
        this.f155643c = aVar2;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f155641a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f155644d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof RecommendationItem;
    }
}
