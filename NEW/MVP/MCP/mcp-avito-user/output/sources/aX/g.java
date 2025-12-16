package Ax;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TargetViewVisibilityHandlerImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class g implements h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC13095a> f713a;

    public g(Provider<InterfaceC13095a> provider) {
        this.f713a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f713a.get());
    }
}
