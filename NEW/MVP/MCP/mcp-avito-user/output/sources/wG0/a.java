package WG0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: ApiValidateSellerAddressResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0015"}, d2 = {"LWG0/a;", "", "LWG0/b;", AddressParameter.TYPE, "", "addressId", "", "error", SearchParamsConverterKt.LOCATION_ID, "<init>", "(LWG0/b;JLjava/lang/String;J)V", "LWG0/b;", "a", "()LWG0/b;", "J", "b", "()J", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @k
    private final b address;

    @com.google.gson.annotations.c("addressId")
    private final long addressId;

    @com.google.gson.annotations.c("error")
    @l
    private final String error;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    public a(@k b bVar, long j12, @l String str, long j13) {
        this.address = bVar;
        this.addressId = j12;
        this.error = str;
        this.locationId = j13;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final long getAddressId() {
        return this.addressId;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: d, reason: from getter */
    public final long getLocationId() {
        return this.locationId;
    }
}
