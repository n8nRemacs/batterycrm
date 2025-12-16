package com.avito.android.trx_promo_goods.screens.configure.deeplink;

import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.trx_promo_goods.deeplink.TrxPromoGoodsConfigureLink;
import com.avito.android.util.C35967w2;
import eH0.c;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;
import sv.C48421d;

/* compiled from: TrxPromoGoodsConfigureDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/deeplink/i;", "Lev/a;", "Lcom/avito/android/trx_promo_goods/deeplink/TrxPromoGoodsConfigureLink;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends AbstractC40161a<TrxPromoGoodsConfigureLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.paid_services.a f303409f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final v50.c f303410g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final eH0.c f303411h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44261b f303412i;

    /* compiled from: TrxPromoGoodsConfigureDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC14249c.b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC14249c.b bVar) {
            ((i) this.receiver).j(bVar);
            return G0.f406611a;
        }
    }

    @Inject
    public i(@Y61.k com.avito.android.paid_services.a aVar, @Y61.k v50.c cVar, @Y61.k eH0.c cVar2, @Y61.k InterfaceC44261b interfaceC44261b) {
        this.f303409f = aVar;
        this.f303410g = cVar;
        this.f303411h = cVar2;
        this.f303412i = interfaceC44261b;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        Intent flags;
        TrxPromoGoodsConfigureLink trxPromoGoodsConfigureLink = (TrxPromoGoodsConfigureLink) deepLink;
        if (bundle != null) {
            flags = (Intent) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable("up_intent", Intent.class) : bundle.getParcelable("up_intent"));
        } else {
            flags = null;
        }
        if (flags == null && trxPromoGoodsConfigureLink.f303327e) {
            flags = c.a.a(this.f303411h, trxPromoGoodsConfigureLink.f303325c, null, true, false, 22).putExtra("up_intent", InterfaceC44261b.a.a(this.f303412i, null, null, null, null, 31)).setFlags(603979776);
        }
        Intent intentAddFlags = this.f303410g.a(trxPromoGoodsConfigureLink).addFlags(603979776);
        if (flags != null) {
            intentAddFlags.putExtra("up_intent", flags);
        }
        C35967w2.c(intentAddFlags, bundle != null ? com.avito.android.util.H.b(bundle) : null);
        this.f303409f.a(trxPromoGoodsConfigureLink, C48421d.a(this), bundle, intentAddFlags);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f303409f.b(C48421d.a(this), new a(1, this, i.class, "setTerminalResult", "setTerminalResult(Lcom/avito/android/deep_linking/links/result/DeeplinkResult$Terminal;)V", 0));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f303409f.e();
    }
}
