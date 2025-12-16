package com.avito.android.serp.adapter;

import com.avito.android.remote.model.HeaderElement;
import com.avito.android.serp.adapter.header.HeaderItem;
import kotlin.Metadata;

/* compiled from: HeaderElementConverter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/f0;", "Lcom/avito/android/serp/adapter/e0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34732f0 implements InterfaceC34730e0 {
    @Override // com.avito.android.serp.adapter.InterfaceC34730e0
    @Y61.k
    public final HeaderItem a(@Y61.k HeaderElement headerElement) {
        return new HeaderItem(headerElement.getText(), headerElement.getText(), headerElement.getDescriptions(), SerpViewType.f268585e, 6);
    }
}
