package com.avito.android.user_advert.advert.items.reservation;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MyAdvertReservationInfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/reservation/c;", "Lcom/avito/conveyor_item/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f310021b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f310022c;

    public c(@k String str, @k String str2) {
        this.f310021b = str;
        this.f310022c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f310021b, cVar.f310021b) && L.f(this.f310022c, cVar.f310022c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83595b() {
        return getF83597d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83597d() {
        return this.f310021b;
    }

    public final int hashCode() {
        return this.f310022c.hashCode() + (this.f310021b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MyAdvertReservationInfoItem(stringId=");
        sb2.append(this.f310021b);
        sb2.append(", info=");
        return C22026a.c(sb2, this.f310022c, ')');
    }
}
