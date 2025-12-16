package Bk0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.C;
import com.google.gson.Gson;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

/* compiled from: PushDeliveryTracker_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes17.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13158a> f1681a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<OkHttpClient> f1682b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<C> f1683c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.notification.features.c f1684d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.f f1685e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<Gson> f1686f;

    public h(Provider provider, Provider provider2, Provider provider3, com.avito.android.notification.features.c cVar, dagger.internal.f fVar, Provider provider4) {
        this.f1681a = provider;
        this.f1682b = provider2;
        this.f1683c = provider3;
        this.f1684d = cVar;
        this.f1685e = fVar;
        this.f1686f = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f1681a.get(), dagger.internal.g.b(this.f1682b), this.f1683c.get(), (com.avito.android.notification.features.a) this.f1684d.get(), (InterfaceC28373a) this.f1685e.get(), dagger.internal.g.b(this.f1686f));
    }
}
