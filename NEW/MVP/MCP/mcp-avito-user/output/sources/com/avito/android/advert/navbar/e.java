package com.avito.android.advert.navbar;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertCardNavBar;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsNavBarData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/navbar/e;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AdvertCardNavBar f80816a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final a f80817b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80818c;

    public e(@Y61.k AdvertCardNavBar advertCardNavBar, @Y61.l a aVar, boolean z12) {
        this.f80816a = advertCardNavBar;
        this.f80817b = aVar;
        this.f80818c = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f80816a, eVar.f80816a) && L.f(this.f80817b, eVar.f80817b) && this.f80818c == eVar.f80818c;
    }

    public final int hashCode() {
        int iHashCode = this.f80816a.hashCode() * 31;
        a aVar = this.f80817b;
        return Boolean.hashCode(this.f80818c) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsNavBarData(data=");
        sb2.append(this.f80816a);
        sb2.append(", image=");
        sb2.append(this.f80817b);
        sb2.append(", dropdownVisible=");
        return androidx.appcompat.app.r.x(sb2, this.f80818c, ')');
    }
}
