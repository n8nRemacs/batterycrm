package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes8.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f387510a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final Map<String, String> f387511b;

    public li(@Y61.k String str, @Y61.k Map<String, String> map) {
        this.f387510a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            linkedHashMap.put(key != null ? key.toLowerCase(Locale.US) : null, entry.getValue());
        }
        this.f387511b = Collections.unmodifiableMap(linkedHashMap);
    }

    @X41.i
    @Y61.k
    public final Charset a() {
        String str = this.f387511b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    @Y61.l
    @X41.i
    public final String b() {
        return this.f387511b.get("realm");
    }

    @X41.i
    @Y61.k
    public final String c() {
        return this.f387510a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof li) {
            li liVar = (li) obj;
            if (kotlin.jvm.internal.L.f(liVar.f387510a, this.f387510a) && kotlin.jvm.internal.L.f(liVar.f387511b, this.f387511b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f387511b.hashCode() + v2.a(this.f387510a, 899, 31);
    }

    @Y61.k
    public final String toString() {
        return this.f387510a + " authParams=" + this.f387511b;
    }
}
