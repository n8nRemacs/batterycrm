package yp;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wp.InterfaceC49662a;

/* compiled from: DigitalRegistrationInstantItemFilter_Factory.java */
@e
@y
@x
/* renamed from: yp.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C50278b implements h<C50277a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49662a> f443504a;

    public C50278b(Provider<InterfaceC49662a> provider) {
        this.f443504a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50277a(this.f443504a.get());
    }
}
