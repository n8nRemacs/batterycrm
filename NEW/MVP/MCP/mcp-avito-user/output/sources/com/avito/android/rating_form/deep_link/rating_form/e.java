package com.avito.android.rating_form.deep_link.rating_form;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import com.google.gson.Gson;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingFormDeeplinkParser.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/deep_link/rating_form/e;", "LKu/a;", "Lcom/avito/android/rating_form/deep_link/RatingFormLink;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e extends AbstractC14350a<RatingFormLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        String queryParameter = uri.getQueryParameter("fid");
        if (queryParameter == null) {
            i.h(uri, "fid");
            throw null;
        }
        Map mapI = i.i(uri);
        if (mapI.isEmpty()) {
            mapI = null;
        }
        if (mapI != null) {
            String queryParameter2 = uri.getQueryParameter("anonymous");
            return new RatingFormLink(queryParameter, mapI, queryParameter2 != null ? Boolean.parseBoolean(queryParameter2) : false);
        }
        i.h(uri, "queryMap");
        throw null;
    }
}
