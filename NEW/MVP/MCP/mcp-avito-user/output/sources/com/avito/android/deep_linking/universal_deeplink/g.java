package com.avito.android.deep_linking.universal_deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.util.M6;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: UniversalDeepLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/universal_deeplink/g;", "LKu/a;", "Lcom/avito/android/deep_linking/universal_deeplink/UniversalDeepLink;", "<init>", "()V", "_avito_deep-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends AbstractC14350a<UniversalDeepLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        Uri uriQ = i.q(uri, ContextActionHandler.Link.URL);
        if (M6.a(uriQ, "avito.ru")) {
            return new UniversalDeepLink(uriQ);
        }
        i.g(this, uri, "url must have root domain avito.ru");
        throw null;
    }
}
