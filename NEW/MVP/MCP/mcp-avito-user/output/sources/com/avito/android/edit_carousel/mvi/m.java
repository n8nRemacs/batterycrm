package com.avito.android.edit_carousel.mvi;

import com.avito.android.edit_carousel.entity.CarouselEditorData;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EditCarouselReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f146530a;

    /* renamed from: b, reason: collision with root package name */
    public final u f146531b;

    public m(dagger.internal.l lVar, u uVar) {
        this.f146530a = lVar;
        this.f146531b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new l((CarouselEditorData) this.f146530a.f393949a, (com.avito.android.edit_carousel.k) this.f146531b.get());
    }
}
