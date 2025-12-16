package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
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
/* loaded from: classes6.dex */
public class v extends AbstractC36575e implements HttpDataSource {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f347997e;

    /* renamed from: f, reason: collision with root package name */
    public final int f347998f;

    /* renamed from: g, reason: collision with root package name */
    public final int f347999g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final String f348000h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final HttpDataSource.c f348001i;

    /* renamed from: j, reason: collision with root package name */
    public final HttpDataSource.c f348002j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f348003k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public final com.google.common.base.N<String> f348004l;

    /* renamed from: m, reason: collision with root package name */
    @P
    public HttpURLConnection f348005m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public InputStream f348006n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f348007o;

    /* renamed from: p, reason: collision with root package name */
    public int f348008p;

    /* renamed from: q, reason: collision with root package name */
    public long f348009q;

    /* renamed from: r, reason: collision with root package name */
    public long f348010r;

    /* compiled from: DefaultHttpDataSource.java */
    public static final class b implements HttpDataSource.b {

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f348012b;

        /* renamed from: e, reason: collision with root package name */
        public boolean f348015e;

        /* renamed from: a, reason: collision with root package name */
        public final HttpDataSource.c f348011a = new HttpDataSource.c();

        /* renamed from: c, reason: collision with root package name */
        public int f348013c = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: d, reason: collision with root package name */
        public int f348014d = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b, com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final InterfaceC36583m a() {
            return new v(this.f348012b, this.f348013c, this.f348014d, this.f348015e, this.f348011a, null, false);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b, com.google.android.exoplayer2.upstream.InterfaceC36583m.a
        public final HttpDataSource a() {
            return new v(this.f348012b, this.f348013c, this.f348014d, this.f348015e, this.f348011a, null, false);
        }
    }

    /* compiled from: DefaultHttpDataSource.java */
    public static class c extends M0<String, List<String>> {

        /* renamed from: b, reason: collision with root package name */
        public final Map<String, List<String>> f348016b;

        public c(Map<String, List<String>> map) {
            this.f348016b = map;
        }

        @Override // com.google.common.collect.M0, com.google.common.collect.S0
        public final Object X() {
            return this.f348016b;
        }

        @Override // com.google.common.collect.M0
        /* renamed from: Y */
        public final Map<String, List<String>> X() {
            return this.f348016b;
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
            return W3.d(super.entrySet(), new w(1));
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
            return W3.d(super.keySet(), new w(0));
        }

        @Override // com.google.common.collect.M0, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    public static void t(@P HttpURLConnection httpURLConnection, long j12) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i12;
        if (httpURLConnection == null || (i12 = U.f348106a) < 19 || i12 > 20) {
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

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final Map<String, List<String>> c() {
        HttpURLConnection httpURLConnection = this.f348005m;
        return httpURLConnection == null ? AbstractC37412t1.n() : new c(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    public final void close() {
        try {
            InputStream inputStream = this.f348006n;
            if (inputStream != null) {
                long j12 = this.f348009q;
                long j13 = -1;
                if (j12 != -1) {
                    j13 = j12 - this.f348010r;
                }
                t(this.f348005m, j13);
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    int i12 = U.f348106a;
                    throw new HttpDataSource.HttpDataSourceException(e12, 2000, 3);
                }
            }
        } finally {
            this.f348006n = null;
            p();
            if (this.f348007o) {
                this.f348007o = false;
                m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013e  */
    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(com.google.android.exoplayer2.upstream.p r18) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.v.e(com.google.android.exoplayer2.upstream.p):long");
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36583m
    @P
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f348005m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void p() {
        HttpURLConnection httpURLConnection = this.f348005m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e12) {
                C36605v.a("Unexpected error while disconnecting", e12);
            }
            this.f348005m = null;
        }
    }

    public final URL q(URL url, @P String str) throws HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new HttpDataSource.HttpDataSourceException(androidx.camera.camera2.internal.G.f("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f347997e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e12) {
            throw new HttpDataSource.HttpDataSourceException(e12, 2001, 1);
        }
    }

    public final HttpURLConnection r(p pVar) throws IOException {
        HttpURLConnection httpURLConnectionS;
        p pVar2 = pVar;
        URL url = new URL(pVar2.f347929a.toString());
        int i12 = 0;
        boolean z12 = (pVar2.f347937i & 1) == 1;
        boolean z13 = this.f347997e;
        boolean z14 = this.f348003k;
        int i13 = pVar2.f347931c;
        byte[] bArr = pVar2.f347932d;
        long j12 = pVar2.f347934f;
        long j13 = pVar2.f347935g;
        if (!z13 && !z14) {
            return s(url, i13, bArr, j12, j13, z12, true, pVar2.f347933e);
        }
        URL urlQ = url;
        byte[] bArr2 = bArr;
        int i14 = i13;
        while (true) {
            int i15 = i12 + 1;
            if (i12 > 20) {
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException(AK.c.g(i15, "Too many redirects: ")), 2001, 1);
            }
            Map<String, String> map = pVar2.f347933e;
            int i16 = i14;
            long j14 = j13;
            URL url2 = urlQ;
            long j15 = j12;
            httpURLConnectionS = s(urlQ, i14, bArr2, j12, j13, z12, false, map);
            int responseCode = httpURLConnectionS.getResponseCode();
            String headerField = httpURLConnectionS.getHeaderField("Location");
            if ((i16 == 1 || i16 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionS.disconnect();
                urlQ = q(url2, headerField);
                i14 = i16;
            } else {
                if (i16 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionS.disconnect();
                if (z14 && responseCode == 302) {
                    i14 = i16;
                } else {
                    bArr2 = null;
                    i14 = 1;
                }
                urlQ = q(url2, headerField);
            }
            pVar2 = pVar;
            i12 = i15;
            j13 = j14;
            j12 = j15;
        }
        return httpURLConnectionS;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
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
            long r0 = r6.f348009q     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.f348010r     // Catch: java.io.IOException -> L33
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
            java.io.InputStream r0 = r6.f348006n     // Catch: java.io.IOException -> L33
            int r1 = com.google.android.exoplayer2.util.U.f348106a     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.f348010r     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f348010r = r8     // Catch: java.io.IOException -> L33
            r6.l(r7)     // Catch: java.io.IOException -> L33
        L32:
            return r7
        L33:
            r7 = move-exception
            int r8 = com.google.android.exoplayer2.util.U.f348106a
            r8 = 2
            com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException r7 = com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException.b(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.v.read(byte[], int, int):int");
    }

    public final HttpURLConnection s(URL url, int i12, @P byte[] bArr, long j12, long j13, boolean z12, boolean z13, Map<String, String> map) throws IOException {
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f347998f);
        httpURLConnection.setReadTimeout(this.f347999g);
        HashMap map2 = new HashMap();
        HttpDataSource.c cVar = this.f348001i;
        if (cVar != null) {
            map2.putAll(cVar.a());
        }
        map2.putAll(this.f348002j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = y.a(j12, j13);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        String str2 = this.f348000h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z12 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z13);
        httpURLConnection.setDoOutput(bArr != null);
        int i13 = p.f347928k;
        if (i12 == 1) {
            str = "GET";
        } else if (i12 == 2) {
            str = "POST";
        } else {
            if (i12 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
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

    public final void u(long j12) throws IOException {
        if (j12 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j12 > 0) {
            int iMin = (int) Math.min(j12, 4096);
            InputStream inputStream = this.f348006n;
            int i12 = U.f348106a;
            int i13 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i13 == -1) {
                throw new HttpDataSource.HttpDataSourceException();
            }
            j12 -= i13;
            l(i13);
        }
    }

    @Deprecated
    public v() {
        this(null, JosStatusCodes.RTN_CODE_COMMON_ERROR, JosStatusCodes.RTN_CODE_COMMON_ERROR, false, null, null, false);
    }

    public v(@P String str, int i12, int i13, boolean z12, @P HttpDataSource.c cVar, @P com.google.common.base.N<String> n12, boolean z13) {
        super(true);
        this.f348000h = str;
        this.f347998f = i12;
        this.f347999g = i13;
        this.f347997e = z12;
        this.f348001i = cVar;
        this.f348004l = n12;
        this.f348002j = new HttpDataSource.c();
        this.f348003k = z13;
    }
}
