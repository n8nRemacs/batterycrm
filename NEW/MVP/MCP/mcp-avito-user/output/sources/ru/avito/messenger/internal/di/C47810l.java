package ru.avito.messenger.internal.di;

import com.avito.android.analytics.clickstream.C28392q;
import com.google.gson.Gson;
import javax.inject.Provider;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.z;
import ru.avito.messenger.internal.C47745a;

/* compiled from: HttpMessengerTransportModule_ProvideHttpApiFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: ru.avito.messenger.internal.di.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47810l implements dagger.internal.h<ru.avito.messenger.internal.jsonrpc.b> {

    /* renamed from: a, reason: collision with root package name */
    public final C47808j f431641a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OkHttpClient> f431642b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Gson> f431643c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<C47745a> f431644d;

    public C47810l(C47808j c47808j, Provider<OkHttpClient> provider, Provider<Gson> provider2, Provider<C47745a> provider3) {
        this.f431641a = c47808j;
        this.f431642b = provider;
        this.f431643c = provider2;
        this.f431644d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarB = dagger.internal.g.b(this.f431642b);
        Gson gson = this.f431643c.get();
        C47745a c47745a = this.f431644d.get();
        this.f431641a.getClass();
        z.b bVar = new z.b();
        bVar.a(hu.akarnokd.rxjava3.retrofit.g.a());
        bVar.b(retrofit2.converter.gson.a.d(gson));
        HttpUrl httpUrlBuild = (HttpUrl) io.reactivex.rxjava3.core.I.q(c47745a.f431208a.f431826a).e();
        if (c47745a.f431233z && kotlin.jvm.internal.L.f(httpUrlBuild.host(), "socket.avito.ru")) {
            httpUrlBuild = HttpUrl.INSTANCE.get("https://socket-fallback.avito.ru/");
        } else if (C42745f0.U("socket.avito.ru", "socket.t.avito.ru").contains(httpUrlBuild.host())) {
            httpUrlBuild = httpUrlBuild.newBuilder().encodedPath("/").build();
        } else if (C43066x.z(httpUrlBuild.encodedPath(), "/socket", false)) {
            httpUrlBuild = httpUrlBuild.newBuilder().encodedPath(C43066x.X("/socket", httpUrlBuild.encodedPath())).addPathSegment("").build();
        } else if (!C43066x.z(httpUrlBuild.encodedPath(), "/", false)) {
            httpUrlBuild = httpUrlBuild.newBuilder().encodedPath("").addPathSegment("").build();
        }
        bVar.d(httpUrlBuild);
        bVar.f430133b = new C28392q(eVarB, 1);
        ru.avito.messenger.internal.jsonrpc.b bVar2 = (ru.avito.messenger.internal.jsonrpc.b) bVar.e().b(ru.avito.messenger.internal.jsonrpc.b.class);
        dagger.internal.t.d(bVar2);
        return bVar2;
    }
}
