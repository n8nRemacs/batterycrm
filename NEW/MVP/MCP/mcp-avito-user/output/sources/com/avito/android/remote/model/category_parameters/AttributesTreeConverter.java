package com.avito.android.remote.model.category_parameters;

import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Entity;
import com.avito.android.remote.model.ImageUploadResult;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.AttributeNode;
import com.avito.android.remote.model.category_parameters.BaseParametersConverter;
import com.avito.android.remote.model.category_parameters.DateTimeParameter;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.category_parameters.slot.SlotWithState;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35883r4;
import com.avito.android.util.InterfaceC35945t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.sequences.InterfaceC43030m;

/* compiled from: AttributesTreeConverter.kt */
@s0
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u001c\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0011J9\u0010\u001a\u001a\u00020\u0014*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u0014*\u00020\u001c2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010\"\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b&\u0010%J+\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0010\u0010'\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b(\u0010%J+\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f2\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f¢\u0006\u0004\b*\u0010%J%\u0010-\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0+¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0+¢\u0006\u0004\b/\u0010.J%\u00100\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001c0+¢\u0006\u0004\b0\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributesTreeConverter;", "Lcom/avito/android/remote/model/category_parameters/BaseParametersConverter;", "", "paramKeyBase", "slotKeyBase", "attributesKeyBase", "Lcom/avito/android/util/t1;", "phoneNumberFormatter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/util/t1;)V", "", "Lcom/avito/android/remote/model/category_parameters/AttributeNode;", "Lcom/avito/android/remote/model/category_parameters/AttributesTree;", "attributesTree", "key", "", "convertToFieldMap", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "", "tree", "Lkotlin/G0;", "appendToFieldMap", "(Ljava/util/Map;Lcom/avito/android/remote/model/category_parameters/AttributeNode;Ljava/lang/String;)V", "convertToAttributeMap", "", "topLevelNode", "appendToAttributeMap", "(Ljava/util/Map;Lcom/avito/android/remote/model/category_parameters/AttributeNode;Ljava/lang/String;Z)V", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", "", "appendToAttributesTree", "(Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;Ljava/util/List;)V", "", "value", "appendField", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;)V", "convertToSlotFieldMap", "(Ljava/util/List;)Ljava/util/Map;", "convertToParameterFieldMap", "slotsTree", "convertToSlotAttributesMap", "parametersTree", "convertToParameterAttributesMap", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "convertToSlotAttributesTree", "(Ljava/lang/Iterable;)Ljava/util/List;", "convertToParameterAttributesTree", "convertToAttributesTree", "Ljava/lang/String;", "Lcom/avito/android/util/t1;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttributesTreeConverter implements BaseParametersConverter {

    @k
    private final String attributesKeyBase;

    @k
    private final String paramKeyBase;

    @k
    private final InterfaceC35945t1<String> phoneNumberFormatter;

    @k
    private final String slotKeyBase;

    public AttributesTreeConverter() {
        this(null, null, null, null, 15, null);
    }

    private final void appendField(List<AttributeNode> list, String str, Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                list.add(new AttributeNode.StringNode(str, (String) obj));
                return;
            }
            if (obj instanceof Number) {
                appendField(list, str, ((Number) obj).toString());
                return;
            }
            if (obj instanceof Boolean) {
                appendField(list, str, toFormValue(((Boolean) obj).booleanValue()));
                return;
            }
            if (obj instanceof Entity) {
                appendField(list, str, ((Entity) obj).getId());
                return;
            }
            if (obj instanceof Map) {
                AttributeNode.ListNode listNode = new AttributeNode.ListNode(str, null, 2, null);
                for (Map.Entry entry : C35755b0.c((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    appendField(listNode.getValue(), String.valueOf(key), entry.getValue());
                }
                list.add(listNode);
                return;
            }
            if (!(obj instanceof Iterable)) {
                AttributeNode.ListNode listNode2 = new AttributeNode.ListNode(str, null, 2, null);
                for (Q<String, Object> q12 : getFields(obj)) {
                    appendField(listNode2.getValue(), q12.f406619b, q12.f406620c);
                }
                list.add(listNode2);
                return;
            }
            AttributeNode.ListNode listNode3 = new AttributeNode.ListNode(str, null, 2, null);
            Iterator it = C42745f0.C((Iterable) obj).iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                appendField(listNode3.getValue(), String.valueOf(i12), next);
                i12 = i13;
            }
            list.add(listNode3);
        }
    }

    private final void appendToAttributeMap(Map<String, String> map, AttributeNode attributeNode, String str, boolean z12) {
        String string;
        if (!(attributeNode instanceof AttributeNode.ListNode)) {
            if (attributeNode instanceof AttributeNode.StringNode) {
                if (!z12) {
                    StringBuilder sbB = C22491k0.b(str, '[');
                    sbB.append(attributeNode.getId());
                    sbB.append(']');
                    map.put(sbB.toString(), ((AttributeNode.StringNode) attributeNode).getValue());
                    return;
                }
                map.put(r.q(str, "[id]"), attributeNode.getId());
                map.put(str + "[value]", ((AttributeNode.StringNode) attributeNode).getValue());
                return;
            }
            return;
        }
        AttributeNode.ListNode listNode = (AttributeNode.ListNode) attributeNode;
        if (!listNode.getValue().isEmpty() && z12) {
            map.put(r.q(str, "[id]"), attributeNode.getId());
        }
        for (AttributeNode attributeNode2 : listNode.getValue()) {
            if (z12) {
                string = r.q(str, "[value]");
            } else {
                StringBuilder sbB2 = C22491k0.b(str, '[');
                sbB2.append(attributeNode.getId());
                sbB2.append(']');
                string = sbB2.toString();
            }
            appendToAttributeMap(map, attributeNode2, string, false);
        }
    }

    public static /* synthetic */ void appendToAttributeMap$default(AttributesTreeConverter attributesTreeConverter, Map map, AttributeNode attributeNode, String str, boolean z12, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z12 = true;
        }
        attributesTreeConverter.appendToAttributeMap(map, attributeNode, str, z12);
    }

    private final void appendToAttributesTree(ParameterSlot parameterSlot, List<AttributeNode> list) {
        VideoUploadParameterValue videoUploadParameterValue;
        List<ImageUploadResult> onlyUploaded;
        List<ParameterSlot> parameters;
        if (parameterSlot instanceof SelectParameter) {
            SelectParameter.Value chosenOrCurrentSelectedValue = ((SelectParameter) parameterSlot).getChosenOrCurrentSelectedValue();
            appendField(list, parameterSlot.getId(), chosenOrCurrentSelectedValue);
            if (chosenOrCurrentSelectedValue == null || (parameters = chosenOrCurrentSelectedValue.getParameters()) == null) {
                return;
            }
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                appendToAttributesTree((ParameterSlot) it.next(), list);
            }
            return;
        }
        if (parameterSlot instanceof AddressParameter) {
            Object obj = (AddressParameter.Value) ((AddressParameter) parameterSlot).getValue();
            if (obj != null) {
                appendField(list, parameterSlot.getId(), obj);
                return;
            }
            return;
        }
        ArrayList arrayList = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        id = null;
        String id2 = null;
        if (parameterSlot instanceof ObjectsParameter) {
            AttributeNode.ListNode listNode = new AttributeNode.ListNode(parameterSlot.getId(), null, 2, null);
            List<? extends List<? extends ParameterSlot>> value = ((ObjectsParameter) parameterSlot).getValue();
            if (value != null) {
                int i12 = 0;
                for (Object obj2 : value) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    AttributeNode.ListNode listNode2 = new AttributeNode.ListNode(String.valueOf(i12), null, 2, null);
                    Iterator it2 = ((List) obj2).iterator();
                    while (it2.hasNext()) {
                        appendToAttributesTree((ParameterSlot) it2.next(), listNode2.getValue());
                    }
                    listNode.getValue().add(listNode2);
                    i12 = i13;
                }
            }
            list.add(listNode);
            return;
        }
        if (parameterSlot instanceof PhotoParameter) {
            String id3 = parameterSlot.getId();
            PhotoParameter.ImageUploadListWrapper value2 = ((PhotoParameter) parameterSlot).getValue();
            if (value2 != null && (onlyUploaded = value2.getOnlyUploaded()) != null) {
                List<ImageUploadResult> list2 = onlyUploaded;
                arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((ImageUploadResult) it3.next()).getUploadId());
                }
            }
            appendField(list, id3, arrayList2);
            return;
        }
        if (parameterSlot instanceof VideoUploadParameter) {
            String id4 = parameterSlot.getId();
            List<? extends VideoUploadParameterValue> value3 = ((VideoUploadParameter) parameterSlot).getValue();
            if (value3 != null && (videoUploadParameterValue = (VideoUploadParameterValue) C42745f0.G(value3)) != null) {
                id2 = videoUploadParameterValue.getId();
            }
            appendField(list, id4, Collections.singletonList(id2));
            return;
        }
        if (parameterSlot instanceof FileUploaderParameter) {
            String id5 = parameterSlot.getId();
            List<? extends FileUploadParameterValue> value4 = ((FileUploaderParameter) parameterSlot).getValue();
            if (value4 != null) {
                arrayList = new ArrayList();
                for (Object obj3 : value4) {
                    if (((FileUploadParameterValue) obj3).isUploaded()) {
                        arrayList.add(obj3);
                    }
                }
            }
            appendField(list, id5, arrayList);
            return;
        }
        if (parameterSlot instanceof GroupParameter) {
            List<ParameterSlot> parameters2 = ((GroupParameter) parameterSlot).getParameters();
            if (parameters2 == null) {
                parameters2 = C42784z0.f406748b;
            }
            Iterator<T> it4 = parameters2.iterator();
            while (it4.hasNext()) {
                appendToAttributesTree((ParameterSlot) it4.next(), list);
            }
            return;
        }
        if (parameterSlot instanceof DateTimeIntervalParameter) {
            Iterator<DateTimeParameter> it5 = ((DateTimeIntervalParameter) parameterSlot).getParameters().iterator();
            while (it5.hasNext()) {
                appendToAttributesTree((DateTimeParameter) it5.next(), list);
            }
            return;
        }
        if (parameterSlot instanceof DateTimeRangeParameter) {
            appendField(list, parameterSlot.getId(), ((DateTimeRangeParameter) parameterSlot).getParametersMap());
            return;
        }
        if (parameterSlot instanceof DateTimeParameter) {
            DateTimeParameter.Value value5 = ((DateTimeParameter) parameterSlot).getValue();
            if (value5 != null) {
                appendField(list, parameterSlot.getId(), DateTimeParameterKt.toFormValue(value5));
                return;
            }
            return;
        }
        if (parameterSlot instanceof PhoneParameter) {
            appendField(list, parameterSlot.getId(), this.phoneNumberFormatter.a(((PhoneParameter) parameterSlot).getValue()));
            return;
        }
        if (parameterSlot instanceof MultiselectParameter) {
            appendField(list, parameterSlot.getId(), ((MultiselectParameter) parameterSlot).getValue());
            return;
        }
        if (parameterSlot instanceof EditableParameter) {
            appendField(list, parameterSlot.getId(), ((EditableParameter) parameterSlot).getValue());
            return;
        }
        if (parameterSlot instanceof SlotWithState) {
            AttributeNode.ListNode listNode3 = new AttributeNode.ListNode(parameterSlot.getId(), null, 2, null);
            Iterator<T> it6 = ((SlotWithState) parameterSlot).getState().iterator();
            while (it6.hasNext()) {
                appendToAttributesTree((ParameterSlot) it6.next(), listNode3.getValue());
            }
            list.add(listNode3);
        }
    }

    private final void appendToFieldMap(Map<String, String> map, AttributeNode attributeNode, String str) {
        if (!(attributeNode instanceof AttributeNode.ListNode)) {
            if (attributeNode instanceof AttributeNode.StringNode) {
                StringBuilder sbB = C22491k0.b(str, '[');
                sbB.append(attributeNode.getId());
                sbB.append(']');
                map.put(sbB.toString(), ((AttributeNode.StringNode) attributeNode).getValue());
                return;
            }
            return;
        }
        for (AttributeNode attributeNode2 : ((AttributeNode.ListNode) attributeNode).getValue()) {
            StringBuilder sbB2 = C22491k0.b(str, '[');
            sbB2.append(attributeNode.getId());
            sbB2.append(']');
            appendToFieldMap(map, attributeNode2, sbB2.toString());
        }
    }

    public static /* synthetic */ void appendToFieldMap$default(AttributesTreeConverter attributesTreeConverter, Map map, AttributeNode attributeNode, String str, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            str = "";
        }
        attributesTreeConverter.appendToFieldMap(map, attributeNode, str);
    }

    private final Map<String, String> convertToAttributeMap(List<? extends AttributeNode> attributesTree, String key) {
        HashMap map = new HashMap();
        int i12 = 0;
        for (Object obj : attributesTree) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            appendToAttributeMap$default(this, map, (AttributeNode) obj, key + '[' + i12 + ']', false, 4, null);
            i12 = i13;
        }
        return map;
    }

    private final Map<String, String> convertToFieldMap(List<? extends AttributeNode> attributesTree, String key) {
        HashMap map = new HashMap();
        Iterator<T> it = attributesTree.iterator();
        while (it.hasNext()) {
            appendToFieldMap(map, (AttributeNode) it.next(), key);
        }
        return map;
    }

    @k
    public final List<AttributeNode> convertToAttributesTree(@k Iterable<? extends ParameterSlot> parameters) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ParameterSlot parameterSlot : parameters) {
            String id2 = parameterSlot.getId();
            int i12 = 0;
            while (true) {
                if (i12 >= id2.length()) {
                    arrayList2.add(parameterSlot);
                    break;
                }
                if (!Character.isDigit(id2.charAt(i12))) {
                    break;
                }
                i12++;
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            appendToAttributesTree((ParameterSlot) it.next(), arrayList);
        }
        return arrayList;
    }

    @k
    public final Map<String, String> convertToParameterAttributesMap(@k List<? extends AttributeNode> parametersTree) {
        return convertToAttributeMap(parametersTree, this.attributesKeyBase);
    }

    @k
    public final List<AttributeNode> convertToParameterAttributesTree(@k Iterable<? extends ParameterSlot> parameters) {
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : parameters) {
            if (!(parameterSlot instanceof SlotWithState)) {
                arrayList.add(parameterSlot);
            }
        }
        return convertToAttributesTree(arrayList);
    }

    @k
    public final Map<String, String> convertToParameterFieldMap(@k List<? extends AttributeNode> attributesTree) {
        return convertToFieldMap(attributesTree, this.paramKeyBase);
    }

    @k
    public final Map<String, String> convertToSlotAttributesMap(@k List<? extends AttributeNode> slotsTree) {
        return convertToAttributeMap(slotsTree, this.slotKeyBase);
    }

    @k
    public final List<AttributeNode> convertToSlotAttributesTree(@k Iterable<? extends ParameterSlot> parameters) {
        ArrayList arrayList = new ArrayList();
        for (ParameterSlot parameterSlot : parameters) {
            if (parameterSlot instanceof SlotWithState) {
                arrayList.add(parameterSlot);
            }
        }
        return convertToAttributesTree(arrayList);
    }

    @k
    public final Map<String, String> convertToSlotFieldMap(@k List<? extends AttributeNode> attributesTree) {
        return convertToFieldMap(attributesTree, this.slotKeyBase);
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

    public AttributesTreeConverter(@k String str, @k String str2, @k String str3, @k InterfaceC35945t1<String> interfaceC35945t1) {
        this.paramKeyBase = str;
        this.slotKeyBase = str2;
        this.attributesKeyBase = str3;
        this.phoneNumberFormatter = interfaceC35945t1;
    }

    public /* synthetic */ AttributesTreeConverter(String str, String str2, String str3, InterfaceC35945t1 interfaceC35945t1, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "params" : str, (i12 & 2) != 0 ? "slots" : str2, (i12 & 4) != 0 ? Navigation.ATTRIBUTES : str3, (i12 & 8) != 0 ? new C35883r4() : interfaceC35945t1);
    }
}
