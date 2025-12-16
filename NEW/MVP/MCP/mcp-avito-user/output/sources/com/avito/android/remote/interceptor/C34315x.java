package com.avito.android.remote.interceptor;

import com.avito.android.remote.InterfaceC34332n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.CertificatePinningException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: CertificatePinningInterceptorImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/interceptor/x;", "Lcom/avito/android/remote/interceptor/w;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.remote.interceptor.x, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public class C34315x implements InterfaceC34313w {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f253552b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f253553c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34332n f253554d;

    @Inject
    public C34315x(@Y61.k com.avito.android.server_time.f fVar, @Y61.k ArrayList arrayList, @Y61.k InterfaceC34332n interfaceC34332n) {
        this.f253552b = fVar;
        this.f253553c = arrayList;
        this.f253554d = interfaceC34332n;
    }

    public final void a(SSLException sSLException) throws IOException {
        String strD = this.f253554d.d();
        ArrayList arrayList = this.f253553c;
        boolean z12 = true;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.avito.android.certificate_pinning.b bVar = (com.avito.android.certificate_pinning.b) it.next();
                long jNow = this.f253552b.now();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                bVar.getClass();
                if (jNow >= timeUnit.toMillis(1830286799L)) {
                    z12 = false;
                    break;
                }
            }
        }
        throw new IOException(new CertificatePinningException(new ApiError.CertificatePinningError(strD, z12), sSLException));
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) throws IOException {
        try {
            return chain.proceed(chain.request());
        } catch (SSLHandshakeException e12) {
            a(e12);
            throw null;
        } catch (SSLPeerUnverifiedException e13) {
            a(e13);
            throw null;
        }
    }
}
