package com.avito.android.vas_discount.di;

import androidx.view.P0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PickerModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class p implements dagger.internal.h<com.avito.android.vas_discount.ui.dialog.e> {

    /* renamed from: a, reason: collision with root package name */
    public final i f319674a;

    /* renamed from: b, reason: collision with root package name */
    public final u f319675b;

    public p(i iVar, u uVar) {
        this.f319674a = iVar;
        this.f319675b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        P0.c cVar = (P0.c) this.f319675b.get();
        i iVar = this.f319674a;
        iVar.getClass();
        return (com.avito.android.vas_discount.ui.dialog.e) new P0(iVar.f319661a, cVar).a(com.avito.android.vas_discount.ui.dialog.j.class);
    }
}
