package com.google.net.cronet.okhttptransport;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.compose.foundation.text.selection.C21030p;
import com.google.common.util.concurrent.Q0;
import com.google.net.cronet.okhttptransport.j;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* compiled from: RequestResponseConverter.java */
/* loaded from: classes14.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    public final CronetEngine f362565a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f362566b;

    /* renamed from: c, reason: collision with root package name */
    public final q f362567c;

    /* renamed from: d, reason: collision with root package name */
    public final j f362568d;

    /* renamed from: e, reason: collision with root package name */
    public final h f362569e;

    /* compiled from: RequestResponseConverter.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UrlRequest f362570a;

        /* renamed from: b, reason: collision with root package name */
        public final m f362571b;

        public a(UrlRequest urlRequest, m mVar) {
            this.f362570a = urlRequest;
            this.f362571b = mVar;
        }
    }

    /* compiled from: RequestResponseConverter.java */
    public interface b {
    }

    public n(CronetEngine cronetEngine, ExecutorService executorService, j jVar, q qVar, h hVar) {
        this.f362565a = cronetEngine;
        this.f362566b = executorService;
        this.f362568d = jVar;
        this.f362567c = qVar;
        this.f362569e = hVar;
    }

    public final a a(Request request, int i12, int i13) {
        UploadDataProvider aVar;
        g gVar = new g(i12, this.f362569e);
        UrlRequest.Builder builderAllowDirectExecutor = this.f362565a.newUrlRequestBuilder(request.url().getUrl(), gVar, Q0.a()).allowDirectExecutor();
        builderAllowDirectExecutor.setHttpMethod(request.method());
        for (int i14 = 0; i14 < request.headers().size(); i14++) {
            builderAllowDirectExecutor.addHeader(request.headers().name(i14), request.headers().value(i14));
        }
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody != null) {
            if (request.header("Content-Length") == null && requestBodyBody.contentLength() != -1) {
                builderAllowDirectExecutor.addHeader("Content-Length", String.valueOf(requestBodyBody.contentLength()));
            }
            if (requestBodyBody.contentLength() != 0) {
                if (request.header("Content-Type") != null || requestBodyBody.get$contentType() == null) {
                    builderAllowDirectExecutor.addHeader("Content-Type", "application/octet-stream");
                } else {
                    builderAllowDirectExecutor.addHeader("Content-Type", requestBodyBody.get$contentType().getMediaType());
                }
                j jVar = this.f362568d;
                long jContentLength = requestBodyBody.contentLength();
                if (jContentLength == -1 || jContentLength > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                    j.c cVar = jVar.f362547b;
                    cVar.getClass();
                    aVar = new j.c.a(requestBodyBody, new r(), cVar.f362553a, i13, null);
                } else {
                    jVar.f362546a.getClass();
                    long jContentLength2 = requestBodyBody.contentLength();
                    if (jContentLength2 < 0 || jContentLength2 > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        throw new IOException(C21030p.a(jContentLength2, "Expected definite length less than 1048576but got "));
                    }
                    aVar = new j.b.a(jContentLength2, requestBodyBody);
                }
                builderAllowDirectExecutor.setUploadDataProvider(aVar, this.f362566b);
            }
        }
        return new a(builderAllowDirectExecutor.build(), new m(this, request, gVar));
    }
}
