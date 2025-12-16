package Ur;

import Zx.C19616a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CptMassActivationMapperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C15561b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f16693a;

    public c(u uVar) {
        this.f16693a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C15561b((C19616a) this.f16693a.get());
    }
}
