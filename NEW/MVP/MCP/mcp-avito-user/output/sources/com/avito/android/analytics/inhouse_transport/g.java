package com.avito.android.analytics.inhouse_transport;

import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.C44802l;
import okio.InterfaceC44803m;

/* compiled from: GzipRequestInterceptor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/g;", "Lokhttp3/RequestBody;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f90195c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C44802l f90196d;

    public g(h hVar, C44802l c44802l) {
        this.f90195c = hVar;
        this.f90196d = c44802l;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f90196d.f420125c;
    }

    @Override // okhttp3.RequestBody
    @Y61.l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f90195c.get$contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(@Y61.k InterfaceC44803m interfaceC44803m) {
        interfaceC44803m.B1(this.f90196d.y());
    }
}
