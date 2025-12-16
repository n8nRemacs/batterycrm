package com.avito.android.shift_list.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ShiftListModule_ProvideContentAdapterPresenter$_avito_gig_shift_list_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f281028a;

    public e(u uVar) {
        this.f281028a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f281028a.get();
        d.f281027a.getClass();
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
