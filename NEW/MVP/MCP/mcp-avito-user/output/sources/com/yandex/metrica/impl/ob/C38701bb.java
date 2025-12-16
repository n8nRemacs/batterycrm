package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceScreen;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.bb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38701bb {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f380196a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final List<String> f380197b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final String f380198c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final Map<String, String> f380199d;

    public C38701bb(@j.N ECommerceScreen eCommerceScreen) {
        this(eCommerceScreen.getName(), A2.a((Collection) eCommerceScreen.getCategoriesPath()), eCommerceScreen.getSearchQuery(), A2.c(eCommerceScreen.getPayload()));
    }

    @j.N
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenWrapper{name='");
        sb2.append(this.f380196a);
        sb2.append("', categoriesPath=");
        sb2.append(this.f380197b);
        sb2.append(", searchQuery='");
        sb2.append(this.f380198c);
        sb2.append("', payload=");
        return androidx.appcompat.app.r.w(sb2, this.f380199d, '}');
    }

    @j.k0
    public C38701bb(@j.P String str, @j.P List<String> list, @j.P String str2, @j.P Map<String, String> map) {
        this.f380196a = str;
        this.f380197b = list;
        this.f380198c = str2;
        this.f380199d = map;
    }
}
