package com.avito.android.profile.pro.impl.converters;

/* compiled from: ProfileProConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.profile.pro.impl.converters.f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33351f implements dagger.internal.h<C33350e> {

    /* renamed from: a, reason: collision with root package name */
    public final r f222452a;

    /* renamed from: b, reason: collision with root package name */
    public final D f222453b;

    /* renamed from: c, reason: collision with root package name */
    public final J f222454c;

    public C33351f(r rVar, D d12, J j12) {
        this.f222452a = rVar;
        this.f222453b = d12;
        this.f222454c = j12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        p pVar = (p) this.f222452a.get();
        this.f222453b.getClass();
        return new C33350e(pVar, new C(), (H) this.f222454c.get());
    }
}
