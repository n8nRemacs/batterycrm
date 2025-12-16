package com.avito.android.hotel_available_rooms.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import java.text.SimpleDateFormat;
import javax.inject.Provider;

/* compiled from: HotelAvailableRoomsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<SimpleDateFormat> f163196a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<ZI.a> f163197b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.hotel_available_rooms.domain.converters.d> f163198c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<R0> f163199d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f163200e;

    public n(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f163196a = provider;
        this.f163197b = provider2;
        this.f163198c = provider3;
        this.f163199d = provider4;
        this.f163200e = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f163196a.get(), this.f163197b.get(), this.f163198c.get(), this.f163199d.get(), (GI.a) this.f163200e.get());
    }
}
