package com.avito.android.advert_details_items.georeference;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_details_items.georeference.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsGeoReferencePresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/georeference/d;", "Lcom/avito/android/advert_details_items/georeference/c;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public c.a f84819b;

    @Inject
    public d() {
    }

    @Override // com.avito.android.advert_details_items.georeference.c
    public final void O3(@k c.a aVar) {
        this.f84819b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        AdvertDetailsGeoReferenceItem advertDetailsGeoReferenceItem = (AdvertDetailsGeoReferenceItem) aVar;
        c.a aVar2 = this.f84819b;
        if (aVar2 == null) {
            aVar2 = null;
        }
        fVar.cz(advertDetailsGeoReferenceItem, aVar2);
    }
}
