package retrofit2;

import androidx.camera.camera2.internal.G;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.InterfaceC44803m;

/* compiled from: RequestBuilder.java */
/* loaded from: classes9.dex */
final class w {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f430067l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f430068m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f430069a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpUrl f430070b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public String f430071c;

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public HttpUrl.Builder f430072d;

    /* renamed from: e, reason: collision with root package name */
    public final Request.Builder f430073e = new Request.Builder();

    /* renamed from: f, reason: collision with root package name */
    public final Headers.Builder f430074f;

    /* renamed from: g, reason: collision with root package name */
    @I41.h
    public MediaType f430075g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f430076h;

    /* renamed from: i, reason: collision with root package name */
    @I41.h
    public final MultipartBody.Builder f430077i;

    /* renamed from: j, reason: collision with root package name */
    @I41.h
    public final FormBody.Builder f430078j;

    /* renamed from: k, reason: collision with root package name */
    @I41.h
    public RequestBody f430079k;

    /* compiled from: RequestBuilder.java */
    public static class a extends RequestBody {

        /* renamed from: c, reason: collision with root package name */
        public final RequestBody f430080c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaType f430081d;

        public a(RequestBody requestBody, MediaType mediaType) {
            this.f430080c = requestBody;
            this.f430081d = mediaType;
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            return this.f430080c.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public final MediaType getContentType() {
            return this.f430081d;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(InterfaceC44803m interfaceC44803m) {
            this.f430080c.writeTo(interfaceC44803m);
        }
    }

    public w(String str, HttpUrl httpUrl, @I41.h String str2, @I41.h Headers headers, @I41.h MediaType mediaType, boolean z12, boolean z13, boolean z14) {
        this.f430069a = str;
        this.f430070b = httpUrl;
        this.f430071c = str2;
        this.f430075g = mediaType;
        this.f430076h = z12;
        if (headers != null) {
            this.f430074f = headers.newBuilder();
        } else {
            this.f430074f = new Headers.Builder();
        }
        if (z13) {
            this.f430078j = new FormBody.Builder();
        } else if (z14) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f430077i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public final void a(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f430074f.add(str, str2);
            return;
        }
        try {
            this.f430075g = MediaType.get(str2);
        } catch (IllegalArgumentException e12) {
            throw new IllegalArgumentException(G.f("Malformed content type: ", str2), e12);
        }
    }

    public final void b(String str, @I41.h String str2, boolean z12) {
        String str3 = this.f430071c;
        if (str3 != null) {
            HttpUrl httpUrl = this.f430070b;
            HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder(str3);
            this.f430072d = builderNewBuilder;
            if (builderNewBuilder == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f430071c);
            }
            this.f430071c = null;
        }
        if (z12) {
            this.f430072d.addEncodedQueryParameter(str, str2);
        } else {
            this.f430072d.addQueryParameter(str, str2);
        }
    }
}
