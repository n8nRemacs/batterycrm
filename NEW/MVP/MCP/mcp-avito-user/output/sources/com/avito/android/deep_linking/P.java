package com.avito.android.deep_linking;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.RetrySellerSubscriptionLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RetrySellerSubscriptionLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/P;", "Lev/b;", "Lcom/avito/android/deep_linking/RetrySellerSubscriptionLink;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class P extends AbstractC40162b<RetrySellerSubscriptionLink> {
    @Inject
    public P() {
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        RetrySellerSubscriptionLink retrySellerSubscriptionLink = (RetrySellerSubscriptionLink) deepLink;
        return new RetrySellerSubscriptionLink.b(retrySellerSubscriptionLink.f132868b, retrySellerSubscriptionLink.f132869c);
    }
}
