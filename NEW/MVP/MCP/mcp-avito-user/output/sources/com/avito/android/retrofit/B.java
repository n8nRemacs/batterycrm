package com.avito.android.retrofit;

import kotlin.Metadata;
import okhttp3.ResponseBody;
import okio.InterfaceC44804n;
import retrofit2.HttpException;
import wl0.C49649b;

/* compiled from: HttpExceptions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_network_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B {
    @Y61.l
    public static final String a(@Y61.l HttpException httpException) {
        InterfaceC44804n source;
        retrofit2.y<?> yVar;
        ResponseBody responseBody = (httpException == null || (yVar = httpException.f429954d) == null) ? null : yVar.f430120c;
        if (responseBody == null || (source = responseBody.getSource()) == null) {
            return null;
        }
        return source.peek().w4(C49649b.a(responseBody));
    }
}
