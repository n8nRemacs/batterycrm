package com.avito.android.travel_file_download_deeplink.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.travel_file_download_deeplink.TravelFileDownloadDeeplink;
import com.avito.android.util.M6;
import com.google.gson.Gson;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: FileDownloadDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/travel_file_download_deeplink/deeplink/d;", "LKu/a;", "Lcom/avito/android/travel_file_download_deeplink/TravelFileDownloadDeeplink;", "<init>", "()V", "_avito_travel-file-download-deeplink_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends AbstractC14350a<TravelFileDownloadDeeplink> {
    @Inject
    public d() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        TravelFileDownloadDeeplink.Action action;
        Object next;
        Uri uriQ = i.q(uri, ContextActionHandler.Link.URL);
        String strN = i.n(uri, "name");
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("shouldBeAuthorized", false);
        String queryParameter = uri.getQueryParameter("action");
        if (queryParameter != null) {
            TravelFileDownloadDeeplink.Action.f301676c.getClass();
            Iterator it = ((AbstractC42738c) TravelFileDownloadDeeplink.Action.f301678e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((TravelFileDownloadDeeplink.Action) next).f301679b, queryParameter)) {
                    break;
                }
            }
            action = (TravelFileDownloadDeeplink.Action) next;
        } else {
            action = null;
        }
        if (M6.a(uriQ, "avito.ru") || M6.a(uriQ, "avito.st")) {
            return new TravelFileDownloadDeeplink(uriQ, strN, action, booleanQueryParameter);
        }
        i.g(this, uri, "url must have avito domain");
        throw null;
    }
}
