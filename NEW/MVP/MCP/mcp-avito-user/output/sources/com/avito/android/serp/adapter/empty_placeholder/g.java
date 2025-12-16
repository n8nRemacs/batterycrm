package com.avito.android.serp.adapter.empty_placeholder;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SerpAdvertEmptyPlaceholder;
import kotlin.Metadata;

/* compiled from: EmptyPlaceholderItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/empty_placeholder/g;", "Lcom/avito/android/serp/adapter/empty_placeholder/f;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements f {
    @Override // com.avito.android.serp.adapter.empty_placeholder.f
    @Y61.k
    public final EmptyPlaceholderItem a(@Y61.k SerpAdvertEmptyPlaceholder serpAdvertEmptyPlaceholder) {
        String title = serpAdvertEmptyPlaceholder.getTitle();
        long jHashCode = title != null ? title.hashCode() : 0;
        String title2 = serpAdvertEmptyPlaceholder.getTitle();
        String str = title2 == null ? "" : title2;
        String title3 = serpAdvertEmptyPlaceholder.getTitle();
        String str2 = title3 == null ? "" : title3;
        String subtitle = serpAdvertEmptyPlaceholder.getSubtitle();
        return new EmptyPlaceholderItem(jHashCode, str, 6, str2, subtitle == null ? "" : subtitle, serpAdvertEmptyPlaceholder.getActions());
    }
}
