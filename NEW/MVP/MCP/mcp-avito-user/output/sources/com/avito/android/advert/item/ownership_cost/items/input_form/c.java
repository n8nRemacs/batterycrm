package com.avito.android.advert.item.ownership_cost.items.input_form;

import com.avito.android.remote.model.OwnershipCostResponse;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: OwnershipCostInputsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class c extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f77984l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ OwnershipCostResponse.OwnershipCostForm.DistanceInput f77985m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k kVar, OwnershipCostResponse.OwnershipCostForm.DistanceInput distanceInput) {
        super(1);
        this.f77984l = kVar;
        this.f77985m = distanceInput;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        this.f77984l.AF();
        this.f77985m.setValue(C43066x.z0(str));
        return G0.f406611a;
    }
}
