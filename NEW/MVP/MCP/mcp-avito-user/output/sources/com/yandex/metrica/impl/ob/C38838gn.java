package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Vm;

/* renamed from: com.yandex.metrica.impl.ob.gn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38838gn<V, M extends Vm> implements Vm {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final V f380668a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final M f380669b;

    public C38838gn(@j.P V v12, @j.N M m12) {
        this.f380668a = v12;
        this.f380669b = m12;
    }

    @Override // com.yandex.metrica.impl.ob.Vm
    public int a() {
        return this.f380669b.a();
    }

    @j.N
    public String toString() {
        return "TrimmingResult{value=" + this.f380668a + ", metaInfo=" + this.f380669b + '}';
    }
}
