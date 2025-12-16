package Xq;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IsAdvertDetailsComparisonOnboardingEnabledUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C17037a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f19080a;

    public c(Provider<l> provider) {
        this.f19080a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C17037a(this.f19080a.get());
    }
}
