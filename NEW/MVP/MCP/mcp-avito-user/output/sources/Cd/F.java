package Cd;

import java.util.Map;

/* compiled from: ViewModelFactory_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class F implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.q f2368a;

    public F(dagger.internal.q qVar) {
        this.f2368a = qVar;
    }

    public static F a(dagger.internal.q qVar) {
        return new F(qVar);
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new D((Map) this.f2368a.get());
    }
}
