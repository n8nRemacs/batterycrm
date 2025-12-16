package com.avito.android.publish.screen.objects.di;

import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;

/* compiled from: ObjectSupportModule_ProvideLifecycleOwnerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class E implements dagger.internal.h<InterfaceC22983P> {

    /* renamed from: a, reason: collision with root package name */
    public final y f239552a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f239553b;

    public E(y yVar, dagger.internal.l lVar) {
        this.f239552a = yVar;
        this.f239553b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f239553b.f393949a;
        this.f239552a.getClass();
        return fragment;
    }
}
