package com.avito.http;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* compiled from: BasicAuthenticator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/http/a;", "Lokhttp3/Authenticator;", "okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements Authenticator {
    @Override // okhttp3.Authenticator
    @k
    public final Request authenticate(@l Route route, @k Response response) {
        return response.request().newBuilder().addHeader("Authorization", Credentials.basic$default(null, null, null, 4, null)).build();
    }
}
