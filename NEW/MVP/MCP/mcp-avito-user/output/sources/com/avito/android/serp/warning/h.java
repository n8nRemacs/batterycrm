package com.avito.android.serp.warning;

import Y61.k;
import kotlin.Metadata;

/* compiled from: WarningStateStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/warning/h;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface h {
    @k
    WarningState a(@k String str);

    void b(@k String str);

    boolean c(@k String str);

    void d(@k WarningStateStorageState warningStateStorageState);

    @k
    WarningStateStorageState d0();

    @k
    String name();
}
