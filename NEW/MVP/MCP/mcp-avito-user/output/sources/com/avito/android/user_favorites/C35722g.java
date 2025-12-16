package com.avito.android.user_favorites;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SubscriptionsSearchLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_favorites/g;", "Lev/b;", "Lcom/avito/android/user_favorites/SearchSubscriptionLink;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_favorites.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35722g extends AbstractC40162b<SearchSubscriptionLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35727l f316919d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f316920e;

    @Inject
    public C35722g(@Y61.k InterfaceC35727l interfaceC35727l, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f316919d = interfaceC35727l;
        this.f316920e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        this.f316920e.R(this.f316919d.c(((SearchSubscriptionLink) deepLink).f316800b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
