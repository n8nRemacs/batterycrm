package v00;

import dagger.internal.A;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;

/* compiled from: LandingPayloadProvider_Factory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<C49136a> {

    /* renamed from: a, reason: collision with root package name */
    public final A f440363a;

    public b(A a12) {
        this.f440363a = a12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49136a((Set) this.f440363a.get());
    }
}
