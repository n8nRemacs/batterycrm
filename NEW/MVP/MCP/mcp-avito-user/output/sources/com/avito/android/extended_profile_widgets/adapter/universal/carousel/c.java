package com.avito.android.extended_profile_widgets.adapter.universal.carousel;

import dC.C39557b;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UniversalWidgetCarouselContainerItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f154974a;

    /* renamed from: b, reason: collision with root package name */
    public final C39557b f154975b;

    /* renamed from: c, reason: collision with root package name */
    public final u f154976c;

    public c(Provider provider, C39557b c39557b, u uVar) {
        this.f154974a = provider;
        this.f154975b = c39557b;
        this.f154976c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f154974a.get(), this.f154975b, (com.avito.konveyor.a) this.f154976c.get());
    }
}
