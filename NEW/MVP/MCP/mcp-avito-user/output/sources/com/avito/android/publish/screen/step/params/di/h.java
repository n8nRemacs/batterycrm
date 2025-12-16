package com.avito.android.publish.screen.step.params.di;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PublishDetailsModule_ProvideFragmentManagerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final d f241116a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f241117b;

    public h(d dVar, dagger.internal.l lVar) {
        this.f241116a = dVar;
        this.f241117b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f241117b.f393949a;
        this.f241116a.getClass();
        return fragment.getParentFragmentManager();
    }
}
