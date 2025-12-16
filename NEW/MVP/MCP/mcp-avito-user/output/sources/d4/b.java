package D4;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsTravelTrustItemBlockFactoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<F4.e> f2884a;

    public b(Provider<F4.e> provider) {
        this.f2884a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f2884a.get());
    }
}
