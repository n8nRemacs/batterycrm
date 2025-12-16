package com.avito.android.serp.adapter;

import kotlin.Metadata;

/* compiled from: LayoutTypeProvider.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/i0;", "Lcom/avito/android/serp/adapter/h0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34738i0 implements InterfaceC34736h0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.L0 f270167a;

    public C34738i0(@Y61.k com.avito.android.util.L0 l02) {
        this.f270167a = l02;
    }

    @Override // com.avito.android.serp.adapter.InterfaceC34736h0
    @Y61.k
    public final LayoutType getLayoutType() {
        int iF2 = this.f270167a.f();
        return iF2 >= 960 ? LayoutType.f268513g : iF2 >= 640 ? LayoutType.f268512f : LayoutType.f268511e;
    }
}
