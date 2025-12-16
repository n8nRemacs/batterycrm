package com.avito.android.section.item.redesign;

import com.avito.android.section.item.s;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: ComplementaryAdvertRedesignItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f264773a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f264774b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f264775c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f264776d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<s> f264777e;

    public f(Provider<g> provider, Provider<com.avito.android.server_time.h> provider2, Provider<Locale> provider3, Provider<com.avito.android.connection_quality.connectivity.a> provider4, Provider<s> provider5) {
        this.f264773a = provider;
        this.f264774b = provider2;
        this.f264775c = provider3;
        this.f264776d = provider4;
        this.f264777e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f264773a.get(), this.f264774b.get(), this.f264775c.get(), this.f264776d.get(), this.f264777e.get());
    }
}
