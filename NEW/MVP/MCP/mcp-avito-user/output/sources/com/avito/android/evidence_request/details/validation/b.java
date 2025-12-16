package com.avito.android.evidence_request.details.validation;

import Vz.C15731a;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.remote.model.category_parameters.Constraint;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.validation.Form;
import com.avito.android.remote.model.validation.Structure;
import com.avito.android.remote.model.validation.Validation;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;
import shark.AndroidResourceIdNames;

/* compiled from: EvidenceValidationFormConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/validation/b;", "Lcom/avito/android/evidence_request/details/validation/a;", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.evidence_request.details.validation.a
    @Y61.k
    public final C15731a a(@Y61.k Structure structure) {
        List list;
        String[] strArr;
        String value;
        Long lZ02;
        C15731a c15731a = new C15731a(0L, null, 3, null);
        List<Form> form = structure.getForm();
        ArrayList arrayList = new ArrayList();
        for (Object obj : form) {
            if (L.f(((Form) obj).getType(), "file")) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Form) it.next()).getValidations());
        }
        List<Validation> list2 = (List) C42745f0.G(arrayList2);
        if (list2 != null) {
            for (Validation validation : list2) {
                String rule = validation.getRule();
                if (L.f(rule, "type")) {
                    String value2 = validation.getValue();
                    if (value2 != null) {
                        try {
                            list = (List) new Gson().e(value2, new d().getType());
                        } catch (Throwable unused) {
                            list = null;
                        }
                        if (list != null && (strArr = (String[]) list.toArray(new String[0])) != null) {
                            String[] strArr2 = strArr.length != 0 ? strArr : null;
                            if (strArr2 != null) {
                                c15731a = new C15731a(c15731a.f17534a, strArr2);
                            }
                        }
                    }
                } else if (L.f(rule, "size") && (value = validation.getValue()) != null && (lZ02 = C43066x.z0(value)) != null) {
                    c15731a = new C15731a(lZ02.longValue(), c15731a.f17535b);
                }
            }
        }
        return c15731a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.util.ArrayList] */
    @Override // com.avito.android.evidence_request.details.validation.a
    @Y61.k
    public final List<ParameterSlot> b(@Y61.k List<? extends ParameterSlot> list, @Y61.k Structure structure) {
        String value;
        Long lZ02;
        Boolean boolV0;
        String value2;
        Long lZ03;
        Boolean boolV02;
        String value3;
        Long lZ04;
        l0.h hVar = new l0.h();
        hVar.f406842b = list;
        for (Form form : structure.getForm()) {
            String type = form.getType();
            if (L.f(type, "string")) {
                Iterable<ParameterSlot> iterable = (Iterable) hVar.f406842b;
                ?? arrayList = new ArrayList(C42745f0.q(iterable, 10));
                for (ParameterSlot parameterSlot : iterable) {
                    ParameterSlot parameterSlot2 = L.f(parameterSlot.getId(), form.getName()) ? parameterSlot : null;
                    CharParameter charParameter = parameterSlot2 instanceof CharParameter ? (CharParameter) parameterSlot2 : null;
                    if (charParameter != null) {
                        List<Validation> validations = form.getValidations();
                        boolean required = charParameter.getRequired();
                        ArrayList arrayList2 = new ArrayList();
                        boolean zBooleanValue = required;
                        for (Validation validation : validations) {
                            String rule = validation.getRule();
                            if (rule != null) {
                                int iHashCode = rule.hashCode();
                                if (iHashCode != -791400086) {
                                    if (iHashCode != -393139297) {
                                        if (iHashCode == -18921512 && rule.equals("minLength") && (value = validation.getValue()) != null && (lZ02 = C43066x.z0(value)) != null) {
                                            Constraint.Length lengthCopy$default = Constraint.Length.copy$default(new Constraint.Length(null, null, validation.getMessage(), "error", charParameter.getId() + ":minLength", null, null), Long.valueOf(lZ02.longValue()), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                                            if (lengthCopy$default != null) {
                                                arrayList2.add(lengthCopy$default);
                                            }
                                        }
                                    } else if (rule.equals("required")) {
                                        String value4 = validation.getValue();
                                        zBooleanValue = (value4 == null || (boolV0 = C43066x.v0(value4)) == null) ? true : boolV0.booleanValue();
                                    }
                                } else if (rule.equals("maxLength") && (value2 = validation.getValue()) != null && (lZ03 = C43066x.z0(value2)) != null) {
                                    Constraint.Length lengthCopy$default2 = Constraint.Length.copy$default(new Constraint.Length(null, null, validation.getMessage(), "error", charParameter.getId() + ":maxLength", null, null), null, Long.valueOf(lZ03.longValue()), null, null, null, null, null, 125, null);
                                    if (lengthCopy$default2 != null) {
                                        arrayList2.add(lengthCopy$default2);
                                    }
                                }
                            }
                        }
                        CharParameter charParameterCopy = charParameter.copy((261627 & 1) != 0 ? charParameter.id : null, (261627 & 2) != 0 ? charParameter.title : null, (261627 & 4) != 0 ? charParameter.required : zBooleanValue, (261627 & 8) != 0 ? charParameter.immutable : false, (261627 & 16) != 0 ? charParameter.motivation : null, (261627 & 32) != 0 ? charParameter.updatesForm : null, (261627 & 64) != 0 ? charParameter.hint : null, (261627 & 128) != 0 ? charParameter._value : null, (261627 & 256) != 0 ? charParameter.displayingOptions : null, (261627 & 512) != 0 ? charParameter.constraints : !arrayList2.isEmpty() ? arrayList2 : null, (261627 & 1024) != 0 ? charParameter.button : null, (261627 & 2048) != 0 ? charParameter.placeholder : null, (261627 & 4096) != 0 ? charParameter.tags : null, (261627 & 8192) != 0 ? charParameter._inputType : null, (261627 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? charParameter.autogeneratedValue : null, (261627 & 32768) != 0 ? charParameter.visible : null, (261627 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? charParameter.phantom : null, (261627 & 131072) != 0 ? charParameter.widget : null);
                        if (charParameterCopy != null) {
                            parameterSlot = charParameterCopy;
                        }
                    }
                    arrayList.add(parameterSlot);
                }
                hVar.f406842b = arrayList;
            } else if (L.f(type, "file")) {
                Iterable<ParameterSlot> iterable2 = (Iterable) hVar.f406842b;
                ?? arrayList3 = new ArrayList(C42745f0.q(iterable2, 10));
                for (ParameterSlot parameterSlot3 : iterable2) {
                    ParameterSlot parameterSlot4 = L.f(parameterSlot3.getId(), form.getName()) ? parameterSlot3 : null;
                    PhotoParameter photoParameter = parameterSlot4 instanceof PhotoParameter ? (PhotoParameter) parameterSlot4 : null;
                    if (photoParameter != null) {
                        List<Validation> validations2 = form.getValidations();
                        boolean required2 = photoParameter.getRequired();
                        int maxCount = photoParameter.getMaxCount();
                        boolean zBooleanValue2 = required2;
                        int i12 = maxCount;
                        Constraint.Limit limitCopy$default = null;
                        for (Validation validation2 : validations2) {
                            String rule2 = validation2.getRule();
                            if (L.f(rule2, "required")) {
                                String value5 = validation2.getValue();
                                zBooleanValue2 = (value5 == null || (boolV02 = C43066x.v0(value5)) == null) ? true : boolV02.booleanValue();
                                if (zBooleanValue2) {
                                    if (limitCopy$default == null) {
                                        limitCopy$default = new Constraint.Limit(null, null, "error", validation2.getMessage(), photoParameter.getId() + ":limit", null, null, 99, null);
                                    }
                                    limitCopy$default = Constraint.Limit.copy$default(limitCopy$default, Float.valueOf(1.0f), null, null, validation2.getMessage(), null, null, null, 118, null);
                                }
                            } else if (L.f(rule2, "count") && (value3 = validation2.getValue()) != null && (lZ04 = C43066x.z0(value3)) != null) {
                                long jLongValue = lZ04.longValue();
                                if (limitCopy$default == null) {
                                    limitCopy$default = new Constraint.Limit(null, null, "error", validation2.getMessage(), photoParameter.getId() + ":limit", null, null, 99, null);
                                }
                                Constraint.Limit limit = limitCopy$default;
                                Float fValueOf = Float.valueOf(jLongValue);
                                String message = limit.getMessage();
                                if (message == null) {
                                    message = validation2.getMessage();
                                }
                                limitCopy$default = Constraint.Limit.copy$default(limit, null, fValueOf, null, message, null, null, null, 117, null);
                                i12 = (int) jLongValue;
                            }
                        }
                        PhotoParameter photoParameterCopy = photoParameter.copy((8015 & 1) != 0 ? photoParameter.id : null, (8015 & 2) != 0 ? photoParameter.title : null, (8015 & 4) != 0 ? photoParameter.description : null, (8015 & 8) != 0 ? photoParameter.motivation : null, (8015 & 16) != 0 ? photoParameter.maxCount : i12, (8015 & 32) != 0 ? photoParameter.constraints : limitCopy$default != null ? Collections.singletonList(limitCopy$default) : C42784z0.f406748b, (8015 & 64) != 0 ? photoParameter._value : null, (8015 & 128) != 0 ? photoParameter.required : zBooleanValue2, (8015 & 256) != 0 ? photoParameter.shouldUploadPhotoForCV : false, (8015 & 512) != 0 ? photoParameter.suggestByPhotoMaxImages : null, (8015 & 1024) != 0 ? photoParameter.displayingOptions : null, (8015 & 2048) != 0 ? photoParameter.visible : null, (8015 & 4096) != 0 ? photoParameter.phantom : null);
                        if (photoParameterCopy != null) {
                            parameterSlot3 = photoParameterCopy;
                        }
                    }
                    arrayList3.add(parameterSlot3);
                }
                hVar.f406842b = arrayList3;
            }
        }
        return (List) hVar.f406842b;
    }
}
