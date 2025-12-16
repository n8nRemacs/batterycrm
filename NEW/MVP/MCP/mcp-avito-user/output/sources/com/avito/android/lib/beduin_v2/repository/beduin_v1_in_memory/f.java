package com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BeduinV1StorageAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/f;", "", "_design-modules_beduin-v2_interactions_repository_common_beduin-v1-in-memory_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface f {
    void a(@k LinkedHashMap linkedHashMap, @k String str);

    @l
    Map<String, Object> get(@k String str);

    void remove(@k String str);
}
