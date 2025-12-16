package com.avito.android.beduin.common.storage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BeduinParametersStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/storage/c;", "", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {
    void a(@Y61.k LinkedHashMap linkedHashMap, @Y61.k String str);

    @Y61.l
    Map<String, Object> get(@Y61.k String str);

    void remove(@Y61.k String str);
}
