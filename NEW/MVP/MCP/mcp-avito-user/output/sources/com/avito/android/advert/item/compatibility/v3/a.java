package com.avito.android.advert.item.compatibility.v3;

import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.spare_parts.data.SparePartsGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CompatibilityClicksRelay.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SparePartsGroup f74403a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f74404b;

    public a(@Y61.k SparePartsGroup sparePartsGroup, boolean z12) {
        this.f74403a = sparePartsGroup;
        this.f74404b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f74403a, aVar.f74403a) && this.f74404b == aVar.f74404b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f74404b) + (this.f74403a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClickEvent(group=");
        sb2.append(this.f74403a);
        sb2.append(", isShowAllWrapper=");
        return androidx.appcompat.app.r.x(sb2, this.f74404b, ')');
    }

    public /* synthetic */ a(SparePartsGroup sparePartsGroup, boolean z12, int i12, C42822w c42822w) {
        this(sparePartsGroup, (i12 & 2) != 0 ? false : z12);
    }
}
