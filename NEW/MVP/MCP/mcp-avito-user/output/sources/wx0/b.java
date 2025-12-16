package Wx0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingOnboardingStorage_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class b implements h<C15807a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f18087a;

    public b(Provider<l> provider) {
        this.f18087a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15807a(this.f18087a.get());
    }
}
