package retrofit2;

import androidx.camera.camera2.internal.G;
import java.io.IOException;
import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.AbstractC44815z;
import okio.C44802l;
import okio.InterfaceC44804n;
import okio.Y;
import retrofit2.w;

/* loaded from: classes9.dex */
final class OkHttpCall<T> implements InterfaceC47646b<T> {

    /* renamed from: b, reason: collision with root package name */
    public final x f429955b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f429956c;

    /* renamed from: d, reason: collision with root package name */
    public final Call.Factory f429957d;

    /* renamed from: e, reason: collision with root package name */
    public final f<ResponseBody, T> f429958e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f429959f;

    /* renamed from: g, reason: collision with root package name */
    @J41.a
    @I41.h
    public Call f429960g;

    /* renamed from: h, reason: collision with root package name */
    @J41.a
    @I41.h
    public Throwable f429961h;

    /* renamed from: i, reason: collision with root package name */
    @J41.a
    public boolean f429962i;

    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final InterfaceC44804n delegateSource;

        @I41.h
        IOException thrownException;

        public class a extends AbstractC44815z {
            public a(InterfaceC44804n interfaceC44804n) {
                super(interfaceC44804n);
            }

            @Override // okio.AbstractC44815z, okio.e0
            public final long read(C44802l c44802l, long j12) throws IOException {
                try {
                    return super.read(c44802l, j12);
                } catch (IOException e12) {
                    ExceptionCatchingResponseBody.this.thrownException = e12;
                    throw e12;
                }
            }
        }

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = new Y(new a(responseBody.getBodySource()));
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.delegate.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.delegate.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public InterfaceC44804n getBodySource() {
            return this.delegateSource;
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public class a implements Callback {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47648d f429964b;

        public a(InterfaceC47648d interfaceC47648d) {
            this.f429964b = interfaceC47648d;
        }

        @Override // okhttp3.Callback
        public final void onFailure(Call call, IOException iOException) {
            try {
                this.f429964b.onFailure(OkHttpCall.this, iOException);
            } catch (Throwable th2) {
                D.m(th2);
                th2.printStackTrace();
            }
        }

        @Override // okhttp3.Callback
        public final void onResponse(Call call, Response response) {
            InterfaceC47648d interfaceC47648d = this.f429964b;
            OkHttpCall okHttpCall = OkHttpCall.this;
            try {
                try {
                    interfaceC47648d.onResponse(okHttpCall, okHttpCall.f(response));
                } catch (Throwable th2) {
                    D.m(th2);
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                D.m(th3);
                try {
                    interfaceC47648d.onFailure(okHttpCall, th3);
                } catch (Throwable th4) {
                    D.m(th4);
                    th4.printStackTrace();
                }
            }
        }
    }

    public static final class b extends ResponseBody {

        /* renamed from: b, reason: collision with root package name */
        @I41.h
        public final MediaType f429966b;

        /* renamed from: c, reason: collision with root package name */
        public final long f429967c;

        public b(@I41.h MediaType mediaType, long j12) {
            this.f429966b = mediaType;
            this.f429967c = j12;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public final long getContentLength() {
            return this.f429967c;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public final MediaType get$contentType() {
            return this.f429966b;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public final InterfaceC44804n getBodySource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(x xVar, Object[] objArr, Call.Factory factory, f<ResponseBody, T> fVar) {
        this.f429955b = xVar;
        this.f429956c = objArr;
        this.f429957d = factory;
        this.f429958e = fVar;
    }

    public final Call a() {
        HttpUrl httpUrlResolve;
        x xVar = this.f429955b;
        xVar.getClass();
        Object[] objArr = this.f429956c;
        int length = objArr.length;
        u<?>[] uVarArr = xVar.f430091j;
        if (length != uVarArr.length) {
            throw new IllegalArgumentException(AK.c.i(uVarArr.length, ")", G.j(length, "Argument count (", ") doesn't match expected count (")));
        }
        w wVar = new w(xVar.f430084c, xVar.f430083b, xVar.f430085d, xVar.f430086e, xVar.f430087f, xVar.f430088g, xVar.f430089h, xVar.f430090i);
        if (xVar.f430092k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i12 = 0; i12 < length; i12++) {
            arrayList.add(objArr[i12]);
            uVarArr[i12].a(wVar, objArr[i12]);
        }
        HttpUrl.Builder builder = wVar.f430072d;
        if (builder != null) {
            httpUrlResolve = builder.build();
        } else {
            String str = wVar.f430071c;
            HttpUrl httpUrl = wVar.f430070b;
            httpUrlResolve = httpUrl.resolve(str);
            if (httpUrlResolve == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + wVar.f430071c);
            }
        }
        RequestBody aVar = wVar.f430079k;
        if (aVar == null) {
            FormBody.Builder builder2 = wVar.f430078j;
            if (builder2 != null) {
                aVar = builder2.build();
            } else {
                MultipartBody.Builder builder3 = wVar.f430077i;
                if (builder3 != null) {
                    aVar = builder3.build();
                } else if (wVar.f430076h) {
                    aVar = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = wVar.f430075g;
        Headers.Builder builder4 = wVar.f430074f;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new w.a(aVar, mediaType);
            } else {
                builder4.add("Content-Type", mediaType.getMediaType());
            }
        }
        Call callNewCall = this.f429957d.newCall(wVar.f430073e.url(httpUrlResolve).headers(builder4.build()).method(wVar.f430069a, aVar).tag(j.class, new j(xVar.f430082a, arrayList)).build());
        if (callNewCall != null) {
            return callNewCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.InterfaceC47646b
    public final void cancel() {
        Call call;
        this.f429959f = true;
        synchronized (this) {
            call = this.f429960g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new OkHttpCall(this.f429955b, this.f429956c, this.f429957d, this.f429958e);
    }

    @J41.a
    public final Call e() throws IOException {
        Call call = this.f429960g;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f429961h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            Call callA = a();
            this.f429960g = callA;
            return callA;
        } catch (IOException | Error | RuntimeException e12) {
            D.m(e12);
            this.f429961h = e12;
            throw e12;
        }
    }

    @Override // retrofit2.InterfaceC47646b
    public final void enqueue(InterfaceC47648d<T> interfaceC47648d) {
        Call call;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.f429962i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f429962i = true;
                call = this.f429960g;
                th2 = this.f429961h;
                if (call == null && th2 == null) {
                    try {
                        Call callA = a();
                        this.f429960g = callA;
                        call = callA;
                    } catch (Throwable th3) {
                        th2 = th3;
                        D.m(th2);
                        this.f429961h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            interfaceC47648d.onFailure(this, th2);
            return;
        }
        if (this.f429959f) {
            call.cancel();
        }
        call.enqueue(new a(interfaceC47648d));
    }

    @Override // retrofit2.InterfaceC47646b
    public final y<T> execute() {
        Call callE;
        synchronized (this) {
            if (this.f429962i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f429962i = true;
            callE = e();
        }
        if (this.f429959f) {
            callE.cancel();
        }
        return f(callE.execute());
    }

    public final y<T> f(Response response) throws IOException {
        ResponseBody responseBodyBody = response.body();
        Response responseBuild = response.newBuilder().body(new b(responseBodyBody.get$contentType(), responseBodyBody.getContentLength())).build();
        int iCode = responseBuild.code();
        if (iCode < 200 || iCode >= 300) {
            try {
                C44802l c44802l = new C44802l();
                responseBodyBody.getBodySource().E1(c44802l);
                return y.b(ResponseBody.create(responseBodyBody.get$contentType(), responseBodyBody.getContentLength(), c44802l), responseBuild);
            } finally {
                responseBodyBody.close();
            }
        }
        if (iCode == 204 || iCode == 205) {
            responseBodyBody.close();
            return y.d(null, responseBuild);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(responseBodyBody);
        try {
            return y.d(this.f429958e.convert(exceptionCatchingResponseBody), responseBuild);
        } catch (RuntimeException e12) {
            exceptionCatchingResponseBody.throwIfCaught();
            throw e12;
        }
    }

    @Override // retrofit2.InterfaceC47646b
    public final boolean isCanceled() {
        boolean z12 = true;
        if (this.f429959f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f429960g;
                if (call == null || !call.getCanceled()) {
                    z12 = false;
                }
            } finally {
            }
        }
        return z12;
    }

    @Override // retrofit2.InterfaceC47646b
    public final synchronized Request request() {
        try {
        } catch (IOException e12) {
            throw new RuntimeException("Unable to create request.", e12);
        }
        return e().request();
    }

    @Override // retrofit2.InterfaceC47646b
    public final InterfaceC47646b clone() {
        return new OkHttpCall(this.f429955b, this.f429956c, this.f429957d, this.f429958e);
    }
}
