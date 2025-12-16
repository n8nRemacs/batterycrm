package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: CommonIndicatorBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317435a;

    /* renamed from: b, reason: collision with root package name */
    public final u f317436b;

    public b(u uVar, u uVar2) {
        this.f317435a = uVar;
        this.f317436b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f317435a.get(), (com.avito.android.util.text.a) this.f317436b.get());
    }
}
