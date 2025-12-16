package EZ;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import gj.InterfaceC40691b;

/* compiled from: ModelCardScreenModule_ProvideComponentsFormsFactory.java */
@e
@y
@x
/* loaded from: classes15.dex */
public final class d implements h<FZ.b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f4076a;

    public d(u uVar) {
        this.f4076a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC40691b interfaceC40691b = (InterfaceC40691b) this.f4076a.get();
        b.f4070a.getClass();
        return new FZ.b(interfaceC40691b.j(), interfaceC40691b.j(), interfaceC40691b.j(), interfaceC40691b.j());
    }
}
