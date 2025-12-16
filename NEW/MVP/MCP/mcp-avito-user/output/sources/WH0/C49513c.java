package wH0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VasActionPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* renamed from: wH0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49513c implements h<C49512b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f441364a;

    public C49513c(u uVar) {
        this.f441364a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C49512b((com.avito.android.deeplink_handler.handler.composite.a) this.f441364a.get());
    }
}
