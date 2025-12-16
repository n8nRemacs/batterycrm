package com.avito.android.select.bottom_sheet.blueprints.candy;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CheckableCandyItemBlueprintImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f265051a;

    /* renamed from: b, reason: collision with root package name */
    public final u f265052b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f265053c;

    public d(u uVar, Provider provider, Provider provider2) {
        this.f265051a = provider;
        this.f265052b = uVar;
        this.f265053c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f265051a.get(), (com.avito.android.candy.e) this.f265052b.get(), this.f265053c.get());
    }
}
