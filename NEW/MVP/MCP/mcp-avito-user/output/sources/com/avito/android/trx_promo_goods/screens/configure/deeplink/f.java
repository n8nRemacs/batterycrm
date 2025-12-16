package com.avito.android.trx_promo_goods.screens.configure.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: TrxPromoGoodsConfigureCancelDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/f;", "Lev/a;", "Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/TrxPromoGoodsConfigureCancelLink;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC40161a<TrxPromoGoodsConfigureCancelLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final IF0.a f303399f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.i f303400g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.g f303401h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f303402i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f303403j;

    @Inject
    public f(@Y61.k IF0.a aVar, @Y61.k a.i iVar, @Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k R0 r02) {
        this.f303399f = aVar;
        this.f303400g = iVar;
        this.f303401h = gVar;
        this.f303402i = aVar2;
        this.f303403j = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f303403j, null, null, new e(this, (TrxPromoGoodsConfigureCancelLink) deepLink, null), 3);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f303403j, null);
    }
}
