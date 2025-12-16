package e70;

import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PersonalFiltersInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f394969a;

    public i(Provider<d> provider) {
        this.f394969a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(dagger.internal.g.a(w.a(this.f394969a)));
    }
}
