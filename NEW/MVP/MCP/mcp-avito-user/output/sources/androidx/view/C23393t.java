package androidx.view;

import Y41.l;
import Y61.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: NavArgument.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23393t {
    @k
    public static final ArrayList a(@k LinkedHashMap linkedHashMap, @k l lVar) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C23389r c23389r = (C23389r) entry.getValue();
            if (c23389r != null && !c23389r.f53172b && !c23389r.f53173c) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) lVar.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
