package com.avito.android.advert.item.ownership_cost.items.input_form;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.ownership_cost.dialogs.b;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: OwnershipCostInputsItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/items/input_form/h;", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.dialogs.region_select.a f77994b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final z<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region> f77995c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.ownership_cost.f f77996d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f77997e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f77998f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final k6.b f77999g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public y f78000h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public y f78001i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public b.a f78002j;

    @Inject
    public h(@Y61.k com.avito.android.advert.item.ownership_cost.dialogs.region_select.a aVar, @Y61.k z<OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region> zVar, @Y61.k com.avito.android.advert.item.ownership_cost.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.advert_core.analytics.a aVar2, @Y61.k k6.b bVar) {
        this.f77994b = aVar;
        this.f77995c = zVar;
        this.f77996d = fVar;
        this.f77997e = interfaceC35745a5;
        this.f77998f = aVar2;
        this.f77999g = bVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        Long maxValue;
        String modalText;
        String modalTitle;
        k kVar = (k) eVar;
        OwnershipCostInputsItem ownershipCostInputsItem = (OwnershipCostInputsItem) aVar;
        OwnershipCostResponse ownershipCostResponse = ownershipCostInputsItem.f77979f;
        OwnershipCostResponse.OwnershipCostForm ownershipCostForm = ownershipCostResponse.getOwnershipCostForm();
        boolean z12 = ownershipCostInputsItem.f77978e;
        String title = (!z12 || (modalTitle = ownershipCostForm.getModalTitle()) == null || C43066x.K(modalTitle)) ? ownershipCostForm.getTitle() : ownershipCostForm.getModalTitle();
        String text = (!z12 || (modalText = ownershipCostForm.getModalText()) == null || C43066x.K(modalText)) ? ownershipCostForm.getText() : ownershipCostForm.getModalText();
        kVar.setTitle(title);
        kVar.n(text);
        y yVar = this.f78000h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f78000h = (y) this.f77995c.t0(new d(ownershipCostForm, kVar));
        long value = ownershipCostForm.getRegionSelect().getValue();
        Iterator<T> it = ownershipCostForm.getRegionSelect().getValues().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region) next).getId() == value) {
                    break;
                }
            }
        }
        OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region region = (OwnershipCostResponse.OwnershipCostForm.RegionSelect.Region) next;
        if (region != null) {
            ownershipCostForm.getRegionSelect().setValue(region.getId());
        }
        kVar.ci(new e(this, kVar, ownershipCostForm), ownershipCostForm.getRegionSelect().getLabel(), region != null ? region.getLabel() : null);
        OwnershipCostResponse.OwnershipCostForm.DistanceInput distanceInput = ownershipCostForm.getDistanceInput();
        kVar.xy(distanceInput.getLabel());
        Long value2 = distanceInput.getValue();
        kVar.Y30(value2 != null ? value2.toString() : null, new c(kVar, distanceInput));
        OwnershipCostResponse.OwnershipCostForm.DistanceInput.Validation validation = distanceInput.getValidation();
        if (validation != null && (maxValue = validation.getMaxValue()) != null) {
            kVar.I0(String.valueOf(maxValue.longValue()).length());
        }
        OwnershipCostResponse.OwnershipCostForm ownershipCostForm2 = ownershipCostResponse.getOwnershipCostForm();
        kVar.pk(ownershipCostForm2.getCalculateButton().getLabel(), new b(this, kVar, ownershipCostInputsItem, ownershipCostForm2));
        kVar.GU(z12);
        kVar.t(new f(this));
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.a
    public final void P() {
        y yVar = this.f78000h;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f78000h = null;
        y yVar2 = this.f78001i;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f78001i = null;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.a
    public final void U2(@Y61.k b.a aVar) {
        this.f78002j = aVar;
    }

    @Override // com.avito.android.advert.item.ownership_cost.items.input_form.a
    public final void e() {
        this.f78002j = null;
    }
}
