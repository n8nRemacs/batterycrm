package P20;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiGeoAddress.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LP20/a;", "", "LP20/c;", "displayAddress", "", "addressId", SearchParamsConverterKt.LOCATION_ID, "", AddressParameter.TYPE, "LP20/b;", "coordinate", "<init>", "(LP20/c;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;LP20/b;)V", "LP20/c;", "getDisplayAddress", "()LP20/c;", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LP20/b;", "c", "()LP20/b;", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @k
    private final String address;

    @com.google.gson.annotations.c("addressId")
    @l
    private final Integer addressId;

    @com.google.gson.annotations.c("coordinate")
    @k
    private final b coordinate;

    @com.google.gson.annotations.c("displayAddress")
    @k
    private final c displayAddress;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final Integer locationId;

    public a(@k c cVar, @l Integer num, @l Integer num2, @k String str, @k b bVar) {
        this.displayAddress = cVar;
        this.addressId = num;
        this.locationId = num2;
        this.address = str;
        this.coordinate = bVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Integer getAddressId() {
        return this.addressId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final b getCoordinate() {
        return this.coordinate;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getLocationId() {
        return this.locationId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.displayAddress, aVar.displayAddress) && L.f(this.addressId, aVar.addressId) && L.f(this.locationId, aVar.locationId) && L.f(this.address, aVar.address) && L.f(this.coordinate, aVar.coordinate);
    }

    public final int hashCode() {
        int iHashCode = this.displayAddress.hashCode() * 31;
        Integer num = this.addressId;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.locationId;
        return this.coordinate.hashCode() + H.d((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.address);
    }

    @k
    public final String toString() {
        return "MultiGeoAddress(displayAddress=" + this.displayAddress + ", addressId=" + this.addressId + ", locationId=" + this.locationId + ", address=" + this.address + ", coordinate=" + this.coordinate + ')';
    }
}
