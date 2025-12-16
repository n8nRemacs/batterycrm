package iY;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ViewedPinsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class c implements dagger.internal.h<C41362b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f398549a;

    public c(g gVar) {
        this.f398549a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C41362b((e) this.f398549a.get());
    }
}
