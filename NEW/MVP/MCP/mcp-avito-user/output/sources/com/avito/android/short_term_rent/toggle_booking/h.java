package com.avito.android.short_term_rent.toggle_booking;

import Y61.k;
import android.os.Bundle;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_core.toggle_booking.ToggleOnlineBookingDeepLink;
import com.avito.android.util.InterfaceC35745a5;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ToggleOnlineBookingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/toggle_booking/h;", "Lev/a;", "Lcom/avito/android/str_core/toggle_booking/ToggleOnlineBookingDeepLink;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends AbstractC40161a<ToggleOnlineBookingDeepLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f283011f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.i f283012g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.g f283013h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f283014i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f283015j = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public h(@k a aVar, @k a.i iVar, @k a.g gVar, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f283011f = aVar;
        this.f283012g = iVar;
        this.f283013h = gVar;
        this.f283014i = interfaceC35745a5;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        ToggleOnlineBookingDeepLink toggleOnlineBookingDeepLink = (ToggleOnlineBookingDeepLink) deepLink;
        this.f283015j.b(this.f283011f.a(toggleOnlineBookingDeepLink.f288535b, toggleOnlineBookingDeepLink.f288536c).j0(this.f283014i.e()).v0(new f(this), new g(this), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f283015j.e();
    }

    public final void k(ApiError apiError) {
        this.f283013h.g(d(), false);
        a.i.C4057a.d(this.f283012g, com.avito.android.printable_text.b.f(apiError.getF244063c()), null, null, new f.c(apiError), 0, ToastBarPosition.f181047e, null, null, 1966);
        j(ToggleOnlineBookingDeepLink.c.a.f288537b);
    }
}
