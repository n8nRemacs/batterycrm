package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceProduct;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class Ya {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f379957a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f379958b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final List<String> f379959c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final Map<String, String> f379960d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final Xa f379961e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final Xa f379962f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public final List<String> f379963g;

    public Ya(@j.N ECommerceProduct eCommerceProduct) {
        this(eCommerceProduct.getSku(), eCommerceProduct.getName(), A2.a((Collection) eCommerceProduct.getCategoriesPath()), A2.c(eCommerceProduct.getPayload()), eCommerceProduct.getActualPrice() == null ? null : new Xa(eCommerceProduct.getActualPrice()), eCommerceProduct.getOriginalPrice() == null ? null : new Xa(eCommerceProduct.getOriginalPrice()), A2.a((Collection) eCommerceProduct.getPromocodes()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProductWrapper{sku='");
        sb2.append(this.f379957a);
        sb2.append("', name='");
        sb2.append(this.f379958b);
        sb2.append("', categoriesPath=");
        sb2.append(this.f379959c);
        sb2.append(", payload=");
        sb2.append(this.f379960d);
        sb2.append(", actualPrice=");
        sb2.append(this.f379961e);
        sb2.append(", originalPrice=");
        sb2.append(this.f379962f);
        sb2.append(", promocodes=");
        return androidx.compose.foundation.H.p(sb2, this.f379963g, '}');
    }

    @j.k0
    public Ya(@j.N String str, @j.P String str2, @j.P List<String> list, @j.P Map<String, String> map, @j.P Xa xa2, @j.P Xa xa3, @j.P List<String> list2) {
        this.f379957a = str;
        this.f379958b = str2;
        this.f379959c = list;
        this.f379960d = map;
        this.f379961e = xa2;
        this.f379962f = xa3;
        this.f379963g = list2;
    }
}
