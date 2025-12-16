package com.avito.android.extended_profile_adverts.di;

import com.avito.android.serp.adapter.InterfaceC34863v;
import kotlinx.coroutines.flow.Y1;

/* compiled from: ProfileAdvertsModule_ProvideAdvertItemListener$_avito_extended_profile_adverts_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<InterfaceC34863v> {

    /* renamed from: a, reason: collision with root package name */
    public final n f150823a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f150824b;

    public p(n nVar, dagger.internal.u uVar) {
        this.f150823a = nVar;
        this.f150824b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y1 y12 = (Y1) this.f150824b.get();
        this.f150823a.getClass();
        return new o(y12);
    }
}
