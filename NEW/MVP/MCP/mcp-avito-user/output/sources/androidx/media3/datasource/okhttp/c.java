package androidx.media3.datasource.okhttp;

import android.net.Uri;
import androidx.media3.common.A;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.j;
import androidx.media3.datasource.o;
import androidx.media3.datasource.t;
import com.adjust.sdk.network.ErrorCodes;
import com.google.common.base.N;
import com.google.common.util.concurrent.e1;
import j.P;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: OkHttpDataSource.java */
/* loaded from: classes.dex */
public class c extends androidx.media3.datasource.d implements HttpDataSource {

    /* renamed from: e, reason: collision with root package name */
    public final Call.Factory f48266e;

    /* renamed from: f, reason: collision with root package name */
    public final HttpDataSource.c f48267f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public final String f48268g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final CacheControl f48269h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public final HttpDataSource.c f48270i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final N<String> f48271j;

    /* renamed from: k, reason: collision with root package name */
    @P
    public Response f48272k;

    /* renamed from: l, reason: collision with root package name */
    @P
    public InputStream f48273l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f48274m;

    /* renamed from: n, reason: collision with root package name */
    public long f48275n;

    /* renamed from: o, reason: collision with root package name */
    public long f48276o;

    /* compiled from: OkHttpDataSource.java */
    public static final class a implements HttpDataSource.b {

        /* renamed from: a, reason: collision with root package name */
        public final HttpDataSource.c f48277a = new HttpDataSource.c();

        /* renamed from: b, reason: collision with root package name */
        public final Call.Factory f48278b;

        public a(Call.Factory factory) {
            this.f48278b = factory;
        }

        @Override // androidx.media3.datasource.HttpDataSource.b, androidx.media3.datasource.j.a
        @J
        public final j a() {
            HttpDataSource.c cVar = this.f48277a;
            return new c(this.f48278b, null, null, cVar, null, null);
        }

        @Override // androidx.media3.datasource.HttpDataSource.b, androidx.media3.datasource.j.a
        @J
        public final HttpDataSource a() {
            HttpDataSource.c cVar = this.f48277a;
            return new c(this.f48278b, null, null, cVar, null, null);
        }
    }

    static {
        A.a("media3.datasource.okhttp");
    }

    public /* synthetic */ c(Call.Factory factory, String str, CacheControl cacheControl, HttpDataSource.c cVar, N n12, b bVar) {
        this(factory, str, cacheControl, cVar, n12);
    }

    @Override // androidx.media3.datasource.j
    @J
    public final Map<String, List<String>> c() {
        Response response = this.f48272k;
        return response == null ? Collections.emptyMap() : response.headers().toMultimap();
    }

    @Override // androidx.media3.datasource.j
    @J
    public final void close() throws IOException {
        if (this.f48274m) {
            this.f48274m = false;
            l();
            o();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.datasource.j
    @J
    public final long e(o oVar) throws IOException {
        long j12 = 0;
        this.f48276o = 0L;
        this.f48275n = 0L;
        m(oVar);
        long j13 = oVar.f48250f;
        HttpUrl httpUrl = HttpUrl.parse(oVar.f48245a.toString());
        if (httpUrl == null) {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", ErrorCodes.PROTOCOL_EXCEPTION);
        }
        Request.Builder builderUrl = new Request.Builder().url(httpUrl);
        CacheControl cacheControl = this.f48269h;
        if (cacheControl != null) {
            builderUrl.cacheControl(cacheControl);
        }
        HashMap map = new HashMap();
        HttpDataSource.c cVar = this.f48270i;
        if (cVar != null) {
            map.putAll(cVar.a());
        }
        map.putAll(this.f48267f.a());
        map.putAll(oVar.f48249e);
        for (Map.Entry entry : map.entrySet()) {
            builderUrl.header((String) entry.getKey(), (String) entry.getValue());
        }
        long j14 = oVar.f48251g;
        String strA = t.a(j13, j14);
        if (strA != null) {
            builderUrl.addHeader("Range", strA);
        }
        String str = this.f48268g;
        if (str != null) {
            builderUrl.addHeader("User-Agent", str);
        }
        if (!oVar.c(1)) {
            builderUrl.addHeader("Accept-Encoding", "identity");
        }
        int i12 = oVar.f48247c;
        byte[] bArr = oVar.f48248d;
        builderUrl.method(o.b(i12), bArr != null ? RequestBody.create((MediaType) null, bArr) : i12 == 2 ? RequestBody.create((MediaType) null, M.f47891e) : null);
        Call callNewCall = this.f48266e.newCall(builderUrl.build());
        try {
            e1 e1Var = new e1();
            callNewCall.enqueue(new b(e1Var));
            try {
                Response response = (Response) e1Var.get();
                this.f48272k = response;
                ResponseBody responseBodyBody = response.body();
                responseBodyBody.getClass();
                this.f48273l = responseBodyBody.byteStream();
                int iCode = response.code();
                boolean zIsSuccessful = response.isSuccessful();
                long j15 = oVar.f48250f;
                if (!zIsSuccessful) {
                    if (iCode == 416 && j15 == t.b(response.headers().get("Content-Range"))) {
                        this.f48274m = true;
                        n(oVar);
                        if (j14 != -1) {
                            return j14;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.f48273l;
                        inputStream.getClass();
                        M.N(inputStream);
                    } catch (IOException unused) {
                        int i13 = M.f47887a;
                    }
                    Map<String, List<String>> multimap = response.headers().toMultimap();
                    o();
                    DataSourceException dataSourceException = iCode == 416 ? new DataSourceException(2008) : null;
                    response.message();
                    throw new HttpDataSource.InvalidResponseCodeException(iCode, dataSourceException, multimap);
                }
                MediaType mediaTypeContentType = responseBodyBody.get$contentType();
                String mediaType = mediaTypeContentType != null ? mediaTypeContentType.getMediaType() : "";
                N<String> n12 = this.f48271j;
                if (n12 != null && !n12.apply(mediaType)) {
                    o();
                    throw new HttpDataSource.InvalidContentTypeException(mediaType);
                }
                if (iCode == 200 && j15 != 0) {
                    j12 = j15;
                }
                if (j14 != -1) {
                    this.f48275n = j14;
                } else {
                    long jContentLength = responseBodyBody.getContentLength();
                    this.f48275n = jContentLength != -1 ? jContentLength - j12 : -1L;
                }
                this.f48274m = true;
                n(oVar);
                try {
                    p(j12);
                    return this.f48275n;
                } catch (HttpDataSource.HttpDataSourceException e12) {
                    o();
                    throw e12;
                }
            } catch (InterruptedException unused2) {
                callNewCall.cancel();
                throw new InterruptedIOException();
            } catch (ExecutionException e13) {
                throw new IOException(e13);
            }
        } catch (IOException e14) {
            throw HttpDataSource.HttpDataSourceException.b(e14, 1);
        }
    }

    @Override // androidx.media3.datasource.j
    @J
    @P
    public final Uri getUri() {
        Response response = this.f48272k;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().getUrl());
    }

    public final void o() throws IOException {
        Response response = this.f48272k;
        if (response != null) {
            ResponseBody responseBodyBody = response.body();
            responseBodyBody.getClass();
            responseBodyBody.close();
            this.f48272k = null;
        }
        this.f48273l = null;
    }

    public final void p(long j12) throws IOException {
        if (j12 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j12 > 0) {
            try {
                int iMin = (int) Math.min(j12, 4096);
                InputStream inputStream = this.f48273l;
                int i12 = M.f47887a;
                int i13 = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i13 == -1) {
                    throw new HttpDataSource.HttpDataSourceException(2008);
                }
                j12 -= i13;
                k(i13);
            } catch (IOException e12) {
                if (!(e12 instanceof HttpDataSource.HttpDataSourceException)) {
                    throw new HttpDataSource.HttpDataSourceException(2000);
                }
                throw ((HttpDataSource.HttpDataSourceException) e12);
            }
        }
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
            long r0 = r6.f48275n     // Catch: java.io.IOException -> L33
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1e
            long r4 = r6.f48276o     // Catch: java.io.IOException -> L33
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
            java.io.InputStream r0 = r6.f48273l     // Catch: java.io.IOException -> L33
            int r1 = androidx.media3.common.util.M.f47887a     // Catch: java.io.IOException -> L33
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L33
            if (r7 != r3) goto L29
            goto L16
        L29:
            long r8 = r6.f48276o     // Catch: java.io.IOException -> L33
            long r0 = (long) r7     // Catch: java.io.IOException -> L33
            long r8 = r8 + r0
            r6.f48276o = r8     // Catch: java.io.IOException -> L33
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.datasource.okhttp.c.read(byte[], int, int):int");
    }

    public c(Call.Factory factory, @P String str, @P CacheControl cacheControl, @P HttpDataSource.c cVar, @P N<String> n12) {
        super(true);
        factory.getClass();
        this.f48266e = factory;
        this.f48268g = str;
        this.f48269h = cacheControl;
        this.f48270i = cVar;
        this.f48271j = n12;
        this.f48267f = new HttpDataSource.c();
    }
}
