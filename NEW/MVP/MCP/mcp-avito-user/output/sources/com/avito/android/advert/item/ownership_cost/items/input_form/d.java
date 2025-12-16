package com.avito.android.advert.item.ownership_cost.items.input_form;

import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.Metadata;

/* compiled from: OwnershipCostInputsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostResponse.OwnershipCostForm f77986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f77987c;

    public d(OwnershipCostResponse.OwnershipCostForm ownershipCostForm, k kVar) {
        this.f77986b = ownershipCostForm;
        this.f77987c = kVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region region = (OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region) obj;
        this.f77986b.getRegionSelect().setValue(region.getId());
        this.f77987c.DN(region.getLabel());
    }
}
