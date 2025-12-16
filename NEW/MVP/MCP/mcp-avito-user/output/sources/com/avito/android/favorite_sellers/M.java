package com.avito.android.favorite_sellers;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteSellersResourceProviderImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/M;", "Lcom/avito/android/favorite_sellers/L;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class M implements L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f155457a;

    @Inject
    public M(@Y61.k Resources resources) {
        this.f155457a = resources;
    }

    @Override // com.avito.android.favorite_sellers.L
    @Y61.k
    public final String a() {
        return this.f155457a.getString(R.string.favorite_sellers_loading_error);
    }
}
