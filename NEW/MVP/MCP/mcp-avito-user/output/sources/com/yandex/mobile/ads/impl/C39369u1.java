package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.u1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39369u1 {
    @j.N
    public static EnumC39381y1 a(@j.P String str) {
        EnumC39381y1 enumC39381y1 = EnumC39381y1.f391879d;
        if (str == null) {
            return enumC39381y1;
        }
        switch (str) {
            case "preroll":
                return EnumC39381y1.f391876a;
            case "postroll":
                return EnumC39381y1.f391878c;
            case "midroll":
                return EnumC39381y1.f391877b;
            default:
                return enumC39381y1;
        }
    }
}
