package com.avito.android.publish.price_list.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectPriceListModule_ProvideResources$_avito_publish_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f238525a;

    public t(dagger.internal.l lVar) {
        this.f238525a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f238525a.f393949a;
        n.f238518a.getClass();
        return fragment.getResources();
    }
}
