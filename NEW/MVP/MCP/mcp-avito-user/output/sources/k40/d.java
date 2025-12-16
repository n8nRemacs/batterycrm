package K40;

import com.avito.android.remote.model.PresentationType;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BxContentOnboardingPriorityInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.onboarding_manager.f> f9260a;

    /* renamed from: b, reason: collision with root package name */
    public final l f9261b;

    public d(l lVar, Provider provider) {
        this.f9260a = provider;
        this.f9261b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f9260a.get(), (PresentationType) this.f9261b.f393949a);
    }
}
