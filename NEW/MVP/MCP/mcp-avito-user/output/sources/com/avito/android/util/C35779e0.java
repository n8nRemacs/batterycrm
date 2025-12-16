package com.avito.android.util;

import android.R;
import android.content.res.ColorStateList;
import kotlin.Metadata;

/* compiled from: ColorStateLists.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.e0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35779e0 {
    @Y61.l
    public static final Integer a(@Y61.k ColorStateList colorStateList) {
        Integer numValueOf = Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled, R.attr.state_pressed, com.avito.android.R.attr.state_ripple}, 0));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }
}
