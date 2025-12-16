package com.avito.android.lottie;

import Y61.k;
import Y61.l;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.y;

/* compiled from: LottieRetrofitFetcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lottie/f;", "Lcom/airbnb/lottie/network/c;", "_common_lottie_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class f implements com.airbnb.lottie.network.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f182978b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y<ResponseBody> f182979c;

    public f(@k String str, @k y<ResponseBody> yVar) {
        this.f182978b = str;
        this.f182979c = yVar;
    }

    @Override // com.airbnb.lottie.network.c
    @l
    public final String a2() {
        return this.f182979c.f430118a.headers().get("content-type");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ResponseBody responseBody = this.f182979c.f430119b;
        if (responseBody != null) {
            responseBody.close();
        }
    }

    @Override // com.airbnb.lottie.network.c
    @k
    public final InputStream f2() {
        return this.f182979c.f430119b.byteStream();
    }

    @Override // com.airbnb.lottie.network.c
    public final boolean isSuccessful() {
        return this.f182979c.f430118a.isSuccessful();
    }

    @Override // com.airbnb.lottie.network.c
    @l
    public final String v4() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f182978b + ". Failed with " + this.f182979c.f430118a.code();
        } catch (IOException e12) {
            return e12.getMessage();
        }
    }
}
