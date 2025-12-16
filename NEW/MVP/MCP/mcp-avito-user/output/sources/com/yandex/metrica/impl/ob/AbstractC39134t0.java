package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.t0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39134t0<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final Zl<EnumC39158u0, Integer> f381851a;

    public AbstractC39134t0() {
        Zl<EnumC39158u0, Integer> zl2 = new Zl<>(0);
        zl2.a(EnumC39158u0.UNDEFINED, 0);
        zl2.a(EnumC39158u0.APP, 1);
        zl2.a(EnumC39158u0.SATELLITE, 2);
        zl2.a(EnumC39158u0.RETAIL, 3);
        this.f381851a = zl2;
    }

    @Y61.k
    public final Zl<EnumC39158u0, Integer> a() {
        return this.f381851a;
    }

    public abstract boolean a(T t12, T t13);
}
