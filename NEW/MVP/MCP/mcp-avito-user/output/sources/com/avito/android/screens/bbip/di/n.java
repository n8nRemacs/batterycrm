package com.avito.android.screens.bbip.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: BbipModule_ProvideResourcesFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<Resources> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f260231a;

    public n(dagger.internal.l lVar) {
        this.f260231a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f260231a.f393949a;
        m.f260230a.getClass();
        return fragment.getResources();
    }
}
