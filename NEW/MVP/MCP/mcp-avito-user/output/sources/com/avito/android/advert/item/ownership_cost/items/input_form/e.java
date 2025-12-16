package com.avito.android.advert.item.ownership_cost.items.input_form;

import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: OwnershipCostInputsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f77988l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f77989m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostResponse.OwnershipCostForm f77990n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, k kVar, OwnershipCostResponse.OwnershipCostForm ownershipCostForm) {
        super(0);
        this.f77988l = hVar;
        this.f77989m = kVar;
        this.f77990n = ownershipCostForm;
    }

    @Override // Y41.a
    public final G0 invoke() {
        h hVar = this.f77988l;
        hVar.f77994b.a(this.f77989m.getContext(), this.f77990n.getRegionSelect());
        return G0.f406611a;
    }
}
