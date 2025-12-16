package com.avito.android.profile_phones.deep_linking;

import Ku.AbstractC14350a;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PhoneAddLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneAddAsyncLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_phones/deep_linking/g;", "LKu/a;", "Lcom/avito/android/deep_linking/links/auth/PhoneAddLink;", "<init>", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends AbstractC14350a<PhoneAddLink> {
    @Inject
    public g() {
    }

    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        String queryParameter = uri.getQueryParameter("number");
        String queryParameter2 = uri.getQueryParameter(SearchParamsConverterKt.SOURCE);
        String queryParameter3 = uri.getQueryParameter("then");
        DeepLink deepLinkB = queryParameter3 != null ? xVar.b(queryParameter3) : null;
        String queryParameter4 = uri.getQueryParameter("title");
        String queryParameter5 = uri.getQueryParameter("subtitle");
        return (queryParameter2 == null || queryParameter2.length() == 0) ? new PhoneAddLink(queryParameter, null, queryParameter4, queryParameter5, deepLinkB, 2, null) : new PhoneAddLink(queryParameter, queryParameter2, queryParameter4, queryParameter5, deepLinkB);
    }
}
