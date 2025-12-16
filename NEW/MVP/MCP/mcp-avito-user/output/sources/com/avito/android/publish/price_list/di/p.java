package com.avito.android.publish.price_list.di;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListModule_ProvideFragmentManager$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<FragmentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f238520a;

    public p(dagger.internal.l lVar) {
        this.f238520a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f238520a.f393949a;
        n.f238518a.getClass();
        return fragment.getParentFragmentManager();
    }
}
