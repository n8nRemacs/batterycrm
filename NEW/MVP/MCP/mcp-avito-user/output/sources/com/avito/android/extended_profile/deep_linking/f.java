package com.avito.android.extended_profile.deep_linking;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PublicProfileLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsFactory;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublicProfileLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile/deep_linking/f;", "LKu/a;", "Lcom/avito/android/deep_linking/links/PublicProfileLink;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f extends AbstractC14350a<PublicProfileLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "userKey");
        String queryParameter = uri.getQueryParameter("context");
        SearchParams searchParamsFromUri = SearchParamsFactory.INSTANCE.fromUri(uri);
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.i(uri));
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        String str = (String) linkedHashMap.get("floatingBuyBlock");
        if (str != null) {
            dVar.put("floatingBuyBlock", str);
        }
        return new PublicProfileLink(strN, queryParameter, searchParamsFromUri, dVar.b());
    }
}
