package com.avito.android.location_picker.di;

import com.avito.android.location_picker.view.InterfaceC31580b;
import com.avito.android.location_picker.view.T;
import javax.inject.Provider;

/* compiled from: LocationPickerModule_ProvideLocationPickerMapFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class l implements dagger.internal.h<InterfaceC31580b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182327a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T> f182328b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.location_picker.view.publish.b> f182329c;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f182327a = lVar;
        this.f182328b = provider;
        this.f182329c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f182327a.f393949a).booleanValue();
        h31.e eVarB = dagger.internal.g.b(this.f182328b);
        h31.e eVarB2 = dagger.internal.g.b(this.f182329c);
        g.f182320a.getClass();
        return (InterfaceC31580b) (zBooleanValue ? eVarB2.get() : eVarB.get());
    }
}
