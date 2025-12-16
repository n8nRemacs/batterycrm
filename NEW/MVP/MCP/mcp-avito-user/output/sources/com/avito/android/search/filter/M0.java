package com.avito.android.search.filter;

import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;

/* compiled from: FiltersPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/i;", "selectedInfo", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/search/filter/adapter/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class M0 extends kotlin.jvm.internal.N implements Y41.l<?, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f261883l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(C34574h0 c34574h0) {
        super(1);
        this.f261883l = c34574h0;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        com.avito.android.search.filter.adapter.i iVar = (com.avito.android.search.filter.adapter.i) obj;
        ParameterElement.v vVar = iVar.f262361b;
        if (vVar != null) {
            C34574h0 c34574h0 = this.f261883l;
            C34574h0.b(c34574h0);
            Cp0.e eVar = iVar.f262360a;
            String str = eVar.f2697b;
            ParametersTreeWithAdditional parametersTreeWithAdditional = c34574h0.f263319Q;
            String value = vVar.f262689b;
            ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(value) : null;
            if (parameterSlotFindParameter instanceof SelectParameter) {
                C34574h0.e(c34574h0, vVar, eVar);
                FiltersInteractor filtersInteractor = c34574h0.f263329a;
                FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, str, null, 60);
                SearchParams searchParamsF = filtersInteractor.f();
                InterfaceC43057n interfaceC43057nB = C43059p.b(c34574h0.f263327Y, value);
                String categoryId = searchParamsF.getCategoryId();
                if (interfaceC43057nB != null) {
                    value = interfaceC43057nB.getValue();
                }
                String str2 = value;
                List<String> listSingletonList = Collections.singletonList(eVar.f2698c);
                List<String> listSingletonList2 = Collections.singletonList(str);
                SelectParameter selectParameter = (SelectParameter) parameterSlotFindParameter;
                String type = selectParameter.getType();
                SelectParameter.Displaying displaying = selectParameter.getDisplaying();
                c34574h0.f263338f.k(categoryId, vVar.f262840c, str2, listSingletonList, listSingletonList2, type, displaying != null ? displaying.getType() : null);
            }
        }
        return kotlin.G0.f406611a;
    }
}
