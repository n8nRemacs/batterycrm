package com.avito.android.location_picker.di;

import com.avito.android.location_picker.view.InterfaceC31581c;
import com.avito.android.location_picker.view.T;
import javax.inject.Provider;

/* compiled from: LocationPickerModule_ProvideLocationPickerOutputViewFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<InterfaceC31581c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182330a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T> f182331b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.location_picker.view.publish.b> f182332c;

    public m(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f182330a = lVar;
        this.f182331b = provider;
        this.f182332c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f182330a.f393949a).booleanValue();
        h31.e eVarB = dagger.internal.g.b(this.f182331b);
        h31.e eVarB2 = dagger.internal.g.b(this.f182332c);
        g.f182320a.getClass();
        return (InterfaceC31581c) (zBooleanValue ? eVarB2.get() : eVarB.get());
    }
}
