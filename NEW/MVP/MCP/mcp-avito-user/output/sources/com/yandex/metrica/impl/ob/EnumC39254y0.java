package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.y0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39254y0 {
    NATIVE(0),
    JS(1);


    /* renamed from: a, reason: collision with root package name */
    public final int f382217a;

    EnumC39254y0(int i12) {
        this.f382217a = i12;
    }

    @j.N
    public static EnumC39254y0 a(int i12) {
        EnumC39254y0[] enumC39254y0ArrValues = values();
        for (int i13 = 0; i13 < 2; i13++) {
            EnumC39254y0 enumC39254y0 = enumC39254y0ArrValues[i13];
            if (enumC39254y0.f382217a == i12) {
                return enumC39254y0;
            }
        }
        return NATIVE;
    }
}
