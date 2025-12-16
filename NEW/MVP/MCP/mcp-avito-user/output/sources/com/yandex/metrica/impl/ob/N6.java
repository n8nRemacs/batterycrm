package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;

/* loaded from: classes7.dex */
public class N6 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final O6<H6> f378975a;

    public N6() {
        this(new O6(new X6()));
    }

    @j.N
    public byte[] a(@j.N H6 h62) {
        return this.f378975a.a(h62);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object fromModel(@j.N Object obj) {
        return this.f378975a.a((H6) obj);
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    public Object toModel(@j.N Object obj) {
        throw new UnsupportedOperationException();
    }

    @j.k0
    public N6(@j.N O6<H6> o62) {
        this.f378975a = o62;
    }
}
