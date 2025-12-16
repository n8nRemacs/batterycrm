package com.avito.android.sx_address.deeplink;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.SxAddressListRefreshLink;
import com.avito.android.deep_linking.links.DeepLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SxAddressListRefreshLinkDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/deeplink/E;", "Lev/b;", "Lcom/avito/android/SxAddressListRefreshLink;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class E extends AbstractC40162b<SxAddressListRefreshLink> {
    @Inject
    public E() {
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        String str2 = ((SxAddressListRefreshLink) deepLink).f67561b;
        return new SxAddressListRefreshLink.b.a(str2 != null ? Long.parseLong(str2) : 0L);
    }
}
