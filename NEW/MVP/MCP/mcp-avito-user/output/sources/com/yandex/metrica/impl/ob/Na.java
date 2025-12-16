package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Vm;

/* loaded from: classes7.dex */
public class Na<R, M extends Vm> implements Vm {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final R f378989a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final M f378990b;

    public Na(@j.N R r12, @j.N M m12) {
        this.f378989a = r12;
        this.f378990b = m12;
    }

    @Override // com.yandex.metrica.impl.ob.Vm
    public int a() {
        return this.f378990b.a();
    }

    @j.N
    public String toString() {
        return "Result{result=" + this.f378989a + ", metaInfo=" + this.f378990b + '}';
    }
}
