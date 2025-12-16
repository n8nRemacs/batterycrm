package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoritesResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/FavoritesResponse;", "", "favorites", "", "Lcom/avito/android/remote/model/FavoriteAdvert;", "references", "Lcom/avito/android/remote/model/References;", "(Ljava/util/List;Lcom/avito/android/remote/model/References;)V", "getFavorites", "()Ljava/util/List;", "getReferences", "()Lcom/avito/android/remote/model/References;", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FavoritesResponse {

    @c("items")
    @k
    private final List<FavoriteAdvert> favorites;

    @c("refs")
    @l
    private final References references;

    public FavoritesResponse(@k List<FavoriteAdvert> list, @l References references) {
        this.favorites = list;
        this.references = references;
    }

    @k
    public final List<FavoriteAdvert> getFavorites() {
        return this.favorites;
    }

    @l
    public final References getReferences() {
        return this.references;
    }
}
