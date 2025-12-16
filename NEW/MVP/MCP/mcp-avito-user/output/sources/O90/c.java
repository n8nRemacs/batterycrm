package o90;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import f90.H;
import f90.InterfaceC40251E;

/* compiled from: ProfilePluginModule_ProvideAuthorizationPluginFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final H f419469a;

    public c(H h12) {
        this.f419469a = h12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40251E interfaceC40251E = (InterfaceC40251E) this.f419469a.get();
        b.f419468a.getClass();
        return new C44604a(interfaceC40251E);
    }
}
