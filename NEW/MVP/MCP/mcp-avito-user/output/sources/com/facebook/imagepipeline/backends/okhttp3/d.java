package com.facebook.imagepipeline.backends.okhttp3;

import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.e;
import com.facebook.imagepipeline.producers.V;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: OkHttpNetworkFetcher.java */
/* loaded from: classes12.dex */
class d implements Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f340181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V.a f340182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f340183d;

    public d(e eVar, e.a aVar, V.a aVar2) {
        this.f340183d = eVar;
        this.f340181b = aVar;
        this.f340182c = aVar2;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        e.f(this.f340183d, call, iOException, this.f340182c);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) throws IOException {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        e.a aVar = this.f340181b;
        aVar.f340188g = jElapsedRealtime;
        ResponseBody responseBodyBody = response.body();
        V.a aVar2 = this.f340182c;
        e eVar = this.f340183d;
        try {
            if (responseBodyBody == null) {
                e.f(eVar, call, new IOException("Response body null: " + response), aVar2);
                return;
            }
            try {
            } catch (Exception e12) {
                e.f(eVar, call, e12, aVar2);
            }
            if (!response.isSuccessful()) {
                e.f(eVar, call, new IOException("Unexpected HTTP code " + response), aVar2);
                return;
            }
            UW0.a aVarA = UW0.a.a(response.header("Content-Range"));
            if (aVarA != null && (aVarA.f16405a != 0 || aVarA.f16406b != Integer.MAX_VALUE)) {
                aVar.f340516e = aVarA;
                aVar.f340515d = 8;
            }
            long jContentLength = responseBodyBody.getContentLength();
            if (jContentLength < 0) {
                jContentLength = 0;
            }
            aVar2.a((int) jContentLength, responseBodyBody.byteStream());
        } finally {
            responseBodyBody.close();
        }
    }
}
