package cM;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacProblemCurrentDeviceIacEnablingCheckerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<NL.e> f57824a;

    public h(Provider<NL.e> provider) {
        this.f57824a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f57824a.get());
    }
}
