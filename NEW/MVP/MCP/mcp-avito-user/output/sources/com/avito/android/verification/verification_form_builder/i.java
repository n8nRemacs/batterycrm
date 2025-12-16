package com.avito.android.verification.verification_form_builder;

import com.avito.android.remote.A1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: FormBuilderInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<A1> f325389a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f325390b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f325391c;

    public i(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f325389a = provider;
        this.f325390b = provider2;
        this.f325391c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f325389a.get(), this.f325390b.get(), (FormBuilderArgs) this.f325391c.f393949a);
    }
}
