package El;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import wE.InterfaceC49494e;

/* compiled from: FeedsGlobalModule_ProvidePresenterFactory.java */
@e
@y
@x
/* renamed from: El.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13502c implements h<com.avito.android.feeds_global.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49494e> f4224a;

    public C13502c(Provider<InterfaceC49494e> provider) {
        this.f4224a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC49494e interfaceC49494e = this.f4224a.get();
        C13500a.f4221a.getClass();
        return interfaceC49494e.create();
    }
}
