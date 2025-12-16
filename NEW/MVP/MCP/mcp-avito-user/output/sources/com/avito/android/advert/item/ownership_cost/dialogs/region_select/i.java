package com.avito.android.advert.item.ownership_cost.dialogs.region_select;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.RegionSelectItem;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.OwnershipCostResponse;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RegionSelectViewPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/i;", "Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/g;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @l
    public y f77923a;

    @Inject
    public i() {
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.region_select.g
    public final void a() {
        y yVar = this.f77923a;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.region_select.g
    public final void b(@k f fVar, @k OwnershipCostResponse.OwnershipCostForm.RegionSelect regionSelect) {
        List<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region> values = regionSelect.getValues();
        ArrayList arrayList = new ArrayList(C42745f0.q(values, 10));
        for (OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region region : values) {
            arrayList.add(new RegionSelectItem(null, region, region.getId() == regionSelect.getValue(), 1, null));
        }
        fVar.a(arrayList);
        y yVar = this.f77923a;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        Input input = fVar.f77916b;
        input.b(new e(input, fVar));
        com.jakewharton.rxrelay3.c<String> cVar = fVar.f77919e;
        this.f77923a = (y) com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).t0(new h(this, arrayList, fVar));
    }
}
