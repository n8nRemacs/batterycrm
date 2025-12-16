package com.avito.android.str_booking.ui.banner;

import com.avito.android.str_booking.ui.ScreenType;
import dagger.internal.l;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrBookingBannerBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f285923a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f285924b;

    /* renamed from: c, reason: collision with root package name */
    public final l f285925c;

    public b(l lVar, u uVar, Provider provider) {
        this.f285923a = uVar;
        this.f285924b = provider;
        this.f285925c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f285923a.get(), this.f285924b.get(), (ScreenType) this.f285925c.f393949a);
    }
}
