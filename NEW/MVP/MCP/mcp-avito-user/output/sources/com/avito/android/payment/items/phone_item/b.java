package com.avito.android.payment.items.phone_item;

import com.avito.android.payment.di.module.C32986m;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: InputPhoneBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32986m f214483a;

    public b(C32986m c32986m) {
        this.f214483a = c32986m;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f214483a.get());
    }
}
