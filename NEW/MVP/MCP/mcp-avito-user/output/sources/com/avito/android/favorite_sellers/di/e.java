package com.avito.android.favorite_sellers.di;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.favorite_sellers.InterfaceC30574a;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.S;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Y1;

/* compiled from: FavoriteSellersModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/di/e;", "Lcom/avito/android/serp/adapter/v;", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements InterfaceC34863v {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y1<InterfaceC30574a> f155873b;

    public e(Y1<InterfaceC30574a> y12) {
        this.f155873b = y12;
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f155873b.K5(new InterfaceC30574a.b(s5));
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34863v
    public final void k5(@Y61.k AdvertItem advertItem, @Y61.l Image image) {
        this.f155873b.K5(new InterfaceC30574a.C4553a(advertItem, image));
    }

    @Override // La.g
    public final void ic(@Y61.k String str) {
    }

    @Override // com.avito.android.serp.adapter.K
    public final void p9(@Y61.k DeepLink deepLink) {
    }
}
