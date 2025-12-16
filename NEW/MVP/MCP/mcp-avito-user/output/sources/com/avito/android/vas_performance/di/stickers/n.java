package com.avito.android.vas_performance.di.stickers;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersEditVasModule_ProvideEditViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class n implements dagger.internal.h<com.avito.android.vas_performance.ui.stickers.edit.q> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f320127a;

    /* renamed from: b, reason: collision with root package name */
    public final u f320128b;

    public n(dagger.internal.l lVar, u uVar) {
        this.f320127a = lVar;
        this.f320128b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f320127a.f393949a;
        P0.c cVar = (P0.c) this.f320128b.get();
        int i12 = m.f320126a;
        return (com.avito.android.vas_performance.ui.stickers.edit.q) new P0(fragment, cVar).a(com.avito.android.vas_performance.ui.stickers.edit.q.class);
    }
}
