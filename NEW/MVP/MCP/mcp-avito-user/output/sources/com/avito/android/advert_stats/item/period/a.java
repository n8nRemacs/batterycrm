package com.avito.android.advert_stats.item.period;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PeriodItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/item/period/a;", "Lcom/avito/conveyor_item/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f86780b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f86781c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86782d;

    public a(@k String str, @k String str2, boolean z12) {
        this.f86780b = str;
        this.f86781c = str2;
        this.f86782d = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f86780b, aVar.f86780b) && L.f(this.f86781c, aVar.f86781c) && this.f86782d == aVar.f86782d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return getF79191b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79191b() {
        return this.f86780b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86782d) + H.d(this.f86780b.hashCode() * 31, 31, this.f86781c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodItem(stringId=");
        sb2.append(this.f86780b);
        sb2.append(", period=");
        sb2.append(this.f86781c);
        sb2.append(", isHidden=");
        return r.x(sb2, this.f86782d, ')');
    }

    public /* synthetic */ a(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12);
    }
}
