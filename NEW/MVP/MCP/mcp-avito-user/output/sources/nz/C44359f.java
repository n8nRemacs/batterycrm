package nZ;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import rZ.InterfaceC47619a;

/* compiled from: UnreadCounterStorageAuthPlugin_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: nZ.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C44359f implements h<C44357d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC47619a> f415177a;

    public C44359f(Provider<InterfaceC47619a> provider) {
        this.f415177a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44357d(this.f415177a.get());
    }
}
