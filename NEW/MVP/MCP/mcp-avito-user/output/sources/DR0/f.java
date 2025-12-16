package Dr0;

import Oi0.C14699c;
import Oi0.InterfaceC14698b;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ResizableServiceWidgetBlockModule_ProvideDestroyableViewHolderBuilderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<InterfaceC14698b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f3491a;

    public f(Provider<com.avito.konveyor.a> provider) {
        this.f3491a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = this.f3491a.get();
        d.f3489a.getClass();
        return new C14699c(aVar);
    }
}
