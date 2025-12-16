package Vf0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import jg0.InterfaceC42375a;

/* compiled from: FirstAppStartDetectorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<C15673a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f17352a;

    public b(u uVar) {
        this.f17352a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C15673a((InterfaceC42375a) this.f17352a.get());
    }
}
