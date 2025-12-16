package com.avito.android.util;

import android.content.res.ColorStateList;
import kotlin.Metadata;

/* compiled from: ColorStateListProps.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35771d0 {
    public static C35763c0 a(C35763c0 c35763c0, Integer num, Integer num2, Integer num3, Integer num4, int i12) {
        if ((i12 & 2) != 0) {
            num2 = null;
        }
        if ((i12 & 4) != 0) {
            num3 = null;
        }
        if ((i12 & 8) != 0) {
            num4 = null;
        }
        if (c35763c0 == null) {
            if (num == null) {
                return null;
            }
            return new C35763c0(num.intValue(), num2, num3, num4);
        }
        int iIntValue = c35763c0.f318848a;
        int iIntValue2 = num != null ? num.intValue() : iIntValue;
        Integer numValueOf = Integer.valueOf((num2 == null && (num2 = c35763c0.f318849b) == null) ? iIntValue : num2.intValue());
        Integer numValueOf2 = Integer.valueOf((num3 == null && (num3 = c35763c0.f318850c) == null) ? iIntValue : num3.intValue());
        if (num4 != null) {
            iIntValue = num4.intValue();
        } else {
            Integer num5 = c35763c0.f318851d;
            if (num5 != null) {
                iIntValue = num5.intValue();
            }
        }
        return new C35763c0(iIntValue2, numValueOf, numValueOf2, Integer.valueOf(iIntValue));
    }

    public static C35763c0 b(ColorStateList colorStateList) {
        return new C35763c0(colorStateList, false);
    }
}
