package com.avito.android.rating_form.step.dialog.mvi;

import com.avito.android.rating_form.step.dialog.DialogInfo;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DialogBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f249454a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.rating_form.interactor.i> f249455b;

    public h(dagger.internal.l lVar, Provider provider) {
        this.f249454a = lVar;
        this.f249455b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((DialogInfo) this.f249454a.f393949a, this.f249455b.get());
    }
}
