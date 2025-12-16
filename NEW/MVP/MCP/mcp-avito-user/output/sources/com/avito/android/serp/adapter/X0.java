package com.avito.android.serp.adapter;

import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;

/* compiled from: SerpItemUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_serp-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class X0 {
    @Y61.k
    public static final SerpViewType a(@Y61.k SerpDisplayType serpDisplayType, boolean z12) {
        return z12 ? SerpViewType.f268584d : serpDisplayType.isGrid() ? SerpViewType.f268583c : SerpViewType.f268582b;
    }
}
