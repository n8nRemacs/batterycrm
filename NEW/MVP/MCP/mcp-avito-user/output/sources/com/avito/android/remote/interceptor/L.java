package com.avito.android.remote.interceptor;

import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.InterfaceC44804n;

/* compiled from: DefineResponseBodyHeadersInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/L;", "Lokhttp3/ResponseBody;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class L extends ResponseBody {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Headers f253493b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ResponseBody f253494c;

    public L(@Y61.k Headers headers, @Y61.k ResponseBody responseBody) {
        this.f253493b = headers;
        this.f253494c = responseBody;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long get$contentLength() {
        return this.f253494c.get$contentLength();
    }

    @Override // okhttp3.ResponseBody
    @Y61.l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f253494c.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    @Y61.k
    /* renamed from: source */
    public final InterfaceC44804n get$this_asResponseBody() {
        return this.f253494c.get$this_asResponseBody();
    }
}
