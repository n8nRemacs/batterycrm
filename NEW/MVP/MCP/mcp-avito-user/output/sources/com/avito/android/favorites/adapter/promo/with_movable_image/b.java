package com.avito.android.favorites.adapter.promo.with_movable_image;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.favorites.adapter.promo.FavoritesPromoItem;
import com.avito.android.favorites.adapter.promo.x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PromoItemWithMovableImageBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/with_movable_image/b;", "Lcom/avito/android/favorites/adapter/promo/with_movable_image/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.favorites.adapter.promo.with_movable_image.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f156698a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f156699b;

    /* compiled from: PromoItemWithMovableImageBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/favorites/adapter/promo/with_movable_image/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/favorites/adapter/promo/with_movable_image/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new h(view, bVar.f156698a, bVar.f156699b);
        }
    }

    @Inject
    public b(@k d dVar, @k x xVar) {
        this.f156698a = dVar;
        this.f156699b = xVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f156698a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.favorites_promo, new a());
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        FavoritesPromoItem favoritesPromoItem;
        String str;
        return (aVar instanceof FavoritesPromoItem) && ((str = (favoritesPromoItem = (FavoritesPromoItem) aVar).f156650g) == null || str.length() == 0) && favoritesPromoItem.f156651h != null;
    }
}
