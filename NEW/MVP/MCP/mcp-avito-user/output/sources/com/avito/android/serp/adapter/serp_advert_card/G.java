package com.avito.android.serp.adapter.serp_advert_card;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpAdvertTileCard.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/serp_advert_card/G;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class G {

    /* renamed from: a, reason: collision with root package name */
    public boolean f271852a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f271853b;

    public G() {
        this(false, false, 3, null);
    }

    public G(boolean z12, boolean z13, int i12, C42822w c42822w) {
        z12 = (i12 & 1) != 0 ? false : z12;
        z13 = (i12 & 2) != 0 ? false : z13;
        this.f271852a = z12;
        this.f271853b = z13;
    }
}
