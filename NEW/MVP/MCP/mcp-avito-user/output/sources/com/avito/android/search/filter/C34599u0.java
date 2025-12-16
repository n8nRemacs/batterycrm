package com.avito.android.search.filter;

import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.base.BaseParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;

/* compiled from: FiltersPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/ParameterElement$g;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/converter/ParameterElement$g;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34599u0 extends kotlin.jvm.internal.N implements Y41.l<ParameterElement.g, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263804l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34599u0(C34574h0 c34574h0) {
        super(1);
        this.f263804l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(ParameterElement.g gVar) {
        ParametersTreeWithAdditional parametersTreeWithAdditional;
        boolean z12;
        boolean z13;
        String type;
        DisplayingOptions displayingOptions;
        ParameterElement.g gVar2 = gVar;
        C34574h0 c34574h0 = this.f263804l;
        ParametersTreeWithAdditional parametersTreeWithAdditional2 = c34574h0.f263319Q;
        if (parametersTreeWithAdditional2 != null) {
            ParameterElement.o oVar = gVar2.f262753e;
            ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional2.findParameter(oVar.f262689b);
            if (parameterSlotFindParameter != null && (parametersTreeWithAdditional = c34574h0.f263319Q) != null) {
                ParameterElement.o oVar2 = gVar2.f262754f;
                ParameterSlot parameterSlotFindParameter2 = parametersTreeWithAdditional.findParameter(oVar2.f262689b);
                if (parameterSlotFindParameter2 != null) {
                    FiltersInteractor filtersInteractor = c34574h0.f263329a;
                    String categoryId = filtersInteractor.f().getCategoryId();
                    C43059p c43059p = c34574h0.f263327Y;
                    InterfaceC43057n interfaceC43057nB = C43059p.b(c43059p, oVar.f262689b);
                    InterfaceC43057n interfaceC43057nB2 = C43059p.b(c43059p, oVar2.f262689b);
                    C34574h0.b(c34574h0);
                    if (parameterSlotFindParameter instanceof PriceParameter) {
                        String str = oVar.f262786e;
                        String strK = str != null ? C34574h0.k(str) : null;
                        String str2 = oVar2.f262786e;
                        String strK2 = str2 != null ? C34574h0.k(str2) : null;
                        PriceParameter priceParameter = (PriceParameter) parameterSlotFindParameter;
                        z12 = (kotlin.jvm.internal.L.f(priceParameter.getValue(), strK) || ((strK == null || C43066x.K(strK)) && priceParameter.getValue() == null)) ? false : true;
                        PriceParameter priceParameter2 = (PriceParameter) parameterSlotFindParameter2;
                        boolean z14 = (kotlin.jvm.internal.L.f(priceParameter2.getValue(), strK2) || ((strK2 == null || C43066x.K(strK2)) && priceParameter2.getValue() == null)) ? false : true;
                        filtersInteractor.w(kotlin.collections.P0.g(new kotlin.Q(parameterSlotFindParameter.getId(), strK), new kotlin.Q(parameterSlotFindParameter2.getId(), strK2)));
                        z13 = z14;
                    } else if (parameterSlotFindParameter instanceof IntParameter) {
                        String str3 = oVar.f262786e;
                        String strK3 = str3 != null ? C34574h0.k(str3) : null;
                        String str4 = oVar2.f262786e;
                        String strK4 = str4 != null ? C34574h0.k(str4) : null;
                        IntParameter intParameter = (IntParameter) parameterSlotFindParameter;
                        z12 = (kotlin.jvm.internal.L.f(intParameter.getValue(), strK3 != null ? C43066x.z0(strK3) : null) || ((strK3 == null || C43066x.K(strK3)) && intParameter.getValue() == null)) ? false : true;
                        IntParameter intParameter2 = (IntParameter) parameterSlotFindParameter2;
                        z13 = (kotlin.jvm.internal.L.f(intParameter2.getValue(), strK4 != null ? C43066x.z0(strK4) : null) || ((strK4 == null || C43066x.K(strK4)) && intParameter2.getValue() == null)) ? false : true;
                        filtersInteractor.w(kotlin.collections.P0.g(new kotlin.Q(parameterSlotFindParameter.getId(), strK3), new kotlin.Q(parameterSlotFindParameter2.getId(), strK4)));
                    } else if (parameterSlotFindParameter instanceof NumericParameter) {
                        String str5 = oVar.f262786e;
                        String strK5 = str5 != null ? C34574h0.k(str5) : null;
                        String str6 = oVar2.f262786e;
                        String strK6 = str6 != null ? C34574h0.k(str6) : null;
                        NumericParameter numericParameter = (NumericParameter) parameterSlotFindParameter;
                        z12 = (kotlin.jvm.internal.L.c(numericParameter.getValue(), strK5 != null ? C43066x.w0(strK5) : null) || ((strK5 == null || C43066x.K(strK5)) && numericParameter.getValue() == null)) ? false : true;
                        NumericParameter numericParameter2 = (NumericParameter) parameterSlotFindParameter2;
                        z13 = (kotlin.jvm.internal.L.c(numericParameter2.getValue(), strK6 != null ? C43066x.w0(strK6) : null) || ((strK6 == null || C43066x.K(strK6)) && numericParameter2.getValue() == null)) ? false : true;
                        filtersInteractor.w(kotlin.collections.P0.g(new kotlin.Q(parameterSlotFindParameter.getId(), strK5), new kotlin.Q(parameterSlotFindParameter2.getId(), strK6)));
                    } else {
                        z12 = false;
                        z13 = false;
                    }
                    BaseParameter baseParameter = parameterSlotFindParameter instanceof BaseParameter ? (BaseParameter) parameterSlotFindParameter : null;
                    if (baseParameter == null || (type = baseParameter.getType()) == null) {
                        type = "";
                    }
                    TextParameter textParameter = parameterSlotFindParameter instanceof TextParameter ? (TextParameter) parameterSlotFindParameter : null;
                    String type2 = (textParameter == null || (displayingOptions = textParameter.getDisplayingOptions()) == null) ? null : displayingOptions.getType();
                    String value = gVar2.f262689b;
                    if (z12) {
                        c34574h0.f263338f.k(categoryId == null ? "" : categoryId, oVar.f262785d, interfaceC43057nB != null ? interfaceC43057nB.getValue() : value, Collections.singletonList(String.valueOf(oVar.f262786e)), C42784z0.f406748b, type, type2);
                    }
                    if (z13) {
                        String str7 = categoryId == null ? "" : categoryId;
                        if (interfaceC43057nB2 != null) {
                            value = interfaceC43057nB2.getValue();
                        }
                        c34574h0.f263338f.k(str7, oVar2.f262785d, value, Collections.singletonList(String.valueOf(oVar2.f262786e)), C42784z0.f406748b, type, type2);
                    }
                }
            }
        }
        return kotlin.G0.f406611a;
    }
}
