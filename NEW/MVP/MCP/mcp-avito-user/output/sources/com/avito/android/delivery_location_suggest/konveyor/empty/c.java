package com.avito.android.delivery_location_suggest.konveyor.empty;

import Y61.k;
import Y61.l;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EmptyItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/konveyor/empty/c;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135120b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f135121c;

    public c(String str, Integer num, int i12, C42822w c42822w) {
        num = (i12 & 2) != 0 ? null : num;
        this.f135120b = str;
        this.f135121c = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f135120b, cVar.f135120b) && L.f(this.f135121c, cVar.f135121c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return getF131998b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF131998b() {
        return this.f135120b;
    }

    public final int hashCode() {
        int iHashCode = this.f135120b.hashCode() * 31;
        Integer num = this.f135121c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyItem(stringId=");
        sb2.append(this.f135120b);
        sb2.append(", textRes=");
        return s.j(sb2, this.f135121c, ')');
    }
}
