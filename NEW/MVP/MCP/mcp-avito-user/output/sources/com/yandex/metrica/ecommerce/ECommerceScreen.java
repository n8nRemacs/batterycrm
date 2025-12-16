package com.yandex.metrica.ecommerce;

import androidx.appcompat.app.r;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ECommerceScreen {

    /* renamed from: a, reason: collision with root package name */
    @P
    public String f377685a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public List<String> f377686b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public String f377687c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public Map<String, String> f377688d;

    @P
    public List<String> getCategoriesPath() {
        return this.f377686b;
    }

    @P
    public String getName() {
        return this.f377685a;
    }

    @P
    public Map<String, String> getPayload() {
        return this.f377688d;
    }

    @P
    public String getSearchQuery() {
        return this.f377687c;
    }

    public ECommerceScreen setCategoriesPath(@P List<String> list) {
        this.f377686b = list;
        return this;
    }

    public ECommerceScreen setName(@P String str) {
        this.f377685a = str;
        return this;
    }

    public ECommerceScreen setPayload(@P Map<String, String> map) {
        this.f377688d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@P String str) {
        this.f377687c = str;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceScreen{name='");
        sb2.append(this.f377685a);
        sb2.append("', categoriesPath=");
        sb2.append(this.f377686b);
        sb2.append(", searchQuery='");
        sb2.append(this.f377687c);
        sb2.append("', payload=");
        return r.w(sb2, this.f377688d, '}');
    }
}
