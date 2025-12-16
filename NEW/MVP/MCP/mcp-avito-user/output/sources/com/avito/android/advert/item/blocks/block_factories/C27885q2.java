package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert.item.blocks.items_factories.G4;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.service_transportation_info.model.TransportInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;

/* compiled from: AdvertDetailsServicesTransportInfoBlockFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/q2;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert.item.blocks.block_factories.q2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27885q2 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final G4 f73645a;

    @Inject
    public C27885q2(@Y61.k G4 g42) {
        this.f73645a = g42;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        List<PersistableSpannedItem> listB;
        AdvertDetailsWithMeta advertDetailsWithMeta = bVar.f83013a;
        TransportInfo transportInfo = advertDetailsWithMeta.f82645b.getTransportInfo();
        if (transportInfo != null) {
            boolean zIsEmpty = transportInfo.getItems().isEmpty();
            AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
            G4 g42 = this.f73645a;
            if (zIsEmpty) {
                C28070w1.a aVarB = g42.b(advertDetails);
                listB = C42756l.B(new Object[]{aVarB != null ? aVarB.f74053a : null, aVarB != null ? aVarB.f74054b : null});
            } else {
                listB = C42745f0.V(g42.a(advertDetails));
            }
            if (listB != null) {
                return listB;
            }
        }
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.l
    public final List<PersistableSpannedItem> b(@Y61.k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@Y61.k a.b bVar) {
        return true;
    }
}
