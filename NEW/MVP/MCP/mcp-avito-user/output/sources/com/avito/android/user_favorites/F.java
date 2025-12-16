package com.avito.android.user_favorites;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserFavoritesResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/F;", "Lcom/avito/android/user_favorites/E;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F implements E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f316783a;

    @Inject
    public F(@Y61.k Resources resources) {
        this.f316783a = resources;
    }

    @Override // com.avito.android.user_favorites.E
    @Y61.k
    public final String a() {
        return this.f316783a.getString(R.string.favorite_sellers_tab);
    }

    @Override // com.avito.android.user_favorites.E
    @Y61.k
    public final String b() {
        return this.f316783a.getString(R.string.advert_collection);
    }

    @Override // com.avito.android.user_favorites.E
    @Y61.k
    public final String c() {
        return this.f316783a.getString(R.string.tab_new_badge);
    }

    @Override // com.avito.android.user_favorites.E
    @Y61.k
    public final String d() {
        return this.f316783a.getString(R.string.comparison_tab);
    }

    @Override // com.avito.android.user_favorites.E
    @Y61.k
    public final String e() {
        return this.f316783a.getString(R.string.search_subscriptions_tab);
    }

    @Override // com.avito.android.user_favorites.E
    @Y61.k
    public final String f() {
        return this.f316783a.getString(R.string.viewed_tab);
    }

    @Override // com.avito.android.user_favorites.E
    @Y61.k
    public final String g() {
        return this.f316783a.getString(R.string.favorite_items_tab);
    }
}
