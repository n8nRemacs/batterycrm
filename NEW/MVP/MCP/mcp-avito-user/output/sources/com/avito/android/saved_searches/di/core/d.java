package com.avito.android.saved_searches.di.core;

import Cd.D;
import androidx.fragment.app.DialogFragment;
import androidx.view.P0;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SavedSearchCoreModule_Companion_ProvideSavedSearchAnalyticsHolderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<com.avito.android.saved_searches.presentation.core.a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f258357a;

    /* renamed from: b, reason: collision with root package name */
    public final u f258358b;

    public d(l lVar, u uVar) {
        this.f258357a = lVar;
        this.f258358b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        DialogFragment dialogFragment = (DialogFragment) this.f258357a.f393949a;
        D d12 = (D) this.f258358b.get();
        c.f258355a.getClass();
        return (com.avito.android.saved_searches.presentation.core.a) new P0(dialogFragment.getF42820b(), d12, null, 4, null).a(com.avito.android.saved_searches.presentation.core.b.class);
    }
}
