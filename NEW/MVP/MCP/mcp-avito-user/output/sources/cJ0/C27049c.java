package cJ0;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsCountUpdaterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: cJ0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27049c implements dagger.internal.h<C27048b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<eH0.k> f57809a;

    public C27049c(Provider<eH0.k> provider) {
        this.f57809a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27048b(this.f57809a.get());
    }
}
