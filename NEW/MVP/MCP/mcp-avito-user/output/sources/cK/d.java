package CK;

import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacSocketSubscriptionDialerMediatorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f2087a;

    public d(f fVar) {
        this.f2087a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.b(this.f2087a));
    }
}
