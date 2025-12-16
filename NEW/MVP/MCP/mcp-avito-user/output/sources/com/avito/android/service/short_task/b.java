package com.avito.android.service.short_task;

import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.CertificatePinner;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* compiled from: CheckCertPinningInterceptor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service/short_task/b;", "Lokhttp3/Interceptor;", "Lcom/avito/android/service/short_task/f;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements Interceptor, f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CertificatePinner f274051b;

    @Inject
    public b(@Y61.k CertificatePinner certificatePinner) {
        this.f274051b = certificatePinner;
    }

    @Override // com.avito.android.service.short_task.f
    public final void a(@Y61.k OkHttpClient.Builder builder) {
        builder.certificatePinner(this.f274051b);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    @Override // okhttp3.Interceptor
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(@Y61.k okhttp3.Interceptor.Chain r6) throws java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "Certificate is bad"
            java.lang.String r1 = "certificate pinning failed"
            java.lang.String r2 = "CertPinningInterceptor"
            r3 = 0
            okhttp3.Request r4 = r6.request()     // Catch: java.lang.Throwable -> L1d javax.net.ssl.SSLPeerUnverifiedException -> L1f
            okhttp3.Response r6 = r6.proceed(r4)     // Catch: java.lang.Throwable -> L1d javax.net.ssl.SSLPeerUnverifiedException -> L1f
            if (r6 == 0) goto L14
            r6.close()
        L14:
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a
            java.lang.String r1 = "Certificate is good"
            r0.c(r2, r1, r3)
            r3 = r6
            goto L32
        L1d:
            r6 = move-exception
            goto L21
        L1f:
            r6 = move-exception
            goto L2c
        L21:
            com.avito.android.util.V2 r4 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Throwable -> L2a
            r4.a(r2, r1, r6)     // Catch: java.lang.Throwable -> L2a
        L26:
            r4.c(r2, r0, r3)
            goto L32
        L2a:
            r6 = move-exception
            goto L3b
        L2c:
            com.avito.android.util.V2 r4 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Throwable -> L2a
            r4.a(r2, r1, r6)     // Catch: java.lang.Throwable -> L2a
            goto L26
        L32:
            if (r3 == 0) goto L35
            return r3
        L35:
            java.io.IOException r6 = new java.io.IOException
            r6.<init>()
            throw r6
        L3b:
            com.avito.android.util.V2 r1 = com.avito.android.util.V2.f318762a
            r1.c(r2, r0, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service.short_task.b.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
