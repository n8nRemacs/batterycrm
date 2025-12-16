package com.avito.android.comfortable_deal_info.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComfortableDealInfoDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal_info/deeplink/b;", "Lev/b;", "Lcom/avito/android/comfortable_deal_info/deeplink/ComfortableDealInfoLink;", "_avito_comfortable-deal-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40162b<ComfortableDealInfoLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.d f123468d;

    @Inject
    public b(@k a.d dVar) {
        this.f123468d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f123468d.D0("ComfortableDealInfoDialogFragment", new a((ComfortableDealInfoLink) deepLink));
        return AbstractC14250d.c.f9171c;
    }
}
