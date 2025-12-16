package com.avito.android.analytics.inhouse_transport;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.B;
import okio.InterfaceC44803m;
import okio.X;

/* compiled from: GzipRequestInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/h;", "Lokhttp3/RequestBody;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RequestBody f90197c;

    public h(RequestBody requestBody) {
        this.f90197c = requestBody;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return -1L;
    }

    @Override // okhttp3.RequestBody
    @Y61.l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        RequestBody requestBody = this.f90197c;
        if (requestBody != null) {
            return requestBody.get$contentType();
        }
        return null;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(@Y61.k InterfaceC44803m interfaceC44803m) throws Throwable {
        X x12 = new X(new B(interfaceC44803m));
        RequestBody requestBody = this.f90197c;
        if (requestBody != null) {
            requestBody.writeTo(x12);
        }
        x12.close();
    }
}
