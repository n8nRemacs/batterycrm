package com.avito.android.favorites.adapter.promo.with_icon;

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
import kotlin.jvm.internal.s0;

/* compiled from: PromoItemWithIconBlueprint.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/with_icon/b;", "Lcom/avito/android/favorites/adapter/promo/with_icon/a;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.favorites.adapter.promo.with_icon.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f156683a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f156684b;

    /* compiled from: PromoItemWithIconBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/favorites/adapter/promo/with_icon/h;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/favorites/adapter/promo/with_icon/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, h> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final h invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new h(view, bVar.f156683a, bVar.f156684b);
        }
    }

    @Inject
    public b(@k d dVar, @k x xVar) {
        this.f156683a = dVar;
        this.f156684b = xVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f156683a;
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
        if (!(aVar instanceof FavoritesPromoItem)) {
            return false;
        }
        FavoritesPromoItem favoritesPromoItem = (FavoritesPromoItem) aVar;
        String str = favoritesPromoItem.f156650g;
        return !(str == null || str.length() == 0) && favoritesPromoItem.f156651h == null;
    }
}
