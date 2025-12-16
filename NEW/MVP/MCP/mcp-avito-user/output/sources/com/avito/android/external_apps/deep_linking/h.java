package com.avito.android.external_apps.deep_linking;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExternalAppLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/h;", "LKu/a;", "Lcom/avito/android/external_apps/deep_linking/ExternalAppLink;", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends AbstractC14350a<ExternalAppLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        Uri uri2 = Uri.parse(Ku.i.p(uri, "appUri"));
        String queryParameter = uri.getQueryParameter("fallbackUri");
        return new ExternalAppLink(uri2, queryParameter != null ? Uri.parse(queryParameter) : null);
    }
}
