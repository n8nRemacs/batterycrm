package com.avito.android.advert.item.select.controls;

import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.util.Kundle;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoSelectPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class l implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28265d> f79418a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f79419b;

    public l(dagger.internal.l lVar, Provider provider) {
        this.f79418a = provider;
        this.f79419b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f79418a.get(), (Kundle) this.f79419b.f393949a);
    }
}
