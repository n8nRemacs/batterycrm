package com.avito.android.profile.edit;

import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Provider;

/* compiled from: PhotoPickerCameraDelegate_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class g0 implements dagger.internal.h<f0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l90.c> f222209a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f222210b;

    public g0(Provider<l90.c> provider, Provider<InterfaceC35863o4> provider2) {
        this.f222209a = provider;
        this.f222210b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f0(this.f222209a.get(), this.f222210b.get());
    }
}
