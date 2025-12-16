package com.avito.android.async_phone.impl_module.phone_request_link;

import ac.C19864a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.D;
import com.avito.android.analytics.event.W0;
import com.avito.android.async_phone.public_module.phone_request_link.PhoneRequestDeepLinkAnalyticsData;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PhoneRequestDeepLinkAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/impl_module/phone_request_link/b;", "Lcom/avito/android/async_phone/impl_module/phone_request_link/a;", "_avito_async-phone_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f92149a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C19864a f92150b;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C19864a c19864a) {
        this.f92149a = interfaceC28373a;
        this.f92150b = c19864a;
    }

    @Override // com.avito.android.async_phone.impl_module.phone_request_link.a
    public final void a(@Y61.l PhoneRequestDeepLinkAnalyticsData phoneRequestDeepLinkAnalyticsData) {
        boolean z12 = phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.ResidentialComplex;
        InterfaceC28373a interfaceC28373a = this.f92149a;
        if (z12) {
            PhoneRequestDeepLinkAnalyticsData.ResidentialComplex residentialComplex = (PhoneRequestDeepLinkAnalyticsData.ResidentialComplex) phoneRequestDeepLinkAnalyticsData;
            interfaceC28373a.c(new D(residentialComplex.f92277c, residentialComplex.f92279e, residentialComplex.f92280f, residentialComplex.f92278d));
            return;
        }
        boolean z13 = phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.Comparison;
        C19864a c19864a = this.f92150b;
        if (z13) {
            PhoneRequestDeepLinkAnalyticsData.Comparison comparison = (PhoneRequestDeepLinkAnalyticsData.Comparison) phoneRequestDeepLinkAnalyticsData;
            String str = comparison.f92255c;
            boolean zBooleanValue = c19864a.v().getValue().booleanValue();
            interfaceC28373a.c(new com.avito.android.analytics.call.c(str, null, comparison.f92256d, comparison.f92257e, null, null, null, zBooleanValue, 96, null));
            interfaceC28373a.c(new W0(comparison.f92255c, comparison.f92258f));
            return;
        }
        if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.MyApplies) {
            PhoneRequestDeepLinkAnalyticsData.MyApplies myApplies = (PhoneRequestDeepLinkAnalyticsData.MyApplies) phoneRequestDeepLinkAnalyticsData;
            String str2 = myApplies.f92274c;
            boolean zBooleanValue2 = c19864a.v().getValue().booleanValue();
            interfaceC28373a.c(new com.avito.android.analytics.call.c(str2, null, myApplies.f92275d, myApplies.f92276e, null, null, null, zBooleanValue2, 96, null));
            return;
        }
        if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.Favorites) {
            PhoneRequestDeepLinkAnalyticsData.Favorites favorites = (PhoneRequestDeepLinkAnalyticsData.Favorites) phoneRequestDeepLinkAnalyticsData;
            String str3 = favorites.f92269c;
            boolean zBooleanValue3 = c19864a.v().getValue().booleanValue();
            interfaceC28373a.c(new com.avito.android.analytics.call.c(str3, null, favorites.f92270d, favorites.f92271e, null, null, null, zBooleanValue3, 96, null));
            return;
        }
        if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.Default) {
            PhoneRequestDeepLinkAnalyticsData.Default r15 = (PhoneRequestDeepLinkAnalyticsData.Default) phoneRequestDeepLinkAnalyticsData;
            String str4 = r15.f92259c;
            boolean zBooleanValue4 = c19864a.v().getValue().booleanValue();
            interfaceC28373a.c(new com.avito.android.analytics.call.c(str4, null, r15.f92260d, r15.f92261e, null, null, null, zBooleanValue4, 96, null));
            return;
        }
        if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.ExtendedProfile) {
            PhoneRequestDeepLinkAnalyticsData.ExtendedProfile extendedProfile = (PhoneRequestDeepLinkAnalyticsData.ExtendedProfile) phoneRequestDeepLinkAnalyticsData;
            interfaceC28373a.c(new com.avito.android.analytics.call.c(extendedProfile.f92263d, null, extendedProfile.f92264e, extendedProfile.f92265f, extendedProfile.f92267h, extendedProfile.f92268i, extendedProfile.f92266g, c19864a.v().getValue().booleanValue()));
            return;
        }
        if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.IacGsmFallback) {
            PhoneRequestDeepLinkAnalyticsData.IacGsmFallback iacGsmFallback = (PhoneRequestDeepLinkAnalyticsData.IacGsmFallback) phoneRequestDeepLinkAnalyticsData;
            interfaceC28373a.c(new com.avito.android.analytics.call.c(iacGsmFallback.f92272c, null, null, iacGsmFallback.f92273d, 11, "11", null, c19864a.v().getValue().booleanValue()));
        }
    }

    @Override // com.avito.android.async_phone.impl_module.phone_request_link.a
    public final void b(@Y61.l PhoneRequestDeepLinkAnalyticsData phoneRequestDeepLinkAnalyticsData) {
        boolean z12 = phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.Advert;
        InterfaceC28373a interfaceC28373a = this.f92149a;
        if (z12) {
            interfaceC28373a.c(new com.avito.android.analytics.call.a(((PhoneRequestDeepLinkAnalyticsData.Advert) phoneRequestDeepLinkAnalyticsData).f92254c, null));
            return;
        }
        if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.MyApplies) {
            interfaceC28373a.c(new com.avito.android.analytics.call.a(((PhoneRequestDeepLinkAnalyticsData.MyApplies) phoneRequestDeepLinkAnalyticsData).f92274c, null));
            return;
        }
        if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.Favorites) {
            interfaceC28373a.c(new com.avito.android.analytics.call.a(((PhoneRequestDeepLinkAnalyticsData.Favorites) phoneRequestDeepLinkAnalyticsData).f92269c, null));
        } else if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.ExtendedProfile) {
            interfaceC28373a.c(new com.avito.android.analytics.call.a(((PhoneRequestDeepLinkAnalyticsData.ExtendedProfile) phoneRequestDeepLinkAnalyticsData).f92263d, null));
        } else if (phoneRequestDeepLinkAnalyticsData instanceof PhoneRequestDeepLinkAnalyticsData.IacGsmFallback) {
            interfaceC28373a.c(new com.avito.android.analytics.call.a(((PhoneRequestDeepLinkAnalyticsData.IacGsmFallback) phoneRequestDeepLinkAnalyticsData).f92272c, null));
        }
    }
}
