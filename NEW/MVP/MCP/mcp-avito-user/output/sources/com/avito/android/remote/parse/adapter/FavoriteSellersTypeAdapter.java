package com.avito.android.remote.parse.adapter;

import com.avito.android.remote.model.FavoriteSeller;
import com.avito.android.remote.model.FavoriteSellersResultItem;
import com.avito.android.remote.model.FavoriteSellersSectionHeader;
import com.avito.android.remote.model.recommendation.RecommendationCarousel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: FavoriteSellersTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/parse/adapter/FavoriteSellersTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/model/FavoriteSellersResultItem;", "<init>", "()V", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FavoriteSellersTypeAdapter extends RuntimeTypeAdapter<FavoriteSellersResultItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f254179a;

    public FavoriteSellersTypeAdapter() {
        super(null, null, null, 7, null);
        this.f254179a = P0.j(new kotlin.Q("favorite_seller", FavoriteSeller.class), new kotlin.Q("section_header", FavoriteSellersSectionHeader.class), new kotlin.Q("recommended_sellers_carousel", RecommendationCarousel.class));
    }

    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @Y61.k
    public final Map<String, Class<? extends FavoriteSellersResultItem>> getMapping() {
        return this.f254179a;
    }
}
