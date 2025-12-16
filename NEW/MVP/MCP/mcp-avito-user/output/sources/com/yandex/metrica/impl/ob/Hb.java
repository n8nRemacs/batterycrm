package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public class Hb implements Gb {

    /* renamed from: a, reason: collision with root package name */
    private final int f378251a;

    /* renamed from: b, reason: collision with root package name */
    private final int f378252b;

    /* renamed from: c, reason: collision with root package name */
    private int f378253c = 0;

    public Hb(int i12, int i13) {
        this.f378251a = i12;
        this.f378252b = i13;
    }

    @Override // com.yandex.metrica.impl.ob.Gb
    public int a() {
        return this.f378252b;
    }

    @Override // com.yandex.metrica.impl.ob.Gb
    public boolean b() {
        int i12 = this.f378253c;
        this.f378253c = i12 + 1;
        return i12 < this.f378251a;
    }

    @Override // com.yandex.metrica.impl.ob.Gb
    public void c() {
        this.f378253c = 0;
    }
}
