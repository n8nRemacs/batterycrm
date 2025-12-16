package io.ktor.client.engine.android;

import Y41.l;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AndroidEngineConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/engine/android/i;", "Lio/ktor/client/engine/j;", "<init>", "()V", "ktor-client-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class i extends io.ktor.client.engine.j {

    /* renamed from: a, reason: collision with root package name */
    public final int f398876a = 100000;

    /* renamed from: b, reason: collision with root package name */
    public final int f398877b = 100000;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<? super HttpsURLConnection, G0> f398878c = b.f398881l;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l<? super HttpURLConnection, G0> f398879d = a.f398880l;

    /* compiled from: AndroidEngineConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/net/HttpURLConnection;", "Lkotlin/G0;", "invoke", "(Ljava/net/HttpURLConnection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements l<HttpURLConnection, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f398880l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(HttpURLConnection httpURLConnection) {
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidEngineConfig.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljavax/net/ssl/HttpsURLConnection;", "it", "Lkotlin/G0;", "invoke", "(Ljavax/net/ssl/HttpsURLConnection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements l<HttpsURLConnection, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f398881l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(HttpsURLConnection httpsURLConnection) {
            return G0.f406611a;
        }
    }
}
