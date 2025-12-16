package com.avito.android.quic.tracking;

import Y61.k;
import Y61.l;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import org.chromium.net.CronetException;

/* compiled from: NetworkRequestsResultsTracker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/tracking/a;", "", "a", "b", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: NetworkRequestsResultsTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/tracking/a$a;", "", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.quic.tracking.a$a, reason: collision with other inner class name */
    public interface InterfaceC7383a {

        /* compiled from: NetworkRequestsResultsTracker.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.quic.tracking.a$a$a, reason: collision with other inner class name */
        public static final class C7384a {
        }

        @l
        String a(@k Throwable th2);
    }

    @k
    IOException a(@k Call call, @k Request request, @k IOException iOException);

    void b(@l HttpUrl httpUrl, @k Protocol protocol, @k CronetException cronetException);

    void c(@k Request request, @k Response response);

    /* compiled from: NetworkRequestsResultsTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/quic/tracking/a$b;", "Lcom/avito/android/quic/tracking/a;", "<init>", "()V", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f246331a = new b();

        @Override // com.avito.android.quic.tracking.a
        public final void c(@k Request request, @k Response response) {
        }

        @Override // com.avito.android.quic.tracking.a
        @k
        public final IOException a(@k Call call, @k Request request, @k IOException iOException) {
            return iOException;
        }

        @Override // com.avito.android.quic.tracking.a
        public final void b(@l HttpUrl httpUrl, @k Protocol protocol, @k CronetException cronetException) {
        }
    }
}
