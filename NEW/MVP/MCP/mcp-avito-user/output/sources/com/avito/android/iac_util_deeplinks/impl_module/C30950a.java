package com.avito.android.iac_util_deeplinks.impl_module;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChainEventLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/a;", "Lev/b;", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "<init>", "()V", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.iac_util_deeplinks.impl_module.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C30950a extends AbstractC40162b<ChainEventLink> {
    @Inject
    public C30950a() {
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        return new ChainEventLink.b(((ChainEventLink) deepLink).f169242b);
    }
}
