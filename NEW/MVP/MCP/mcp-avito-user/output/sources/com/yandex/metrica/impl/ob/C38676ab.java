package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceReferrer;

/* renamed from: com.yandex.metrica.impl.ob.ab, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38676ab {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f380116a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f380117b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final C38701bb f380118c;

    public C38676ab(@j.N ECommerceReferrer eCommerceReferrer) {
        this(eCommerceReferrer.getType(), eCommerceReferrer.getIdentifier(), eCommerceReferrer.getScreen() == null ? null : new C38701bb(eCommerceReferrer.getScreen()));
    }

    public String toString() {
        return "ReferrerWrapper{type='" + this.f380116a + "', identifier='" + this.f380117b + "', screen=" + this.f380118c + '}';
    }

    @j.k0
    public C38676ab(@j.P String str, @j.P String str2, @j.P C38701bb c38701bb) {
        this.f380116a = str;
        this.f380117b = str2;
        this.f380118c = c38701bb;
    }
}
