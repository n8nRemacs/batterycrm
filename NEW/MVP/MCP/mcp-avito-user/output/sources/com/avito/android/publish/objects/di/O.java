package com.avito.android.publish.objects.di;

import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;

/* compiled from: ObjectFillFormModule_ProvideLifecycleOwnerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class O implements dagger.internal.h<InterfaceC22983P> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f237663a;

    public O(dagger.internal.l lVar) {
        this.f237663a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f237663a.f393949a;
        C33939w.f238031a.getClass();
        return fragment;
    }
}
