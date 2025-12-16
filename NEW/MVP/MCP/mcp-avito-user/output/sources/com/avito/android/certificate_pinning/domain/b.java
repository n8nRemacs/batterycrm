package com.avito.android.certificate_pinning.domain;

import com.avito.android.certificate_pinning.NetworkState;
import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: UnsafeNetworkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/certificate_pinning/NetworkState;", "it", "Lokhttp3/Response;", "kotlin.jvm.PlatformType", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Request f117782b;

    public b(Request request) {
        this.f117782b = request;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        String strHeader$default = Response.header$default((Response) obj, "Location", null, 2, null);
        return (strHeader$default == null || strHeader$default.length() == 0 || L.f(this.f117782b.url().encodedPath(), URI.create(strHeader$default).getPath())) ? new NetworkState(0L, null, 2, null) : new NetworkState(1L, strHeader$default);
    }
}
