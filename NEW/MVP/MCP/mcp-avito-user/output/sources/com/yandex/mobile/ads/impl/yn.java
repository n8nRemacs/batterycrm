package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class yn extends AbstractC39344m {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f392024b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final List<mu0> f392025c;

    public yn(@j.N String str, @j.N String str2, @j.N ArrayList arrayList) {
        super(str);
        this.f392024b = str2;
        this.f392025c = arrayList;
    }

    @j.N
    public final String b() {
        return this.f392024b;
    }

    @j.N
    public final List<mu0> c() {
        return this.f392025c;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39344m
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yn.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        yn ynVar = (yn) obj;
        if (this.f392024b.equals(ynVar.f392024b)) {
            return this.f392025c.equals(ynVar.f392025c);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC39344m
    public final int hashCode() {
        return this.f392025c.hashCode() + v2.a(this.f392024b, super.hashCode() * 31, 31);
    }
}
