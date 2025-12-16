package io.sentry.connection;

import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: HttpConnection.java */
/* loaded from: classes8.dex */
public class g extends io.sentry.connection.a {

    /* renamed from: n, reason: collision with root package name */
    public static final Charset f405124n = Charset.forName(Constants.ENCODING);

    /* renamed from: o, reason: collision with root package name */
    public static final org.slf4j.a f405125o = org.slf4j.b.d(g.class);

    /* renamed from: p, reason: collision with root package name */
    public static final int f405126p;

    /* renamed from: q, reason: collision with root package name */
    public static final int f405127q;

    /* renamed from: r, reason: collision with root package name */
    public static final HostnameVerifier f405128r;

    /* renamed from: g, reason: collision with root package name */
    public final URL f405129g;

    /* renamed from: h, reason: collision with root package name */
    public final Proxy f405130h;

    /* renamed from: i, reason: collision with root package name */
    public final l f405131i;

    /* renamed from: j, reason: collision with root package name */
    public io.sentry.marshaller.json.e f405132j;

    /* renamed from: k, reason: collision with root package name */
    public int f405133k;

    /* renamed from: l, reason: collision with root package name */
    public int f405134l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f405135m;

    /* compiled from: HttpConnection.java */
    public static class a implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        public final boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f405126p = (int) timeUnit.toMillis(1L);
        f405127q = (int) timeUnit.toMillis(5L);
        f405128r = new a();
    }

    public g(URL url, String str, String str2, Proxy proxy, l lVar) {
        super(str, str2);
        this.f405133k = f405126p;
        this.f405134l = f405127q;
        this.f405135m = false;
        this.f405129g = url;
        this.f405130h = proxy;
        this.f405131i = lVar;
    }

    public static String b(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f405124n));
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = true;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!z12) {
                    sb2.append("\n");
                }
                sb2.append(line);
                z12 = false;
            } catch (Exception e12) {
                f405125o.l("Exception while reading the error message from the connection.", e12);
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8 A[Catch: all -> 0x009f, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #3 {IOException -> 0x00f2, blocks: (B:38:0x00c8, B:44:0x00e9, B:45:0x00f0), top: B:68:0x00c6 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    @Override // io.sentry.connection.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(io.sentry.event.Event r10) throws java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.connection.g.a(io.sentry.event.Event):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
