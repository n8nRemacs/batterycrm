package com.yandex.metrica.impl.ob;

/* loaded from: classes7.dex */
public enum Em {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a, reason: collision with root package name */
    private final int f378086a;

    Em(int i12) {
        this.f378086a = i12;
    }

    public int a() {
        return this.f378086a;
    }

    @j.N
    public static Em a(@j.P Integer num) {
        if (num != null) {
            Em[] emArrValues = values();
            for (int i12 = 0; i12 < 3; i12++) {
                Em em2 = emArrValues[i12];
                if (em2.f378086a == num.intValue()) {
                    return em2;
                }
            }
        }
        return NONE;
    }
}
