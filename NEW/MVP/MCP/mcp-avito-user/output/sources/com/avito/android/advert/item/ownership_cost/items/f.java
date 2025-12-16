package com.avito.android.advert.item.ownership_cost.items;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_cost.items.results.OwnershipCostResultsItem;
import com.avito.android.remote.model.OwnershipCostResponse;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OwnershipCostItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/f;", "Lcom/avito/android/advert/item/ownership_cost/items/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.items.input_form.a f77965b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.items.results.h f77966c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final m f77967d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.f f77968e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f77969f;

    @Inject
    public f(@Y61.k com.avito.android.advert.item.ownership_cost.items.input_form.a aVar, @Y61.k com.avito.android.advert.item.ownership_cost.items.results.h hVar, @Y61.k m mVar, @Y61.k com.avito.android.advert.item.ownership_cost.f fVar, @Y61.k com.avito.android.advert_core.analytics.a aVar2) {
        this.f77965b = aVar;
        this.f77966c = hVar;
        this.f77967d = mVar;
        this.f77968e = fVar;
        this.f77969f = aVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String f77946c;
        h hVar = (h) eVar;
        OwnershipCostItem ownershipCostItem = (OwnershipCostItem) aVar;
        com.avito.android.advert.item.ownership_cost.f fVar = this.f77968e;
        OwnershipCostResponse f77945b = fVar.getF77945b();
        OwnershipCostResultsItem ownershipCostResultsItemB = null;
        if (f77945b != null && (f77946c = fVar.getF77946c()) != null) {
            ownershipCostResultsItemB = this.f77967d.b(f77945b, f77946c, ownershipCostItem.f77950d);
        }
        if (ownershipCostResultsItemB == null) {
            hVar.D30(false);
            hVar.xS(false);
            hVar.WD();
        } else {
            if (ownershipCostItem.f77955i) {
                hVar.Ij(new d(ownershipCostItem, this));
            }
            hVar.D30(ownershipCostItem.f77953g);
            hVar.xS(ownershipCostItem.f77954h);
            hVar.E4(new e(this));
            this.f77966c.k(hVar.Zo(), ownershipCostResultsItemB);
        }
    }
}
