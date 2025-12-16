package com.avito.android.avito_map.marker;

import Y61.k;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AvitoMarkerItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/avito_map/marker/MarkerWithFavorite;", "", "favoritesIds", "", "getFavoritesIds", "()Ljava/lang/String;", "isFavorite", "", "()Z", "setFavorite", "(Z)V", "listFavoritesIds", "", "getListFavoritesIds", "()Ljava/util/List;", "setListFavoritesIds", "(Ljava/util/List;)V", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface MarkerWithFavorite {
    @k
    String getFavoritesIds();

    @k
    List<String> getListFavoritesIds();

    boolean isFavorite();

    void setFavorite(boolean z12);

    void setListFavoritesIds(@k List<String> list);
}
