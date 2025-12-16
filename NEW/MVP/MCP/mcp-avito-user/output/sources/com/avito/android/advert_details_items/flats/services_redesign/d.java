package com.avito.android.advert_details_items.flats.services_redesign;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AdvertDetailsFlatsServicesRedesignPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/flats/services_redesign/d;", "Lcom/avito/android/advert_details_items/flats/services_redesign/c;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.advert.k f84761b;

    @Inject
    public d(@k com.avito.android.advert_core.advert.k kVar) {
        this.f84761b = kVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsFlatsItem advertDetailsFlatsItem = (AdvertDetailsFlatsItem) aVar;
        this.f84761b.w0(advertDetailsFlatsItem.f84661i);
        fVar.w(advertDetailsFlatsItem.f84658f);
        List<AdvertParameters.WorkingCondition> list = advertDetailsFlatsItem.f84668p;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        fVar.KF(list);
    }
}
