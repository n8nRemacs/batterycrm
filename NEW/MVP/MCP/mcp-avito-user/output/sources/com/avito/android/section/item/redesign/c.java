package com.avito.android.section.item.redesign;

import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ComplementaryAdvertRedesignBottomSheetItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f264762a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f264763b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f264764c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f264765d;

    public c(Provider<g> provider, Provider<com.avito.android.server_time.h> provider2, Provider<Locale> provider3, Provider<com.avito.android.connection_quality.connectivity.a> provider4) {
        this.f264762a = provider;
        this.f264763b = provider2;
        this.f264764c = provider3;
        this.f264765d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f264762a.get(), this.f264763b.get(), this.f264764c.get(), this.f264765d.get());
    }
}
