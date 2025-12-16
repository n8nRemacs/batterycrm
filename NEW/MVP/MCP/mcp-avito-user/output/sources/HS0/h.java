package hs0;

import Oi0.C14701e;
import Oi0.InterfaceC14698b;
import com.avito.android.util.C;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VerticalFilterModule_ProvideSafeRecyclerAdapterFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<C14701e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f397436a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C> f397437b;

    public h(dagger.internal.u uVar, Provider provider) {
        this.f397436a = uVar;
        this.f397437b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f397436a.get();
        C c12 = this.f397437b.get();
        C40977a.f397427a.getClass();
        return new C14701e(interfaceC14698b, c12);
    }
}
