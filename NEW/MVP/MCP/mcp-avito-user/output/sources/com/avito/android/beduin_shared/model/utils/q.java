package com.avito.android.beduin_shared.model.utils;

import com.avito.android.beduin_models.BeduinModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import oj.InterfaceC44784a;

/* compiled from: ParametersExtractionStrategies.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin-shared_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {
    @Y61.k
    public static final Map<String, Object> a(@Y61.l List<? extends BeduinModel> list, @Y61.k InterfaceC44784a<BeduinModel> interfaceC44784a) {
        if (list == null) {
            return P0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(interfaceC44784a.m((BeduinModel) it.next()));
        }
        return linkedHashMap;
    }
}
