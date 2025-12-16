package com.avito.android.leasing_calculator.view;

import jR.InterfaceC42298a;
import javax.inject.Provider;
import oR.InterfaceC44683b;

/* compiled from: LeasingBottomSheetDialogFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<p> f175164a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC42298a> f175165b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f175166c;

    public m(dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f175164a = provider;
        this.f175165b = provider2;
        this.f175166c = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f175164a.get(), this.f175165b.get(), (InterfaceC44683b) this.f175166c.get());
    }
}
