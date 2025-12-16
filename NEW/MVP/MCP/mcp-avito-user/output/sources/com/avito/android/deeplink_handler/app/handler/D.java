package com.avito.android.deeplink_handler.app.handler;

import android.annotation.SuppressLint;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DeepLinkContainer;
import com.avito.android.deep_linking.links.FallbackableLinkPublic;
import com.avito.android.deep_linking.links.PublicDeeplink;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DeeplinkContainerHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deeplink_handler/app/handler/D;", "Lcom/avito/android/deeplink_handler/app/handler/t;", "Lcom/avito/android/deep_linking/links/FallbackableLinkPublic;", "_avito_deeplink-handler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes12.dex */
public final class D extends C29801t<FallbackableLinkPublic> {
    @Override // com.avito.android.deeplink_handler.app.handler.C29801t
    @Y61.k
    public final List<DeepLink> k(@Y61.k DeepLinkContainer deepLinkContainer) {
        List<DeepLink> listK = super.k(deepLinkContainer);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (obj instanceof PublicDeeplink) {
                arrayList.add(obj);
            }
        }
        return C42745f0.E0(arrayList, 1);
    }
}
