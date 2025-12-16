package xz0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import yF0.InterfaceC50108b;

/* compiled from: LoadBannerUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C50025b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC50108b> f442820a;

    public c(Provider<InterfaceC50108b> provider) {
        this.f442820a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50025b(this.f442820a.get());
    }
}
