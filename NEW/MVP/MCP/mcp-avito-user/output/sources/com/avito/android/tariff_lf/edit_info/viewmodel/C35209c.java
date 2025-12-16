package com.avito.android.tariff_lf.edit_info.viewmodel;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: EditInfoConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.tariff_lf.edit_info.viewmodel.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35209c implements dagger.internal.h<C35208b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.tariff_lf.bar.i> f299089a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f299090b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f299091c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<Context> f299092d;

    public C35209c(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f299089a = provider;
        this.f299090b = uVar;
        this.f299091c = provider2;
        this.f299092d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35208b(this.f299089a.get(), (F) this.f299090b.get(), this.f299091c.get(), this.f299092d.get());
    }
}
