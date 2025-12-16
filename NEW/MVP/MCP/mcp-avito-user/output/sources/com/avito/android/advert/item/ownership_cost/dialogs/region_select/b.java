package com.avito.android.advert.item.ownership_cost.dialogs.region_select;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.N0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RegionSelectDialogFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/b;", "Lcom/avito/android/advert/item/ownership_cost/dialogs/region_select/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.ownership_cost.dialogs.region_select.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f77902a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final z<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region> f77903b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f77904c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.h f77905d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public y f77906e;

    /* compiled from: RegionSelectDialogFactory.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/OwnershipCostResponse$OwnershipCostForm$RegionSelect$Region;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f77907b;

        public a(com.avito.android.lib.design.bottom_sheet.d dVar) {
            this.f77907b = dVar;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            N0.a(this.f77907b);
        }
    }

    @Inject
    public b(@k g gVar, @k z<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region> zVar, @com.avito.android.advert.item.ownership_cost.di.b @k com.avito.konveyor.a aVar, @com.avito.android.advert.item.ownership_cost.di.a @k com.avito.konveyor.adapter.h hVar) {
        this.f77902a = gVar;
        this.f77903b = zVar;
        this.f77904c = aVar;
        this.f77905d = hVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.region_select.a
    public final void a(@k Context context, @k OwnershipCostResponse.OwnershipCostForm.RegionSelect regionSelect) {
        View viewInflate = View.inflate(context, R.layout.ownership_cost_region_select_view, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, R.style.OwnershipCostDialog);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, regionSelect.getLabel(), true, true, 2);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        y yVar = this.f77906e;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f77906e = (y) this.f77903b.t0(new a(dVar));
        this.f77902a.b(new f(viewInflate, this.f77904c, this.f77905d), regionSelect);
        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 7));
        com.avito.android.lib.util.g.a(dVar);
    }
}
