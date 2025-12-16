package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import Yv0.C18332b;
import Yv0.C18333c;
import Yv0.C18334d;
import Yv0.C18335e;
import Yv0.C18336f;
import Yv0.C18339i;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import dF0.C39574a;
import dF0.C39575b;
import javax.inject.Inject;
import kotlin.Metadata;
import mw0.C44147a;

/* compiled from: BookingFormAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/b;", "Lcom/avito/android/short_term_rent/bookingform/mvi/interactor/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f281887a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f281888b;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.provider.a aVar) {
        this.f281887a = interfaceC28373a;
        this.f281888b = aVar;
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void a(@Y61.k ParametrizedClickStreamEvent parametrizedClickStreamEvent) {
        this.f281887a.c(parametrizedClickStreamEvent);
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void b(@Y61.k String str, @Y61.l String str2) {
        this.f281887a.c(new Yv0.j(str, this.f281888b.a(), str2));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void c(@Y61.k String str, boolean z12) {
        this.f281887a.c(new C18339i(str, z12));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void d(@Y61.k String str, @Y61.l String str2) {
        this.f281887a.c(new C18336f(str, str2));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void e(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f281887a.c(new C18332b(str, str2, str3));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void f(@Y61.k String str, @Y61.l String str2) {
        this.f281887a.c(new C39574a("preview_open_form", str, this.f281888b.a(), str2, null, 16, null));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void g(@Y61.k String str, @Y61.l String str2) {
        this.f281887a.c(new C18334d(str, this.f281888b.a(), str2));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void h(@Y61.l Boolean bool, @Y61.k String str, @Y61.l String str2) {
        this.f281887a.c(new C18335e(str, str2, bool, this.f281888b.a()));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void i(@Y61.k String str) {
        this.f281887a.c(new C39575b("preview_open_form", this.f281888b.a(), str, null, null, null, 56, null));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void j(@Y61.l String str, @Y61.k String str2) {
        this.f281887a.c(new C44147a(str, str2, true, null));
    }

    @Override // com.avito.android.short_term_rent.bookingform.mvi.interactor.a
    public final void k(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4) {
        this.f281887a.c(new C18333c(str, this.f281888b.a(), str2, str3, str4));
    }
}
