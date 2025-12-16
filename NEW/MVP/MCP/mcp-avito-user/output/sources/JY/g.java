package JY;

import AK0.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersistentMessengerConfigStorage_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f9033a;

    public g(Provider<l> provider) {
        this.f9033a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f9033a.get());
    }
}
