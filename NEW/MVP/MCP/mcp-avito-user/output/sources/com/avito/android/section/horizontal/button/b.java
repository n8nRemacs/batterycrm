package com.avito.android.section.horizontal.button;

import com.avito.android.section.item.s;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HorizontalSectionButtonBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f264696a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<s> f264697b;

    public b(u uVar, Provider provider) {
        this.f264696a = uVar;
        this.f264697b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((e) this.f264696a.get(), this.f264697b.get());
    }
}
