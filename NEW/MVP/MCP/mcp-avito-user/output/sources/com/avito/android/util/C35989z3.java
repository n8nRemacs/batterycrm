package com.avito.android.util;

import com.avito.android.payment.ParametersTree;
import com.avito.android.remote.model.IterableParameters;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: ParameterTrees.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_payment-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.z3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35989z3 {
    @Y61.k
    public static final LinkedHashMap a(@Y61.k ParametersTree parametersTree) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        parametersTree.getClass();
        Iterator<ParameterSlot> it = IterableParameters.DefaultImpls.iterator(parametersTree);
        while (it.hasNext()) {
            ParameterSlot next = it.next();
            if (next instanceof EditableParameter) {
                String id2 = next.getId();
                Object value = ((EditableParameter) next).getValue();
                String string = value != null ? value.toString() : null;
                if (string == null) {
                    string = "";
                }
                linkedHashMap.put(id2, string);
            }
        }
        return linkedHashMap;
    }
}
