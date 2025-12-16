package com.android.volley;

import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NetworkResponse.java */
/* loaded from: classes10.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f67099a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f67100b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Map<String, String> f67101c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final List<o> f67102d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f67103e;

    @Deprecated
    public r() {
        throw null;
    }

    public r(int i12, byte[] bArr, @P Map map, @P List list, boolean z12) {
        this.f67099a = i12;
        this.f67100b = bArr;
        this.f67101c = map;
        if (list == null) {
            this.f67102d = null;
        } else {
            this.f67102d = Collections.unmodifiableList(list);
        }
        this.f67103e = z12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    public r(int i12, byte[] bArr, boolean z12, @P List list) {
        Map treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                treeMap.put(oVar.f67092a, oVar.f67093b);
            }
        }
        this(i12, bArr, treeMap, list, z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Deprecated
    public r(byte[] bArr, @P Map<String, String> map) {
        List arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new o(entry.getKey(), entry.getValue()));
            }
        }
        this(200, bArr, map, arrayList, false);
    }
}
