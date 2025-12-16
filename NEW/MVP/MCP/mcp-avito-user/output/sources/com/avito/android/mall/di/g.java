package com.avito.android.mall.di;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MallModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class g implements h<com.avito.android.mall.viewmodel.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f184329a;

    /* renamed from: b, reason: collision with root package name */
    public final u f184330b;

    public g(l lVar, u uVar) {
        this.f184329a = lVar;
        this.f184330b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f184329a.f393949a;
        P0.c cVar = (P0.c) this.f184330b.get();
        d.f184325a.getClass();
        return (com.avito.android.mall.viewmodel.a) new P0(fragment, cVar).a(com.avito.android.mall.viewmodel.g.class);
    }
}
