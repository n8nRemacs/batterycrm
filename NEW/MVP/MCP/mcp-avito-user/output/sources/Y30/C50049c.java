package y30;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: NotificationAuthorizationPlugin_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: y30.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C50049c implements h<C50047a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f442872a;

    public C50049c(f fVar) {
        this.f442872a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C50047a((InterfaceC50050d) this.f442872a.get());
    }
}
