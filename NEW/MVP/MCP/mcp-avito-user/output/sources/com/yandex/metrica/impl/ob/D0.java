package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public enum D0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a, reason: collision with root package name */
    public final int f377925a;

    D0(int i12) {
        this.f377925a = i12;
    }

    @j.N
    public static D0 a(@j.P Integer num) {
        if (num != null) {
            D0[] d0ArrValues = values();
            for (int i12 = 0; i12 < 3; i12++) {
                D0 d02 = d0ArrValues[i12];
                if (d02.f377925a == num.intValue()) {
                    return d02;
                }
            }
        }
        return UNKNOWN;
    }
}
