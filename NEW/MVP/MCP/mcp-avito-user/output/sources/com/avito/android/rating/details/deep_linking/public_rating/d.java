package com.avito.android.rating.details.deep_linking.public_rating;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.PublicRatingDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PublicRatingDetailsLinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating/details/deep_linking/public_rating/d;", "LKu/a;", "Lcom/avito/android/deep_linking/PublicRatingDetailsLink;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends AbstractC14350a<PublicRatingDetailsLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
        String strN = i.n(uri, "userKey");
        String queryParameter = uri.getQueryParameter("context");
        String queryParameter2 = uri.getQueryParameter("srcRole");
        String queryParameter3 = uri.getQueryParameter("fromItem");
        Long lZ02 = queryParameter3 != null ? C43066x.z0(queryParameter3) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap(i.i(uri));
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        String str = (String) linkedHashMap.get("floatingBuyBlock");
        if (str != null) {
            dVar.put("floatingBuyBlock", str);
        }
        return new PublicRatingDetailsLink(strN, queryParameter, queryParameter2, lZ02, dVar.b());
    }
}
