package com.avito.android.search.filter;

import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.Direction;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.Sublocation;
import com.avito.android.remote.model.SuggestAddress;
import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import com.avito.android.remote.model.category_parameters.AdditionalCharParameter;
import com.avito.android.remote.model.category_parameters.AddressesSearchParameter;
import com.avito.android.remote.model.category_parameters.BannerCheckBoxWithImageParameter;
import com.avito.android.remote.model.category_parameters.BeduinParameter;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.CategoryAndTypeParameter;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.DateRangeParameter;
import com.avito.android.remote.model.category_parameters.DirectionParameter;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.KeywordsParameter;
import com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter;
import com.avito.android.remote.model.category_parameters.LocalPriorityParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.RadiusParameter;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.remote.model.category_parameters.SelectCategoryParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SuggestLocationParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: ParametersTreeMapConverter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/t1;", "Lcom/avito/android/search/filter/r1;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t1 implements r1 {
    @Inject
    public t1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(LinkedHashMap linkedHashMap, String str, List list) {
        Object next;
        SelectParameter.Value.Display display;
        List<SelectParameter.Value.CategoryAttributes> categoryAttributes;
        s1 s1Var = new s1(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((Boolean) s1Var.invoke(next)).booleanValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            SelectParameter.Value value = (SelectParameter.Value) next;
            if (value == null || (display = value.getDisplay()) == null || (categoryAttributes = display.getCategoryAttributes()) == null) {
                return;
            }
            for (SelectParameter.Value.CategoryAttributes categoryAttributes2 : categoryAttributes) {
                linkedHashMap.put("params[" + categoryAttributes2.getId() + ']', categoryAttributes2.getValue());
            }
        }
    }

    public static void c(LinkedHashMap linkedHashMap, String str, List list, List list2) {
        int i12 = 0;
        if (list != null) {
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                linkedHashMap.put(str + '[' + i13 + ']', (String) obj);
                i13 = i14;
            }
        }
        if (list2 != null) {
            for (Object obj2 : list2) {
                int i15 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                linkedHashMap.put("changedValues[" + str + '[' + i12 + "]]", (String) obj2);
                i12 = i15;
            }
        }
    }

    public static void d(LinkedHashMap linkedHashMap, String str, String str2, String str3) {
        if (str2 != null) {
        }
        if (kotlin.jvm.internal.L.f(str, "parameter_id_categories") ? true : kotlin.jvm.internal.L.f(str, "parameter_id_subcategories")) {
            if (str3 == null) {
                str3 = "0";
            }
            str = "categoryId";
        }
        if (str3 != null) {
        }
    }

    public static void e(ParameterSlot parameterSlot, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ParametersTreeWithAdditional parametersTreeWithAdditional) {
        String str;
        Object next;
        String parentId;
        Object next2;
        String parentId2;
        String id2;
        String str2;
        SelectParameter.Flat flat;
        String value;
        str = "";
        String str3 = null;
        if (!(parameterSlot instanceof EditableParameter)) {
            if (parameterSlot instanceof BottomSheetGroupParameter) {
                for (MultiselectParameter multiselectParameter : ((BottomSheetGroupParameter) parameterSlot).getParameters()) {
                    c(linkedHashMap, multiselectParameter.getId(), multiselectParameter.getValue(), multiselectParameter.getOldValue());
                }
                return;
            }
            if (parameterSlot instanceof CategoryAndTypeParameter) {
                for (ParameterSlot parameterSlot2 : ((CategoryAndTypeParameter) parameterSlot).getParameters()) {
                    if (parameterSlot2 instanceof SelectParameter.Flat) {
                        SelectParameter.Flat flat2 = (SelectParameter.Flat) parameterSlot2;
                        if (flat2.getValue() != null) {
                            String id3 = parameterSlot2.getId();
                            String value2 = flat2.getValue();
                            if (value2 == null) {
                                value2 = "";
                            }
                            d(linkedHashMap, id3, value2, flat2.getOldValue());
                        }
                    } else if (parameterSlot2 instanceof CharParameter) {
                        CharParameter charParameter = (CharParameter) parameterSlot2;
                        if (charParameter.getValue() != null) {
                            String id4 = parameterSlot2.getId();
                            String value3 = charParameter.getValue();
                            if (value3 == null) {
                                value3 = "";
                            }
                            d(linkedHashMap, id4, value3, charParameter.getOldValue());
                        }
                    }
                }
                return;
            }
            if (parameterSlot instanceof HiddenParameter) {
                HiddenParameter hiddenParameter = (HiddenParameter) parameterSlot;
                if (hiddenParameter instanceof HiddenParameter.HiddenRangeParameter) {
                    HiddenParameter.HiddenRangeParameter hiddenRangeParameter = (HiddenParameter.HiddenRangeParameter) hiddenParameter;
                    String cleanId = hiddenRangeParameter.getCleanId();
                    String strK = AK.c.k("params[", cleanId, "-from]");
                    LegacyRangeIntParameter.RangeValue value4 = hiddenRangeParameter.getValue();
                    d(linkedHashMap, strK, String.valueOf(value4 != null ? value4.getFrom() : null), null);
                    String strS = AK.c.s(new StringBuilder("params["), cleanId, "-to]");
                    LegacyRangeIntParameter.RangeValue value5 = hiddenRangeParameter.getValue();
                    d(linkedHashMap, strS, String.valueOf(value5 != null ? value5.getTo() : null), null);
                    return;
                }
                if (hiddenParameter instanceof HiddenParameter.HiddenStringParameter) {
                    d(linkedHashMap, hiddenParameter.getId(), ((HiddenParameter.HiddenStringParameter) hiddenParameter).getValue(), null);
                    return;
                }
                if (hiddenParameter instanceof HiddenParameter.HiddenIntParameter) {
                    String id5 = hiddenParameter.getId();
                    Integer value6 = ((HiddenParameter.HiddenIntParameter) hiddenParameter).getValue();
                    d(linkedHashMap, id5, value6 != null ? value6.toString() : null, null);
                    return;
                } else if (hiddenParameter instanceof HiddenParameter.HiddenMultiselectParameter) {
                    c(linkedHashMap, hiddenParameter.getId(), ((HiddenParameter.HiddenMultiselectParameter) hiddenParameter).getValue(), null);
                    return;
                } else {
                    boolean z12 = hiddenParameter instanceof HiddenParameter.HiddenRawParameter;
                    return;
                }
            }
            return;
        }
        String id6 = parameterSlot.getId();
        EditableParameter editableParameter = (EditableParameter) parameterSlot;
        if (!editableParameter.hasValue()) {
            if (parameterSlot instanceof RadiusParameter) {
                RadiusParameter radiusParameter = (RadiusParameter) parameterSlot;
                Radius value7 = radiusParameter.getValue();
                String id7 = value7 != null ? value7.getId() : null;
                Radius oldValue = radiusParameter.getOldValue();
                d(linkedHashMap, id6, id7, oldValue != null ? oldValue.getId() : null);
                return;
            }
            if (parameterSlot instanceof BooleanParameter) {
                BooleanParameter booleanParameter = (BooleanParameter) parameterSlot;
                DisplayingOptions displayingOptions = booleanParameter.getDisplayingOptions();
                if (displayingOptions != null ? kotlin.jvm.internal.L.f(displayingOptions.getSendUncheckedValue(), Boolean.TRUE) : false) {
                    String str4 = kotlin.jvm.internal.L.f(booleanParameter.getValue(), Boolean.TRUE) ? "1" : "0";
                    Boolean oldValue2 = booleanParameter.getOldValue();
                    d(linkedHashMap, id6, str4, oldValue2 != null ? oldValue2.booleanValue() ? "1" : "0" : null);
                    return;
                }
                return;
            }
            if (parameterSlot instanceof SelectParameter) {
                SelectParameter selectParameter = (SelectParameter) parameterSlot;
                d(linkedHashMap, id6, selectParameter.getValue(), selectParameter.getOldValue());
                return;
            } else if (parameterSlot instanceof BeduinParameter) {
                BeduinParameter beduinParameter = (BeduinParameter) parameterSlot;
                d(linkedHashMap, id6, beduinParameter.getValue(), beduinParameter.getOldValue());
                return;
            } else {
                if (parameterSlot instanceof KeywordsParameter) {
                    KeywordsParameter keywordsParameter = (KeywordsParameter) parameterSlot;
                    c(linkedHashMap, id6, keywordsParameter.getValue(), keywordsParameter.getOldValue());
                    return;
                }
                return;
            }
        }
        if (parameterSlot instanceof SelectParameter) {
            if ((parameterSlot instanceof SelectParameter.Flat) && (((value = (flat = (SelectParameter.Flat) parameterSlot).getValue()) == null || value.length() == 0) && kotlin.jvm.internal.L.f(parameterSlot.getId(), "parameter_id_categories"))) {
                b(linkedHashMap2, editableParameter.get_selectedParameterTitle(), flat.getValues());
            }
            SelectParameter selectParameter2 = (SelectParameter) parameterSlot;
            String value8 = selectParameter2.getValue();
            d(linkedHashMap, id6, value8 != null ? value8 : "", selectParameter2.getOldValue());
            return;
        }
        if (parameterSlot instanceof PriceParameter) {
            PriceParameter priceParameter = (PriceParameter) parameterSlot;
            String value9 = priceParameter.getValue();
            d(linkedHashMap, id6, value9 != null ? value9 : "", priceParameter.getOldValue());
            return;
        }
        if (parameterSlot instanceof LocationParameter) {
            ParameterSlot parameterSlotFindParameter = parametersTreeWithAdditional.findParameter("localPriority");
            LocationParameter locationParameter = (LocationParameter) parameterSlot;
            Location value10 = locationParameter.getValue();
            String id8 = value10 != null ? value10.getId() : null;
            if (id8 == null) {
                id8 = "";
            }
            if (parameterSlotFindParameter != null) {
                LocalPriorityParameter localPriorityParameter = parameterSlotFindParameter instanceof LocalPriorityParameter ? (LocalPriorityParameter) parameterSlotFindParameter : null;
                if (localPriorityParameter != null ? kotlin.jvm.internal.L.f(localPriorityParameter.getValue(), Boolean.FALSE) : false) {
                    Location value11 = ((SuggestLocationParameter) parametersTreeWithAdditional.findParameter("suggestLocationId")).getValue();
                    if (value11 != null && (id2 = value11.getId()) != null && (str2 = (String) C42745f0.Q(C43066x.f0(id2, new String[]{"_"}, 0, 6))) != null) {
                        str = str2;
                    }
                    id8 = str;
                }
            }
            Location oldValue3 = locationParameter.getOldValue();
            d(linkedHashMap, id6, id8, oldValue3 != null ? oldValue3.getId() : null);
            return;
        }
        if (parameterSlot instanceof SuggestLocationParameter) {
            SuggestLocationParameter suggestLocationParameter = (SuggestLocationParameter) parameterSlot;
            Location value12 = suggestLocationParameter.getValue();
            String id9 = value12 != null ? value12.getId() : null;
            str = id9 != null ? id9 : "";
            Location oldValue4 = suggestLocationParameter.getOldValue();
            d(linkedHashMap, id6, str, oldValue4 != null ? oldValue4.getId() : null);
            return;
        }
        if (parameterSlot instanceof RadiusParameter) {
            RadiusParameter radiusParameter2 = (RadiusParameter) parameterSlot;
            Radius value13 = radiusParameter2.getValue();
            String id10 = value13 != null ? value13.getId() : null;
            str = id10 != null ? id10 : "";
            Radius oldValue5 = radiusParameter2.getOldValue();
            d(linkedHashMap, id6, str, oldValue5 != null ? oldValue5.getId() : null);
            return;
        }
        if (parameterSlot instanceof DirectionParameter) {
            DirectionParameter directionParameter = (DirectionParameter) parameterSlot;
            List<? extends Direction> value14 = directionParameter.getValue();
            ArrayList arrayListF = value14 != null ? f(value14) : null;
            List<? extends Direction> oldValue6 = directionParameter.getOldValue();
            c(linkedHashMap, id6, arrayListF, oldValue6 != null ? f(oldValue6) : null);
            return;
        }
        if (parameterSlot instanceof DistrictParameter) {
            DistrictParameter districtParameter = (DistrictParameter) parameterSlot;
            List<? extends District> value15 = districtParameter.getValue();
            ArrayList arrayListF2 = value15 != null ? f(value15) : null;
            List<? extends District> oldValue7 = districtParameter.getOldValue();
            c(linkedHashMap, id6, arrayListF2, oldValue7 != null ? f(oldValue7) : null);
            return;
        }
        if (parameterSlot instanceof NumericParameter) {
            NumericParameter numericParameter = (NumericParameter) parameterSlot;
            Double value16 = numericParameter.getValue();
            String string = value16 != null ? value16.toString() : null;
            str = string != null ? string : "";
            Double oldValue8 = numericParameter.getOldValue();
            d(linkedHashMap, id6, str, oldValue8 != null ? oldValue8.toString() : null);
            return;
        }
        if (parameterSlot instanceof SelectCategoryParameter) {
            SelectCategoryParameter selectCategoryParameter = (SelectCategoryParameter) parameterSlot;
            Category value17 = selectCategoryParameter.getValue();
            String id11 = value17 != null ? value17.getId() : null;
            str = id11 != null ? id11 : "";
            Category oldValue9 = selectCategoryParameter.getOldValue();
            d(linkedHashMap, id6, str, oldValue9 != null ? oldValue9.getId() : null);
            b(linkedHashMap2, editableParameter.get_selectedParameterTitle(), selectCategoryParameter.getValues());
            return;
        }
        if (parameterSlot instanceof IntParameter) {
            IntParameter intParameter = (IntParameter) parameterSlot;
            Long value18 = intParameter.getValue();
            String string2 = value18 != null ? value18.toString() : null;
            str = string2 != null ? string2 : "";
            Long oldValue10 = intParameter.getOldValue();
            d(linkedHashMap, id6, str, oldValue10 != null ? oldValue10.toString() : null);
            return;
        }
        if (parameterSlot instanceof MultiselectParameter) {
            MultiselectParameter multiselectParameter2 = (MultiselectParameter) parameterSlot;
            String id12 = multiselectParameter2.getId();
            List<? extends String> value19 = multiselectParameter2.getValue();
            int i12 = 10;
            if (value19 != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj : value19) {
                    String str5 = (String) obj;
                    Iterator<T> it = multiselectParameter2.getValues().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next2 = it.next();
                            if (kotlin.jvm.internal.L.f(((MultiselectParameter.Value) next2).getId(), str5)) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    MultiselectParameter.Value value20 = (MultiselectParameter.Value) next2;
                    if (value20 == null || (parentId2 = value20.getParentId()) == null) {
                        parentId2 = id12;
                    }
                    Object objR = linkedHashMap3.get(parentId2);
                    if (objR == null) {
                        objR = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap3, parentId2);
                    }
                    ((List) objR).add(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    String str6 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list, i12));
                    int i13 = 0;
                    for (Object obj2 : list) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        arrayList2.add(new kotlin.Q(str6 + '[' + i13 + ']', (String) obj2));
                        i13 = i14;
                    }
                    C42745f0.h(arrayList2, arrayList);
                    i12 = 10;
                }
                kotlin.collections.P0.m(linkedHashMap, arrayList);
            }
            List<? extends String> oldValue11 = multiselectParameter2.getOldValue();
            if (oldValue11 != null) {
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Object obj3 : oldValue11) {
                    String str7 = (String) obj3;
                    Iterator<T> it2 = multiselectParameter2.getValues().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (kotlin.jvm.internal.L.f(((MultiselectParameter.Value) next).getId(), str7)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    MultiselectParameter.Value value21 = (MultiselectParameter.Value) next;
                    if (value21 == null || (parentId = value21.getParentId()) == null) {
                        parentId = id12;
                    }
                    Object objR2 = linkedHashMap4.get(parentId);
                    if (objR2 == null) {
                        objR2 = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap4, parentId);
                    }
                    ((List) objR2).add(obj3);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    String str8 = (String) entry2.getKey();
                    List list2 = (List) entry2.getValue();
                    ArrayList arrayList4 = new ArrayList(C42745f0.q(list2, 10));
                    int i15 = 0;
                    for (Object obj4 : list2) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        arrayList4.add(new kotlin.Q("changedValues[" + str8 + '[' + i15 + "]]", (String) obj4));
                        i15 = i16;
                    }
                    C42745f0.h(arrayList4, arrayList3);
                }
                kotlin.collections.P0.m(linkedHashMap, arrayList3);
                return;
            }
            return;
        }
        if (parameterSlot instanceof SectionedMultiselectParameter) {
            SectionedMultiselectParameter sectionedMultiselectParameter = (SectionedMultiselectParameter) parameterSlot;
            Set<? extends String> value22 = sectionedMultiselectParameter.getValue();
            Set<? extends String> oldValue12 = sectionedMultiselectParameter.getOldValue();
            if (value22 != null) {
                int i17 = 0;
                for (Object obj5 : value22) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put(id6 + '[' + i17 + ']', (String) obj5);
                    i17 = i18;
                }
            }
            if (oldValue12 != null) {
                int i19 = 0;
                for (Object obj6 : oldValue12) {
                    int i22 = i19 + 1;
                    if (i19 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put("changedValues[" + id6 + '[' + i19 + "]]", (String) obj6);
                    i19 = i22;
                }
                return;
            }
            return;
        }
        if (parameterSlot instanceof MetroParameter) {
            MetroParameter metroParameter = (MetroParameter) parameterSlot;
            List<? extends Metro> value23 = metroParameter.getValue();
            ArrayList arrayListF3 = value23 != null ? f(value23) : null;
            List<? extends Metro> oldValue13 = metroParameter.getOldValue();
            c(linkedHashMap, id6, arrayListF3, oldValue13 != null ? f(oldValue13) : null);
            return;
        }
        if (parameterSlot instanceof BooleanParameter) {
            BooleanParameter booleanParameter2 = (BooleanParameter) parameterSlot;
            String str9 = kotlin.jvm.internal.L.f(booleanParameter2.getValue(), Boolean.TRUE) ? "1" : null;
            Boolean oldValue14 = booleanParameter2.getOldValue();
            d(linkedHashMap, id6, str9, oldValue14 != null ? oldValue14.booleanValue() ? "1" : "0" : null);
            return;
        }
        if (parameterSlot instanceof DateRangeParameter) {
            List<? extends ParameterSlot> value24 = ((DateRangeParameter) parameterSlot).getValue();
            if (value24 != null) {
                Iterator<T> it3 = value24.iterator();
                while (it3.hasNext()) {
                    e((ParameterSlot) it3.next(), linkedHashMap, linkedHashMap2, parametersTreeWithAdditional);
                }
                return;
            }
            return;
        }
        if (parameterSlot instanceof DateRangeParameter.FormattedDateParameter) {
            DateRangeParameter.FormattedDateParameter formattedDateParameter = (DateRangeParameter.FormattedDateParameter) parameterSlot;
            String value25 = formattedDateParameter.getValue();
            if (value25 != null) {
                d(linkedHashMap, parameterSlot.getId(), value25, formattedDateParameter.getOldValue());
                return;
            }
            return;
        }
        if (parameterSlot instanceof CharParameter) {
            CharParameter charParameter2 = (CharParameter) parameterSlot;
            d(linkedHashMap, id6, charParameter2.getValue(), charParameter2.getOldValue());
            return;
        }
        if (parameterSlot instanceof BeduinParameter) {
            BeduinParameter beduinParameter2 = (BeduinParameter) parameterSlot;
            d(linkedHashMap, id6, beduinParameter2.getValue(), beduinParameter2.getOldValue());
            return;
        }
        if (parameterSlot instanceof KeywordsParameter) {
            KeywordsParameter keywordsParameter2 = (KeywordsParameter) parameterSlot;
            c(linkedHashMap, id6, keywordsParameter2.getValue(), keywordsParameter2.getOldValue());
            return;
        }
        if (!(parameterSlot instanceof AddressesSearchParameter)) {
            if (parameterSlot instanceof BannerCheckBoxWithImageParameter) {
                BannerCheckBoxWithImageParameter bannerCheckBoxWithImageParameter = (BannerCheckBoxWithImageParameter) parameterSlot;
                d(linkedHashMap, id6, String.valueOf(bannerCheckBoxWithImageParameter.getValue()), String.valueOf(bannerCheckBoxWithImageParameter.getOldValue()));
                return;
            }
            if (parameterSlot instanceof LocalPriorityParameter) {
                LocalPriorityParameter localPriorityParameter2 = (LocalPriorityParameter) parameterSlot;
                Boolean value26 = localPriorityParameter2.getValue();
                Boolean bool = Boolean.TRUE;
                String str10 = kotlin.jvm.internal.L.f(value26, bool) ? "1" : "0";
                Boolean oldValue15 = localPriorityParameter2.getOldValue();
                if (kotlin.jvm.internal.L.f(oldValue15, bool)) {
                    str3 = "1";
                } else if (kotlin.jvm.internal.L.f(oldValue15, Boolean.FALSE)) {
                    str3 = "0";
                }
                d(linkedHashMap, id6, str10, str3);
                return;
            }
            return;
        }
        AddressesSearchParameter addressesSearchParameter = (AddressesSearchParameter) parameterSlot;
        List<? extends SuggestAddress> value27 = addressesSearchParameter.getValue();
        List<? extends SuggestAddress> oldValue16 = addressesSearchParameter.getOldValue();
        if (value27 != null) {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            for (Object obj7 : value27) {
                String paramId = ((SuggestAddress) obj7).getParamId();
                Object objR3 = linkedHashMap5.get(paramId);
                if (objR3 == null) {
                    objR3 = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap5, paramId);
                }
                ((List) objR3).add(obj7);
            }
            for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                String str11 = (String) entry3.getKey();
                int i23 = 0;
                for (Object obj8 : (List) entry3.getValue()) {
                    int i24 = i23 + 1;
                    if (i23 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put("params[" + str11 + "][" + i23 + ']', ((SuggestAddress) obj8).getId());
                    i23 = i24;
                }
            }
        }
        if (oldValue16 != null) {
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            for (Object obj9 : oldValue16) {
                String paramId2 = ((SuggestAddress) obj9).getParamId();
                Object objR4 = linkedHashMap6.get(paramId2);
                if (objR4 == null) {
                    objR4 = androidx.compose.ui.graphics.colorspace.e.r(linkedHashMap6, paramId2);
                }
                ((List) objR4).add(obj9);
            }
            for (Map.Entry entry4 : linkedHashMap6.entrySet()) {
                String str12 = (String) entry4.getKey();
                int i25 = 0;
                for (Object obj10 : (List) entry4.getValue()) {
                    int i26 = i25 + 1;
                    if (i25 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    linkedHashMap.put("changedValues[params[" + str12 + "][" + i25 + "]]", ((SuggestAddress) obj10).getId());
                    i25 = i26;
                }
            }
        }
    }

    public static ArrayList f(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Sublocation) it.next()).getId());
        }
        return arrayList;
    }

    @Override // com.avito.android.search.filter.r1
    @Y61.k
    public final LinkedHashMap a(@Y61.k ParametersTreeWithAdditional parametersTreeWithAdditional) {
        String value;
        String value2;
        String value3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator<ParameterSlot> it = parametersTreeWithAdditional.iterator();
        while (it.hasNext()) {
            e(it.next(), linkedHashMap, linkedHashMap2, parametersTreeWithAdditional);
        }
        AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional.a("query");
        if (additionalCategoryParameterA != null && (additionalCategoryParameterA instanceof AdditionalCharParameter) && (value3 = ((AdditionalCharParameter) additionalCategoryParameterA).getValue()) != null) {
            linkedHashMap.put("query", value3);
        }
        AdditionalCategoryParameter additionalCategoryParameterA2 = parametersTreeWithAdditional.a(SearchParamsConverterKt.SELLER_ID);
        AdditionalCharParameter additionalCharParameter = additionalCategoryParameterA2 instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA2 : null;
        if (additionalCharParameter != null && (value2 = additionalCharParameter.getValue()) != null) {
            linkedHashMap.put(SearchParamsConverterKt.SELLER_ID, value2);
        }
        AdditionalCategoryParameter additionalCategoryParameterA3 = parametersTreeWithAdditional.a("itemListId");
        AdditionalCharParameter additionalCharParameter2 = additionalCategoryParameterA3 instanceof AdditionalCharParameter ? (AdditionalCharParameter) additionalCategoryParameterA3 : null;
        if (additionalCharParameter2 != null && (value = additionalCharParameter2.getValue()) != null) {
            linkedHashMap.put("params[166812]", value);
        }
        if (!linkedHashMap2.isEmpty()) {
            linkedHashMap.putAll(linkedHashMap2);
        }
        return linkedHashMap;
    }
}
