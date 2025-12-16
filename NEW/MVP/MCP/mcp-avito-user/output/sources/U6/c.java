package u6;

import com.avito.konveyor.adapter.j;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PropertiesDialogModule_ProvideAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class c implements h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f439792a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f439793b;

    public c(u uVar, Provider provider) {
        this.f439792a = uVar;
        this.f439793b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f439792a.get();
        com.avito.konveyor.a aVar2 = this.f439793b.get();
        b.f439791a.getClass();
        return new j(aVar, aVar2);
    }
}
