package com.avito.android.advert_details_items.imv_v4_cars;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.imv_cars.EntryPointType;
import com.avito.android.analytics.event.imv_cars.IconType;
import javax.inject.Inject;
import kotlin.Metadata;
import lc.C43724a;
import lc.C43726c;

/* compiled from: ImvCarsAnalyticsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/imv_v4_cars/b;", "Lcom/avito/android/advert_details_items/imv_v4_cars/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f84841a;

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f84841a = interfaceC28373a;
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.a
    public final void a(@Y61.k String str) {
        this.f84841a.c(new C43724a(str, EntryPointType.f90086c));
    }

    @Override // com.avito.android.advert_details_items.imv_v4_cars.a
    public final void b(@Y61.k String str) {
        this.f84841a.c(new C43726c(str, IconType.f90092c));
    }
}
