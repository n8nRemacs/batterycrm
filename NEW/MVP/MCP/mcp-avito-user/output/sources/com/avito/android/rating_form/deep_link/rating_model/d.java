package com.avito.android.rating_form.deep_link.rating_model;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.rating_form.deep_link.RatingModelLink;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: RatingModelDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/rating_form/deep_link/rating_model/d;", "LKu/a;", "Lcom/avito/android/rating_form/deep_link/RatingModelLink;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends AbstractC14350a<RatingModelLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("path");
        String queryParameter2 = uri.getQueryParameter("pageFrom");
        String queryParameter3 = uri.getQueryParameter("catalogId");
        return new RatingModelLink(i.l(uri, "categoryId"), queryParameter3 != null ? C43066x.y0(queryParameter3) : null, queryParameter2, queryParameter, Boolean.parseBoolean(uri.getQueryParameter("fromPush")));
    }
}
