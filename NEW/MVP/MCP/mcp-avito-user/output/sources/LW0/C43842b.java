package lw0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogOpenParams;
import javax.inject.Inject;
import kotlin.Metadata;
import mw0.C44147a;

/* compiled from: StrSoftBookingPromoCodesAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llw0/b;", "Llw0/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43842b implements InterfaceC43841a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final StrSoftBookingPromoCodesDialogOpenParams f414248a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414249b;

    @Inject
    public C43842b(@k StrSoftBookingPromoCodesDialogOpenParams strSoftBookingPromoCodesDialogOpenParams, @k InterfaceC28373a interfaceC28373a) {
        this.f414248a = strSoftBookingPromoCodesDialogOpenParams;
        this.f414249b = interfaceC28373a;
    }

    @Override // lw0.InterfaceC43841a
    public final void a(@k String str, @l String str2, boolean z12) {
        this.f414249b.c(new C44147a(this.f414248a.f282500b, str, z12, str2));
    }
}
