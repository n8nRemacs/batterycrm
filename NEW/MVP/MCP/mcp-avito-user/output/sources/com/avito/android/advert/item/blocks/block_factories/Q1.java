package com.avito.android.advert.item.blocks.block_factories;

import com.avito.android.advert.item.blocks.items_factories.C28070w1;
import com.avito.android.advert_core.advert.AdvertDetailsFlatViewType;
import com.avito.android.advert_core.advert.AdvertDetailsWithMeta;
import com.avito.android.advert_core.blocks.a;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.RentConditions;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: AdvertDetailsRentConditionsBlockFactory.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/blocks/block_factories/Q1;", "Lcom/avito/android/advert_core/blocks/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Q1 implements com.avito.android.advert_core.blocks.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C28070w1 f73479a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.similars.j f73480b;

    @Inject
    public Q1(@Y61.k C28070w1 c28070w1, @Y61.k com.avito.android.advert.item.similars.j jVar) {
        this.f73479a = c28070w1;
        this.f73480b = jVar;
    }

    @Override // com.avito.android.advert_core.blocks.a
    @Y61.k
    public final List<PersistableSpannedItem> a(@Y61.k a.b bVar) {
        AdvertDetailsWithMeta advertDetailsWithMeta = bVar.f83013a;
        RentConditions rentConditions = advertDetailsWithMeta.f82645b.getRentConditions();
        List<AdvertParameters.Parameter> params = rentConditions != null ? rentConditions.getParams() : null;
        AdvertDetails advertDetails = advertDetailsWithMeta.f82645b;
        boolean z12 = !advertDetails.isActive();
        RentConditions rentConditions2 = advertDetails.getRentConditions();
        AttributedText title = rentConditions2 != null ? rentConditions2.getTitle() : null;
        RentConditions rentConditions3 = advertDetails.getRentConditions();
        C28070w1.a aVarA = C28070w1.a(this.f73479a, params, z12, title, rentConditions3 != null ? rentConditions3.getExpandParamsButton() : null, AdvertDetailsFlatViewType.f82420b, advertDetails.isRestyle() || advertDetails.isRealtyRedesign(), this.f73480b.a(), null, false, null, advertDetails.hasModelCardLink(), false, false, null, 14592);
        return C42756l.B(new PersistableSpannedItem[]{aVarA != null ? aVarA.f74053a : null, aVarA != null ? aVarA.f74054b : null});
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
