package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.C42745f0;

/* loaded from: classes8.dex */
public final class y2 {
    @X41.n
    public static final void a(@Y61.k String str, @Y61.k ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        h70.a(String.format("Found following errors for %s ad type: %s", Arrays.copyOf(new Object[]{str, C42745f0.O(arrayList, "\n - ", "\n - ", null, null, 60)}, 2)), new Object[0]);
    }

    @X41.n
    public static final void a(@Y61.k String str) {
        h70.b(String.format("Ad type %s was integrated successfully", Arrays.copyOf(new Object[]{str}, 1)), new Object[0]);
    }
}
