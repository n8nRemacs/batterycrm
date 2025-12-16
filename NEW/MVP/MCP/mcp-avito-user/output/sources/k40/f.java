package K40;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FavoritesOnboardingPriorityInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f9262a;

    public f(Provider<com.avito.android.onboarding_manager.f> provider) {
        this.f9262a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f9262a.get());
    }
}
