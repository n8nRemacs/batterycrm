package D4;

import F4.e;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.travel.trust.AdvertDetailsTravelTrustItem;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.short_term_rent.TravelTrustItemDto;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsTravelTrustItemBlockFactoryImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD4/a;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f2883a;

    @Inject
    public a(@k e eVar) {
        this.f2883a = eVar;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @l
    public final List<PersistableSpannedItem> a(@k a.b bVar) {
        TravelTrustItemDto trustItem;
        AdvertDetailsTravelTrustItem advertDetailsTravelTrustItemA;
        AdvertShortTermRent shortTermRent = bVar.f83013a.f82645b.getShortTermRent();
        if (shortTermRent == null || (trustItem = shortTermRent.getTrustItem()) == null || (advertDetailsTravelTrustItemA = this.f2883a.a(trustItem)) == null) {
            return null;
        }
        return Collections.singletonList(advertDetailsTravelTrustItemA);
    }

    @Override // com.avito.android.advert_core.blocks.a
    @l
    public final List<PersistableSpannedItem> b(@k a.b bVar) {
        return a.C2462a.a(this, bVar);
    }

    @Override // com.avito.android.advert_core.blocks.a
    public final boolean c(@k a.b bVar) {
        return true;
    }
}
