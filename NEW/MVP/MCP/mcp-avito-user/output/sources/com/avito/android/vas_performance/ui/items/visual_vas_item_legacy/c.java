package com.avito.android.vas_performance.ui.items.visual_vas_item_legacy;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VisualVasItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f321836a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f321837b;

    public c(u uVar, Provider provider) {
        this.f321836a = uVar;
        this.f321837b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f321836a.get(), this.f321837b.get());
    }
}
