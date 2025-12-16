package com.avito.android.imv_similiar_adverts;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ImvSimilarAdvertsLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ImvSimilarAdvertsDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_similiar_adverts/f;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ImvSimilarAdvertsLink;", "_avito_imv-similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends AbstractC40162b<ImvSimilarAdvertsLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final j f170855d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f170856e;

    @Inject
    public f(@Y61.k j jVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f170855d = jVar;
        this.f170856e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ImvSimilarAdvertsLink imvSimilarAdvertsLink = (ImvSimilarAdvertsLink) deepLink;
        this.f170856e.R(this.f170855d.a(imvSimilarAdvertsLink.f133364b, imvSimilarAdvertsLink.f133365c, imvSimilarAdvertsLink.f133366d, imvSimilarAdvertsLink.f133367e, imvSimilarAdvertsLink.f133368f, imvSimilarAdvertsLink.f133369g, imvSimilarAdvertsLink.f133370h), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
