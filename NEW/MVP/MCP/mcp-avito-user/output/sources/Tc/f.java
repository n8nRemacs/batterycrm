package TC;

import AK0.l;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CategoryOnboardingShowsStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f15501a;

    public f(Provider<l> provider) {
        this.f15501a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f15501a.get());
    }
}
