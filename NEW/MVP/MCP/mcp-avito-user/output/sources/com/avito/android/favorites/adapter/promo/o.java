package com.avito.android.favorites.adapter.promo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import java.util.List;
import kotlin.Metadata;

/* compiled from: FavoritesPromoItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/promo/u;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o extends com.avito.konveyor.adapter.b implements u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f156668b;

    public o(@Y61.k View view, @Y61.k s sVar, @Y61.k x xVar) {
        super(view);
        this.f156668b = new w(view, sVar, xVar, LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.fav_simple_promo_block_content, (ViewGroup) null));
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void KV(@Y61.k PromoStyle promoStyle) {
        this.f156668b.KV(promoStyle);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void W2() {
        this.f156668b.W2();
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void co(@Y61.k List<PromoAction> list, @Y61.k FavoritesPromoItem favoritesPromoItem, int i12) {
        this.f156668b.co(list, favoritesPromoItem, i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f156668b.getClass();
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void jY(@Y61.k String str) {
        this.f156668b.jY(str);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void r6(@Y61.k String str) {
        this.f156668b.r6(str);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void v8() {
        this.f156668b.v8();
    }
}
