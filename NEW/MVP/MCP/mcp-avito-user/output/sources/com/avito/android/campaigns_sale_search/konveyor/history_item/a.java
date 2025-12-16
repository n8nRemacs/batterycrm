package com.avito.android.campaigns_sale_search.konveyor.history_item;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HistoryItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/history_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f114560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f114561c;

    public a(@k String str, @k String str2) {
        this.f114560b = str;
        this.f114561c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f114560b, aVar.f114560b) && L.f(this.f114561c, aVar.f114561c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF114560b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF114560b() {
        return this.f114560b;
    }

    public final int hashCode() {
        return this.f114561c.hashCode() + (this.f114560b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HistoryItem(stringId=");
        sb2.append(this.f114560b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f114561c, ')');
    }
}
