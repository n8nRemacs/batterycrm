package com.avito.android.serp.adapter.empty_search;

import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.N0;
import com.avito.android.serp.adapter.empty_search.EmptySearchElement;
import com.avito.android.serp.adapter.empty_search.EmptySearchItem;
import kotlin.Metadata;

/* compiled from: EmptySearchItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/empty_search/e;", "Lcom/avito/android/serp/adapter/empty_search/d;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {
    @Override // com.avito.android.serp.adapter.empty_search.d
    @Y61.k
    public final EmptySearchItem a(@Y61.k EmptySearchElement emptySearchElement) {
        long jA2 = N0.a(emptySearchElement.f269927f, emptySearchElement.f269923b);
        EmptySearchElement.Paddings paddings = emptySearchElement.f269926e;
        return new EmptySearchItem(jA2, emptySearchElement.f269923b, emptySearchElement.f269924c, emptySearchElement.f269925d, new EmptySearchItem.Paddings(paddings != null ? paddings.f269928b : -1, paddings != null ? paddings.f269929c : -1), 6);
    }
}
