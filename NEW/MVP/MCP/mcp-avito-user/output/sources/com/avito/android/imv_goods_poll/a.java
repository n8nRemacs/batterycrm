package com.avito.android.imv_goods_poll;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ImvGoodsPollLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvGoodsPollDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_goods_poll/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ImvGoodsPollLink;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC40162b<ImvGoodsPollLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final f f170613d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f170614e;

    @Inject
    public a(@Y61.k f fVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f170613d = fVar;
        this.f170614e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ImvGoodsPollLink imvGoodsPollLink = (ImvGoodsPollLink) deepLink;
        this.f170614e.R(this.f170613d.a(imvGoodsPollLink.f133360b, imvGoodsPollLink.f133361c, imvGoodsPollLink.f133362d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
