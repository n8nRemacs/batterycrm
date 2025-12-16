package com.avito.android.remote.model.payment.service;

import Y61.k;
import android.net.Uri;
import android.net.UrlQuerySanitizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43054k;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;

/* compiled from: OrderItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, d2 = {"parseOrderItemSet", "", "Lcom/avito/android/remote/model/payment/service/OrderItem;", "Landroid/net/Uri;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class OrderItemKt {
    @k
    public static final Set<OrderItem> parseOrderItemSet(@k Uri uri) {
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer(uri.toString());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<UrlQuerySanitizer.ParameterValuePair> parameterList = urlQuerySanitizer.getParameterList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameterList) {
            if (new C43059p("^orderItems\\[\\d\\]\\[\\w+\\]$").e(((UrlQuerySanitizer.ParameterValuePair) obj).mParameter)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            UrlQuerySanitizer.ParameterValuePair parameterValuePair = (UrlQuerySanitizer.ParameterValuePair) it.next();
            InterfaceC43057n interfaceC43057nB = C43059p.b(new C43059p("^orderItems\\[(\\d)\\]\\[(\\w+)\\]$"), parameterValuePair.mParameter);
            if (interfaceC43057nB != null) {
                C43054k c43054kA = interfaceC43057nB.getF410617c().a(1);
                String str = c43054kA != null ? c43054kA.f410612a : null;
                C43054k c43054kA2 = interfaceC43057nB.getF410617c().a(2);
                String str2 = c43054kA2 != null ? c43054kA2.f410612a : null;
                String str3 = parameterValuePair.mValue;
                if (str != null && str2 != null) {
                    Map linkedHashMap2 = (Map) linkedHashMap.get(str);
                    if (linkedHashMap2 == null) {
                        linkedHashMap2 = new LinkedHashMap();
                    }
                    linkedHashMap2.put(str2, str3);
                    linkedHashMap.put(str, linkedHashMap2);
                }
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Map) entry.getValue()).containsKey("serviceSlug") && ((Map) entry.getValue()).containsKey("externalId")) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap3.size());
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            arrayList2.add(new OrderItem((String) ((Map) entry2.getValue()).get("serviceSlug"), (String) ((Map) entry2.getValue()).get("externalId")));
        }
        return C42745f0.P0(arrayList2);
    }
}
