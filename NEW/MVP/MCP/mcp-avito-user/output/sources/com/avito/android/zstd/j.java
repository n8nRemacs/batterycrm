package com.avito.android.zstd;

import Y41.p;
import Y41.q;
import com.avito.android.I1;
import com.avito.android.ab_tests.configs.ZstdTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.C;
import okio.InterfaceC44804n;
import okio.M;
import okio.Y;
import okio.e0;

/* compiled from: ZstdInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/zstd/j;", "Lcom/avito/android/zstd/i;", "a", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.zstd.e f331368b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l f331369c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f331370d;

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/zstd/j$a;", "", "<init>", "()V", "", "ACCEPT_ENCODING_HEADER", "Ljava/lang/String;", "ACCEPT_ENCODING_ZSTD_VALUE", "CONTENT_ENCODING_HEADER", "GZIP_ENCODING", "ZSTD_ENCODING", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "bytes", "Lkotlin/G0;", "invoke", "(JJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Long, Long, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Response f331372m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f331373n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Response response, String str) {
            super(2);
            this.f331372m = response;
            this.f331373n = str;
        }

        @Override // Y41.p
        public final G0 invoke(Long l12, Long l13) {
            l12.longValue();
            long jLongValue = l13.longValue();
            j.a(j.this, this.f331372m, jLongValue, jLongValue, this.f331373n, "");
            return G0.f406611a;
        }
    }

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "decodedBytes", "encodedBytes", "Lkotlin/G0;", "invoke", "(JJJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements q<Long, Long, Long, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Response f331375m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f331376n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f331377o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Response response, String str, String str2) {
            super(3);
            this.f331375m = response;
            this.f331376n = str;
            this.f331377o = str2;
        }

        @Override // Y41.q
        public final G0 invoke(Long l12, Long l13, Long l14) {
            l12.longValue();
            long jLongValue = l13.longValue();
            long jLongValue2 = l14.longValue();
            String str = this.f331377o;
            if (str == null) {
                str = "";
            }
            Response response = this.f331375m;
            String str2 = this.f331376n;
            j.a(j.this, response, jLongValue2, jLongValue, str2, str);
            return G0.f406611a;
        }
    }

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokio/n;", "Lokio/e0;", "invoke", "(Lokio/n;)Lokio/e0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<InterfaceC44804n, e0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final e0 invoke(InterfaceC44804n interfaceC44804n) {
            j jVar = j.this;
            return M.g(jVar.f331368b.c(interfaceC44804n.s6()));
        }
    }

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "decodedBytes", "encodedBytes", "Lkotlin/G0;", "invoke", "(JJJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements q<Long, Long, Long, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Response f331380m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f331381n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f331382o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Response response, String str, String str2) {
            super(3);
            this.f331380m = response;
            this.f331381n = str;
            this.f331382o = str2;
        }

        @Override // Y41.q
        public final G0 invoke(Long l12, Long l13, Long l14) {
            l12.longValue();
            long jLongValue = l13.longValue();
            long jLongValue2 = l14.longValue();
            String str = this.f331382o;
            if (str == null) {
                str = "";
            }
            Response response = this.f331380m;
            String str2 = this.f331381n;
            j.a(j.this, response, jLongValue2, jLongValue, str2, str);
            return G0.f406611a;
        }
    }

    /* compiled from: ZstdInterceptor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokio/n;", "Lokio/e0;", "invoke", "(Lokio/n;)Lokio/e0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC44804n, e0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f331383l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final e0 invoke(InterfaceC44804n interfaceC44804n) {
            return new Y(new C(interfaceC44804n));
        }
    }

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", CrashHianalyticsData.TIME, "bytes", "Lkotlin/G0;", "invoke", "(JJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements p<Long, Long, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.g f331384l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.g f331385m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(l0.g gVar, l0.g gVar2) {
            super(2);
            this.f331384l = gVar;
            this.f331385m = gVar2;
        }

        @Override // Y41.p
        public final G0 invoke(Long l12, Long l13) {
            long jLongValue = l12.longValue();
            long jLongValue2 = l13.longValue();
            this.f331384l.f406841b = jLongValue;
            this.f331385m.f406841b = jLongValue2;
            return G0.f406611a;
        }
    }

    /* compiled from: ZstdInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", CrashHianalyticsData.TIME, "bytes", "Lkotlin/G0;", "invoke", "(JJ)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements p<Long, Long, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f331386l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.g f331387m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l0.g f331388n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(q<? super Long, ? super Long, ? super Long, G0> qVar, l0.g gVar, l0.g gVar2) {
            super(2);
            this.f331386l = (N) qVar;
            this.f331387m = gVar;
            this.f331388n = gVar2;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.q, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(Long l12, Long l13) {
            long jLongValue = l12.longValue();
            long jLongValue2 = l13.longValue();
            this.f331386l.invoke(Long.valueOf(jLongValue - this.f331387m.f406841b), Long.valueOf(jLongValue2), Long.valueOf(this.f331388n.f406841b));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k com.avito.android.zstd.e eVar, @Y61.k l lVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f331368b = eVar;
        this.f331369c = lVar;
        this.f331370d = interfaceC28373a;
    }

    public static final void a(j jVar, Response response, long j12, long j13, String str, String str2) {
        l lVar = jVar.f331369c;
        ZstdTestGroup zstdTestGroup = lVar.f331392a;
        zstdTestGroup.getClass();
        if (zstdTestGroup != ZstdTestGroup.f67935c) {
            I1 i12 = lVar.f331393b;
            i12.getClass();
            n<Object> nVar = I1.f67278k0[51];
            if (((Boolean) i12.f67303Y.a().invoke()).booleanValue()) {
                jVar.f331370d.c(new com.avito.android.zstd.a(response.request().url().getUrl(), str, str2, j12, j13, response.receivedResponseAtMillis() - response.sentRequestAtMillis()));
            }
        }
    }

    public static ResponseBody b(ResponseBody responseBody, q qVar, Y41.l lVar) {
        l0.g gVar = new l0.g();
        gVar.f406841b = -1L;
        l0.g gVar2 = new l0.g();
        gVar2.f406841b = -1L;
        InterfaceC44804n source = responseBody.getBodySource();
        g gVar3 = new g(gVar, gVar2);
        com.avito.android.time.c cVar = com.avito.android.time.c.f301452a;
        return ResponseBody.INSTANCE.create(new Y(new com.avito.android.zstd.c((e0) lVar.invoke(new Y(new com.avito.android.zstd.c(source, cVar, gVar3))), cVar, new h(qVar, gVar, gVar2))), responseBody.get$contentType(), responseBody.getContentLength());
    }

    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        String strHeader = request.header("Accept-Encoding");
        if (strHeader == null) {
            l lVar = this.f331369c;
            ZstdTestGroup zstdTestGroup = lVar.f331392a;
            zstdTestGroup.getClass();
            strHeader = (zstdTestGroup == ZstdTestGroup.f67936d || lVar.f331393b.x().invoke().booleanValue()) ? "zstd;q=1.0, gzip;q=0.8" : "gzip";
        }
        if (request.header("Accept-Encoding") == null) {
            builderNewBuilder.addHeader("Accept-Encoding", strHeader);
        }
        Response responseProceed = chain.proceed(builderNewBuilder.method(request.method(), request.body()).build());
        String str = responseProceed.headers().get("Content-Encoding");
        boolean zF2 = L.f(str, "zstd");
        boolean zF3 = L.f(str, "gzip");
        ResponseBody responseBodyBody = responseProceed.body();
        if (zF2) {
            return responseProceed.newBuilder().body(responseBodyBody != null ? b(responseBodyBody, new c(responseProceed, strHeader, str), new d()) : null).headers(responseProceed.headers().newBuilder().removeAll("Content-Encoding").build()).build();
        }
        if (zF3) {
            return responseProceed.newBuilder().body(responseBodyBody != null ? b(responseBodyBody, new e(responseProceed, strHeader, str), f.f331383l) : null).headers(responseProceed.headers().newBuilder().removeAll("Content-Encoding").build()).build();
        }
        return responseProceed.newBuilder().body(responseBodyBody != null ? ResponseBody.INSTANCE.create(new Y(new com.avito.android.zstd.c(responseBodyBody.getBodySource(), com.avito.android.time.c.f301452a, new b(responseProceed, strHeader))), responseBodyBody.get$contentType(), responseBodyBody.getContentLength()) : null).build();
    }
}
