package com.avito.android.advert.di;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* compiled from: AdvertFragmentModule_ProvideFragmentContextFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class P implements dagger.internal.h<Context> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f69117a;

    public P(dagger.internal.l lVar) {
        this.f69117a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f69117a.f393949a;
        C27710t.f69463a.getClass();
        return fragment.requireContext();
    }
}
