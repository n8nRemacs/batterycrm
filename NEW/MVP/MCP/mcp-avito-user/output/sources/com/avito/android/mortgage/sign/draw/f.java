package com.avito.android.mortgage.sign.draw;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: SvgUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f {
    public static String a(List list, Integer num, Integer num2) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder("<svg xmlns=\"http://www.w3.org/2000/svg\"");
        String str = " width=\"" + num + "\" height=\"" + num2 + '\"';
        if (num == null || num.intValue() == 0 || num2 == null || num2.intValue() == 0) {
            str = null;
        }
        sb3.append(str);
        sb3.append('>');
        sb2.append(sb3.toString());
        sb2.append("\n");
        return AK.c.s(sb2, C42745f0.O(list, "\n", null, null, new e(1), 30), "\n</svg>");
    }
}
