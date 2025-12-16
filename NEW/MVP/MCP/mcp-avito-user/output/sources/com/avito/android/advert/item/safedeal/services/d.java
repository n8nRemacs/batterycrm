package com.avito.android.advert.item.safedeal.services;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.view.InterfaceC22983P;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.safedeal.InterfaceC28173a;
import com.avito.android.advert_core.safedeal.q;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSafeDealServicesPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/safedeal/services/d;", "Lcom/avito/android/advert/item/safedeal/services/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final q f79017b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28173a f79018c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<MyAdvertSafeDeal> f79019d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public AdvertDetailsFragment f79020e;

    @Inject
    public d(@k q qVar, @k InterfaceC28173a interfaceC28173a, @com.avito.android.advert_core.safedeal.di.e @k com.jakewharton.rxrelay3.d<MyAdvertSafeDeal> dVar) {
        this.f79017b = qVar;
        this.f79018c = interfaceC28173a;
        this.f79019d = dVar;
    }

    @Override // com.avito.android.advert.item.safedeal.services.c
    public final void B6(@l InterfaceC22983P interfaceC22983P) {
        this.f79020e = (AdvertDetailsFragment) interfaceC22983P;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsSafeDealServicesItem advertDetailsSafeDealServicesItem = (AdvertDetailsSafeDealServicesItem) aVar;
        AdvertDetailsFragment advertDetailsFragment = this.f79020e;
        if (advertDetailsFragment != null) {
            fVar.ZO(advertDetailsSafeDealServicesItem.f79007d, this.f79017b, this.f79019d, this.f79018c, advertDetailsFragment);
        }
    }
}
