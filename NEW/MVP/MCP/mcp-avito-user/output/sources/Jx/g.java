package JX;

import com.avito.android.permissions.z;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MainStartOnboardingLocationPermissionCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<z> f9017a;

    public g(Provider<z> provider) {
        this.f9017a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f9017a.get());
    }
}
