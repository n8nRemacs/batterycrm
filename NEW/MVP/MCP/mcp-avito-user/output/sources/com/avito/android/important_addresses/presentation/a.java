package com.avito.android.important_addresses.presentation;

import androidx.compose.runtime.C22026a;
import com.avito.android.important_addresses.domain.TransportType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/a;", "", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f169615a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TransportType f169616b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f169617c;

    public a(int i12, @Y61.k TransportType transportType, @Y61.l String str) {
        this.f169615a = i12;
        this.f169616b = transportType;
        this.f169617c = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f169615a == aVar.f169615a && this.f169616b == aVar.f169616b && L.f(this.f169617c, aVar.f169617c);
    }

    public final int hashCode() {
        int iHashCode = (this.f169616b.hashCode() + (Integer.hashCode(this.f169615a) * 31)) * 31;
        String str = this.f169617c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculatedTravelTime(destinationId=");
        sb2.append(this.f169615a);
        sb2.append(", type=");
        sb2.append(this.f169616b);
        sb2.append(", time=");
        return C22026a.c(sb2, this.f169617c, ')');
    }
}
