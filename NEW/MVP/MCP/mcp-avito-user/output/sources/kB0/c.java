package kB0;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CpxConfigureAdvanceMapperImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C42565b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f406195a;

    public c(l lVar) {
        this.f406195a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C42565b(((Boolean) this.f406195a.f393949a).booleanValue());
    }
}
