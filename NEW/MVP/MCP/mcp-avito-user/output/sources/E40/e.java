package E40;

import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingPreviewPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A40.a> f3752a;

    /* renamed from: b, reason: collision with root package name */
    public final l f3753b;

    public e(l lVar, Provider provider) {
        this.f3752a = provider;
        this.f3753b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f3752a.get(), (String) this.f3753b.f393949a);
    }
}
