package com.avito.android.remote.model.category_parameters;

import AK.c;
import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Entity;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.BaseParametersConverter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.LegacyRangeIntParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.RangeIntParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35883r4;
import com.avito.android.util.InterfaceC35945t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42770s0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;
import kotlin.text.C43066x;

/* compiled from: CategoryParametersConverter.kt */
@s0
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n*\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00152*\u0010\u001a\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u00190\u0018\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ-\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00152\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u0015¢\u0006\u0004\b\u0016\u0010\u001dJ'\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001e¢\u0006\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010'\u001a\u00020\u0002*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0018\u0010)\u001a\u00020\u0002*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0018\u0010-\u001a\u00020\u0002*\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/category_parameters/CategoryParametersConverter;", "Lcom/avito/android/remote/model/category_parameters/BaseParametersConverter;", "", "paramKeyBase", "slotKeyBase", "Lcom/avito/android/util/t1;", "phoneNumberFormatter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/util/t1;)V", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "", "map", "appendToFieldMap", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;Ljava/util/Map;)Ljava/util/Map;", "key", "", "value", "appendField", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Object;)Ljava/util/Map;", "Lcom/avito/android/remote/model/Navigation;", "navigation", "", "convertToFieldMap", "(Lcom/avito/android/remote/model/Navigation;)Ljava/util/Map;", "", "Lkotlin/Q;", LocalPublishState.FIELDS, "([Lkotlin/Q;)Ljava/util/Map;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "(Ljava/util/Map;)Ljava/util/Map;", "", "(Ljava/lang/Iterable;)Ljava/util/Map;", "Ljava/lang/String;", "Lcom/avito/android/util/t1;", "", "hardcodedParamIds", "Ljava/util/Set;", "getToParamKey", "(Ljava/lang/String;)Ljava/lang/String;", "toParamKey", "getToSlotKey", "toSlotKey", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "getParamKey", "(Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;)Ljava/lang/String;", "paramKey", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CategoryParametersConverter implements BaseParametersConverter {

    @k
    private final Set<String> hardcodedParamIds;

    @k
    private final String paramKeyBase;

    @k
    private final InterfaceC35945t1<String> phoneNumberFormatter;

    @k
    private final String slotKeyBase;

    public CategoryParametersConverter() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<String, String> appendField(Map<String, String> map, String str, Object obj) {
        if (obj != 0) {
            if (obj instanceof String) {
                map.put(str, obj);
            } else if (obj instanceof Number) {
                appendField(map, str, ((Number) obj).toString());
            } else if (obj instanceof Boolean) {
                appendField(map, str, toFormValue(((Boolean) obj).booleanValue()));
            } else if (obj instanceof Entity) {
                appendField(map, str, ((Entity) obj).getId());
            } else if (obj instanceof Map) {
                for (Map.Entry entry : C35755b0.c((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    appendField(map, str + '[' + key + ']', entry.getValue());
                }
            } else if (obj instanceof Iterable) {
                Iterator it = C42745f0.C((Iterable) obj).iterator();
                int i12 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    appendField(map, str + '[' + i12 + ']', next);
                    i12 = i13;
                }
            } else {
                for (Q<String, Object> q12 : getFields(obj)) {
                    appendField(map, str + '[' + q12.f406619b + ']', q12.f406620c);
                }
            }
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Map<String, String> appendToFieldMap(ParameterSlot parameterSlot, Map<String, String> map) {
        Long l12;
        Long l13;
        VideoUploadParameterValue videoUploadParameterValue;
        List<ImageUploadResult> onlyUploaded;
        List<ParameterSlot> parameters;
        if (parameterSlot instanceof SelectParameter) {
            SelectParameter.Value chosenOrCurrentSelectedValue = ((SelectParameter) parameterSlot).getChosenOrCurrentSelectedValue();
            appendField(map, getParamKey((CategoryParameter) parameterSlot), chosenOrCurrentSelectedValue);
            if (chosenOrCurrentSelectedValue != null && (parameters = chosenOrCurrentSelectedValue.getParameters()) != null) {
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    appendToFieldMap((ParameterSlot) it.next(), map);
                }
                G0 g02 = G0.f406611a;
            }
        } else {
            int i12 = 0;
            if (parameterSlot instanceof AddressParameter) {
                Object obj = (AddressParameter.Value) ((AddressParameter) parameterSlot).getValue();
                if (obj != null) {
                    appendField(map, C43066x.h0(parameterSlot.getId(), "params", false) ? parameterSlot.getId() : getParamKey((CategoryParameter) parameterSlot), obj);
                    appendField(map, "coords", obj);
                }
            } else {
                arrayList = null;
                ArrayList arrayList = null;
                id = null;
                String id2 = null;
                ArrayList arrayList2 = null;
                if (parameterSlot instanceof ObjectsParameter) {
                    List<? extends List<? extends ParameterSlot>> value = ((ObjectsParameter) parameterSlot).getValue();
                    if (value != null) {
                        for (Object obj2 : value) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C42745f0.H0();
                                throw null;
                            }
                            String str = getParamKey((CategoryParameter) parameterSlot) + '[' + i12 + ']';
                            Map<String, String> mapConvertToFieldMap = convertToFieldMap((List) obj2);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(P0.f(mapConvertToFieldMap.size()));
                            Iterator<T> it2 = mapConvertToFieldMap.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                linkedHashMap.put(C43066x.U(this.paramKeyBase, (String) entry.getKey()), entry.getValue());
                            }
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                StringBuilder sbR = H.r(str);
                                sbR.append((String) entry2.getKey());
                                map.put(sbR.toString(), entry2.getValue());
                            }
                            i12 = i13;
                        }
                        G0 g03 = G0.f406611a;
                    }
                } else if (parameterSlot instanceof PhotoParameter) {
                    String paramKey = getParamKey((CategoryParameter) parameterSlot);
                    PhotoParameter.ImageUploadListWrapper value2 = ((PhotoParameter) parameterSlot).getValue();
                    if (value2 != null && (onlyUploaded = value2.getOnlyUploaded()) != null) {
                        List<ImageUploadResult> list = onlyUploaded;
                        arrayList = new ArrayList(C42745f0.q(list, 10));
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((ImageUploadResult) it3.next()).getUploadId());
                        }
                    }
                    appendField(map, paramKey, arrayList);
                } else if (parameterSlot instanceof VideoUploadParameter) {
                    String paramKey2 = getParamKey((CategoryParameter) parameterSlot);
                    List<? extends VideoUploadParameterValue> value3 = ((VideoUploadParameter) parameterSlot).getValue();
                    if (value3 != null && (videoUploadParameterValue = (VideoUploadParameterValue) C42745f0.G(value3)) != null) {
                        id2 = videoUploadParameterValue.getId();
                    }
                    appendField(map, paramKey2, Collections.singletonList(id2));
                } else if (parameterSlot instanceof FileUploaderParameter) {
                    FileUploaderParameter fileUploaderParameter = (FileUploaderParameter) parameterSlot;
                    if (fileUploaderParameter.isDduFileUploader()) {
                        List<? extends FileUploadParameterValue> value4 = fileUploaderParameter.getValue();
                        if (value4 != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj3 : value4) {
                                if (((FileUploadParameterValue) obj3).isUploaded()) {
                                    arrayList3.add(obj3);
                                }
                            }
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                Object next = it4.next();
                                int i14 = i12 + 1;
                                if (i12 < 0) {
                                    C42745f0.H0();
                                    throw null;
                                }
                                FileUploadParameterValue fileUploadParameterValue = (FileUploadParameterValue) next;
                                String strP = r.p("[dduFile][", i12, ']');
                                appendField(map, r.q(strP, "[id]"), fileUploadParameterValue.getId());
                                appendField(map, r.q(strP, "[type]"), fileUploadParameterValue.getType());
                                appendField(map, r.q(strP, "[name]"), fileUploadParameterValue.getName());
                                appendField(map, r.q(strP, "[size]"), fileUploadParameterValue.getSize());
                                i12 = i14;
                            }
                        }
                    } else {
                        String paramKey3 = getParamKey((CategoryParameter) parameterSlot);
                        List<? extends FileUploadParameterValue> value5 = fileUploaderParameter.getValue();
                        if (value5 != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj4 : value5) {
                                if (((FileUploadParameterValue) obj4).isUploaded()) {
                                    arrayList4.add(obj4);
                                }
                            }
                            arrayList2 = new ArrayList(C42745f0.q(arrayList4, 10));
                            Iterator it5 = arrayList4.iterator();
                            while (it5.hasNext()) {
                                arrayList2.add(((FileUploadParameterValue) it5.next()).getId());
                            }
                        }
                        appendField(map, paramKey3, arrayList2);
                    }
                } else if (parameterSlot instanceof GroupParameter) {
                    List<ParameterSlot> parameters2 = ((GroupParameter) parameterSlot).getParameters();
                    if (parameters2 == null) {
                        parameters2 = C42784z0.f406748b;
                    }
                    Iterator<T> it6 = parameters2.iterator();
                    while (it6.hasNext()) {
                        appendToFieldMap((ParameterSlot) it6.next(), map);
                    }
                } else if (parameterSlot instanceof DateTimeIntervalParameter) {
                    Iterator<DateTimeParameter> it7 = ((DateTimeIntervalParameter) parameterSlot).getParameters().iterator();
                    while (it7.hasNext()) {
                        appendToFieldMap((DateTimeParameter) it7.next(), map);
                    }
                } else if (parameterSlot instanceof DateTimeRangeParameter) {
                    appendField(map, getParamKey((CategoryParameter) parameterSlot), ((DateTimeRangeParameter) parameterSlot).getParametersMap());
                } else if (parameterSlot instanceof DateTimeParameter) {
                    DateTimeParameter.Value value6 = ((DateTimeParameter) parameterSlot).getValue();
                    if (value6 != null) {
                        appendField(map, getParamKey((CategoryParameter) parameterSlot), DateTimeParameterKt.toFormValue(value6));
                    }
                } else if (parameterSlot instanceof PhoneParameter) {
                    String paramKey4 = getParamKey((CategoryParameter) parameterSlot);
                    Object objA = this.phoneNumberFormatter.a(((PhoneParameter) parameterSlot).getValue());
                    appendField(map, paramKey4, L.f(objA, "") ? null : objA);
                } else if (parameterSlot instanceof MultiselectParameter) {
                    appendField(map, getParamKey((CategoryParameter) parameterSlot), ((MultiselectParameter) parameterSlot).getValue());
                } else if (parameterSlot instanceof LegacyRangeIntParameter) {
                    LegacyRangeIntParameter.RangeValue value7 = ((LegacyRangeIntParameter) parameterSlot).getValue();
                    if (value7 != null) {
                        Long from = value7.getFrom();
                        if (from != null) {
                            appendField(map, c.s(new StringBuilder(), getParamKey((CategoryParameter) parameterSlot), "[from]"), Long.valueOf(from.longValue()));
                        }
                        Long to2 = value7.getTo();
                        if (to2 != null) {
                            appendField(map, c.s(new StringBuilder(), getParamKey((CategoryParameter) parameterSlot), "[to]"), Long.valueOf(to2.longValue()));
                        }
                    }
                } else if (parameterSlot instanceof RangeIntParameter) {
                    RangeIntParameter.RangeValue value8 = ((RangeIntParameter) parameterSlot).getValue();
                    if (value8 != null) {
                        RangeIntParameter.RangeValueLimit from2 = value8.getFrom();
                        if (from2 != null && (l13 = from2.getInt()) != null) {
                            appendField(map, c.s(new StringBuilder(), getParamKey((CategoryParameter) parameterSlot), "[from]"), Long.valueOf(l13.longValue()));
                        }
                        RangeIntParameter.RangeValueLimit to3 = value8.getTo();
                        if (to3 != null && (l12 = to3.getInt()) != null) {
                            appendField(map, c.s(new StringBuilder(), getParamKey((CategoryParameter) parameterSlot), "[to]"), Long.valueOf(l12.longValue()));
                        }
                    }
                } else if (parameterSlot instanceof MetroParameter) {
                    List<? extends Metro> value9 = ((MetroParameter) parameterSlot).getValue();
                    if (value9 != null) {
                        String paramKey5 = getParamKey((CategoryParameter) parameterSlot);
                        List<? extends Metro> list2 = value9;
                        ArrayList arrayList5 = new ArrayList(C42745f0.q(list2, 10));
                        Iterator<T> it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList5.add(((Metro) it8.next()).getId());
                        }
                        appendField(map, paramKey5, arrayList5);
                    }
                } else if (parameterSlot instanceof DistrictParameter) {
                    List<? extends District> value10 = ((DistrictParameter) parameterSlot).getValue();
                    if (value10 != null) {
                        String paramKey6 = getParamKey((CategoryParameter) parameterSlot);
                        List<? extends District> list3 = value10;
                        ArrayList arrayList6 = new ArrayList(C42745f0.q(list3, 10));
                        Iterator<T> it9 = list3.iterator();
                        while (it9.hasNext()) {
                            arrayList6.add(((District) it9.next()).getId());
                        }
                        appendField(map, paramKey6, arrayList6);
                    }
                } else if (parameterSlot instanceof EditableParameter) {
                    appendField(map, getParamKey((CategoryParameter) parameterSlot), ((EditableParameter) parameterSlot).getValue());
                } else if (parameterSlot instanceof SlotWithState) {
                    Map<String, String> mapConvertToFieldMap2 = convertToFieldMap(((SlotWithState) parameterSlot).getState());
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(mapConvertToFieldMap2.size()));
                    Iterator<T> it10 = mapConvertToFieldMap2.entrySet().iterator();
                    while (it10.hasNext()) {
                        Map.Entry entry3 = (Map.Entry) it10.next();
                        linkedHashMap2.put(C43066x.U(this.paramKeyBase, (String) entry3.getKey()), entry3.getValue());
                    }
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        map.put(getToSlotKey(parameterSlot.getId()) + ((String) entry4.getKey()), entry4.getValue());
                    }
                }
            }
        }
        return map;
    }

    private final String getParamKey(CategoryParameter categoryParameter) {
        return getToParamKey(categoryParameter.getId());
    }

    private final String getToParamKey(String str) {
        if (this.hardcodedParamIds.contains(str)) {
            return str;
        }
        return this.paramKeyBase + '[' + str + ']';
    }

    private final String getToSlotKey(String str) {
        return this.slotKeyBase + '[' + str + ']';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final Map<String, String> convertToFieldMap(@k Q<String, ? extends Object>... fields) {
        InterfaceC43030m<Q> interfaceC43030mF = C42756l.f(fields);
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Q q12 : interfaceC43030mF) {
            linkedHashMap = appendField(linkedHashMap, (String) q12.f406619b, q12.f406620c);
        }
        return linkedHashMap;
    }

    @Override // com.avito.android.remote.model.category_parameters.BaseParametersConverter
    @k
    public InterfaceC43030m<Q<String, Object>> getFields(@k Object obj) {
        return BaseParametersConverter.DefaultImpls.getFields(this, obj);
    }

    @Override // com.avito.android.remote.model.category_parameters.BaseParametersConverter
    @k
    public String toFormValue(boolean z12) {
        return BaseParametersConverter.DefaultImpls.toFormValue(this, z12);
    }

    public CategoryParametersConverter(@k String str, @k String str2, @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.paramKeyBase = str;
        this.slotKeyBase = str2;
        this.phoneNumberFormatter = interfaceC35945t1;
        this.hardcodedParamIds = Collections.singleton("coords");
    }

    @k
    public final Map<String, String> convertToFieldMap(@k Map<String, ? extends Object> parameters) {
        C42770s0 c42770s0B = P0.b(parameters);
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry entry : c42770s0B.f406743a) {
            String str = (String) entry.getKey();
            linkedHashMap = appendField(linkedHashMap, getToParamKey(str), entry.getValue());
        }
        return linkedHashMap;
    }

    public /* synthetic */ CategoryParametersConverter(String str, String str2, InterfaceC35945t1 interfaceC35945t1, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "params" : str, (i12 & 2) != 0 ? "slots" : str2, (i12 & 4) != 0 ? new C35883r4() : interfaceC35945t1);
    }

    @k
    public final Map<String, String> convertToFieldMap(@k Iterable<? extends ParameterSlot> parameters) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Iterator<? extends ParameterSlot> it = parameters.iterator();
        while (it.hasNext()) {
            linkedHashMap = appendToFieldMap(it.next(), linkedHashMap);
        }
        return linkedHashMap;
    }

    @k
    public final Map<String, String> convertToFieldMap(@k Navigation navigation2) {
        return convertToFieldMap(new Q("navigation", navigation2));
    }
}
