package com.avito.android.location_picker.di;

import com.avito.android.location_picker.view.InterfaceC31579a;
import com.avito.android.location_picker.view.T;
import javax.inject.Provider;

/* compiled from: LocationPickerModule_ProvideLocationPickerInputViewFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class k implements dagger.internal.h<InterfaceC31579a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f182324a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T> f182325b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f182326c;

    public k(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f182324a = lVar;
        this.f182325b = provider;
        this.f182326c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        boolean zBooleanValue = ((Boolean) this.f182324a.f393949a).booleanValue();
        h31.e eVarB = dagger.internal.g.b(this.f182325b);
        h31.e eVarA = dagger.internal.g.a(dagger.internal.w.a(this.f182326c));
        g.f182320a.getClass();
        return (InterfaceC31579a) (zBooleanValue ? eVarA.get() : eVarB.get());
    }
}
