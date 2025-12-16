package com.avito.android.campaigns_sale_search.konveyor.page_loading_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PageLoadingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/page_loading_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f114587b;

    public a() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && L.f(this.f114587b, ((a) obj).f114587b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84603b() {
        return getF114576b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF114576b() {
        return this.f114587b;
    }

    public final int hashCode() {
        return this.f114587b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("PageLoadingItem(stringId="), this.f114587b, ')');
    }

    public a(String str, int i12, C42822w c42822w) {
        this.f114587b = (i12 & 1) != 0 ? "page_loading_item_id" : str;
    }
}
