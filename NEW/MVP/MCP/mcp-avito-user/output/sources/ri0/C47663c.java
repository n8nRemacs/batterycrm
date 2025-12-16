package ri0;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: RealtyAgencyStorageImpl_Factory.java */
@e
@y
@x
/* renamed from: ri0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C47663c implements h<C47662b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f430152a;

    public C47663c(u uVar) {
        this.f430152a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C47662b((l) this.f430152a.get());
    }
}
