package com.yandex.metrica.ecommerce;

import androidx.compose.foundation.H;
import j.N;
import j.P;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class ECommerceProduct {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final String f377675a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public String f377676b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public List<String> f377677c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public Map<String, String> f377678d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public ECommercePrice f377679e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public ECommercePrice f377680f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public List<String> f377681g;

    public ECommerceProduct(@N String str) {
        this.f377675a = str;
    }

    @P
    public ECommercePrice getActualPrice() {
        return this.f377679e;
    }

    @P
    public List<String> getCategoriesPath() {
        return this.f377677c;
    }

    @P
    public String getName() {
        return this.f377676b;
    }

    @P
    public ECommercePrice getOriginalPrice() {
        return this.f377680f;
    }

    @P
    public Map<String, String> getPayload() {
        return this.f377678d;
    }

    @P
    public List<String> getPromocodes() {
        return this.f377681g;
    }

    @N
    public String getSku() {
        return this.f377675a;
    }

    @N
    public ECommerceProduct setActualPrice(@P ECommercePrice eCommercePrice) {
        this.f377679e = eCommercePrice;
        return this;
    }

    @N
    public ECommerceProduct setCategoriesPath(@P List<String> list) {
        this.f377677c = list;
        return this;
    }

    @N
    public ECommerceProduct setName(@P String str) {
        this.f377676b = str;
        return this;
    }

    @N
    public ECommerceProduct setOriginalPrice(@P ECommercePrice eCommercePrice) {
        this.f377680f = eCommercePrice;
        return this;
    }

    @N
    public ECommerceProduct setPayload(@P Map<String, String> map) {
        this.f377678d = map;
        return this;
    }

    @N
    public ECommerceProduct setPromocodes(@P List<String> list) {
        this.f377681g = list;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ECommerceProduct{sku='");
        sb2.append(this.f377675a);
        sb2.append("', name='");
        sb2.append(this.f377676b);
        sb2.append("', categoriesPath=");
        sb2.append(this.f377677c);
        sb2.append(", payload=");
        sb2.append(this.f377678d);
        sb2.append(", actualPrice=");
        sb2.append(this.f377679e);
        sb2.append(", originalPrice=");
        sb2.append(this.f377680f);
        sb2.append(", promocodes=");
        return H.p(sb2, this.f377681g, '}');
    }
}
