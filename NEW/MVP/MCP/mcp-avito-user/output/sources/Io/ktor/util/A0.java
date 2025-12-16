package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: StringValues.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/A0;", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface A0 {
    @Y61.l
    List<String> a(@Y61.k String str);

    @Y61.k
    Set<Map.Entry<String, List<String>>> b();

    void c(@Y61.k Iterable iterable, @Y61.k String str);

    @Y61.k
    Set<String> names();
}
