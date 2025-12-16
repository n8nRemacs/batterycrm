package com.avito.android.search.filter;

import Cp0.C13337a;
import com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.KeywordsParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.BaseParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.base.TextParameter;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.SwitcherWithHintItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;

/* compiled from: FiltersPresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/conveyor_item/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.search.filter.y0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34607y0 extends kotlin.jvm.internal.N implements Y41.l<?, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34574h0 f263815l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34607y0(C34574h0 c34574h0) {
        super(1);
        this.f263815l = c34574h0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final kotlin.G0 invoke(Object obj) {
        String str;
        DisplayingOptions displayingOptions;
        String type;
        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
        C34574h0 c34574h0 = this.f263815l;
        C34574h0.b(c34574h0);
        FiltersInteractor filtersInteractor = c34574h0.f263329a;
        String categoryId = filtersInteractor.f().getCategoryId();
        ParametersTreeWithAdditional parametersTreeWithAdditional = c34574h0.f263319Q;
        ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.findParameter(aVar.getF273226b()) : null;
        String f262931b = aVar.getF273226b();
        C43059p c43059p = c34574h0.f263327Y;
        InterfaceC43057n interfaceC43057nB = C43059p.b(c43059p, f262931b);
        String str2 = "";
        if (aVar instanceof ParameterElement.o) {
            if (parameterSlotFindParameter instanceof PriceParameter) {
                EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
                String str3 = ((ParameterElement.o) aVar).f262786e;
                FiltersInteractor.a.a(filtersInteractor, editableParameter, str3 != null ? C34574h0.k(str3) : null, null, 60);
            } else if (parameterSlotFindParameter instanceof IntParameter) {
                EditableParameter editableParameter2 = (EditableParameter) parameterSlotFindParameter;
                String str4 = ((ParameterElement.o) aVar).f262786e;
                FiltersInteractor.a.a(filtersInteractor, editableParameter2, str4 != null ? C43066x.z0(C34574h0.k(str4)) : null, null, 60);
            } else if (parameterSlotFindParameter instanceof NumericParameter) {
                EditableParameter editableParameter3 = (EditableParameter) parameterSlotFindParameter;
                String str5 = ((ParameterElement.o) aVar).f262786e;
                FiltersInteractor.a.a(filtersInteractor, editableParameter3, str5 != null ? C43066x.w0(str5) : null, null, 60);
            }
            ParameterElement.o oVar = (ParameterElement.o) aVar;
            String value = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF273226b();
            List<String> listSingletonList = Collections.singletonList(String.valueOf(oVar.f262786e));
            C42784z0 c42784z0 = C42784z0.f406748b;
            BaseParameter baseParameter = parameterSlotFindParameter instanceof BaseParameter ? (BaseParameter) parameterSlotFindParameter : null;
            String str6 = (baseParameter == null || (type = baseParameter.getType()) == null) ? "" : type;
            TextParameter textParameter = parameterSlotFindParameter instanceof TextParameter ? (TextParameter) parameterSlotFindParameter : null;
            c34574h0.f263338f.k(categoryId, oVar.f262785d, value, listSingletonList, c42784z0, str6, (textParameter == null || (displayingOptions = textParameter.getDisplayingOptions()) == null) ? null : displayingOptions.getType());
        } else if ((aVar instanceof com.avito.android.search.filter.converter.common.b) && (parameterSlotFindParameter instanceof BooleanParameter)) {
            com.avito.android.search.filter.converter.common.b bVar = (com.avito.android.search.filter.converter.common.b) aVar;
            FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, Boolean.valueOf(bVar.f262953d), null, 60);
            String value2 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF273226b();
            List<String> listSingletonList2 = Collections.singletonList(String.valueOf(bVar.f262953d));
            C42784z0 c42784z02 = C42784z0.f406748b;
            BooleanParameter booleanParameter = (BooleanParameter) parameterSlotFindParameter;
            String type2 = booleanParameter.getType();
            DisplayingOptions displayingOptions2 = booleanParameter.getDisplayingOptions();
            c34574h0.f263338f.k(categoryId, bVar.f262952c, value2, listSingletonList2, c42784z02, type2, displayingOptions2 != null ? displayingOptions2.getType() : null);
        } else if ((aVar instanceof C13337a) && (parameterSlotFindParameter instanceof BannerCheckBoxWithImageParameter)) {
            EditableParameter editableParameter4 = (EditableParameter) parameterSlotFindParameter;
            C13337a c13337a = (C13337a) aVar;
            boolean z12 = c13337a.f2690e;
            FiltersInteractor.a.a(filtersInteractor, editableParameter4, Integer.valueOf(z12 ? 1 : 0), null, 60);
            String value3 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF273226b();
            List<String> listSingletonList3 = Collections.singletonList(String.valueOf(z12));
            C42784z0 c42784z03 = C42784z0.f406748b;
            BannerCheckBoxWithImageParameter bannerCheckBoxWithImageParameter = (BannerCheckBoxWithImageParameter) parameterSlotFindParameter;
            String type3 = bannerCheckBoxWithImageParameter.getType();
            DisplayingOptions displayingOptions3 = bannerCheckBoxWithImageParameter.getDisplayingOptions();
            c34574h0.f263338f.k(categoryId, c13337a.f2689d, value3, listSingletonList3, c42784z03, type3, displayingOptions3 != null ? displayingOptions3.getType() : null);
        } else if ((aVar instanceof SwitcherWithHintItem) && (parameterSlotFindParameter instanceof BooleanParameter)) {
            SwitcherWithHintItem switcherWithHintItem = (SwitcherWithHintItem) aVar;
            boolean z13 = switcherWithHintItem.f262945d;
            FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, Boolean.valueOf(z13), null, 60);
            String value4 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF273226b();
            List<String> listSingletonList4 = Collections.singletonList(String.valueOf(z13));
            C42784z0 c42784z04 = C42784z0.f406748b;
            BooleanParameter booleanParameter2 = (BooleanParameter) parameterSlotFindParameter;
            String type4 = booleanParameter2.getType();
            DisplayingOptions displayingOptions4 = booleanParameter2.getDisplayingOptions();
            c34574h0.f263338f.k(categoryId, switcherWithHintItem.f262944c, value4, listSingletonList4, c42784z04, type4, displayingOptions4 != null ? displayingOptions4.getType() : null);
        } else if ((aVar instanceof ParameterElement.v) && (parameterSlotFindParameter instanceof SelectParameter)) {
            ParameterElement.v vVar = (ParameterElement.v) aVar;
            if (vVar.f262845h instanceof ParameterElement.DisplayType.l) {
                c34574h0.f263322T = true;
            }
            C34574h0.e(c34574h0, vVar, vVar.f262844g);
            EditableParameter editableParameter5 = (EditableParameter) parameterSlotFindParameter;
            Cp0.e eVar = vVar.f262844g;
            String str7 = eVar != null ? eVar.f2697b : null;
            if (eVar != null && (str = eVar.f2698c) != null) {
                str2 = str;
            }
            FiltersInteractor.a.a(filtersInteractor, editableParameter5, str7, str2, 44);
            Cp0.e eVar2 = vVar.f262844g;
            if (eVar2 != null) {
                String value5 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF273226b();
                List<String> listSingletonList5 = Collections.singletonList(eVar2.f2698c);
                List<String> listSingletonList6 = Collections.singletonList(eVar2.f2697b);
                SelectParameter selectParameter = (SelectParameter) parameterSlotFindParameter;
                String type5 = selectParameter.getType();
                SelectParameter.Displaying displaying = selectParameter.getDisplaying();
                c34574h0.f263338f.k(categoryId, vVar.f262840c, value5, listSingletonList5, listSingletonList6, type5, displaying != null ? displaying.getType() : null);
                kotlin.G0 g02 = kotlin.G0.f406611a;
            }
        } else {
            boolean z14 = aVar instanceof ParameterElement.s;
            int i12 = 10;
            if (z14 && (parameterSlotFindParameter instanceof MultiselectParameter)) {
                EditableParameter editableParameter6 = (EditableParameter) parameterSlotFindParameter;
                ParameterElement.s sVar = (ParameterElement.s) aVar;
                List<Cp0.e> list = sVar.f262819e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((Cp0.e) obj2).f2700e) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Cp0.e) it.next()).f2697b);
                }
                FiltersInteractor.a.a(filtersInteractor, editableParameter6, arrayList2, null, 60);
                MultiselectParameter multiselectParameter = (MultiselectParameter) parameterSlotFindParameter;
                List<MultiselectParameter.Value> values = multiselectParameter.getValues();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : values) {
                    MultiselectParameter.Value value6 = (MultiselectParameter.Value) obj3;
                    List<? extends String> value7 = multiselectParameter.getValue();
                    if (value7 != null ? value7.contains(value6.getId()) : false) {
                        arrayList3.add(obj3);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
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
                ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    String str8 = (String) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    InterfaceC43057n interfaceC43057nB2 = C43059p.b(c43059p, str8);
                    arrayList4.add(new kotlin.Q(interfaceC43057nB2 != null ? interfaceC43057nB2.getValue() : aVar.getF273226b(), list2));
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    kotlin.Q q12 = (kotlin.Q) it3.next();
                    String str9 = (String) q12.f406619b;
                    List list3 = (List) q12.f406620c;
                    ArrayList arrayList5 = new ArrayList(C42745f0.q(list3, i12));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((MultiselectParameter.Value) it4.next()).getF119974b());
                    }
                    ArrayList arrayList6 = new ArrayList(C42745f0.q(list3, i12));
                    Iterator it5 = list3.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(((MultiselectParameter.Value) it5.next()).getId());
                    }
                    String type6 = multiselectParameter.getType();
                    MultiselectParameter.Displaying displaying2 = multiselectParameter.getDisplaying();
                    c34574h0.f263338f.k(categoryId, sVar.f262817c, str9, arrayList5, arrayList6, type6, displaying2 != null ? displaying2.getType() : null);
                    i12 = i12;
                    sVar = sVar;
                }
            } else if (z14 && (parameterSlotFindParameter instanceof SectionedMultiselectParameter)) {
                ParameterElement.s sVar2 = (ParameterElement.s) aVar;
                String value8 = interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF273226b();
                List<Cp0.e> list4 = sVar2.f262819e;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj4 : list4) {
                    if (((Cp0.e) obj4).f2700e) {
                        arrayList7.add(obj4);
                    }
                }
                ArrayList arrayList8 = new ArrayList(C42745f0.q(arrayList7, 10));
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(((Cp0.e) it6.next()).f2698c);
                }
                ArrayList arrayList9 = new ArrayList();
                for (Object obj5 : list4) {
                    if (((Cp0.e) obj5).f2700e) {
                        arrayList9.add(obj5);
                    }
                }
                ArrayList arrayList10 = new ArrayList(C42745f0.q(arrayList9, 10));
                Iterator it7 = arrayList9.iterator();
                while (it7.hasNext()) {
                    arrayList10.add(((Cp0.e) it7.next()).f2697b);
                }
                SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) parameterSlotFindParameter;
                String type7 = sectionedMultiselectParameter.getType();
                SectionedMultiselectParameter.Displaying displaying3 = sectionedMultiselectParameter.getDisplaying();
                c34574h0.f263338f.k(categoryId, sVar2.f262817c, value8, arrayList8, arrayList10, type7, displaying3 != null ? displaying3.getType() : null);
                EditableParameter editableParameter7 = (EditableParameter) parameterSlotFindParameter;
                ArrayList arrayList11 = new ArrayList();
                for (Object obj6 : list4) {
                    if (((Cp0.e) obj6).f2700e) {
                        arrayList11.add(obj6);
                    }
                }
                ArrayList arrayList12 = new ArrayList(C42745f0.q(arrayList11, 10));
                Iterator it8 = arrayList11.iterator();
                while (it8.hasNext()) {
                    arrayList12.add(((Cp0.e) it8.next()).f2697b);
                }
                FiltersInteractor.a.a(filtersInteractor, editableParameter7, C42745f0.P0(arrayList12), null, 60);
            } else if ((aVar instanceof ParameterElement.b) && (parameterSlotFindParameter instanceof BottomSheetGroupParameter)) {
                ParameterElement.b bVar2 = (ParameterElement.b) aVar;
                Map<String, Set<String>> map = bVar2.f262739k;
                LinkedHashMap linkedHashMap3 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
                List list5 = bVar2.f262733e;
                if (list5 == null) {
                    list5 = C42784z0.f406748b;
                }
                filtersInteractor.k(categoryId, linkedHashMap3, list5, (BottomSheetGroupParameter) parameterSlotFindParameter);
            } else if ((aVar instanceof ParameterElement.p) && (parameterSlotFindParameter instanceof KeywordsParameter)) {
                ParameterElement.p pVar = (ParameterElement.p) aVar;
                c34574h0.f263338f.k(categoryId, pVar.f262803d, interfaceC43057nB != null ? interfaceC43057nB.getValue() : aVar.getF273226b(), pVar.f262804e, C42784z0.f406748b, ((KeywordsParameter) parameterSlotFindParameter).getType(), null);
                FiltersInteractor.a.a(filtersInteractor, (EditableParameter) parameterSlotFindParameter, pVar.f262804e, null, 60);
            }
        }
        return kotlin.G0.f406611a;
    }
}
