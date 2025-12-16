package com.avito.android.section.chips;

import com.avito.android.section.chips.f;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionChipsPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<f.b> f264639a;

    public i(Provider<f.b> provider) {
        this.f264639a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f264639a.get());
    }
}
