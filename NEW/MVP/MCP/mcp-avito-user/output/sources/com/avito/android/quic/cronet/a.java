package com.avito.android.quic.cronet;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.concurrent.Executor;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.Protocol;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

/* compiled from: AvitoCronetEngineDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/a;", "Lorg/chromium/net/CronetEngine;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends CronetEngine {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final CronetEngine f246196a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<org.chromium.net.CronetException, String, Protocol, G0> f246197b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.k CronetEngine cronetEngine, @Y61.k Y41.q<? super org.chromium.net.CronetException, ? super String, ? super Protocol, G0> qVar) {
        this.f246196a = cronetEngine;
        this.f246197b = qVar;
    }

    @Override // org.chromium.net.CronetEngine
    @Y61.k
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.f246196a.createURLStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    @Y61.k
    public final byte[] getGlobalMetricsDeltas() {
        return this.f246196a.getGlobalMetricsDeltas();
    }

    @Override // org.chromium.net.CronetEngine
    @Y61.k
    public final String getVersionString() {
        return this.f246196a.getVersionString();
    }

    @Override // org.chromium.net.CronetEngine
    @Y61.k
    public final UrlRequest.Builder newUrlRequestBuilder(@Y61.k String str, @Y61.l UrlRequest.Callback callback, @Y61.k Executor executor) {
        return this.f246196a.newUrlRequestBuilder(str, new v(callback, this.f246197b, str), executor);
    }

    @Override // org.chromium.net.CronetEngine
    @Y61.k
    public final URLConnection openConnection(@Y61.l URL url) {
        return this.f246196a.openConnection(url);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.f246196a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(@Y61.l String str, boolean z12) {
        this.f246196a.startNetLogToFile(str, z12);
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
        this.f246196a.stopNetLog();
    }
}
