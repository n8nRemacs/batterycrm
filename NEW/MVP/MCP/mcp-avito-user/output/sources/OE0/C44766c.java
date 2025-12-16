package oe0;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: VinManualBottomSheetFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* renamed from: oe0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C44766c implements h<C44765b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f419978a;

    public C44766c(u uVar) {
        this.f419978a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44765b((InterfaceC44767d) this.f419978a.get());
    }
}
