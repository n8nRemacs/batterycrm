package com.avito.android.favorites.preloading;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.remote.model.FavoriteItemsWidgets;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.g1;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsWidgetsPreloadable.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/preloading/h;", "Lcom/avito/android/preloading/d;", "Lkotlin/G0;", "Lcom/avito/android/remote/model/FavoriteItemsWidgets;", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements com.avito.android.preloading.d<G0, FavoriteItemsWidgets> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ZC.c f157421a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f157422b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FavoritesSpace f157423c;

    @Inject
    public h(@k ZC.c cVar, @k InterfaceC35745a5 interfaceC35745a5, @k FavoritesSpace favoritesSpace) {
        this.f157421a = cVar;
        this.f157422b = interfaceC35745a5;
        this.f157423c = favoritesSpace;
    }

    @Override // com.avito.android.preloading.d
    public final z<? extends FavoriteItemsWidgets> a(G0 g02) {
        return g1.a(this.f157421a.a(this.f157423c.f156271d)).z(this.f157422b.a()).F();
    }
}
