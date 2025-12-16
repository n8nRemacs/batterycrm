package com.yandex.mobile.ads.impl;

import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class vq {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f390965a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final JSONObject f390966b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final JSONObject f390967c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final List<b30> f390968d;

    public vq(@j.N String str, @j.N JSONObject jSONObject, @j.P JSONObject jSONObject2, @j.P List<b30> list) {
        this.f390965a = str;
        this.f390966b = jSONObject;
        this.f390967c = jSONObject2;
        this.f390968d = list;
    }

    @j.N
    public final JSONObject a() {
        return this.f390966b;
    }

    @j.P
    public final List<b30> b() {
        return this.f390968d;
    }

    @j.N
    public final String c() {
        return this.f390965a;
    }

    @j.P
    public final JSONObject d() {
        return this.f390967c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vq.class != obj.getClass()) {
            return false;
        }
        vq vqVar = (vq) obj;
        if (!this.f390965a.equals(vqVar.f390965a) || !this.f390966b.equals(vqVar.f390966b)) {
            return false;
        }
        JSONObject jSONObject = this.f390967c;
        if (jSONObject == null ? vqVar.f390967c != null : !jSONObject.equals(vqVar.f390967c)) {
            return false;
        }
        List<b30> list = this.f390968d;
        List<b30> list2 = vqVar.f390968d;
        return list != null ? list.equals(list2) : list2 == null;
    }

    public final int hashCode() {
        int iA2 = v2.a(this.f390965a, this.f390966b.hashCode() * 31, 31);
        JSONObject jSONObject = this.f390967c;
        int iHashCode = (iA2 + (jSONObject != null ? jSONObject.hashCode() : 0)) * 31;
        List<b30> list = this.f390968d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
