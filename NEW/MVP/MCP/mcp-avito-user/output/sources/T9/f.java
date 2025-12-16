package t9;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDiscountDetailsDialogPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f439172a;

    /* renamed from: b, reason: collision with root package name */
    public final u f439173b;

    public f(u uVar, Provider provider) {
        this.f439172a = provider;
        this.f439173b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f439172a.get(), (g) this.f439173b.get());
    }
}
