package com.avito.android.location_picker.providers;

/* compiled from: AvitoAddressGeoCoder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes14.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f182482a;

    public v(dagger.internal.u uVar) {
        this.f182482a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((com.avito.android.geo_common.interactor.g) this.f182482a.get());
    }
}
