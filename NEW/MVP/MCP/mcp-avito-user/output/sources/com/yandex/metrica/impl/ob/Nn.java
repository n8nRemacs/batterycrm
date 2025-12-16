package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
class Nn implements Kn<Integer> {
    @Override // com.yandex.metrica.impl.ob.Kn
    public In a(@j.P Integer num) {
        if (num == null || num.intValue() > 0) {
            return In.a(this);
        }
        return In.a(this, "Invalid quantity value " + num);
    }
}
