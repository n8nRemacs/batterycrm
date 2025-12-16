package dagger.internal;

import dagger.internal.w;
import javax.inject.Provider;

/* compiled from: DelegateFactory.java */
/* loaded from: classes8.dex */
public final class f<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    public u<T> f393944a;

    public static <T> void a(u<T> uVar, u<T> uVar2) {
        f fVar = (f) uVar;
        uVar2.getClass();
        if (fVar.f393944a != null) {
            throw new IllegalStateException();
        }
        fVar.f393944a = uVar2;
    }

    @Deprecated
    public static void b(u uVar, Provider provider) {
        f fVar = (f) provider;
        w.a aVar = new w.a(uVar);
        if (fVar.f393944a != null) {
            throw new IllegalStateException();
        }
        fVar.f393944a = aVar;
    }

    @Override // javax.inject.Provider
    public final T get() {
        u<T> uVar = this.f393944a;
        if (uVar != null) {
            return uVar.get();
        }
        throw new IllegalStateException();
    }
}
