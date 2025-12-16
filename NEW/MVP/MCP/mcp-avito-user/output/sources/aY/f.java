package aY;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import eY.InterfaceC40070a;
import iY.InterfaceC41361a;
import javax.inject.Provider;

/* compiled from: PinsConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40070a> f20917a;

    /* renamed from: b, reason: collision with root package name */
    public final u f20918b;

    public f(u uVar, Provider provider) {
        this.f20917a = provider;
        this.f20918b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f20917a.get(), (InterfaceC41361a) this.f20918b.get());
    }
}
