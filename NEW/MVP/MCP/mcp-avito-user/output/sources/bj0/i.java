package bj0;

import dagger.internal.x;
import dagger.internal.y;
import ej0.InterfaceC40118a;
import javax.inject.Provider;

/* compiled from: RelatedProductsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<C25668h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC40118a> f57405a;

    public i(Provider<InterfaceC40118a> provider) {
        this.f57405a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C25668h(this.f57405a.get());
    }
}
