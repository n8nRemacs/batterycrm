package com.avito.android.favorites.adapter.advert;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/d;", "LTV0/f;", "Lcom/avito/android/favorites/adapter/advert/r;", "Lcom/avito/android/favorites/adapter/advert/FavoriteAdvertItem;", "a", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface d extends TV0.f<r, FavoriteAdvertItem> {

    /* compiled from: FavoriteAdvertItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/advert/d$a;", "", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: FavoriteAdvertItemPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorites.adapter.advert.d$a$a, reason: collision with other inner class name */
        public static final class C4580a {
        }

        void C(@Y61.k String str);

        void D(@Y61.k DeepLink deepLink, @Y61.k String str);

        void E(@Y61.k DeepLink deepLink);

        void F(@Y61.k String str, @Y61.k String str2);

        void b(int i12, int i13, @Y61.k String str, int i14);

        void e(@Y61.k DeepLink deepLink);

        void h(@Y61.k DeepLink deepLink);

        void l(@Y61.k FavoriteAdvertItem favoriteAdvertItem);

        void o(@Y61.k AutotekaPurchaseAction autotekaPurchaseAction);

        void p(@Y61.k DeepLink deepLink);

        void y(@Y61.k FavoriteAdvertItem favoriteAdvertItem, @Y61.l Image image);
    }

    void H1(@Y61.l com.avito.android.advert_collection.t tVar);
}
