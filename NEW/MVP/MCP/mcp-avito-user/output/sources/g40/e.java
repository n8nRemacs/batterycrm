package G40;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.onboarding.steps.analytics.OnboardingStepsAnalyticsParams;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: OnboardingStepsEventTrackerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f6286a;

    /* renamed from: b, reason: collision with root package name */
    public final l f6287b;

    public e(l lVar, Provider provider) {
        this.f6286a = provider;
        this.f6287b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f6286a.get(), (OnboardingStepsAnalyticsParams) this.f6287b.f393949a);
    }
}
