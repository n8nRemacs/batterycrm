package D81;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.collections.B0;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.C;
import okio.C44802l;
import okio.InterfaceC44804n;
import q1.EnumC47182b;

/* loaded from: classes9.dex */
public final class c implements Interceptor {

    /* renamed from: b, reason: collision with root package name */
    public final b f2974b;

    /* renamed from: c, reason: collision with root package name */
    public volatile B0 f2975c = B0.f406639b;

    /* renamed from: d, reason: collision with root package name */
    public volatile EnumC47182b f2976d = EnumC47182b.f428952b;

    public c(b bVar) {
        this.f2974b = bVar;
    }

    public final void a(Headers headers, int i12) {
        B0 b02 = this.f2975c;
        headers.name(i12);
        b02.getClass();
        headers.value(i12);
        b bVar = this.f2974b;
        headers.name(i12);
        bVar.a();
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws Exception {
        String str;
        Charset charset;
        Charset charset2;
        EnumC47182b enumC47182b = this.f2976d;
        Request request = chain.request();
        if (enumC47182b == EnumC47182b.f428952b) {
            return chain.proceed(request);
        }
        boolean z12 = true;
        boolean z13 = enumC47182b == EnumC47182b.f428955e;
        if (!z13 && enumC47182b != EnumC47182b.f428954d) {
            z12 = false;
        }
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        String strMethod = request.method();
        HttpUrl httpUrlUrl = request.url();
        String str2 = connection != null ? " " + connection.protocol() : "";
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(strMethod);
        sb2.append(" ");
        sb2.append(httpUrlUrl);
        sb2.append(str2);
        if (!z12 && requestBodyBody != null) {
            requestBodyBody.contentLength();
        }
        this.f2974b.a();
        if (z12) {
            Headers headers = request.headers();
            if (requestBodyBody != null) {
                MediaType mediaType = requestBodyBody.get$contentType();
                if (mediaType != null && headers.get("Content-Type") == null) {
                    b bVar = this.f2974b;
                    mediaType.getMediaType();
                    bVar.a();
                }
                if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                    b bVar2 = this.f2974b;
                    requestBodyBody.contentLength();
                    bVar2.a();
                }
            }
            int size = headers.size();
            for (int i12 = 0; i12 < size; i12++) {
                a(headers, i12);
            }
            if (!z13 || requestBodyBody == null) {
                str = "identity";
                b bVar3 = this.f2974b;
                request.method();
                bVar3.a();
            } else {
                String str3 = request.headers().get("Content-Encoding");
                if (str3 != null && !str3.equalsIgnoreCase("identity") && !str3.equalsIgnoreCase("gzip")) {
                    b bVar4 = this.f2974b;
                    request.method();
                    bVar4.a();
                } else if (requestBodyBody.isDuplex()) {
                    b bVar5 = this.f2974b;
                    request.method();
                    bVar5.a();
                } else if (requestBodyBody.isOneShot()) {
                    b bVar6 = this.f2974b;
                    request.method();
                    bVar6.a();
                } else {
                    C44802l c44802l = new C44802l();
                    requestBodyBody.writeTo(c44802l);
                    MediaType mediaType2 = requestBodyBody.get$contentType();
                    if (mediaType2 == null || (charset2 = mediaType2.charset(StandardCharsets.UTF_8)) == null) {
                        charset2 = StandardCharsets.UTF_8;
                    }
                    this.f2974b.a();
                    if (a.a(c44802l)) {
                        b bVar7 = this.f2974b;
                        str = "identity";
                        c44802l.z1(c44802l.f420125c, charset2);
                        bVar7.a();
                        b bVar8 = this.f2974b;
                        request.method();
                        requestBodyBody.contentLength();
                        bVar8.a();
                    } else {
                        str = "identity";
                        b bVar9 = this.f2974b;
                        request.method();
                        requestBodyBody.contentLength();
                        bVar9.a();
                    }
                }
                str = "identity";
            }
        } else {
            str = "identity";
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseProceed = chain.proceed(request);
            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            ResponseBody responseBodyBody = responseProceed.body();
            long j12 = responseBodyBody.get$contentLength();
            String str4 = j12 != -1 ? j12 + "-byte" : "unknown-length";
            b bVar10 = this.f2974b;
            responseProceed.code();
            if (responseProceed.message().length() != 0) {
                new StringBuilder(" ").append(responseProceed.message());
            }
            HttpUrl httpUrlUrl2 = responseProceed.request().url();
            if (!z12) {
                StringBuilder sb3 = new StringBuilder(", ");
                sb3.append(str4);
                sb3.append(" body");
            }
            Objects.toString(httpUrlUrl2);
            bVar10.a();
            if (z12) {
                Headers headers2 = responseProceed.headers();
                int size2 = headers2.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    a(headers2, i13);
                }
                if (z13 && HttpHeaders.promisesBody(responseProceed)) {
                    String str5 = responseProceed.headers().get("Content-Encoding");
                    if (str5 == null || str5.equalsIgnoreCase(str) || str5.equalsIgnoreCase("gzip")) {
                        InterfaceC44804n interfaceC44804n = responseBodyBody.get$this_asResponseBody();
                        interfaceC44804n.request(Long.MAX_VALUE);
                        C44802l f420047c = interfaceC44804n.getF420047c();
                        Long l12 = null;
                        if ("gzip".equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                            Long lValueOf = Long.valueOf(f420047c.f420125c);
                            C c12 = new C(f420047c.clone());
                            try {
                                f420047c = new C44802l();
                                f420047c.h2(c12);
                                kotlin.io.c.a(c12, null);
                                l12 = lValueOf;
                            } finally {
                            }
                        }
                        MediaType mediaType3 = responseBodyBody.get$contentType();
                        if (mediaType3 == null || (charset = mediaType3.charset(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                        }
                        if (!a.a(f420047c)) {
                            this.f2974b.a();
                            this.f2974b.a();
                            return responseProceed;
                        }
                        if (j12 != 0) {
                            this.f2974b.a();
                            b bVar11 = this.f2974b;
                            C44802l c44802lClone = f420047c.clone();
                            c44802lClone.z1(c44802lClone.f420125c, charset);
                            bVar11.a();
                        }
                        if (l12 != null) {
                            this.f2974b.a();
                        } else {
                            this.f2974b.a();
                        }
                    } else {
                        this.f2974b.a();
                    }
                } else {
                    this.f2974b.a();
                }
            }
            return responseProceed;
        } catch (Exception e12) {
            b bVar12 = this.f2974b;
            e12.toString();
            bVar12.a();
            throw e12;
        }
    }
}
