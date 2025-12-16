package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.adjust.sdk.Constants;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.yandex.mobile.ads.impl.gn;
import java.io.ByteArrayOutputStream;
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
import java.util.zip.GZIPInputStream;

/* loaded from: classes8.dex */
public class wo extends we {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f391455e;

    /* renamed from: f, reason: collision with root package name */
    private final int f391456f;

    /* renamed from: g, reason: collision with root package name */
    private final int f391457g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private final String f391458h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private final h10 f391459i;

    /* renamed from: j, reason: collision with root package name */
    private final h10 f391460j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f391461k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private ju0<String> f391462l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private HttpURLConnection f391463m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private InputStream f391464n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f391465o;

    /* renamed from: p, reason: collision with root package name */
    private int f391466p;

    /* renamed from: q, reason: collision with root package name */
    private long f391467q;

    /* renamed from: r, reason: collision with root package name */
    private long f391468r;

    public static final class a implements gn.a {

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private String f391470b;

        /* renamed from: a, reason: collision with root package name */
        private final h10 f391469a = new h10();

        /* renamed from: c, reason: collision with root package name */
        private int f391471c = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        /* renamed from: d, reason: collision with root package name */
        private int f391472d = JosStatusCodes.RTN_CODE_COMMON_ERROR;

        @Override // com.yandex.mobile.ads.impl.gn.a
        public final gn a() {
            return new wo(this.f391470b, this.f391471c, this.f391472d, false, this.f391469a);
        }

        public final a b() {
            this.f391470b = null;
            return this;
        }
    }

    public static class b extends com.yandex.mobile.ads.embedded.guava.collect.k<String, List<String>> {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, List<String>> f391473a;

        public b(Map<String, List<String>> map) {
            this.f391473a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(String str) {
            return str != null;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k
        public final Map<String, List<String>> b() {
            return this.f391473a;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final boolean containsKey(@j.P Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(@j.P Object obj) {
            return a(obj);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return com.yandex.mobile.ads.embedded.guava.collect.m0.a(super.entrySet(), (ju0) new Z1(1));
        }

        @Override // java.util.Map
        public final boolean equals(@j.P Object obj) {
            return obj != null && b(obj);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        @j.P
        public final Object get(@j.P Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return c();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final Set<String> keySet() {
            return com.yandex.mobile.ads.embedded.guava.collect.m0.a(super.keySet(), (ju0) new Z1(0));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.k, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.l
        public final Map a() {
            return this.f391473a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean a(Map.Entry entry) {
            return entry.getKey() != null;
        }
    }

    public wo(@j.P String str, int i12, int i13, boolean z12, @j.P h10 h10Var) {
        super(true);
        this.f391458h = str;
        this.f391456f = i12;
        this.f391457g = i13;
        this.f391455e = z12;
        this.f391459i = h10Var;
        this.f391462l = null;
        this.f391460j = new h10();
        this.f391461k = false;
    }

    private void g() {
        HttpURLConnection httpURLConnection = this.f391463m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e12) {
                ka0.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e12);
            }
            this.f391463m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final long a(kn knVar) throws IOException {
        long j12 = 0;
        this.f391468r = 0L;
        this.f391467q = 0L;
        b(knVar);
        try {
            HttpURLConnection httpURLConnectionD = d(knVar);
            this.f391463m = httpURLConnectionD;
            this.f391466p = httpURLConnectionD.getResponseCode();
            httpURLConnectionD.getResponseMessage();
            int i12 = this.f391466p;
            if (i12 < 200 || i12 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
                if (this.f391466p == 416) {
                    if (knVar.f387197f == t10.a(httpURLConnectionD.getHeaderField("Content-Range"))) {
                        this.f391465o = true;
                        c(knVar);
                        long j13 = knVar.f387198g;
                        if (j13 != -1) {
                            return j13;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionD.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i13 = pc1.f388768a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i14 = errorStream.read(bArr);
                            if (i14 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i14);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i15 = pc1.f388768a;
                    }
                } catch (IOException unused) {
                    int i16 = pc1.f388768a;
                }
                g();
                throw new g10(this.f391466p, this.f391466p == 416 ? new hn(2008) : null, headerFields);
            }
            String contentType = httpURLConnectionD.getContentType();
            ju0<String> ju0Var = this.f391462l;
            if (ju0Var != null && !ju0Var.apply(contentType)) {
                g();
                throw new f10(contentType);
            }
            if (this.f391466p == 200) {
                long j14 = knVar.f387197f;
                if (j14 != 0) {
                    j12 = j14;
                }
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionD.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                this.f391467q = knVar.f387198g;
            } else {
                long j15 = knVar.f387198g;
                if (j15 != -1) {
                    this.f391467q = j15;
                } else {
                    long jA2 = t10.a(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField("Content-Range"));
                    this.f391467q = jA2 != -1 ? jA2 - j12 : -1L;
                }
            }
            try {
                this.f391464n = httpURLConnectionD.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f391464n = new GZIPInputStream(this.f391464n);
                }
                this.f391465o = true;
                c(knVar);
                try {
                    a(j12);
                    return this.f391467q;
                } catch (IOException e12) {
                    g();
                    if (e12 instanceof e10) {
                        throw ((e10) e12);
                    }
                    throw new e10(e12, 2000, 1);
                }
            } catch (IOException e13) {
                g();
                throw new e10(e13, 2000, 1);
            }
        } catch (IOException e14) {
            g();
            throw e10.a(e14, 1);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f391463m;
        return httpURLConnection == null ? com.yandex.mobile.ads.embedded.guava.collect.q.h() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // com.yandex.mobile.ads.impl.gn
    public final void close() {
        try {
            InputStream inputStream = this.f391464n;
            if (inputStream != null) {
                long j12 = this.f391467q;
                long j13 = -1;
                if (j12 != -1) {
                    j13 = j12 - this.f391468r;
                }
                a(this.f391463m, j13);
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    int i12 = pc1.f388768a;
                    throw new e10(e12, 2000, 3);
                }
            }
        } finally {
            this.f391464n = null;
            g();
            if (this.f391465o) {
                this.f391465o = false;
                f();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.gn
    @j.P
    public final Uri d() {
        HttpURLConnection httpURLConnection = this.f391463m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: IOException -> 0x001e, TRY_LEAVE, TryCatch #0 {IOException -> 0x001e, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0017, B:12:0x0020, B:15:0x002c), top: B:19:0x0004 }] */
    @Override // com.yandex.mobile.ads.impl.dn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L35
        L4:
            long r0 = r6.f391467q     // Catch: java.io.IOException -> L1e
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L20
            long r4 = r6.f391468r     // Catch: java.io.IOException -> L1e
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L2a
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L1e
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L1e
            int r9 = (int) r0     // Catch: java.io.IOException -> L1e
            goto L20
        L1e:
            r7 = move-exception
            goto L36
        L20:
            java.io.InputStream r0 = r6.f391464n     // Catch: java.io.IOException -> L1e
            int r1 = com.yandex.mobile.ads.impl.pc1.f388768a     // Catch: java.io.IOException -> L1e
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L1e
            if (r7 != r3) goto L2c
        L2a:
            r7 = r3
            goto L35
        L2c:
            long r8 = r6.f391468r     // Catch: java.io.IOException -> L1e
            long r0 = (long) r7     // Catch: java.io.IOException -> L1e
            long r8 = r8 + r0
            r6.f391468r = r8     // Catch: java.io.IOException -> L1e
            r6.c(r7)     // Catch: java.io.IOException -> L1e
        L35:
            return r7
        L36:
            int r8 = com.yandex.mobile.ads.impl.pc1.f388768a
            r8 = 2
            com.yandex.mobile.ads.impl.e10 r7 = com.yandex.mobile.ads.impl.e10.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.wo.read(byte[], int, int):int");
    }

    private HttpURLConnection d(kn knVar) throws IOException {
        HttpURLConnection httpURLConnectionA;
        kn knVar2 = knVar;
        URL url = new URL(knVar2.f387192a.toString());
        int i12 = knVar2.f387194c;
        byte[] bArr = knVar2.f387195d;
        long j12 = knVar2.f387197f;
        long j13 = knVar2.f387198g;
        boolean zA2 = knVar2.a(1);
        if (!this.f391455e && !this.f391461k) {
            return a(url, i12, bArr, j12, j13, zA2, true, knVar2.f387196e);
        }
        int i13 = 0;
        URL urlA = url;
        int i14 = i12;
        byte[] bArr2 = bArr;
        while (true) {
            int i15 = i13 + 1;
            if (i13 > 20) {
                throw new e10(new NoRouteToHostException(ba.a("Too many redirects: ", i15)), 2001, 1);
            }
            Map<String, String> map = knVar2.f387196e;
            int i16 = i14;
            URL url2 = urlA;
            long j14 = j13;
            httpURLConnectionA = a(urlA, i14, bArr2, j12, j13, zA2, false, map);
            int responseCode = httpURLConnectionA.getResponseCode();
            String headerField = httpURLConnectionA.getHeaderField("Location");
            if ((i16 == 1 || i16 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionA.disconnect();
                urlA = a(url2, headerField);
                i14 = i16;
                i13 = i15;
                j13 = j14;
                knVar2 = knVar;
            } else {
                if (i16 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                httpURLConnectionA.disconnect();
                if (this.f391461k && responseCode == 302) {
                    i14 = i16;
                } else {
                    bArr2 = null;
                    i14 = 1;
                }
                urlA = a(url2, headerField);
                knVar2 = knVar;
                i13 = i15;
                j13 = j14;
            }
        }
        return httpURLConnectionA;
    }

    private HttpURLConnection a(URL url, int i12, @j.P byte[] bArr, long j12, long j13, boolean z12, boolean z13, Map<String, String> map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnectionA = a(url);
        httpURLConnectionA.setConnectTimeout(this.f391456f);
        httpURLConnectionA.setReadTimeout(this.f391457g);
        HashMap map2 = new HashMap();
        h10 h10Var = this.f391459i;
        if (h10Var != null) {
            map2.putAll(h10Var.a());
        }
        map2.putAll(this.f391460j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i13 = t10.f390059c;
        if (j12 == 0 && j13 == -1) {
            string = null;
        } else {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j12, "bytes=", "-");
            if (j13 != -1) {
                sbQ.append((j12 + j13) - 1);
            }
            string = sbQ.toString();
        }
        if (string != null) {
            httpURLConnectionA.setRequestProperty("Range", string);
        }
        String str2 = this.f391458h;
        if (str2 != null) {
            httpURLConnectionA.setRequestProperty("User-Agent", str2);
        }
        httpURLConnectionA.setRequestProperty("Accept-Encoding", z12 ? "gzip" : "identity");
        httpURLConnectionA.setInstanceFollowRedirects(z13);
        httpURLConnectionA.setDoOutput(bArr != null);
        int i14 = kn.f387191k;
        if (i12 == 1) {
            str = "GET";
        } else if (i12 == 2) {
            str = "POST";
        } else if (i12 == 3) {
            str = "HEAD";
        } else {
            throw new IllegalStateException();
        }
        httpURLConnectionA.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnectionA.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionA.connect();
            OutputStream outputStream = httpURLConnectionA.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionA.connect();
        }
        return httpURLConnectionA;
    }

    @j.k0
    public HttpURLConnection a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    private URL a(URL url, @j.P String str) throws e10 {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!Constants.SCHEME.equals(protocol) && !"http".equals(protocol)) {
                    throw new e10(up1.a("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (this.f391455e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                StringBuilder sbA = Cif.a("Disallowed cross-protocol redirect (");
                sbA.append(url.getProtocol());
                sbA.append(" to ");
                sbA.append(protocol);
                sbA.append(")");
                throw new e10(sbA.toString(), 2001);
            } catch (MalformedURLException e12) {
                throw new e10(e12, 2001, 1);
            }
        }
        throw new e10("Null location redirect", 2001);
    }

    private void a(long j12) throws IOException {
        if (j12 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j12 > 0) {
            int iMin = (int) Math.min(j12, 4096);
            InputStream inputStream = this.f391464n;
            int i12 = pc1.f388768a;
            int i13 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new e10(new InterruptedIOException(), 2000, 1);
            }
            if (i13 != -1) {
                j12 -= i13;
                c(i13);
            } else {
                throw new e10(2008);
            }
        }
    }

    private static void a(@j.P HttpURLConnection httpURLConnection, long j12) throws IllegalAccessException, NoSuchMethodException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i12;
        if (httpURLConnection == null || (i12 = pc1.f388768a) < 19 || i12 > 20) {
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
}
