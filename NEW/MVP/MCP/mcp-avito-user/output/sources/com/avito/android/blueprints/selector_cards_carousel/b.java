package com.avito.android.blueprints.selector_cards_carousel;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectorCardsCarouselBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f106720a;

    public b(Provider<e> provider) {
        this.f106720a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106720a.get());
    }
}
