package kg0;

import com.avito.android.push.rustore.token_update.i;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import lg0.InterfaceC43767a;

/* compiled from: RustoreAuthorizationPluginModule_ProvidePushAuthorizationPluginFactory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<A3.b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC43767a> f406539a;

    /* renamed from: b, reason: collision with root package name */
    public final u f406540b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.push.impl_module.features.b f406541c;

    public c(Provider provider, u uVar, com.avito.android.push.impl_module.features.b bVar) {
        this.f406539a = provider;
        this.f406540b = uVar;
        this.f406541c = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC43767a interfaceC43767a = this.f406539a.get();
        i iVar = (i) this.f406540b.get();
        this.f406541c.get();
        C42691b.f406538a.getClass();
        return new C42690a(interfaceC43767a, iVar);
    }
}
