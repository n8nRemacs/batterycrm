package nC;

import AK0.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: FakeDoorStorageImpl_Factory.java */
@e
@y
@x
/* renamed from: nC.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C44230c implements h<C44229b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f414921a;

    public C44230c(u uVar) {
        this.f414921a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C44229b((l) this.f414921a.get());
    }
}
