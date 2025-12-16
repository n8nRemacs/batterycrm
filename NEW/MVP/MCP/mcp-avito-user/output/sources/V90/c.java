package v90;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ProfileProDashboardConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f440481a;

    /* renamed from: b, reason: collision with root package name */
    public final t90.f f440482b;

    /* renamed from: c, reason: collision with root package name */
    public final j f440483c;

    /* renamed from: d, reason: collision with root package name */
    public final g f440484d;

    public c(Provider provider, t90.f fVar, j jVar, g gVar) {
        this.f440481a = provider;
        this.f440482b = fVar;
        this.f440483c = jVar;
        this.f440484d = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f440481a.get(), (t90.d) this.f440482b.get(), (h) this.f440483c.get(), (e) this.f440484d.get());
    }
}
