package com.avito.android.publish.details;

/* compiled from: PublishDetailsDraftsManagerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.publish.details.o0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33776o0 implements dagger.internal.h<C33773n0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f234866a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f234867b;

    public C33776o0(dagger.internal.l lVar, dagger.internal.u uVar) {
        this.f234866a = uVar;
        this.f234867b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C33773n0((com.avito.android.publish.C0) this.f234866a.get(), ((Integer) this.f234867b.f393949a).intValue());
    }
}
