package com.yandex.metrica.impl.ob;

import java.util.LinkedList;

/* loaded from: classes7.dex */
public class J4 extends K4<X4> {

    /* renamed from: a, reason: collision with root package name */
    private final C38845h5 f378561a;

    /* renamed from: b, reason: collision with root package name */
    private final K5 f378562b;

    /* renamed from: c, reason: collision with root package name */
    private final C38745d5 f378563c;

    public J4(L3 l32) {
        this.f378561a = new C38845h5(l32);
        this.f378562b = new K5(l32);
        this.f378563c = new C38745d5(l32);
    }

    @Override // com.yandex.metrica.impl.ob.K4
    public H4 a(int i12) {
        LinkedList linkedList = new LinkedList();
        int iOrdinal = EnumC38666a1.a(i12).ordinal();
        if (iOrdinal == 1) {
            linkedList.add(this.f378561a);
        } else if (iOrdinal == 3) {
            linkedList.add(this.f378563c);
        } else if (iOrdinal == 40) {
            linkedList.add(this.f378562b);
            linkedList.add(this.f378561a);
        }
        return new H4(linkedList);
    }
}
