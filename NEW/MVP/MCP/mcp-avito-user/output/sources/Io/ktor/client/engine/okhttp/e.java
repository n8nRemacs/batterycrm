package io.ktor.client.engine.okhttp;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/engine/okhttp/e;", "Lio/ktor/client/engine/j;", "<init>", "()V", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e extends io.ktor.client.engine.j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public N f398914a = a.f398916l;

    /* renamed from: b, reason: collision with root package name */
    public final int f398915b = 10;

    /* compiled from: OkHttpConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lokhttp3/OkHttpClient$Builder;", "Lkotlin/G0;", "invoke", "(Lokhttp3/OkHttpClient$Builder;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.l<OkHttpClient.Builder, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f398916l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(OkHttpClient.Builder builder) {
            OkHttpClient.Builder builder2 = builder;
            builder2.followRedirects(false);
            builder2.followSslRedirects(false);
            builder2.retryOnConnectionFailure(true);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void a(@Y61.k U51.b bVar) {
        this.f398914a = new f(this.f398914a, bVar);
    }
}
