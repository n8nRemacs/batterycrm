package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.models.ad.JavaScriptResource;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class xd1 implements oi1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f391701a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final JavaScriptResource f391702b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f391703c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final Map<String, List<String>> f391704d;

    public xd1(@j.N String str, @j.P JavaScriptResource javaScriptResource, @j.P String str2, @j.N HashMap map) {
        this.f391701a = str;
        this.f391702b = javaScriptResource;
        this.f391703c = str2;
        this.f391704d = map;
    }

    @Override // com.yandex.mobile.ads.impl.oi1
    @j.N
    public final Map<String, List<String>> a() {
        return Collections.unmodifiableMap(this.f391704d);
    }

    @j.P
    public final JavaScriptResource b() {
        return this.f391702b;
    }

    @j.P
    public final String c() {
        return this.f391703c;
    }

    @j.N
    public final String d() {
        return this.f391701a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xd1.class != obj.getClass()) {
            return false;
        }
        xd1 xd1Var = (xd1) obj;
        if (!this.f391701a.equals(xd1Var.f391701a)) {
            return false;
        }
        JavaScriptResource javaScriptResource = this.f391702b;
        if (javaScriptResource == null ? xd1Var.f391702b != null : !javaScriptResource.equals(xd1Var.f391702b)) {
            return false;
        }
        String str = this.f391703c;
        if (str == null ? xd1Var.f391703c == null : str.equals(xd1Var.f391703c)) {
            return this.f391704d.equals(xd1Var.f391704d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f391701a.hashCode() * 31;
        JavaScriptResource javaScriptResource = this.f391702b;
        int iHashCode2 = (iHashCode + (javaScriptResource != null ? javaScriptResource.hashCode() : 0)) * 31;
        String str = this.f391703c;
        return this.f391704d.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
