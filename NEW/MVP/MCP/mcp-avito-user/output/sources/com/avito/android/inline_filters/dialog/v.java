package com.avito.android.inline_filters.dialog;

import android.app.Activity;
import javax.inject.Provider;

/* compiled from: InlineFiltersDialogItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<t> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.select.variant.b> f172289a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f172290b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f172291c;

    public v(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider) {
        this.f172289a = provider;
        this.f172290b = lVar;
        this.f172291c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new t(this.f172289a.get(), (Activity) this.f172290b.f393949a, (NN.c) this.f172291c.get());
    }
}
