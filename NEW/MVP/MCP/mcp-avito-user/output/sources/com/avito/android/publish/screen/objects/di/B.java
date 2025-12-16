package com.avito.android.publish.screen.objects.di;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: ObjectSupportModule_ProvideFragmentManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class B implements dagger.internal.h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final y f239548a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f239549b;

    public B(y yVar, dagger.internal.l lVar) {
        this.f239548a = yVar;
        this.f239549b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f239549b.f393949a;
        this.f239548a.getClass();
        return fragment.getParentFragmentManager();
    }
}
