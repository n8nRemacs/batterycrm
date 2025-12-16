package com.avito.android.external_apps.deep_linking;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: SendEmailLinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/p;", "LKu/a;", "Lcom/avito/android/external_apps/deep_linking/SendEmailLink;", "<init>", "()V", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p extends AbstractC14350a<SendEmailLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new SendEmailLink(uri.getQueryParameter(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME), uri.getQueryParameter("subject"), uri.getQueryParameter(RequestReviewResultKt.INFO_TYPE));
    }
}
