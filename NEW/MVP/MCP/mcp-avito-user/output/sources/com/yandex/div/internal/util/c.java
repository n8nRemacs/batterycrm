package com.yandex.div.internal.util;

import java.util.List;
import kotlin.Metadata;

/* compiled from: Collections.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"utils_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c {
    public static final boolean a(@Y61.k List<?>... listArr) {
        int length = listArr.length;
        int i12 = 0;
        while (i12 < length) {
            List<?> list = listArr[i12];
            i12++;
            List<?> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
