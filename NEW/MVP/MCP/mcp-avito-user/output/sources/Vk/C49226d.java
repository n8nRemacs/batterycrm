package vK;

import dagger.internal.f;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: IacPushHandlerDialerMediatorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: vK.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49226d implements h<C49225c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f440686a;

    public C49226d(f fVar) {
        this.f440686a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49225c(g.b(this.f440686a));
    }
}
