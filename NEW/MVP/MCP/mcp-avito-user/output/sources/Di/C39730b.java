package di;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lj.InterfaceC43780b;

/* compiled from: ComponentsFormParamsFetcherImpl_Factory.java */
@e
@y
@x
/* renamed from: di.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C39730b implements h<C39729a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43780b> f394026a;

    public C39730b(Provider<InterfaceC43780b> provider) {
        this.f394026a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C39729a(this.f394026a.get());
    }
}
