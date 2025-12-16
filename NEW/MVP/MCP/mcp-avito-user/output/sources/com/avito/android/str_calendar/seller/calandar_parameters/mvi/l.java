package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.remote.model.category_parameters.CheckinCheckoutParameter;
import com.avito.android.remote.model.category_parameters.ChildrenAgesGroup;
import com.avito.android.remote.model.category_parameters.ChildrenAgesParameter;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.remote.model.category_parameters.IntParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.remote.model.category_parameters.PriceParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter;
import com.avito.android.remote.model.category_parameters.StrDurationDiscountsSelect;
import com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrCalendarParametersConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/l;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/k;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.s f287427a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a f287428b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d f287429c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, List<String>> f287430d = Collections.singletonMap("petToggle", C42745f0.U("petFeeValue", "petFeeType"));

    @Inject
    public l(@Y61.k com.avito.android.str_calendar.seller.calandar_parameters.s sVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.children.a aVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d dVar) {
        this.f287427a = sVar;
        this.f287428b = aVar;
        this.f287429c = dVar;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.k
    @Y61.k
    public final SimpleParametersTree a(@Y61.k List list, @Y61.k Map map) {
        SimpleParametersTree simpleParametersTree = new SimpleParametersTree(list);
        f(simpleParametersTree, map);
        return simpleParametersTree;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.k
    @Y61.l
    public final ParametersTree b(@Y61.l ParametersTree parametersTree, @Y61.k String str, boolean z12) {
        ParameterSlot parameterSlotFindParameter;
        if (parametersTree != null && (parameterSlotFindParameter = parametersTree.findParameter(str)) != null && (parameterSlotFindParameter instanceof BooleanParameter)) {
            EditableParameter editableParameter = (EditableParameter) parameterSlotFindParameter;
            Boolean boolValueOf = Boolean.valueOf(z12);
            if (!L.f(editableParameter.getValue(), boolValueOf)) {
                editableParameter.setValue(boolValueOf);
                editableParameter.setError(null);
            }
        }
        return parametersTree;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0190  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList] */
    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.k
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.model.category_parameters.ParametersTree c(@Y61.l com.avito.android.remote.model.category_parameters.ParametersTree r12, @Y61.k java.lang.String r13, @Y61.k java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.mvi.l.c(com.avito.android.remote.model.category_parameters.ParametersTree, java.lang.String, java.lang.String):com.avito.android.remote.model.category_parameters.ParametersTree");
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.k
    @Y61.k
    public final LinkedHashMap d(@Y61.l ParametersTree parametersTree) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (parametersTree != null) {
            for (ParameterSlot parameterSlot : parametersTree) {
                String id2 = parameterSlot.getId();
                Iterator<Map.Entry<String, List<String>>> it = this.f287430d.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry<String, List<String>> next = it.next();
                        String key = next.getKey();
                        if (next.getValue().contains(id2)) {
                            ParameterSlot parameterSlotFindParameter = parametersTree.findParameter(key);
                            if (!(parameterSlotFindParameter instanceof BooleanParameter) || !L.f(((BooleanParameter) parameterSlotFindParameter).getValue(), Boolean.FALSE)) {
                            }
                        }
                    } else {
                        if (parameterSlot instanceof EditableParameter) {
                            if (parameterSlot instanceof PriceParameter) {
                                String str = "parameters[" + parameterSlot.getId() + ']';
                                String strValueOf = String.valueOf(((PriceParameter) parameterSlot).getValue());
                                StringBuilder sb2 = new StringBuilder();
                                int length = strValueOf.length();
                                for (int i12 = 0; i12 < length; i12++) {
                                    char cCharAt = strValueOf.charAt(i12);
                                    if (Character.isDigit(cCharAt)) {
                                        sb2.append(cCharAt);
                                    }
                                }
                                linkedHashMap.put(str, sb2.toString());
                            } else {
                                linkedHashMap.put("parameters[" + parameterSlot.getId() + ']', String.valueOf(((EditableParameter) parameterSlot).getValue()));
                            }
                        } else if (parameterSlot instanceof CheckinCheckoutParameter) {
                            for (ParameterSlot parameterSlot2 : ((CheckinCheckoutParameter) parameterSlot).getParameters()) {
                                if (parameterSlot2 instanceof SelectParameter) {
                                    linkedHashMap.put("parameters[" + parameterSlot2.getId() + ']', String.valueOf(((SelectParameter) parameterSlot2).getValue()));
                                }
                            }
                        } else if (parameterSlot instanceof ChildrenAgesGroup) {
                            List<ChildrenAgesParameter> childrenAgesParameters = ((ChildrenAgesGroup) parameterSlot).getChildrenAgesParameters();
                            ArrayList arrayList = new ArrayList();
                            Iterator<T> it2 = childrenAgesParameters.iterator();
                            while (it2.hasNext()) {
                                C42745f0.h(((ChildrenAgesParameter) it2.next()).getParameters(), arrayList);
                            }
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                ParameterSlot parameterSlot3 = (ParameterSlot) it3.next();
                                if (parameterSlot3 instanceof PriceParameter) {
                                    String str2 = "parameters[" + parameterSlot3.getId() + ']';
                                    String strValueOf2 = String.valueOf(((PriceParameter) parameterSlot3).getValue());
                                    StringBuilder sb3 = new StringBuilder();
                                    int length2 = strValueOf2.length();
                                    for (int i13 = 0; i13 < length2; i13++) {
                                        char cCharAt2 = strValueOf2.charAt(i13);
                                        if (Character.isDigit(cCharAt2)) {
                                            sb3.append(cCharAt2);
                                        }
                                    }
                                    linkedHashMap.put(str2, sb3.toString());
                                } else if (parameterSlot3 instanceof IntParameter) {
                                    linkedHashMap.put("parameters[" + parameterSlot3.getId() + ']', String.valueOf(((IntParameter) parameterSlot3).getValue()));
                                }
                            }
                        } else if (parameterSlot instanceof StrDurationDiscountsParameter) {
                            List<StrDurationDiscountsSelect> discountSelectParameters = this.f287429c.a((StrDurationDiscountsParameter) parameterSlot).getDiscountSelectParameters();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<T> it4 = discountSelectParameters.iterator();
                            while (it4.hasNext()) {
                                List<ParameterSlot> parameters = ((StrDurationDiscountsSelect) it4.next()).getParameters();
                                if (parameters == null) {
                                    parameters = C42784z0.f406748b;
                                }
                                C42745f0.h(parameters, arrayList2);
                            }
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                ParameterSlot parameterSlot4 = (ParameterSlot) it5.next();
                                if (parameterSlot4 instanceof IntParameter) {
                                    linkedHashMap.put("parameters[" + parameterSlot4.getId() + ']', String.valueOf(((IntParameter) parameterSlot4).getValue()));
                                }
                            }
                        } else if (parameterSlot instanceof StrEarlyBookingDiscountParameter) {
                            StrEarlyBookingDiscountParameter strEarlyBookingDiscountParameter = (StrEarlyBookingDiscountParameter) parameterSlot;
                            List<ParameterSlot> parameters2 = strEarlyBookingDiscountParameter.getParameters();
                            if (parameters2 == null) {
                                parameters2 = C42784z0.f406748b;
                            }
                            for (ParameterSlot parameterSlot5 : parameters2) {
                                if (parameterSlot5 instanceof IntParameter) {
                                    String str3 = "parameters[" + parameterSlot5.getId() + ']';
                                    String strValueOf3 = String.valueOf(((IntParameter) parameterSlot5).getValue());
                                    if (!strEarlyBookingDiscountParameter.isEnabled()) {
                                        strValueOf3 = null;
                                    }
                                    if (strValueOf3 == null) {
                                        strValueOf3 = "";
                                    }
                                    linkedHashMap.put(str3, strValueOf3);
                                }
                            }
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.k
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.avito.conveyor_item.a> e(@Y61.l com.avito.android.remote.model.category_parameters.ParametersTree r7) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.mvi.l.e(com.avito.android.remote.model.category_parameters.ParametersTree):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.str_calendar.seller.calandar_parameters.mvi.k
    @Y61.l
    public final ParametersTree f(@Y61.l ParametersTree parametersTree, @Y61.k Map<String, String> map) {
        List<ParameterSlot> listSingletonList;
        ArrayList arrayList;
        if (parametersTree != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ParameterSlot parameterSlot : parametersTree) {
                if (parameterSlot instanceof GroupParameter) {
                    listSingletonList = ((GroupParameter) parameterSlot).getParameters();
                } else if (parameterSlot instanceof CheckinCheckoutParameter) {
                    CheckinCheckoutParameter checkinCheckoutParameter = (CheckinCheckoutParameter) parameterSlot;
                    listSingletonList = C42745f0.U(C42745f0.K(0, checkinCheckoutParameter.getParameters()), C42745f0.K(1, checkinCheckoutParameter.getParameters()));
                } else {
                    if (parameterSlot instanceof ChildrenAgesGroup) {
                        List<ChildrenAgesParameter> childrenAgesParameters = ((ChildrenAgesGroup) parameterSlot).getChildrenAgesParameters();
                        arrayList = new ArrayList();
                        Iterator<T> it = childrenAgesParameters.iterator();
                        while (it.hasNext()) {
                            C42745f0.h(((ChildrenAgesParameter) it.next()).getParameters(), arrayList);
                        }
                    } else if (parameterSlot instanceof StrDurationDiscountsParameter) {
                        List<StrDurationDiscountsSelect> discountSelectParameters = ((StrDurationDiscountsParameter) parameterSlot).getDiscountSelectParameters();
                        arrayList = new ArrayList();
                        Iterator<T> it2 = discountSelectParameters.iterator();
                        while (it2.hasNext()) {
                            List<ParameterSlot> parameters = ((StrDurationDiscountsSelect) it2.next()).getParameters();
                            if (parameters == null) {
                                parameters = C42784z0.f406748b;
                            }
                            C42745f0.h(parameters, arrayList);
                        }
                    } else if (parameterSlot instanceof StrEarlyBookingDiscountParameter) {
                        listSingletonList = ((StrEarlyBookingDiscountParameter) parameterSlot).getParameters();
                        if (listSingletonList == null) {
                            listSingletonList = C42784z0.f406748b;
                        }
                    } else {
                        listSingletonList = Collections.singletonList(parameterSlot);
                    }
                    listSingletonList = arrayList;
                }
                if (listSingletonList == null) {
                    listSingletonList = C42784z0.f406748b;
                }
                C42745f0.h(listSingletonList, arrayList2);
            }
            Iterator it3 = C42745f0.C(arrayList2).iterator();
            while (it3.hasNext()) {
                ParameterSlot parameterSlot2 = (ParameterSlot) it3.next();
                if (parameterSlot2 instanceof HasError) {
                    String str = null;
                    if (map.containsKey(parameterSlot2.getId())) {
                        String str2 = map.get(parameterSlot2.getId());
                        String str3 = str2;
                        if (str3 != null && str3.length() != 0) {
                            str = str2;
                        }
                        String str4 = str;
                        if (str4 == null) {
                            ((HasError) parameterSlot2).setError(HasError.Error.WithoutMessage.INSTANCE);
                        } else {
                            ((HasError) parameterSlot2).setError(new HasError.Error.WithMessage(str4));
                        }
                    } else {
                        ((HasError) parameterSlot2).setError(null);
                    }
                }
            }
        }
        return parametersTree;
    }
}
