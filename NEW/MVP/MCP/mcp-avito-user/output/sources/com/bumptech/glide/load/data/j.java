package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import j.N;
import j.k0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes5.dex */
public class j implements d<InputStream> {

    /* renamed from: h, reason: collision with root package name */
    @k0
    public static final a f338863h = new a();

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.load.model.g f338864b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338865c;

    /* renamed from: d, reason: collision with root package name */
    public final a f338866d;

    /* renamed from: e, reason: collision with root package name */
    public HttpURLConnection f338867e;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f338868f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f338869g;

    /* compiled from: HttpUrlFetcher.java */
    public static class a implements b {
    }

    /* compiled from: HttpUrlFetcher.java */
    public interface b {
    }

    public j(com.bumptech.glide.load.model.g gVar, int i12) {
        a aVar = f338863h;
        this.f338864b = gVar;
        this.f338865c = i12;
        this.f338866d = aVar;
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() throws IOException {
        InputStream inputStream = this.f338868f;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f338867e;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f338867e = null;
    }

    public final InputStream c(URL url, int i12, URL url2, Map<String, String> map) throws IOException {
        if (i12 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        this.f338866d.getClass();
        this.f338867e = (HttpURLConnection) url.openConnection();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f338867e.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f338867e.setConnectTimeout(this.f338865c);
        this.f338867e.setReadTimeout(this.f338865c);
        this.f338867e.setUseCaches(false);
        this.f338867e.setDoInput(true);
        this.f338867e.setInstanceFollowRedirects(false);
        this.f338867e.connect();
        this.f338868f = this.f338867e.getInputStream();
        if (this.f338869g) {
            return null;
        }
        int responseCode = this.f338867e.getResponseCode();
        int i13 = responseCode / 100;
        if (i13 == 2) {
            HttpURLConnection httpURLConnection = this.f338867e;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f338868f = new com.bumptech.glide.util.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.f338868f = httpURLConnection.getInputStream();
            }
            return this.f338868f;
        }
        if (i13 != 3) {
            if (responseCode == -1) {
                throw new HttpException(AK.c.g(responseCode, "Http request failed with status code: "), null);
            }
            throw new HttpException(this.f338867e.getResponseMessage(), null);
        }
        String headerField = this.f338867e.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url", null);
        }
        URL url3 = new URL(url, headerField);
        b();
        return c(url3, i12 + 1, url, map);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
        this.f338869g = true;
    }

    @Override // com.bumptech.glide.load.data.d
    @N
    public final DataSource d() {
        return DataSource.f338828c;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(@N Priority priority, @N d.a<? super InputStream> aVar) {
        com.bumptech.glide.load.model.g gVar = this.f338864b;
        int i12 = com.bumptech.glide.util.g.f339641a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.c(c(gVar.d(), 0, null, gVar.f339219b.b()));
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            } catch (IOException e12) {
                Log.isLoggable("HttpUrlFetcher", 3);
                aVar.f(e12);
                if (!Log.isLoggable("HttpUrlFetcher", 2)) {
                    return;
                }
            }
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th2;
        }
    }
}
