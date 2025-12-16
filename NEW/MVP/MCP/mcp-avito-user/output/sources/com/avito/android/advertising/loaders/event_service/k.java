package com.avito.android.advertising.loaders.event_service;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: CommercialPixelService.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/event_service/k;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Request f88367a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Response f88368b;

    /* renamed from: c, reason: collision with root package name */
    public final long f88369c;

    public k(long j12, @Y61.k Request request, @Y61.k Response response) {
        this.f88367a = request;
        this.f88368b = response;
        this.f88369c = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f88367a, kVar.f88367a) && L.f(this.f88368b, kVar.f88368b) && this.f88369c == kVar.f88369c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88369c) + ((this.f88368b.hashCode() + (this.f88367a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PixelResponse(request=");
        sb2.append(this.f88367a);
        sb2.append(", response=");
        sb2.append(this.f88368b);
        sb2.append(", startTime=");
        return r.u(sb2, this.f88369c, ')');
    }
}
