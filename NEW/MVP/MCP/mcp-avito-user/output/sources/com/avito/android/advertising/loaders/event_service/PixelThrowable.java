package com.avito.android.advertising.loaders.event_service;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import okhttp3.Request;

/* compiled from: CommercialPixelService.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/event_service/PixelThrowable;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PixelThrowable extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Request f88334b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Throwable f88335c;

    /* renamed from: d, reason: collision with root package name */
    public final long f88336d;

    public PixelThrowable(@Y61.k Request request, @Y61.k Throwable th2, long j12) {
        super(th2);
        this.f88334b = request;
        this.f88335c = th2;
        this.f88336d = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PixelThrowable)) {
            return false;
        }
        PixelThrowable pixelThrowable = (PixelThrowable) obj;
        return L.f(this.f88334b, pixelThrowable.f88334b) && L.f(this.f88335c, pixelThrowable.f88335c) && this.f88336d == pixelThrowable.f88336d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f88336d) + ((this.f88335c.hashCode() + (this.f88334b.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PixelThrowable(request=");
        sb2.append(this.f88334b);
        sb2.append(", innerThrowable=");
        sb2.append(this.f88335c);
        sb2.append(", startTime=");
        return r.u(sb2, this.f88336d, ')');
    }
}
