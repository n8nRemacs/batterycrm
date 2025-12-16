package com.avito.android.advert.item.similars;

import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComplementarySection.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/similars/t;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSpannedItem> f80337a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.advert.item.commercials.a f80338b;

    public t() {
        this(null, null, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return L.f(this.f80337a, tVar.f80337a) && L.f(this.f80338b, tVar.f80338b);
    }

    public final int hashCode() {
        int iHashCode = this.f80337a.hashCode() * 31;
        com.avito.android.advert.item.commercials.a aVar = this.f80338b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "ComplementarySection(similarItems=" + this.f80337a + ", commercials=" + this.f80338b + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t(@Y61.k List<? extends PersistableSpannedItem> list, @Y61.l com.avito.android.advert.item.commercials.a aVar) {
        this.f80337a = list;
        this.f80338b = aVar;
    }

    public t(List list, com.avito.android.advert.item.commercials.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? null : aVar);
    }
}
