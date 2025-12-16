package com.avito.avcalls.android.utils;

import androidx.compose.foundation.H;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ToStringExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {
    @Y61.k
    public static final String a(@Y61.l String str) {
        if (str == null) {
            return "null";
        }
        if (C43066x.h0(str, "ru.avito://", false)) {
            str = C43066x.x(11, str);
        }
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '?') {
                return str.substring(0, i12);
            }
        }
        return str;
    }

    @Y61.k
    public static final String b(@Y61.l Map<?, ?> map) {
        if (map == null) {
            return "null";
        }
        StringBuilder sbR = H.r("{");
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            entry.getValue();
            if (sbR.length() > 1) {
                sbR.append(", ");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(key);
            sb2.append('=');
            C43066x.k(sbR, sb2.toString(), "***");
        }
        sbR.append("}");
        return sbR.toString();
    }

    @Y61.k
    public static final String c(@Y61.k String str) {
        return "RawMessage(size=" + str.length() + ", hash=" + str.hashCode() + ')';
    }
}
