package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public final class zo0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f392315a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f392316b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final Map<String, String> f392317c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final List<dz> f392318d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f392319e;

    @Deprecated
    public zo0(int i12, byte[] bArr, @j.P Map map, boolean z12) {
        this(i12, bArr, map, a((Map<String, String>) map), z12);
    }

    @j.P
    private static Map<String, String> a(@j.P List<dz> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (dz dzVar : list) {
            treeMap.put(dzVar.a(), dzVar.b());
        }
        return treeMap;
    }

    public zo0(int i12, byte[] bArr, boolean z12, long j12, @j.P List<dz> list) {
        this(i12, bArr, a(list), list, z12);
    }

    @Deprecated
    public zo0(int i12, byte[] bArr, @j.P Map map) {
        this(i12, bArr, map, true);
    }

    @Deprecated
    public zo0(byte[] bArr, @j.P Map<String, String> map) {
        this(200, bArr, map, false);
    }

    private zo0(int i12, byte[] bArr, @j.P Map map, @j.P List list, boolean z12) {
        this.f392315a = i12;
        this.f392316b = bArr;
        this.f392317c = map;
        if (list == null) {
            this.f392318d = null;
        } else {
            this.f392318d = Collections.unmodifiableList(list);
        }
        this.f392319e = z12;
    }

    @j.P
    private static List<dz> a(@j.P Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new dz(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }
}
