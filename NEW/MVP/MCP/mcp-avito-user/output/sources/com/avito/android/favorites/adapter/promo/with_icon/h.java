package com.avito.android.favorites.adapter.promo.with_icon;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.favorites.adapter.promo.FavoritesPromoItem;
import com.avito.android.favorites.adapter.promo.s;
import com.avito.android.favorites.adapter.promo.u;
import com.avito.android.favorites.adapter.promo.w;
import com.avito.android.favorites.adapter.promo.x;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.remote.model.vertical_main.PromoAction;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PromoItemWithIconView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/with_icon/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/favorites/adapter/promo/with_icon/g;", "Lcom/avito/android/favorites/adapter/promo/u;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g, u {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f156694b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f156695c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Resources f156696d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f156697e;

    public h(@k View view, @k s sVar, @k x xVar) {
        super(view);
        this.f156694b = xVar;
        View viewInflate = LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23)).inflate(R.layout.favorites_promo_block_with_icon_content, (ViewGroup) null);
        this.f156695c = new w(view, sVar, xVar, viewInflate);
        this.f156696d = view.getResources();
        View viewFindViewById = viewInflate.findViewById(R.id.promo_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f156697e = (ImageView) viewFindViewById;
    }

    @Override // com.avito.android.favorites.adapter.promo.with_icon.g
    public final void A2(@l String str) {
        this.f156694b.getClass();
        this.f156697e.setVisibility(8);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void KV(@k PromoStyle promoStyle) throws Resources.NotFoundException {
        w wVar = this.f156695c;
        wVar.f156680e.setAppearanceFromAttr(this.f156694b.a(promoStyle));
        Resources resources = this.f156696d;
        boolean z12 = resources.getBoolean(R.bool.is_tablet);
        Banner banner = wVar.f156680e;
        if (z12) {
            banner.l(Integer.valueOf(resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding)), 0, 0, 0);
        } else {
            Banner.m(banner, 0, 3);
        }
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void W2() {
        this.f156695c.W2();
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void co(@k List<PromoAction> list, @k FavoritesPromoItem favoritesPromoItem, int i12) {
        this.f156695c.co(list, favoritesPromoItem, i12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f156695c.getClass();
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void jY(@k String str) {
        this.f156695c.jY(str);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void r6(@k String str) {
        this.f156695c.r6(str);
    }

    @Override // com.avito.android.favorites.adapter.promo.u
    public final void v8() {
        this.f156695c.v8();
    }
}
