package com.avito.android.seller_promotions.konveyor.attributed_text;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AttributedTextBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f267763a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f267764b;

    public b(e eVar, Provider provider) {
        this.f267763a = eVar;
        this.f267764b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f267763a.getClass();
        return new a(new d(), this.f267764b.get());
    }
}
