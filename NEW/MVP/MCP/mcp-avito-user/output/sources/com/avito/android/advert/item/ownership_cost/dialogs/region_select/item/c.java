package com.avito.android.advert.item.ownership_cost.dialogs.region_select.item;

import Y41.l;
import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RegionSelectItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements l<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f77931l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f77931l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region region) {
        this.f77931l.f77932b.accept(region);
        return G0.f406611a;
    }
}
