package androidx.media3.datasource;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.camera.camera2.internal.G;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.HttpDataSource;
import com.adjust.sdk.Constants;
import com.google.common.base.N;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.M0;
import com.google.common.collect.M2;
import com.google.common.collect.W3;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import j.P;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes.dex */
public class r extends d implements HttpDataSource {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48292e;

    /* renamed from: f, reason: collision with root package name */
    public final int f48293f;

    /* renamed from: g, reason: collision with root package name */
    public final int f48294g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final String f48295h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final HttpDataSource.c f48296i;

    /* renamed from: j, reason: collision with root package name */
    public final HttpDataSource.c f48297j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f48298k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final N<String> f48299l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public HttpURLConnection f48300m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public InputStream f48301n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f48302o;

    /* renamed from: p, reason: collision with root package name */
    public int f48303p;

    /* renamed from: q, reason: collision with root package name */
    public long f48304q;

    /* renamed from: r, reason: collision with root package name */
    public long f48305r;

    /* compiled from: DefaultHttpDataSource.java */
    public static final class b implements HttpDataSource.b {

        /* renamed from: a, reason: collision with root package name */
        public final HttpDataSource.c f48306a = new HttpDataSource.c();

        /* renamed from: b, reason: collision with root package name */
        public final int f48307b = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: c, reason: collision with root package name */
        public final int f48308c = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        @Override // androidx.media3.datasource.HttpDataSource.b, androidx.media3.datasource.j.a
        @J
        public final j a() {
            return new r(null, this.f48307b, this.f48308c, false, this.f48306a, null, false);
        }

        @Override // androidx.media3.datasource.HttpDataSource.b, androidx.media3.datasource.j.a
        @J
        public final HttpDataSource a() {
            return new r(null, this.f48307b, this.f48308c, false, this.f48306a, null, false);
        }
    }

    /* compiled from: DefaultHttpDataSource.java */
    public static class c extends M0<String, List<String>> {

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, List<String>> f48309b;

        public c(Map<String, List<String>> map) {
            this.f48309b = map;
        }

        @Override // com.google.common.collect.M0, com.google.common.collect.S0
        public final Object X() {
            return this.f48309b;
        }

        @Override // com.google.common.collect.M0
        /* renamed from: Y */
        public final Map<String, List<String>> X() {
            return this.f48309b;
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final boolean containsKey(@P Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final boolean containsValue(@P Object obj) {
            return Z(obj);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return W3.d(super.entrySet(), new s(0));
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final boolean equals(@P Object obj) {
            return obj != null && M2.d(this, obj);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        @P
        public final Object get(@P Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final int hashCode() {
            return W3.e(entrySet());
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final Set<String> keySet() {
            return W3.d(super.keySet(), new s(1));
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public static void s(@P HttpURLConnection httpURLConnection, long j12) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i12;
        if (httpURLConnection == null || (i12 = M.f47887a) < 19 || i12 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j12 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j12 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.media3.datasource.j
    @J
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f48300m;
        return httpURLConnection == null ? AbstractC37412t1.n() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.j
    @J
    public final void close() {
        try {
            InputStream inputStream = this.f48301n;
            if (inputStream != null) {
                long j12 = this.f48304q;
                long j13 = -1;
                if (j12 != -1) {
                    j13 = j12 - this.f48305r;
                }
                s(this.f48300m, j13);
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    int i12 = M.f47887a;
                    throw new HttpDataSource.HttpDataSourceException(e12, 2000, 3);
                }
            }
        } finally {
            this.f48301n = null;
            o();
            if (this.f48302o) {
                this.f48302o = false;
                l();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    @Override // androidx.media3.datasource.j
    @androidx.media3.common.util.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(androidx.media3.datasource.o r18) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.r.e(androidx.media3.datasource.o):long");
    }

    @Override // androidx.media3.datasource.j
    @J
    @P
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f48300m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void o() {
        HttpURLConnection httpURLConnection = this.f48300m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e12) {
                androidx.media3.common.util.s.d("Unexpected error while disconnecting", e12);
            }
            this.f48300m = null;
        }
    }

    public final URL p(URL url, @P String str) throws HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource.HttpDataSourceException(G.f("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f48292e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e12) {
            throw new HttpDataSource.HttpDataSourceException(e12, 2001, 1);
        }
    }

    public final HttpURLConnection q(o oVar) throws IOException {
        HttpURLConnection httpURLConnectionR;
        o oVar2 = oVar;
        URL url = new URL(oVar2.f48245a.toString());
        boolean zC2 = oVar2.c(1);
        boolean z12 = this.f48292e;
        boolean z13 = this.f48298k;
        int i12 = oVar2.f48247c;
        byte[] bArr = oVar2.f48248d;
        long j12 = oVar2.f48250f;
        long j13 = oVar2.f48251g;
        if (!z12 && !z13) {
            return r(url, i12, bArr, j12, j13, zC2, true, oVar2.f48249e);
        }
        int i13 = 0;
        URL urlP = url;
        int i14 = i12;
        byte[] bArr2 = bArr;
        while (true) {
            int i15 = i13 + 1;
            if (i13 > 20) {
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException(AK.c.g(i15, "Too many redirects: ")), 2001, 1);
            }
            Map<String, String> map = oVar2.f48249e;
            int i16 = i14;
            long j14 = j13;
            URL url2 = urlP;
            long j15 = j12;
            httpURLConnectionR = r(urlP, i14, bArr2, j12, j13, zC2, false, map);
            int responseCode = httpURLConnectionR.getResponseCode();
            String headerField = httpURLConnectionR.getHeaderField("Location");
            if ((i16 == 1 || i16 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionR.disconnect();
                urlP = p(url2, headerField);
                i14 = i16;
            } else {
                if (i16 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionR.disconnect();
                if (z13 && responseCode == 302) {
                    i14 = i16;
                } else {
                    bArr2 = null;
                    i14 = 1;
                }
                urlP = p(url2, headerField);
            }
            oVar2 = oVar;
            i13 = i15;
            j13 = j14;
            j12 = j15;
        }
        return httpURLConnectionR;
    }

    public final HttpURLConnection r(URL url, int i12, @P byte[] bArr, long j12, long j13, boolean z12, boolean z13, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f48293f);
        httpURLConnection.setReadTimeout(this.f48294g);
        HashMap map2 = new HashMap();
        HttpDataSource.c cVar = this.f48296i;
        if (cVar != null) {
            map2.putAll(cVar.a());
        }
        map2.putAll(this.f48297j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = t.a(j12, j13);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str = this.f48295h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z12 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z13);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(o.b(i12));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // androidx.media3.common.InterfaceC23102m
    @androidx.media3.common.util.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L32
        L4:
            long r0 = r6.f48304q     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.f48305r     // Catch: java.io.IOException -> L33
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L18
        L16:
            r7 = r3
            goto L32
        L18:
            long r4 = (long) r9     // Catch: java.io.IOException -> L33
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L33
            int r9 = (int) r0     // Catch: java.io.IOException -> L33
        L1e:
            java.io.InputStream r0 = r6.f48301n     // Catch: java.io.IOException -> L33
            int r1 = androidx.media3.common.util.M.f47887a     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.f48305r     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f48305r = r8     // Catch: java.io.IOException -> L33
            r6.k(r7)     // Catch: java.io.IOException -> L33
        L32:
            return r7
        L33:
            r7 = move-exception
            int r8 = androidx.media3.common.util.M.f47887a
            r8 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r7 = androidx.media3.datasource.HttpDataSource.HttpDataSourceException.b(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.r.read(byte[], int, int):int");
    }

    public final void t(long j12) throws IOException {
        if (j12 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j12 > 0) {
            int iMin = (int) Math.min(j12, 4096);
            InputStream inputStream = this.f48301n;
            int i12 = M.f47887a;
            int i13 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i13 == -1) {
                throw new HttpDataSource.HttpDataSourceException(2008);
            }
            j12 -= i13;
            k(i13);
        }
    }

    @J
    @Deprecated
    public r() {
        this(null, JosStatusCodes.RTN_CODE_COMMON_ERROR, JosStatusCodes.RTN_CODE_COMMON_ERROR, false, null, null, false);
    }

    public r(@P String str, int i12, int i13, boolean z12, @P HttpDataSource.c cVar, @P N<String> n12, boolean z13) {
        super(true);
        this.f48295h = str;
        this.f48293f = i12;
        this.f48294g = i13;
        this.f48292e = z12;
        this.f48296i = cVar;
        this.f48299l = n12;
        this.f48297j = new HttpDataSource.c();
        this.f48298k = z13;
    }
}
