package x40;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import java.io.IOException;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.CipherSuite;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.TlsVersion;
import okhttp3.internal.Util;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;
import okio.X;
import okio.Y;
import okio.c0;
import okio.e0;

/* compiled from: CacheEntry.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lx40/a;", "", "a", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x40.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49761a {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final String f442191l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final String f442192m;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final HttpUrl f442193a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Headers f442194b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f442195c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Protocol f442196d;

    /* renamed from: e, reason: collision with root package name */
    public final int f442197e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f442198f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Headers f442199g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Handshake f442200h;

    /* renamed from: i, reason: collision with root package name */
    public final long f442201i;

    /* renamed from: j, reason: collision with root package name */
    public final long f442202j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public String f442203k;

    /* compiled from: CacheEntry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lx40/a$a;", "", "<init>", "()V", "", "AVITO_ENCODING", "Ljava/lang/String;", "RECEIVED_MILLIS", "SENT_MILLIS", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x40.a$a, reason: collision with other inner class name */
    public static final class C12843a {
        public /* synthetic */ C12843a(C42822w c42822w) {
            this();
        }

        public C12843a() {
        }
    }

    static {
        new C12843a(null);
        StringBuilder sb2 = new StringBuilder();
        Platform.Companion companion = Platform.INSTANCE;
        sb2.append(companion.get().getPrefix());
        sb2.append("-Sent-Millis");
        f442191l = sb2.toString();
        f442192m = companion.get().getPrefix() + "-Received-Millis";
    }

    public C49761a(@k e0 e0Var) {
        try {
            Y y12 = new Y(e0Var);
            String strX1 = y12.X1(Long.MAX_VALUE);
            HttpUrl httpUrl = HttpUrl.INSTANCE.parse(strX1);
            if (httpUrl == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strX1));
                Platform.INSTANCE.get().log("cache corruption", 5, iOException);
                throw iOException;
            }
            this.f442193a = httpUrl;
            this.f442195c = y12.X1(Long.MAX_VALUE);
            Headers.Builder builder = new Headers.Builder();
            int iB2 = d.b(y12);
            for (int i12 = 0; i12 < iB2; i12++) {
                builder.add(y12.X1(Long.MAX_VALUE));
            }
            this.f442194b = builder.build();
            StatusLine statusLine = StatusLine.INSTANCE.parse(y12.X1(Long.MAX_VALUE));
            this.f442196d = statusLine.protocol;
            this.f442197e = statusLine.code;
            this.f442198f = statusLine.message;
            Headers.Builder builder2 = new Headers.Builder();
            int iB3 = d.b(y12);
            for (int i13 = 0; i13 < iB3; i13++) {
                builder2.add(y12.X1(Long.MAX_VALUE));
            }
            String str = f442191l;
            String str2 = builder2.get(str);
            String str3 = f442192m;
            String str4 = builder2.get(str3);
            builder2.removeAll(str);
            builder2.removeAll(str3);
            this.f442201i = str2 != null ? Long.parseLong(str2) : 0L;
            this.f442202j = str4 != null ? Long.parseLong(str4) : 0L;
            String str5 = builder2.get("Avito-Encoding");
            builder2.removeAll("Avito-Encoding");
            this.f442203k = str5;
            this.f442199g = builder2.build();
            if (L.f(this.f442193a.scheme(), Constants.SCHEME)) {
                String strX12 = y12.X1(Long.MAX_VALUE);
                if (strX12.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strX12 + '\"');
                }
                this.f442200h = Handshake.INSTANCE.get(!y12.W2() ? TlsVersion.INSTANCE.forJavaName(y12.X1(Long.MAX_VALUE)) : TlsVersion.SSL_3_0, CipherSuite.INSTANCE.forJavaName(y12.X1(Long.MAX_VALUE)), d.a(y12), d.a(y12));
            } else {
                this.f442200h = null;
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(e0Var, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(e0Var, th2);
                throw th3;
            }
        }
    }

    public final void a(@k c0 c0Var) {
        Handshake handshake;
        HttpUrl httpUrl = this.f442193a;
        Headers headers = this.f442199g;
        Headers headers2 = this.f442194b;
        X x12 = new X(c0Var);
        try {
            x12.b2(httpUrl.getUrl());
            x12.writeByte(10);
            x12.b2(this.f442195c);
            x12.writeByte(10);
            x12.U0(headers2.size());
            x12.writeByte(10);
            int size = headers2.size();
            for (int i12 = 0; i12 < size; i12++) {
                x12.b2(headers2.name(i12));
                x12.b2(": ");
                x12.b2(headers2.value(i12));
                x12.writeByte(10);
            }
            x12.b2(new StatusLine(this.f442196d, this.f442197e, this.f442198f).toString());
            x12.writeByte(10);
            x12.U0(headers.size() + (this.f442203k != null ? 3 : 2));
            x12.writeByte(10);
            int size2 = headers.size();
            for (int i13 = 0; i13 < size2; i13++) {
                x12.b2(headers.name(i13));
                x12.b2(": ");
                x12.b2(headers.value(i13));
                x12.writeByte(10);
            }
            x12.b2(f442191l);
            x12.b2(": ");
            x12.U0(this.f442201i);
            x12.writeByte(10);
            x12.b2(f442192m);
            x12.b2(": ");
            x12.U0(this.f442202j);
            x12.writeByte(10);
            String str = this.f442203k;
            if (str != null) {
                x12.b2("Avito-Encoding");
                x12.b2(": ");
                x12.b2(str);
                x12.writeByte(10);
            }
            if (L.f(httpUrl.scheme(), Constants.SCHEME) && (handshake = this.f442200h) != null) {
                x12.writeByte(10);
                x12.b2(handshake.cipherSuite().javaName());
                x12.writeByte(10);
                e.a(x12, handshake.peerCertificates());
                e.a(x12, handshake.localCertificates());
                x12.b2(handshake.tlsVersion().javaName());
                x12.writeByte(10);
            }
            G0 g02 = G0.f406611a;
            kotlin.io.c.a(x12, null);
        } finally {
        }
    }

    public C49761a(@k Response response) {
        Headers headersBuild;
        Request request;
        this.f442193a = response.request().url();
        Response responseNetworkResponse = response.networkResponse();
        Headers headers = (responseNetworkResponse == null || (request = responseNetworkResponse.request()) == null || (headers = request.headers()) == null) ? response.request().headers() : headers;
        Set<String> setA = C49763c.a(response.headers());
        if (setA.isEmpty()) {
            headersBuild = Util.EMPTY_HEADERS;
        } else {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i12 = 0; i12 < size; i12++) {
                String strName = headers.name(i12);
                if (setA.contains(strName)) {
                    builder.add(strName, headers.value(i12));
                }
            }
            headersBuild = builder.build();
        }
        this.f442194b = headersBuild;
        this.f442195c = response.request().method();
        this.f442196d = response.protocol();
        this.f442197e = response.code();
        this.f442198f = response.message();
        this.f442199g = response.headers();
        this.f442200h = response.handshake();
        this.f442201i = response.sentRequestAtMillis();
        this.f442202j = response.receivedResponseAtMillis();
    }
}
