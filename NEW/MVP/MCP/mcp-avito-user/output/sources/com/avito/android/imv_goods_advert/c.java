package com.avito.android.imv_goods_advert;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ImvGoodsAdvertLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvGoodsAdvertDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_advert/c;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ImvGoodsAdvertLink;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends AbstractC40162b<ImvGoodsAdvertLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final j f170330d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f170331e;

    @Inject
    public c(@Y61.k j jVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f170330d = jVar;
        this.f170331e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ImvGoodsAdvertLink imvGoodsAdvertLink = (ImvGoodsAdvertLink) deepLink;
        this.f170331e.R(this.f170330d.a(imvGoodsAdvertLink.f133356b, imvGoodsAdvertLink.f133357c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
