package com.huawei.hms.framework.common.hianalytics;

import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public class LinkedHashMapPack {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap<String, String> f363485a = new LinkedHashMap<>();

    public LinkedHashMap<String, String> getAll() {
        return this.f363485a;
    }

    public LinkedHashMapPack put(String str, String str2) {
        if (str != null && str2 != null) {
            this.f363485a.put(str, str2);
        }
        return this;
    }

    public LinkedHashMapPack putIfNotDefault(String str, long j12, long j13) {
        return j12 == j13 ? this : put(str, j12);
    }

    public LinkedHashMapPack put(String str, boolean z12) {
        if (str != null) {
            LinkedHashMap<String, String> linkedHashMap = this.f363485a;
            if (z12) {
                linkedHashMap.put(str, "1");
            } else {
                linkedHashMap.put(str, "0");
            }
        }
        return this;
    }

    public LinkedHashMapPack put(String str, long j12) {
        if (str != null) {
            this.f363485a.put(str, "" + j12);
        }
        return this;
    }
}
