package com.avito.android.loyalty.ui.quality_service.items.effects;

import com.avito.android.loyalty.di.quality_service.j;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EffectsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final f f183836a;

    /* renamed from: b, reason: collision with root package name */
    public final j f183837b;

    public d(f fVar, j jVar) {
        this.f183836a = fVar;
        this.f183837b = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f183836a.getClass();
        return new c(new e(), this.f183837b);
    }
}
