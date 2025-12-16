package com.avito.beduin.v2.utils.network;

import SU0.h;
import SU0.j;
import SU0.n;
import SU0.o;
import SU0.p;
import Y61.k;
import Y61.l;
import com.avito.android.advert.item.C28156p;
import com.avito.beduin.v2.logger.LogLevel;
import com.avito.beduin.v2.network.api.Method;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: OkHttpNetworkClient.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/utils/network/b;", "LSU0/g;", "a", "okhttp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements SU0.g {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f338456e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final JV0.a f338457a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f338458b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.beduin.v2.utils.network.e f338459c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OkHttpClient f338460d;

    /* compiled from: OkHttpNetworkClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/utils/network/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "okhttp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: OkHttpNetworkClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.utils.network.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C10491b {
        static {
            int[] iArr = new int[Method.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Method method = Method.f337866b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Method method2 = Method.f337866b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Method method3 = Method.f337866b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Method method4 = Method.f337866b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: OkHttpNetworkClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Integer, G0> {
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            ((h) this.receiver).b(num.intValue());
            return G0.f406611a;
        }
    }

    /* compiled from: OkHttpNetworkClient.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/utils/network/b$d", "Lokhttp3/Callback;", "okhttp_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements Callback {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f338462c;

        public d(h hVar) {
            this.f338462c = hVar;
        }

        @Override // okhttp3.Callback
        public final void onFailure(@k Call call, @k IOException iOException) {
            a aVar = b.f338456e;
            com.avito.beduin.v2.utils.network.e eVar = b.this.f338459c;
            if (eVar == null) {
                eVar = null;
            }
            eVar.f338471c = null;
            this.f338462c.onFailure(iOException);
        }

        @Override // okhttp3.Callback
        public final void onResponse(@k Call call, @k Response response) {
            MediaType mediaType;
            a aVar = b.f338456e;
            com.avito.beduin.v2.utils.network.e eVar = b.this.f338459c;
            String mediaType2 = null;
            if (eVar == null) {
                eVar = null;
            }
            eVar.f338471c = null;
            int iCode = response.code();
            ResponseBody responseBodyBody = response.body();
            String strString = responseBodyBody != null ? responseBodyBody.string() : null;
            if (strString == null) {
                strString = "";
            }
            ResponseBody responseBodyBody2 = response.body();
            if (responseBodyBody2 != null && (mediaType = responseBodyBody2.get$contentType()) != null) {
                mediaType2 = mediaType.getMediaType();
            }
            this.f338462c.a(iCode, strString, mediaType2);
        }
    }

    /* compiled from: OkHttpNetworkClient.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/RequestBody;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<RequestBody> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f338463l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ b f338464m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j jVar, b bVar) {
            super(0);
            this.f338463l = jVar;
            this.f338464m = bVar;
        }

        @Override // Y41.a
        public final RequestBody invoke() {
            j jVar = this.f338463l;
            if (jVar == null) {
                return null;
            }
            a aVar = b.f338456e;
            return this.f338464m.b(jVar);
        }
    }

    public b(@k JV0.a aVar, @k OkHttpClient okHttpClient, @l String str, boolean z12) {
        this.f338457a = aVar;
        this.f338458b = str;
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        com.avito.beduin.v2.utils.network.a aVar2 = new com.avito.beduin.v2.utils.network.a(z12);
        if (z12) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(aVar2);
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            builderNewBuilder.addInterceptor(httpLoggingInterceptor);
        }
        com.avito.beduin.v2.utils.network.e eVar = new com.avito.beduin.v2.utils.network.e(aVar2);
        this.f338459c = eVar;
        builderNewBuilder.addInterceptor(new com.avito.beduin.v2.utils.network.d(eVar));
        this.f338460d = builderNewBuilder.build();
    }

    public static void c(Request.Builder builder, Method method, Y41.a aVar) {
        int iOrdinal = method.ordinal();
        if (iOrdinal == 0) {
            builder.get();
            return;
        }
        if (iOrdinal == 1) {
            builder.post(d((RequestBody) ((e) aVar).invoke()));
            return;
        }
        if (iOrdinal == 2) {
            builder.patch(d((RequestBody) ((e) aVar).invoke()));
        } else if (iOrdinal == 3) {
            builder.put(d((RequestBody) ((e) aVar).invoke()));
        } else {
            if (iOrdinal != 4) {
                return;
            }
            builder.delete((RequestBody) ((e) aVar).invoke());
        }
    }

    public static final RequestBody d(RequestBody requestBody) {
        return requestBody == null ? RequestBody.Companion.create$default(RequestBody.INSTANCE, new byte[0], (MediaType) null, 0, 0, 7, (Object) null) : requestBody;
    }

    @Override // SU0.g
    @k
    public final HV0.b a(@l String str, @l String str2, @k Method method, @k HV0.d[] dVarArr, @k n[] nVarArr, @l j jVar, @k h hVar) {
        String str3;
        if (str == null) {
            try {
                str3 = this.f338458b;
            } catch (Exception e12) {
                RU0.b bVar = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar.getClass();
                if (4 >= RU0.b.f14469c) {
                    RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":OkHttp"), "request failed", e12);
                }
                hVar.onFailure(e12);
                return new C28156p(5);
            }
        } else {
            str3 = str;
        }
        if (str3 == null) {
            throw new IllegalArgumentException("Neither 'host' nor 'baseUrl' is set");
        }
        Request.Builder builder = new Request.Builder();
        HttpUrl.Builder builderNewBuilder = HttpUrl.INSTANCE.get(str3).newBuilder();
        if (str2 != null) {
            builderNewBuilder.addPathSegments(C43066x.H0(str2, '/'));
        }
        G0 g02 = G0.f406611a;
        for (n nVar : nVarArr) {
            o oVar = nVar.f15027b;
            boolean z12 = oVar instanceof o.b;
            String str4 = nVar.f15026a;
            if (z12) {
                builderNewBuilder.addQueryParameter(str4, ((o.b) oVar).f15029a);
            } else if (oVar instanceof o.a) {
                for (String str5 : ((o.a) oVar).f15028a) {
                    builderNewBuilder.addQueryParameter(str4, str5);
                }
            }
        }
        G0 g03 = G0.f406611a;
        Request.Builder builderUrl = builder.url(builderNewBuilder.build());
        c(builderUrl, method, new e(jVar, this));
        for (HV0.d dVar : dVarArr) {
            builderUrl.addHeader(dVar.f7123a, dVar.f7124b);
        }
        Call callNewCall = this.f338460d.newCall(builderUrl.build());
        com.avito.beduin.v2.utils.network.e eVar = this.f338459c;
        if (eVar == null) {
            eVar = null;
        }
        eVar.f338471c = new c(1, hVar, h.class, "onProgress", "onProgress(I)V", 0);
        callNewCall.enqueue(new d(hVar));
        return new com.avito.android.lib.beduin_v2.feature.launchclient.a(1, this, callNewCall);
    }

    public final RequestBody b(j jVar) {
        RequestBody requestBodyB;
        if (jVar instanceof j.c.C1022c) {
            return RequestBody.INSTANCE.create(((j.c.C1022c) jVar).f15023b, MediaType.INSTANCE.get(((j.c.C1022c) jVar).f15024c));
        }
        if (jVar instanceof j.c.a) {
            return RequestBody.Companion.create$default(RequestBody.INSTANCE, ((j.c.a) jVar).f15020e.invoke(), MediaType.INSTANCE.get(jVar.f15013a), 0, 0, 6, (Object) null);
        }
        if (jVar instanceof j.c.d) {
            FormBody.Builder builder = new FormBody.Builder(null, 1, null);
            for (HV0.d dVar : ((j.c.d) jVar).f15025b) {
                builder.add(dVar.f7123a, dVar.f7124b);
            }
            return builder.build();
        }
        if (jVar instanceof j.c.b) {
            return new com.avito.beduin.v2.utils.network.c(MediaType.INSTANCE.get(jVar.f15013a), this, (j.c.b) jVar);
        }
        if (jVar instanceof j.a) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (3 >= RU0.b.f14469c) {
                RU0.b.f14468b.e(RU0.b.f14470d + ":OkHttp", "Array must be used inside multipart/form-data");
            }
            j.c[] cVarArr = ((j.a) jVar).f15014b;
            j.c cVar = cVarArr.length == 0 ? null : cVarArr[0];
            return (cVar == null || (requestBodyB = b(cVar)) == null) ? RequestBody.Companion.create$default(RequestBody.INSTANCE, "", (MediaType) null, 1, (Object) null) : requestBodyB;
        }
        if (!(jVar instanceof j.b)) {
            throw new NoWhenBranchMatchedException();
        }
        j.b bVar2 = (j.b) jVar;
        String str = bVar2.f15016c;
        MultipartBody.Builder builder2 = str != null ? new MultipartBody.Builder(str) : new MultipartBody.Builder(null, 1, null);
        builder2.setType(MultipartBody.FORM);
        for (p pVar : bVar2.f15015b) {
            String str2 = pVar.f15030a;
            j jVar2 = pVar.f15031b;
            if (jVar2 instanceof j.a) {
                for (j.c cVar2 : ((j.a) jVar2).f15014b) {
                    builder2.addFormDataPart(str2, cVar2 instanceof j.c.a ? ((j.c.a) cVar2).f15017b : cVar2 instanceof j.c.b ? ((j.c.b) cVar2).f15021b : null, b(cVar2));
                }
            } else {
                builder2.addFormDataPart(str2, jVar2 instanceof j.c.a ? ((j.c.a) jVar2).f15017b : jVar2 instanceof j.c.b ? ((j.c.b) jVar2).f15021b : null, b(jVar2));
            }
        }
        return builder2.build();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(JV0.a aVar, OkHttpClient okHttpClient, String str, boolean z12, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            f338456e.getClass();
            okHttpClient = new OkHttpClient.Builder().readTimeout(60L, TimeUnit.SECONDS).build();
        }
        this(aVar, okHttpClient, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? false : z12);
    }
}
