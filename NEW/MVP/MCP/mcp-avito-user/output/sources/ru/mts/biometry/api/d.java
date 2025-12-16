package ru.mts.biometry.api;

import Y41.l;
import Y61.k;
import com.google.gson.Gson;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.z;
import ru.mts.biometry.api.dataSource.j;
import ru.mts.biometry.api.dataSource.o;
import ru.mts.biometry.api.dataSource.p;
import ru.mts.biometry.api.entity.state.ApiIdentificationState;
import x91.C49798a;
import x91.C49799b;
import x91.C49800c;
import x91.C49801d;

/* compiled from: BiometryDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/mts/biometry/api/d;", "Lru/mts/biometry/api/dataSource/p;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements p {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f436312a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final o f436313b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public SuspendLambda f436314c;

    /* compiled from: BiometryDataSource.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Lru/mts/biometry/api/entity/state/ApiIdentificationState;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "ru.mts.biometry.api.BiometryDataSource$stateBlock$1", f = "BiometryDataSource.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements l<Continuation<? super ApiIdentificationState>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f436315q;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@k Continuation<?> continuation) {
            return d.this.new a(continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super ApiIdentificationState> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f436315q;
            if (i12 == 0) {
                C42729a0.b(obj);
                j jVar = d.this.f436312a;
                this.f436315q = 1;
                obj = jVar.g(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k String str, @k SDKEnvironment sDKEnvironment, @k ru.mts.biometry.api.repo.c cVar, @k ru.mts.biometry.api.repo.a aVar) {
        Gson gson = new Gson();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor(new C49800c()).addInterceptor(new C49801d(cVar)).addInterceptor(new C49798a(aVar)).addInterceptor(new C49799b()).addInterceptor(httpLoggingInterceptor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderAddInterceptor.connectTimeout(30L, timeUnit).readTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).build();
        z.b bVar = new z.b();
        bVar.c(sDKEnvironment.b() + "/api/" + sDKEnvironment.getF436302g() + '/' + sDKEnvironment.getF436303h() + "/identifications/" + str + '/');
        bVar.b(retrofit2.converter.gson.a.d(gson));
        Objects.requireNonNull(okHttpClientBuild, "client == null");
        bVar.f430133b = okHttpClientBuild;
        z zVarE = bVar.e();
        this.f436312a = new j(zVarE);
        this.f436313b = new o(zVarE);
        this.f436314c = new a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v2, types: [Y41.l, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ru.mts.biometry.api.a
            if (r0 == 0) goto L13
            r0 = r9
            ru.mts.biometry.api.a r0 = (ru.mts.biometry.api.a) r0
            int r1 = r0.f436307t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436307t = r1
            goto L18
        L13:
            ru.mts.biometry.api.a r0 = new ru.mts.biometry.api.a
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f436305r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436307t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ru.mts.biometry.api.d r0 = r0.f436304q
            kotlin.C42729a0.b(r9)
            goto L44
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            kotlin.C42729a0.b(r9)
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = r8.f436314c
            r0.f436304q = r8
            r0.f436307t = r3
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            r0 = r8
        L44:
            ru.mts.biometry.api.entity.state.ApiIdentificationState r9 = (ru.mts.biometry.api.entity.state.ApiIdentificationState) r9
            r1 = 0
            if (r9 == 0) goto L4e
            java.lang.String r2 = r9.getSubStatus()
            goto L4f
        L4e:
            r2 = r1
        L4f:
            java.lang.String r3 = "AwaitingDocumentRecognitionCompletion"
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 == 0) goto Lad
            ru.mts.biometry.api.dataSource.o r2 = r0.f436313b
            ru.mts.biometry.api.entity.state.ApiDocumentRecognitionData r3 = r9.getDocumentRecognitionData()
            if (r3 == 0) goto L64
            java.lang.String r3 = r3.getRecognitionId()
            goto L65
        L64:
            r3 = r1
        L65:
            retrofit2.z r4 = r2.f436352a
            okhttp3.HttpUrl r5 = r4.f430123c
            okhttp3.HttpUrl$Builder r5 = r5.newBuilder()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "recognitions/"
            r6.<init>(r7)
            r6.append(r3)
            r3 = 47
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            okhttp3.HttpUrl$Builder r3 = r5.addPathSegments(r3)
            okhttp3.HttpUrl r3 = r3.build()
            r2.f436353b = r3
            retrofit2.z$b r3 = new retrofit2.z$b
            r3.<init>(r4)
            okhttp3.HttpUrl r4 = r2.f436353b
            if (r4 != 0) goto L94
            r4 = r1
        L94:
            r3.d(r4)
            retrofit2.z r3 = r3.e()
            java.lang.Class<y91.b> r4 = y91.InterfaceC50089b.class
            java.lang.Object r3 = r3.b(r4)
            y91.b r3 = (y91.InterfaceC50089b) r3
            r2.f436354c = r3
            ru.mts.biometry.api.b r2 = new ru.mts.biometry.api.b
            r2.<init>(r0, r1)
            r0.f436314c = r2
            return r9
        Lad:
            if (r9 == 0) goto Lb4
            java.lang.String r2 = r9.getStatus()
            goto Lb5
        Lb4:
            r2 = r1
        Lb5:
            java.lang.String r3 = "InProgress"
            boolean r2 = kotlin.jvm.internal.L.f(r2, r3)
            if (r2 != 0) goto Lc4
            ru.mts.biometry.api.c r2 = new ru.mts.biometry.api.c
            r2.<init>(r0, r1)
            r0.f436314c = r2
        Lc4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.mts.biometry.api.d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
