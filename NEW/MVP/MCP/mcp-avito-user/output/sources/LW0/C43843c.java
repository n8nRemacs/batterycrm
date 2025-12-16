package lw0;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSoftBookingPromoCodesAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* renamed from: lw0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43843c implements h<C43842b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f414250a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f414251b;

    public C43843c(l lVar, Provider provider) {
        this.f414250a = lVar;
        this.f414251b = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C43842b((StrSoftBookingPromoCodesDialogOpenParams) this.f414250a.f393949a, this.f414251b.get());
    }
}
