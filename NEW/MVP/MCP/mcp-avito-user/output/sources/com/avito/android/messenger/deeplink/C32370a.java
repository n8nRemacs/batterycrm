package com.avito.android.messenger.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.BlockUserLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.blacklist_reasons.y;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BlockUserDeeplinkHandler.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/deeplink/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/BlockUserLink;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.deeplink.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32370a extends AbstractC40162b<BlockUserLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.blacklist_reasons.y f195448d;

    @Inject
    public C32370a(@Y61.k com.avito.android.messenger.blacklist_reasons.y yVar) {
        this.f195448d = yVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BlockUserLink blockUserLink = (BlockUserLink) deepLink;
        y.b.a(this.f195448d, blockUserLink.f133048b, blockUserLink.f133049c, blockUserLink.f133050d, null, 24);
        return AbstractC14250d.c.f9171c;
    }
}
