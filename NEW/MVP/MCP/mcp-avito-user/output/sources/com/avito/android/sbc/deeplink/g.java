package com.avito.android.sbc.deeplink;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.C29689o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DiscountDispatchProxyDeepLink;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DiscountDispatchProxyDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/sbc/deeplink/g;", "Lcom/avito/android/deep_linking/links/DiscountDispatchProxyDeepLink;", "DeeplinkT", "Lev/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g<DeeplinkT extends DiscountDispatchProxyDeepLink> extends AbstractC40162b<DeeplinkT> {
    @Inject
    public g() {
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        return C29689o.f134017b;
    }
}
