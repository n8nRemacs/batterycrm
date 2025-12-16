package com.avito.android.publish.input_imei.items.scan_button;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ScanImeiButtonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f236358a;

    public b(Provider<d> provider) {
        this.f236358a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f236358a.get());
    }
}
