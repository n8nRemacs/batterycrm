package cJ0;

import AK0.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserAdvertsToastStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: cJ0.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27052f implements dagger.internal.h<C27051e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f57811a;

    public C27052f(Provider<l> provider) {
        this.f57811a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C27051e(this.f57811a.get());
    }
}
