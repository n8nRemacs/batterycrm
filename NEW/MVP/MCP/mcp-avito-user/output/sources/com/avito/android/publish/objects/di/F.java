package com.avito.android.publish.objects.di;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: ObjectFillFormModule_ProvideFragmentManagerFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class F implements dagger.internal.h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f237613a;

    public F(dagger.internal.l lVar) {
        this.f237613a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f237613a.f393949a;
        C33939w.f238031a.getClass();
        return fragment.getParentFragmentManager();
    }
}
