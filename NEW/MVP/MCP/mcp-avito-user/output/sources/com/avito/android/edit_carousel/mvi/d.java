package com.avito.android.edit_carousel.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.edit_carousel.entity.CarouselEditorData;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditCarouselActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146455a;

    /* renamed from: b, reason: collision with root package name */
    public final u f146456b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f146457c;

    public d(dagger.internal.l lVar, u uVar, Provider provider) {
        this.f146455a = lVar;
        this.f146456b = uVar;
        this.f146457c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((CarouselEditorData) this.f146455a.f393949a, (com.avito.android.edit_carousel.e) this.f146456b.get(), this.f146457c.get());
    }
}
