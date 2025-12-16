package com.avito.android.quic.cronet;

import java.nio.ByteBuffer;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.Protocol;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* compiled from: AvitoCronetEngineDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/v;", "Lorg/chromium/net/UrlRequest$Callback;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class v extends UrlRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final UrlRequest.Callback f246231a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<org.chromium.net.CronetException, String, Protocol, G0> f246232b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f246233c;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@Y61.l UrlRequest.Callback callback, @Y61.k Y41.q<? super org.chromium.net.CronetException, ? super String, ? super Protocol, G0> qVar, @Y61.k String str) {
        this.f246231a = callback;
        this.f246232b = qVar;
        this.f246233c = str;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(@Y61.k UrlRequest urlRequest, @Y61.l UrlResponseInfo urlResponseInfo, @Y61.k org.chromium.net.CronetException cronetException) {
        Protocol protocol;
        try {
            Protocol.Companion companion = Protocol.INSTANCE;
            String negotiatedProtocol = urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null;
            if (negotiatedProtocol == null) {
                negotiatedProtocol = "";
            }
            protocol = companion.get(negotiatedProtocol);
        } catch (Exception unused) {
            protocol = Protocol.HTTP_1_1;
        }
        this.f246232b.invoke(cronetException, this.f246233c, protocol);
        UrlRequest.Callback callback = this.f246231a;
        if (callback != null) {
            callback.onFailed(urlRequest, urlResponseInfo, cronetException);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(@Y61.l UrlRequest urlRequest, @Y61.l UrlResponseInfo urlResponseInfo, @Y61.l ByteBuffer byteBuffer) {
        UrlRequest.Callback callback = this.f246231a;
        if (callback != null) {
            callback.onReadCompleted(urlRequest, urlResponseInfo, byteBuffer);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(@Y61.l UrlRequest urlRequest, @Y61.l UrlResponseInfo urlResponseInfo, @Y61.l String str) {
        UrlRequest.Callback callback = this.f246231a;
        if (callback != null) {
            callback.onRedirectReceived(urlRequest, urlResponseInfo, str);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(@Y61.l UrlRequest urlRequest, @Y61.l UrlResponseInfo urlResponseInfo) {
        UrlRequest.Callback callback = this.f246231a;
        if (callback != null) {
            callback.onResponseStarted(urlRequest, urlResponseInfo);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(@Y61.k UrlRequest urlRequest, @Y61.k UrlResponseInfo urlResponseInfo) {
        UrlRequest.Callback callback = this.f246231a;
        if (callback != null) {
            callback.onSucceeded(urlRequest, urlResponseInfo);
        }
    }
}
