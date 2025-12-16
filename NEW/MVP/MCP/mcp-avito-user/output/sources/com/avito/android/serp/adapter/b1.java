package com.avito.android.serp.adapter;

import com.avito.android.remote.model.SerpDisplayType;
import kotlin.Metadata;

/* compiled from: SimpleAdvertSpanCountProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/b1;", "Lcom/avito/android/serp/adapter/G;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b1 implements G {

    /* renamed from: a, reason: collision with root package name */
    public final int f268988a;

    public b1(int i12) {
        this.f268988a = i12;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.l
    public final int a(@Y61.k SerpDisplayType serpDisplayType) {
        if (serpDisplayType.isSingleColumn()) {
            return 6;
        }
        return this.f268988a;
    }
}
