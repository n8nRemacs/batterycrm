package com.avito.android.publish.view;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.details.D;
import com.avito.android.publish.view.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.EditCategoryParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.ObjectsParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.edit_category.EditCategorySlot;
import com.avito.android.remote.model.category_parameters.slot.residential_complex.ResidentialComplexSelect;
import javax.inject.Inject;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ItemDetailsParameterClickListener.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/view/j;", "Lcom/avito/android/publish/view/i;", "Lcom/avito/android/publish/view/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements i, a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f245663b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C50213a f245664c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public D.a f245665d;

    @Inject
    public j(@Y61.k a aVar, @Y61.k C50213a c50213a) {
        this.f245663b = aVar;
        this.f245664c = c50213a;
    }

    @Override // com.avito.android.publish.view.i
    public final void A(@Y61.k D.a aVar) {
        this.f245663b.e(aVar);
        this.f245665d = aVar;
    }

    @Override // com.avito.android.details.a
    @Y61.l
    public final CategoryParameters C0() {
        return this.f245663b.C0();
    }

    @Override // com.avito.android.publish.view.a
    public final void F(@Y61.k com.avito.android.details.a aVar) {
        this.f245663b.F(aVar);
    }

    @Override // com.avito.android.publish.view.a
    public final void G(@Y61.k com.avito.conveyor_item.a aVar) {
        Navigation navigation2;
        ParametersTree parametersTreeWa;
        if (aVar instanceof com.avito.android.items.e) {
            ((com.avito.android.items.e) aVar).o();
        }
        Integer categoryId = null;
        a aVar2 = this.f245663b;
        ParameterSlot parameterSlotFindParameter = (aVar2 == null || (parametersTreeWa = aVar2.wa()) == null) ? null : parametersTreeWa.findParameter(aVar.getF238671b());
        if (parameterSlotFindParameter == null) {
            return;
        }
        if (parameterSlotFindParameter instanceof CategoryParameter) {
            CategoryParameter categoryParameter = (CategoryParameter) parameterSlotFindParameter;
            if (categoryParameter instanceof EditableParameter) {
                ((EditableParameter) categoryParameter).setError(null);
            }
        }
        if (parameterSlotFindParameter instanceof EditCategoryParameter) {
            D.a aVar3 = this.f245665d;
            if (aVar3 != null) {
                aVar3.M2();
                return;
            }
            return;
        }
        if (parameterSlotFindParameter instanceof ResidentialComplexSelect) {
            D.a aVar4 = this.f245665d;
            if (aVar4 != null) {
                aVar4.L0();
                return;
            }
            return;
        }
        if (parameterSlotFindParameter instanceof EditCategorySlot) {
            D.a aVar5 = this.f245665d;
            if (aVar5 != null) {
                aVar5.M2();
                return;
            }
            return;
        }
        if (!(parameterSlotFindParameter instanceof MetroParameter)) {
            if (!(parameterSlotFindParameter instanceof DistrictParameter)) {
                aVar2.G(aVar);
                return;
            }
            D.a aVar6 = this.f245665d;
            if (aVar6 != null) {
                aVar6.m2((DistrictParameter) parameterSlotFindParameter);
                return;
            }
            return;
        }
        D.a aVar7 = this.f245665d;
        if (aVar7 != null) {
            MetroParameter metroParameter = (MetroParameter) parameterSlotFindParameter;
            CategoryParameters categoryParametersC0 = aVar2.C0();
            if (categoryParametersC0 != null && (navigation2 = categoryParametersC0.getNavigation()) != null) {
                categoryId = navigation2.getCategoryId();
            }
            aVar7.p2(metroParameter, categoryId, this.f245664c.b());
        }
    }

    @Override // com.avito.android.publish.view.i
    public final void P9(@Y61.k ParameterElement.w wVar, int i12) {
        D.a aVar;
        ParametersTree parametersTreeWa;
        Integer numValueOf = Integer.valueOf(i12);
        a aVar2 = this.f245663b;
        Parcelable parcelableFindParameter = (aVar2 == null || (parametersTreeWa = aVar2.wa()) == null) ? null : parametersTreeWa.findParameter(wVar.getF238671b());
        ObjectsParameter objectsParameter = parcelableFindParameter instanceof ObjectsParameter ? (ObjectsParameter) parcelableFindParameter : null;
        if (objectsParameter == null || (aVar = this.f245665d) == null) {
            return;
        }
        aVar.h4(objectsParameter, numValueOf);
    }

    @Override // com.avito.android.publish.view.a
    public final void Q9(@Y61.k ItemWithAdditionalButton itemWithAdditionalButton) {
        this.f245663b.Q9(itemWithAdditionalButton);
    }

    @Override // com.avito.android.publish.view.i
    public final void U3(@Y61.k ParameterElement.w wVar) {
        D.a aVar;
        ParametersTree parametersTreeWa;
        a aVar2 = this.f245663b;
        Parcelable parcelableFindParameter = (aVar2 == null || (parametersTreeWa = aVar2.wa()) == null) ? null : parametersTreeWa.findParameter(wVar.getF238671b());
        ObjectsParameter objectsParameter = parcelableFindParameter instanceof ObjectsParameter ? (ObjectsParameter) parcelableFindParameter : null;
        if (objectsParameter == null || (aVar = this.f245665d) == null) {
            return;
        }
        aVar.Q2(objectsParameter);
    }

    @Override // com.avito.android.publish.view.a
    public final void U7(@Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12) {
        this.f245663b.U7(c29377e, l12);
    }

    @Override // com.avito.android.publish.view.a
    public final void Z2(@Y61.k com.avito.android.items.d dVar, @Y61.k String str, boolean z12) {
        this.f245663b.Z2(dVar, str, z12);
    }

    @Override // com.avito.android.publish.view.a
    public final void be(@Y61.k ParameterElement.C29376d c29376d, @Y61.k ParameterElement.C29377e c29377e, @Y61.l Long l12, boolean z12, boolean z13) {
        this.f245663b.be(c29376d, c29377e, l12, z12, z13);
    }

    @Override // com.avito.android.publish.view.a
    public final void c0() {
        this.f245663b.c0();
        this.f245665d = null;
    }

    @Override // com.avito.android.publish.view.a
    public final void e(@Y61.k a.b bVar) {
        this.f245663b.e(bVar);
    }

    @Override // com.avito.android.publish.view.i
    public final void g2(@Y61.k ParameterElement.w wVar) {
        D.a aVar;
        ParametersTree parametersTreeWa;
        a aVar2 = this.f245663b;
        ParameterSlot parameterSlotFindParameter = (aVar2 == null || (parametersTreeWa = aVar2.wa()) == null) ? null : parametersTreeWa.findParameter(wVar.getF238671b());
        ObjectsParameter objectsParameter = parameterSlotFindParameter instanceof ObjectsParameter ? (ObjectsParameter) parameterSlotFindParameter : null;
        if (objectsParameter == null || (aVar = this.f245665d) == null) {
            return;
        }
        aVar.h4(objectsParameter, null);
    }

    @Override // com.avito.android.details.e
    @Y61.l
    public final ParametersTree wa() {
        return this.f245663b.wa();
    }
}
