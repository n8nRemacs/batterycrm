package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.en, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38788en<T> implements InterfaceC38813fn<T> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final InterfaceC38813fn<T> f380508a;

    public C38788en(@j.N InterfaceC38813fn<T> interfaceC38813fn, @j.P T t12) {
        this.f380508a = interfaceC38813fn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC38813fn
    @j.P
    public T a(@j.P T t12) {
        return t12 != this.f380508a.a(t12) ? "<truncated data was not sent, see METRIKALIB-4568>" : t12;
    }
}
