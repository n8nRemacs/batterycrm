package com.avito.android.search.filter;

import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.DateSearchParam;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.MultiSelectSearchParam;
import com.avito.android.remote.model.MultiSelectWithAttrIdValue;
import com.avito.android.remote.model.MultiSelectWithParentIdSearchParam;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SplitSearchParam;
import com.avito.android.remote.model.StringSearchParam;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.CategoryAndTypeParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.category_parameters.KeywordsParameter;
import com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter;
import com.avito.android.remote.model.category_parameters.LocalPriorityParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.QuartersParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectCategoryParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SuggestLocationParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.filters_parameter.ParametersTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.text.C43044a;
import kotlin.text.C43066x;

/* compiled from: ParametersTreeSearchParamsConverter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/x1;", "Lcom/avito/android/search/filter/w1;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x1 implements w1 {
    @Inject
    public x1() {
    }

    public static void b(LinkedHashMap linkedHashMap, EditableParameter editableParameter) {
        List listM0;
        Object next;
        String parentId;
        String id2 = editableParameter.getId();
        String strP0 = C43066x.p0(C43066x.l0('[', id2, id2), ']');
        SearchParam stringSearchParam = null;
        if (editableParameter instanceof MultiselectParameter) {
            MultiselectParameter multiselectParameter = (MultiselectParameter) editableParameter;
            String id3 = multiselectParameter.getId();
            String strP02 = C43066x.p0(C43066x.l0('[', id3, id3), ']');
            List<? extends String> value = multiselectParameter.getValue();
            if (value != null) {
                if (value.isEmpty()) {
                    value = null;
                }
                if (value != null) {
                    List<? extends String> list = value;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                    for (String str : list) {
                        Iterator<T> it = multiselectParameter.getValues().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (kotlin.jvm.internal.L.f(((MultiselectParameter.Value) next).getId(), str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        MultiselectParameter.Value value2 = (MultiselectParameter.Value) next;
                        arrayList.add(new MultiSelectWithAttrIdValue((value2 == null || (parentId = value2.getParentId()) == null) ? strP02 : C43066x.p0(C43066x.l0('[', parentId, parentId), ']'), str));
                    }
                    stringSearchParam = new MultiSelectWithParentIdSearchParam(arrayList);
                }
            }
        } else {
            if (editableParameter instanceof LocalPriorityParameter) {
                stringSearchParam = new StringSearchParam(kotlin.jvm.internal.L.f(((LocalPriorityParameter) editableParameter).getValue(), Boolean.TRUE) ? "1" : "0");
            } else if (editableParameter instanceof SectionedMultiselectParameter) {
                Set<? extends String> value3 = ((SectionedMultiselectParameter) editableParameter).getValue();
                if (value3 != null && (listM0 = C42745f0.M0(value3)) != null) {
                    stringSearchParam = d(listM0);
                }
            } else if (editableParameter instanceof BooleanParameter) {
                Boolean value4 = ((BooleanParameter) editableParameter).getValue();
                if (value4 != null) {
                    stringSearchParam = new StringSearchParam(value4.booleanValue() ? "1" : "0");
                }
            } else if (editableParameter instanceof BannerCheckBoxWithImageParameter) {
                Integer value5 = ((BannerCheckBoxWithImageParameter) editableParameter).getValue();
                if (value5 != null) {
                    stringSearchParam = new StringSearchParam(value5.intValue() == 1 ? "1" : "0");
                }
            } else if (editableParameter instanceof KeywordsParameter) {
                List<? extends String> value6 = ((KeywordsParameter) editableParameter).getValue();
                if (value6 != null) {
                    stringSearchParam = d(value6);
                }
            } else {
                Object value7 = editableParameter.getValue();
                if (value7 != null) {
                    stringSearchParam = new StringSearchParam(value7.toString());
                }
            }
        }
        if (stringSearchParam != null) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.avito.android.remote.model.SearchParams] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.avito.android.remote.model.StringSearchParam] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.avito.android.remote.model.StringSearchParam] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.avito.android.remote.model.SplitSearchParam] */
    public static void c(SearchParams searchParams, ParameterSlot parameterSlot, LinkedHashMap linkedHashMap) {
        String string;
        String string2;
        Integer to2;
        Integer from;
        String id2;
        String str = "0";
        MultiSelectSearchParam multiSelectSearchParamD = null;
        Integer numValueOf = null;
        Integer numValueOf2 = null;
        numValueOf = null;
        Integer numValueOf3 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        multiSelectSearchParamD = null;
        multiSelectSearchParamD = null;
        multiSelectSearchParamD = null;
        multiSelectSearchParamD = null;
        if (parameterSlot instanceof EditableParameter) {
            EditableParameter editableParameter = (EditableParameter) parameterSlot;
            if (editableParameter.hasValue()) {
                if (parameterSlot instanceof SelectCategoryParameter) {
                    Category value = ((SelectCategoryParameter) parameterSlot).getValue();
                    searchParams.setCategoryId(value != null ? value.getId() : null);
                    return;
                }
                if (parameterSlot instanceof LocationParameter) {
                    Location value2 = ((LocationParameter) parameterSlot).getValue();
                    searchParams.setLocationId(value2 != null ? value2.getId() : null);
                    return;
                }
                if (parameterSlot instanceof PriceParameter) {
                    String id3 = parameterSlot.getId();
                    if (kotlin.jvm.internal.L.f(id3, SearchParamsConverterKt.PRICE_MIN)) {
                        String value3 = ((PriceParameter) parameterSlot).getValue();
                        searchParams.setPriceMin(value3 != null ? C43066x.z0(value3) : null);
                        return;
                    } else {
                        if (kotlin.jvm.internal.L.f(id3, SearchParamsConverterKt.PRICE_MAX)) {
                            String value4 = ((PriceParameter) parameterSlot).getValue();
                            searchParams.setPriceMax(value4 != null ? C43066x.z0(value4) : null);
                            return;
                        }
                        return;
                    }
                }
                if (parameterSlot instanceof SelectParameter) {
                    String id4 = parameterSlot.getId();
                    switch (id4.hashCode()) {
                        case -2141955158:
                            if (id4.equals("localPriorityId")) {
                                searchParams.setDisplayType(SerpDisplayType.INSTANCE.fromString(editableParameter.getType()));
                                return;
                            }
                            break;
                        case -1313322582:
                            if (id4.equals("parameter_id_categories")) {
                                return;
                            }
                            break;
                        case -938578798:
                            if (id4.equals("radius")) {
                                String value5 = ((SelectParameter) parameterSlot).getValue();
                                if (value5 != null) {
                                    String string3 = value5.toString();
                                    C43044a.a(10);
                                    numValueOf2 = Integer.valueOf(Integer.parseInt(string3, 10));
                                }
                                searchParams.setRadius(numValueOf2);
                                return;
                            }
                            break;
                        case -220158290:
                            if (id4.equals(SearchParamsConverterKt.FOOT_WALKING_METRO)) {
                                searchParams.setFootWalkingMetro(((SelectParameter) parameterSlot).getValue());
                                return;
                            }
                            break;
                        case 3536286:
                            if (id4.equals(SearchParamsConverterKt.SORT)) {
                                searchParams.setSort(((SelectParameter) parameterSlot).getValue());
                                return;
                            }
                            break;
                        case 73719898:
                            if (id4.equals("searchRadius")) {
                                String value6 = ((SelectParameter) parameterSlot).getValue();
                                if (value6 != null) {
                                    String string4 = value6.toString();
                                    C43044a.a(10);
                                    numValueOf = Integer.valueOf(Integer.parseInt(string4, 10));
                                }
                                searchParams.setRadius(numValueOf);
                                return;
                            }
                            break;
                        case 106164915:
                            if (id4.equals(SearchParamsConverterKt.OWNER)) {
                                searchParams.setOwner(Collections.singletonList(String.valueOf(((SelectParameter) parameterSlot).getValue())));
                                return;
                            }
                            break;
                        case 878003796:
                            if (id4.equals("suggestLocationId")) {
                                searchParams.setDisplayType(SerpDisplayType.INSTANCE.fromString(editableParameter.getType()));
                                return;
                            }
                            break;
                        case 1296531129:
                            if (id4.equals("categoryId")) {
                                searchParams.setCategoryId(((SelectParameter) parameterSlot).getValue());
                                return;
                            }
                            break;
                        case 1671764162:
                            if (id4.equals("display")) {
                                searchParams.setDisplayType(SerpDisplayType.INSTANCE.fromString(((SelectParameter) parameterSlot).getValue()));
                                return;
                            }
                            break;
                        case 1902960142:
                            if (id4.equals("parameter_id_subcategories")) {
                                return;
                            }
                            break;
                    }
                    b(linkedHashMap, editableParameter);
                    return;
                }
                if (parameterSlot instanceof MultiselectParameter) {
                    String id5 = parameterSlot.getId();
                    int iHashCode = id5.hashCode();
                    if (iHashCode != -1631834886) {
                        if (iHashCode != -1480945335) {
                            if (iHashCode == 106164915 && id5.equals(SearchParamsConverterKt.OWNER)) {
                                searchParams.setOwner(((MultiselectParameter) parameterSlot).getValue());
                                return;
                            }
                        } else if (id5.equals(SearchParamsConverterKt.DISTRICT_ID)) {
                            searchParams.setDistrictId(((MultiselectParameter) parameterSlot).getValue());
                            return;
                        }
                    } else if (id5.equals(SearchParamsConverterKt.DIRECTION_ID)) {
                        searchParams.setDirectionId(((MultiselectParameter) parameterSlot).getValue());
                        return;
                    }
                    b(linkedHashMap, editableParameter);
                    return;
                }
                if (parameterSlot instanceof BooleanParameter) {
                    String id6 = parameterSlot.getId();
                    switch (id6.hashCode()) {
                        case -1662688601:
                            if (id6.equals("earlyAccess")) {
                                searchParams.setEarlyAccess(((BooleanParameter) parameterSlot).getValue());
                                return;
                            }
                            break;
                        case -317069398:
                            if (id6.equals(SearchParamsConverterKt.WITH_IMAGES_ONLY)) {
                                searchParams.setWithImagesOnly(((BooleanParameter) parameterSlot).getValue());
                                return;
                            }
                            break;
                        case 301466678:
                            if (id6.equals(SearchParamsConverterKt.MORE_EXPENSIVE)) {
                                BooleanParameter booleanParameter = (BooleanParameter) parameterSlot;
                                DisplayingOptions displayingOptions = booleanParameter.getDisplayingOptions();
                                if (!(displayingOptions != null ? kotlin.jvm.internal.L.f(displayingOptions.getSendUncheckedValue(), Boolean.TRUE) : false)) {
                                    str = null;
                                } else if (kotlin.jvm.internal.L.f(booleanParameter.getValue(), Boolean.TRUE)) {
                                    str = "1";
                                }
                                searchParams.setMoreExpensive(str);
                                return;
                            }
                            break;
                        case 636854694:
                            if (id6.equals(SearchParamsConverterKt.WITH_DELIVERY_ONLY)) {
                                searchParams.setWithDeliveryOnly(((BooleanParameter) parameterSlot).getValue());
                                return;
                            }
                            break;
                        case 1691623983:
                            if (id6.equals("localPriority")) {
                                searchParams.setLocalPriority(((BooleanParameter) parameterSlot).getValue());
                                return;
                            }
                            break;
                    }
                    if (kotlin.jvm.internal.L.f(((BooleanParameter) parameterSlot).getValue(), Boolean.TRUE)) {
                        b(linkedHashMap, editableParameter);
                        return;
                    }
                    return;
                }
                if (parameterSlot instanceof RadiusParameter) {
                    Radius value7 = ((RadiusParameter) parameterSlot).getValue();
                    if (value7 != null && (id2 = value7.getId()) != null) {
                        String string5 = id2.toString();
                        C43044a.a(10);
                        numValueOf3 = Integer.valueOf(Integer.parseInt(string5, 10));
                    }
                    searchParams.setRadius(numValueOf3);
                    return;
                }
                if (parameterSlot instanceof DateRangeParameter) {
                    DateRangeParameter dateRangeParameter = (DateRangeParameter) parameterSlot;
                    DateRangeParameter.FormattedDateParameter checkIn = dateRangeParameter.getCheckIn();
                    String id7 = checkIn != null ? checkIn.getId() : null;
                    DateRangeParameter.FormattedDateParameter checkIn2 = dateRangeParameter.getCheckIn();
                    String value8 = checkIn2 != null ? checkIn2.getValue() : null;
                    DateRangeParameter.FormattedDateParameter checkOut = dateRangeParameter.getCheckOut();
                    String id8 = checkOut != null ? checkOut.getId() : null;
                    DateRangeParameter.FormattedDateParameter checkOut2 = dateRangeParameter.getCheckOut();
                    String value9 = checkOut2 != null ? checkOut2.getValue() : null;
                    if (id7 != null && value8 != null && id8 != null && value9 != null) {
                        linkedHashMap.put(id7, new DateSearchParam(value8));
                        linkedHashMap.put(id8, new DateSearchParam(value9));
                    }
                    Iterator it = dateRangeParameter.getOtherParams().iterator();
                    while (it.hasNext()) {
                        c(searchParams, (ParameterSlot) it.next(), linkedHashMap);
                    }
                    return;
                }
                if (parameterSlot instanceof QuartersParameter) {
                    String id9 = parameterSlot.getId();
                    String strP0 = C43066x.p0(C43066x.l0('[', id9, id9), ']');
                    QuartersParameter quartersParameter = (QuartersParameter) parameterSlot;
                    QuartersParameter.Value value10 = quartersParameter.getValue();
                    if (value10 != null && (from = value10.getFrom()) != null) {
                    }
                    QuartersParameter.Value value11 = quartersParameter.getValue();
                    if (value11 == null || (to2 = value11.getTo()) == null) {
                        return;
                    }
                    return;
                }
                if (parameterSlot instanceof MetroParameter) {
                    List<? extends Metro> value12 = ((MetroParameter) parameterSlot).getValue();
                    if (value12 != null) {
                        List<? extends Metro> list = value12;
                        arrayList = new ArrayList(C42745f0.q(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((Metro) it2.next()).getId());
                        }
                    }
                    searchParams.setMetroIds(arrayList);
                    return;
                }
                if (parameterSlot instanceof DistrictParameter) {
                    List<? extends District> value13 = ((DistrictParameter) parameterSlot).getValue();
                    if (value13 != null) {
                        List<? extends District> list2 = value13;
                        arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((District) it3.next()).getId());
                        }
                    }
                    searchParams.setDistrictId(arrayList2);
                    return;
                }
                if (!(parameterSlot instanceof AddressesSearchParameter)) {
                    if (parameterSlot instanceof BannerCheckBoxWithImageParameter) {
                        if (!kotlin.jvm.internal.L.f(parameterSlot.getId(), "earlyAccess")) {
                            b(linkedHashMap, editableParameter);
                            return;
                        } else {
                            Integer value14 = ((BannerCheckBoxWithImageParameter) parameterSlot).getValue();
                            searchParams.setEarlyAccess(Boolean.valueOf(value14 != null && value14.intValue() == 1));
                            return;
                        }
                    }
                    if (parameterSlot instanceof SuggestLocationParameter) {
                        Location value15 = ((SuggestLocationParameter) parameterSlot).getValue();
                        searchParams.setSuggestLocationId(value15 != null ? value15.getId() : null);
                        return;
                    } else if (parameterSlot instanceof LocalPriorityParameter) {
                        searchParams.setLocalPriority(((LocalPriorityParameter) parameterSlot).getValue());
                        return;
                    } else {
                        b(linkedHashMap, editableParameter);
                        return;
                    }
                }
                List<? extends SuggestAddress> value16 = ((AddressesSearchParameter) parameterSlot).getValue();
                if (value16 != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj : value16) {
                        String paramId = ((SuggestAddress) obj).getParamId();
                        Object objR = linkedHashMap2.get(paramId);
                        if (objR == null) {
                            objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap2, paramId);
                        }
                        ((List) objR).add(obj);
                    }
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        String str2 = (String) entry.getKey();
                        List list3 = (List) entry.getValue();
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(list3, 10));
                        Iterator it4 = list3.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((SuggestAddress) it4.next()).getId());
                        }
                        MultiSelectSearchParam multiSelectSearchParamD2 = d(arrayList3);
                        if (multiSelectSearchParamD2 != null && str2 != null) {
                            linkedHashMap.put(str2, multiSelectSearchParamD2);
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (parameterSlot instanceof BottomSheetGroupParameter) {
            Iterator it5 = ((BottomSheetGroupParameter) parameterSlot).getParameters().iterator();
            while (it5.hasNext()) {
                b(linkedHashMap, (MultiselectParameter) it5.next());
            }
            return;
        }
        if (parameterSlot instanceof CategoryAndTypeParameter) {
            CategoryAndTypeParameter categoryAndTypeParameter = (CategoryAndTypeParameter) parameterSlot;
            if (!categoryAndTypeParameter.getParameters().isEmpty()) {
                ParameterSlot parameterSlot2 = categoryAndTypeParameter.getParameters().get(0);
                searchParams.setCategoryId(parameterSlot2 instanceof CharParameter ? ((CharParameter) parameterSlot2).getValue() : ((SelectParameter.Flat) parameterSlot2).getValue());
            }
            if (categoryAndTypeParameter.getParameters().size() == 2) {
                ParameterSlot parameterSlot3 = categoryAndTypeParameter.getParameters().get(1);
                if (parameterSlot3 instanceof CharParameter) {
                    b(linkedHashMap, (EditableParameter) parameterSlot3);
                    return;
                } else {
                    b(linkedHashMap, (SelectParameter.Flat) parameterSlot3);
                    return;
                }
            }
            return;
        }
        if (parameterSlot instanceof HiddenParameter) {
            HiddenParameter hiddenParameter = (HiddenParameter) parameterSlot;
            String id10 = hiddenParameter.getId();
            String strP02 = C43066x.p0(C43066x.l0('[', id10, id10), ']');
            if (hiddenParameter instanceof HiddenParameter.HiddenRangeParameter) {
                LegacyRangeIntParameter.RangeValue value17 = ((HiddenParameter.HiddenRangeParameter) hiddenParameter).getValue();
                if (value17 != null) {
                    Long from2 = value17.getFrom();
                    if (from2 == null || (string = from2.toString()) == null) {
                        string = "0";
                    }
                    Long to3 = value17.getTo();
                    if (to3 != null && (string2 = to3.toString()) != null) {
                        str = string2;
                    }
                    multiSelectSearchParamD = new SplitSearchParam(new SplitSearchParam.Split(string, str));
                }
            } else if (hiddenParameter instanceof HiddenParameter.HiddenStringParameter) {
                String value18 = ((HiddenParameter.HiddenStringParameter) hiddenParameter).getValue();
                if (value18 != null) {
                    multiSelectSearchParamD = new StringSearchParam(value18);
                }
            } else if (hiddenParameter instanceof HiddenParameter.HiddenIntParameter) {
                Integer value19 = ((HiddenParameter.HiddenIntParameter) hiddenParameter).getValue();
                if (value19 != null) {
                    multiSelectSearchParamD = new StringSearchParam(String.valueOf(value19.intValue()));
                }
            } else if (hiddenParameter instanceof HiddenParameter.HiddenMultiselectParameter) {
                List<String> value20 = ((HiddenParameter.HiddenMultiselectParameter) hiddenParameter).getValue();
                if (value20 != null) {
                    multiSelectSearchParamD = d(value20);
                }
            } else if (!(hiddenParameter instanceof HiddenParameter.HiddenRawParameter)) {
                throw new NoWhenBranchMatchedException();
            }
            if (multiSelectSearchParamD != null) {
            }
        }
    }

    public static MultiSelectSearchParam d(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return new MultiSelectSearchParam(list);
    }

    @Override // com.avito.android.search.filter.w1
    @Y61.k
    public final SearchParams a(@Y61.k ParametersTree parametersTree) {
        SearchParams searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<ParameterSlot> it = parametersTree.iterator();
        while (it.hasNext()) {
            c(searchParams, it.next(), linkedHashMap);
        }
        if (!linkedHashMap.isEmpty()) {
            searchParams.setParams(linkedHashMap);
        }
        return searchParams;
    }
}
