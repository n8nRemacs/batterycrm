package com.avito.android.vas_performance.di.stickers;

import androidx.fragment.app.Fragment;
import androidx.view.P0;
import com.avito.android.vas_performance.ui.stickers.buy.v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: StickersBuyVasModule_ProvideViewModelFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class k implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f320124a;

    /* renamed from: b, reason: collision with root package name */
    public final u f320125b;

    public k(dagger.internal.l lVar, u uVar) {
        this.f320124a = lVar;
        this.f320125b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Fragment fragment = (Fragment) this.f320124a.f393949a;
        P0.c cVar = (P0.c) this.f320125b.get();
        int i12 = h.f320120a;
        return (v) new P0(fragment, cVar).a(v.class);
    }
}
