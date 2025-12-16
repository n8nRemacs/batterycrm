package com.avito.android.search.filter.location_filter;

import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.LocalPriorityParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.SwitcherItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;

/* compiled from: LocationFiltersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/conveyor_item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.l<?, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f263646l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar) {
        super(1);
        this.f263646l = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(Object obj) {
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
        r rVar = this.f263646l;
        r.r(rVar);
        FiltersInteractor filtersInteractor = rVar.f263654a;
        String categoryId = filtersInteractor.f().getCategoryId();
        ParametersTreeWithAdditional parametersTreeWithAdditional = rVar.f263665l;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(aVar.getF76517c()) : null;
        String f281526b = aVar.getF76517c();
        C43059p c43059p = rVar.f263653A;
        InterfaceC43057n interfaceC43057nB = C43059p.b(c43059p, f281526b);
        if ((aVar instanceof SwitcherItem) && (parameterSlotFindParameter instanceof BooleanParameter)) {
            BooleanParameter booleanParameter = (BooleanParameter) parameterSlotFindParameter;
            rVar.u(booleanParameter.getResetAreaOnChange());
            SwitcherItem switcherItem = (SwitcherItem) aVar;
            boolean z12 = switcherItem.f262936d;
            FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, Boolean.valueOf(z12), null, 60);
            String value = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF76517c();
            List<String> listSingletonList = Collections.singletonList(String.valueOf(z12));
            C42784z0 c42784z0 = C42784z0.f406748b;
            String type = booleanParameter.getType();
            DisplayingOptions displayingOptions = booleanParameter.getDisplayingOptions();
            rVar.f263658e.k(categoryId, switcherItem.f262935c, value, listSingletonList, c42784z0, type, displayingOptions != null ? displayingOptions.getType() : null);
        } else if ((aVar instanceof com.avito.android.search.filter.converter.common.b) && (parameterSlotFindParameter instanceof BooleanParameter)) {
            BooleanParameter booleanParameter2 = (BooleanParameter) parameterSlotFindParameter;
            rVar.u(booleanParameter2.getResetAreaOnChange());
            com.avito.android.search.filter.converter.common.b bVar = (com.avito.android.search.filter.converter.common.b) aVar;
            FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, Boolean.valueOf(bVar.f262953d), null, 60);
            String value2 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF76517c();
            List<String> listSingletonList2 = Collections.singletonList(String.valueOf(bVar.f262953d));
            C42784z0 c42784z02 = C42784z0.f406748b;
            String type2 = booleanParameter2.getType();
            DisplayingOptions displayingOptions2 = booleanParameter2.getDisplayingOptions();
            rVar.f263658e.k(categoryId, bVar.f262952c, value2, listSingletonList2, c42784z02, type2, displayingOptions2 != null ? displayingOptions2.getType() : null);
        } else {
            boolean z13 = aVar instanceof ParameterElement.v;
            if (z13 && (parameterSlotFindParameter instanceof SelectParameter)) {
                SelectParameter selectParameter = (SelectParameter) parameterSlotFindParameter;
                rVar.u(selectParameter.getResetAreaOnChange());
                ParameterElement.v vVar = (ParameterElement.v) aVar;
                r.s(rVar, vVar, vVar.f262844g);
                EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
                Cp0.e eVar = vVar.f262844g;
                FiltersInteractor.a.a(filtersInteractor, editableParameter, eVar != null ? eVar.f2697b : null, null, 60);
                Cp0.e eVar2 = vVar.f262844g;
                if (eVar2 != null) {
                    String value3 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF76517c();
                    List<String> listSingletonList3 = Collections.singletonList(eVar2.f2698c);
                    List<String> listSingletonList4 = Collections.singletonList(eVar2.f2697b);
                    String type3 = selectParameter.getType();
                    SelectParameter.Displaying displaying = selectParameter.getDisplaying();
                    rVar.f263658e.k(categoryId, vVar.f262840c, value3, listSingletonList3, listSingletonList4, type3, displaying != null ? displaying.getType() : null);
                }
            } else if (z13 && (parameterSlotFindParameter instanceof LocalPriorityParameter)) {
                ParameterElement.v.b bVar2 = (ParameterElement.v.b) aVar;
                rVar.u(true);
                ParameterElement.v vVar2 = (ParameterElement.v) aVar;
                String str = vVar2.f262842e;
                FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, Boolean.valueOf(Boolean.parseBoolean(str)), null, 60);
                String value4 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF76517c();
                List<Cp0.e> list = bVar2.f262862t;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Cp0.e) it.next()).f2698c);
                }
                List<String> listSingletonList5 = str != null ? Collections.singletonList(str) : C42784z0.f406748b;
                rVar.f263658e.k(categoryId, vVar2.f262840c, value4, arrayList, listSingletonList5, ((LocalPriorityParameter) parameterSlotFindParameter).getType(), "");
            } else if ((aVar instanceof ParameterElement.s) && (parameterSlotFindParameter instanceof MultiselectParameter)) {
                MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
                rVar.u(multiselectParameter.getResetAreaOnChange());
                EditableParameter editableParameter2 = (EditableParameter) parameterSlotFindParameter;
                ParameterElement.s sVar = (ParameterElement.s) aVar;
                List<Cp0.e> list2 = sVar.f262819e;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((Cp0.e) obj2).f2700e) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((Cp0.e) it2.next()).f2697b);
                }
                FiltersInteractor.a.a(filtersInteractor, editableParameter2, arrayList3, null, 60);
                List<MultiselectParameter.Value> values = multiselectParameter.getValues();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : values) {
                    MultiselectParameter.Value value5 = (MultiselectParameter.Value) obj3;
                    List<? extends String> value6 = multiselectParameter.getValue();
                    if (value6 != null ? value6.contains(value5.getId()) : false) {
                        arrayList4.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    String parentId = ((MultiselectParameter.Value) next).getParentId();
                    if (parentId == null) {
                        parentId = multiselectParameter.getId();
                    }
                    Object objR = linkedHashMap.get(parentId);
                    if (objR == null) {
                        objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap, parentId);
                    }
                    ((List) objR).add(next);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (!((List) entry.getValue()).isEmpty()) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList5 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    List list3 = (List) entry2.getValue();
                    InterfaceC43057n interfaceC43057nB2 = C43059p.b(c43059p, str2);
                    arrayList5.add(new Q(interfaceC43057nB2 != null ? interfaceC43057nB2.getValue() : aVar.getF76517c(), list3));
                }
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    Q q12 = (Q) it4.next();
                    String str3 = (String) q12.f406619b;
                    List list4 = (List) q12.f406620c;
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(list4, 10));
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(((MultiselectParameter.Value) it5.next()).getF119974b());
                    }
                    ArrayList arrayList7 = new ArrayList(C42745f0.q(list4, 10));
                    Iterator it6 = list4.iterator();
                    while (it6.hasNext()) {
                        arrayList7.add(((MultiselectParameter.Value) it6.next()).getId());
                    }
                    String type4 = multiselectParameter.getType();
                    MultiselectParameter.Displaying displaying2 = multiselectParameter.getDisplaying();
                    rVar.f263658e.k(categoryId, sVar.f262817c, str3, arrayList6, arrayList7, type4, displaying2 != null ? displaying2.getType() : null);
                    sVar = sVar;
                }
            }
        }
        return G0.f406611a;
    }
}
