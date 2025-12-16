package com.avito.android.mall.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MallMainLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MallMainLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mall/deeplink/j;", "Lev/b;", "Lcom/avito/android/deep_linking/links/MallMainLink;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends AbstractC40162b<MallMainLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f184266d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final d f184267e;

    @Inject
    public j(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k d dVar) {
        this.f184266d = interfaceC4053a;
        this.f184267e = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f184266d.R(this.f184267e.a(((MallMainLink) deepLink).f133434b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
