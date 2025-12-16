package com.avito.android.publish.details.di;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: PublishDetailsModule_ProvideFragmentManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class s0 implements dagger.internal.h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f234592a;

    public s0(dagger.internal.l lVar) {
        this.f234592a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f234592a.f393949a;
        n0.f234577a.getClass();
        return fragment.getParentFragmentManager();
    }
}
