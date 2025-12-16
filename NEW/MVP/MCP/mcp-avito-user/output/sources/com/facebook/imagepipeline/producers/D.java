package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.V;
import com.facebook.infer.annotation.Nullsafe;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: HttpUrlConnectionNetworkFetcher.java */
@Nullsafe
/* loaded from: classes15.dex */
public class D extends AbstractC36397c<a> {

    /* renamed from: a, reason: collision with root package name */
    public int f340529a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f340530b;

    /* renamed from: c, reason: collision with root package name */
    public final RealtimeSinceBootClock f340531c;

    /* compiled from: HttpUrlConnectionNetworkFetcher.java */
    public static class a extends A {

        /* renamed from: f, reason: collision with root package name */
        public long f340532f;

        /* renamed from: g, reason: collision with root package name */
        public long f340533g;

        /* renamed from: h, reason: collision with root package name */
        public long f340534h;

        public a() {
            throw null;
        }
    }

    public D() {
        this(RealtimeSinceBootClock.get());
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final A a(InterfaceC36410l interfaceC36410l, k0 k0Var) {
        return new a(interfaceC36410l, k0Var);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36397c, com.facebook.imagepipeline.producers.V
    public final void b(A a12) {
        ((a) a12).f340534h = this.f340531c.now();
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC36397c, com.facebook.imagepipeline.producers.V
    public final Map d(A a12, int i12) {
        a aVar = (a) a12;
        HashMap map = new HashMap(4);
        map.put("queue_time", Long.toString(aVar.f340533g - aVar.f340532f));
        map.put("fetch_time", Long.toString(aVar.f340534h - aVar.f340533g));
        map.put("total_time", Long.toString(aVar.f340534h - aVar.f340532f));
        map.put("image_size", Integer.toString(i12));
        return map;
    }

    @Override // com.facebook.imagepipeline.producers.V
    public final void e(A a12, V.a aVar) {
        a aVar2 = (a) a12;
        aVar2.f340532f = this.f340531c.now();
        aVar2.f340513b.b(new C(this.f340530b.submit(new B(this, aVar2, aVar)), aVar));
    }

    public final HttpURLConnection f(Uri uri, int i12) throws IOException {
        URL url;
        String str;
        Uri uri2 = com.facebook.common.util.g.f339869a;
        if (uri == null) {
            url = null;
        } else {
            try {
                url = new URL(uri.toString());
            } catch (MalformedURLException e12) {
                throw new RuntimeException(e12);
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f340529a);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 300) {
            return httpURLConnection;
        }
        if (responseCode != 307 && responseCode != 308) {
            switch (responseCode) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    httpURLConnection.disconnect();
                    throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
            }
        }
        String headerField = httpURLConnection.getHeaderField("Location");
        httpURLConnection.disconnect();
        Uri uri3 = headerField != null ? Uri.parse(headerField) : null;
        String scheme = uri.getScheme();
        if (i12 > 0 && uri3 != null && !com.facebook.common.internal.n.a(uri3.getScheme(), scheme)) {
            return f(uri3, i12 - 1);
        }
        if (i12 == 0) {
            String string = uri.toString();
            Locale.getDefault();
            str = "URL " + string + " follows too many redirects";
        } else {
            str = String.format(Locale.getDefault(), "URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
        }
        throw new IOException(str);
    }

    @j.k0
    public D(RealtimeSinceBootClock realtimeSinceBootClock) {
        this.f340530b = Executors.newFixedThreadPool(3);
        this.f340531c = realtimeSinceBootClock;
    }
}
