package io.ktor.util;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: StringValues.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class G0 {
    @Y61.k
    public static final void a(@Y61.k A0 a02, @Y61.k A0 a03) {
        Iterator<T> it = a03.b().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a02.c((List) entry.getValue(), (String) entry.getKey());
        }
    }
}
