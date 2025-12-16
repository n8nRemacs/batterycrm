package mK;

import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacCallLauncherDialerMediatorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f414474a;

    public d(f fVar) {
        this.f414474a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.b(this.f414474a));
    }
}
