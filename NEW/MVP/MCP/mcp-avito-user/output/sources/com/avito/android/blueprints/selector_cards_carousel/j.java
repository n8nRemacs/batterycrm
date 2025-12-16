package com.avito.android.blueprints.selector_cards_carousel;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectorCardsCarouselPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final u f106738a;

    /* renamed from: b, reason: collision with root package name */
    public final u f106739b;

    public j(u uVar, u uVar2) {
        this.f106738a = uVar;
        this.f106739b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f((com.avito.android.util.text.a) this.f106738a.get(), (InterfaceC35745a5) this.f106739b.get());
    }
}
