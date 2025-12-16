package com.avito.android.extended_profile.di;

/* compiled from: ExtendedProfileModule_ProvideSpanLookupFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class M implements dagger.internal.h<QH.b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f149547a;

    public M(dagger.internal.u uVar) {
        this.f149547a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        int iIntValue = ((Integer) this.f149547a.get()).intValue();
        r.f149945a.getClass();
        return new QH.b(new C30440u(iIntValue));
    }
}
