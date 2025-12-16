package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;

/* renamed from: com.yandex.metrica.impl.ob.de, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38754de implements Converter {
    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer fromModel(@j.N EnumC39158u0 enumC39158u0) {
        int iOrdinal = enumC39158u0.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // com.yandex.metrica.core.api.Converter
    @j.N
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC39158u0 toModel(@j.N Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            return EnumC39158u0.APP;
        }
        if (iIntValue == 2) {
            return EnumC39158u0.RETAIL;
        }
        if (iIntValue != 3) {
            return EnumC39158u0.UNDEFINED;
        }
        return EnumC39158u0.SATELLITE;
    }
}
