package com.avito.android.external_apps.deep_linking;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InAppBrowserLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: InAppBrowserLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/k;", "LKu/a;", "Lcom/avito/android/deep_linking/links/InAppBrowserLink;", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends AbstractC14350a<InAppBrowserLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom {
        String host;
        Uri uri2 = Uri.parse(Ku.i.p(uri, TooltipAttribute.PARAM_DEEP_LINK));
        if (L.f(uri2.getHost(), "avito.ru") || ((host = uri2.getHost()) != null && C43066x.z(host, ".avito.ru", false))) {
            return new InAppBrowserLink(uri2);
        }
        Ku.i.g(this, uri, "uri's host must be avito.ru");
        throw null;
    }
}
