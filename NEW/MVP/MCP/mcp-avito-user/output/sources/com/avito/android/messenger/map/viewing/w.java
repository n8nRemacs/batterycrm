package com.avito.android.messenger.map.viewing;

import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.MarkersRequest;
import javax.inject.Provider;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: PlatformMapInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class w implements dagger.internal.h<v> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f196907a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC47842z> f196908b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f196909c;

    public w(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider) {
        this.f196907a = lVar;
        this.f196908b = provider;
        this.f196909c = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new v((GeoMarker[]) this.f196907a.f393949a, this.f196908b.get(), (MarkersRequest) this.f196909c.f393949a);
    }
}
