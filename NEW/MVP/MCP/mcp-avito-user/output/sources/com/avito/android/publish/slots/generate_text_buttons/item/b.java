package com.avito.android.publish.slots.generate_text_buttons.item;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GenerateTextButtonsBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f243995a;

    public b(Provider<e> provider) {
        this.f243995a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f243995a.get());
    }
}
