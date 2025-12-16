package Zv0;

import com.avito.android.short_term_rent.bookingform.deeplink.c;
import com.avito.android.short_term_rent.bookingform.deeplink.f;
import com.avito.android.short_term_rent.deeplink.BookingFormDeepLink;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: BookingFormDeepLinkModule_ProvideBookingFormDeepLinkMappingFactory.java */
@e
@y
@x
/* renamed from: Zv0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19613b implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final c f20574a;

    /* renamed from: b, reason: collision with root package name */
    public final f f20575b;

    public C19613b(c cVar, f fVar) {
        this.f20574a = cVar;
        this.f20575b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f20575b.getClass();
        com.avito.android.short_term_rent.bookingform.deeplink.e eVar = new com.avito.android.short_term_rent.bookingform.deeplink.e();
        C19612a.f20573a.getClass();
        return new C43834a(BookingFormDeepLink.class, eVar, new C43834a.b.C11808a(com.avito.android.deep_linking.links.storage.a.f134018a.a(BookingFormDeepLink.class), this.f20574a));
    }
}
