package com.avito.android.favorites.link;

import Ku.AbstractC14350a;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Navigation;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: GetSimilarPushLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/favorites/link/d;", "LKu/a;", "Lcom/avito/android/favorites/link/GetSimilarPushLink;", "<init>", "()V", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends AbstractC14350a<GetSimilarPushLink> {
    @Inject
    public d() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strP = Ku.i.p(uri, "itemId");
        String queryParameter = uri.getQueryParameter("categoryId");
        Long lZ02 = queryParameter != null ? C43066x.z0(queryParameter) : null;
        String queryParameter2 = uri.getQueryParameter(Navigation.MICRO_CATEGORY_ID);
        return new GetSimilarPushLink(lZ02, strP, queryParameter2 != null ? C43066x.z0(queryParameter2) : null, uri.getQueryParameter("src"));
    }
}
