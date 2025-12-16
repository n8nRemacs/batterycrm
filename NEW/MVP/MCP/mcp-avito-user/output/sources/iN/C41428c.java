package in;

import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;
import javax.inject.Provider;
import ln.C43801b;

/* compiled from: CartSimilarItemsBeduinModule_ProvideComponentsFormsFactory.java */
@dagger.internal.e
@y
@x
/* renamed from: in.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C41428c implements dagger.internal.h<C43801b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40691b> f398756a;

    public C41428c(Provider<InterfaceC40691b> provider) {
        this.f398756a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = this.f398756a.get();
        C41426a.f398750a.getClass();
        return new C43801b(interfaceC40691b.j());
    }
}
