package com.squareup.picasso;

import android.net.NetworkInfo;
import android.os.Handler;
import com.adjust.sdk.Constants;
import com.squareup.picasso.C;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: NetworkRequestHandler.java */
/* loaded from: classes7.dex */
class u extends C {

    /* renamed from: a, reason: collision with root package name */
    public final v f366468a;

    /* renamed from: b, reason: collision with root package name */
    public final E f366469b;

    /* compiled from: NetworkRequestHandler.java */
    public static class a extends IOException {
    }

    /* compiled from: NetworkRequestHandler.java */
    public static final class b extends IOException {
    }

    public u(v vVar, E e12) {
        this.f366468a = vVar;
        this.f366469b = e12;
    }

    @Override // com.squareup.picasso.C
    public final boolean b(A a12) {
        String scheme = a12.f366289a.getScheme();
        return "http".equals(scheme) || Constants.SCHEME.equals(scheme);
    }

    @Override // com.squareup.picasso.C
    public final int d() {
        return 2;
    }

    @Override // com.squareup.picasso.C
    public final C.a e(A a12, int i12) throws IOException {
        CacheControl cacheControlBuild;
        if (i12 == 0) {
            cacheControlBuild = null;
        } else if ((i12 & 4) != 0) {
            cacheControlBuild = CacheControl.FORCE_CACHE;
        } else {
            CacheControl.Builder builder = new CacheControl.Builder();
            if ((i12 & 1) != 0) {
                builder.noCache();
            }
            if ((i12 & 2) != 0) {
                builder.noStore();
            }
            cacheControlBuild = builder.build();
        }
        Request.Builder builderUrl = new Request.Builder().url(a12.f366289a.toString());
        if (cacheControlBuild != null) {
            builderUrl.cacheControl(cacheControlBuild);
        }
        Response responseExecute = this.f366468a.f366470a.newCall(builderUrl.build()).execute();
        ResponseBody responseBodyBody = responseExecute.body();
        if (!responseExecute.isSuccessful()) {
            responseBodyBody.close();
            throw new b(AK.c.g(responseExecute.code(), "HTTP "));
        }
        Response responseCacheResponse = responseExecute.cacheResponse();
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        Picasso.LoadedFrom loadedFrom2 = Picasso.LoadedFrom.NETWORK;
        Picasso.LoadedFrom loadedFrom3 = responseCacheResponse == null ? loadedFrom2 : loadedFrom;
        if (loadedFrom3 == loadedFrom && responseBodyBody.getContentLength() == 0) {
            responseBodyBody.close();
            throw new a("Received response with 0 content-length header.");
        }
        if (loadedFrom3 == loadedFrom2 && responseBodyBody.getContentLength() > 0) {
            long jContentLength = responseBodyBody.getContentLength();
            Handler handler = this.f366469b.f366332b;
            handler.sendMessage(handler.obtainMessage(4, Long.valueOf(jContentLength)));
        }
        return new C.a(responseBodyBody.getSource(), loadedFrom3);
    }

    @Override // com.squareup.picasso.C
    public final boolean f(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
