package com.avito.android.profile.pro.impl.screen.item.delivery_restriction;

import Y41.l;
import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import m90.C43931a;

/* compiled from: ProfileProDeliveryRestrictionBannerPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/delivery_restriction/g;", "Lcom/avito/android/profile/pro/impl/screen/item/delivery_restriction/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f223204b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<D90.a, G0> f223205c;

    @Inject
    public g(@k l lVar, @k InterfaceC28373a interfaceC28373a) {
        this.f223204b = interfaceC28373a;
        this.f223205c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        this.f223204b.c(new C43931a());
        ((c) eVar).g10((ProfileProDeliveryRestrictionBannerItem) aVar, this.f223205c);
    }
}
