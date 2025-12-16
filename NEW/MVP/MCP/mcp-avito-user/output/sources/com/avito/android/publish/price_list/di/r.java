package com.avito.android.publish.price_list.di;

import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListModule_ProvideLifecycleOwner$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<InterfaceC22983P> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f238522a;

    public r(dagger.internal.l lVar) {
        this.f238522a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f238522a.f393949a;
        n.f238518a.getClass();
        return fragment;
    }
}
