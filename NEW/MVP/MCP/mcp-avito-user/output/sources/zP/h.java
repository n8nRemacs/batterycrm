package zp;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MortgageBannerItemFilter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50602a> f444250a;

    public h(Provider<InterfaceC50602a> provider) {
        this.f444250a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f444250a.get());
    }
}
