package com.avito.android.publish.items.location_addresses;

import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationAddressPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/location_addresses/b;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ItemWithState.State f236991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AddressParameter.SellerAddresses f236992b;

    public b(@Y61.k ItemWithState.State state, @Y61.l AddressParameter.SellerAddresses sellerAddresses) {
        this.f236991a = state;
        this.f236992b = sellerAddresses;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f236991a, bVar.f236991a) && L.f(this.f236992b, bVar.f236992b);
    }

    public final int hashCode() {
        int iHashCode = this.f236991a.hashCode() * 31;
        AddressParameter.SellerAddresses sellerAddresses = this.f236992b;
        return iHashCode + (sellerAddresses == null ? 0 : sellerAddresses.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "LocationAddressPayload(state=" + this.f236991a + ", sellerAddressesFlow=" + this.f236992b + ')';
    }
}
