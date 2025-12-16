package FA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressRequest.kt */
@P
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b,\u0010+R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b-\u0010\u001eR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b.\u0010!R\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b/\u0010$R\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"LFA0/a;", "", "LFA0/b;", AddressParameter.TYPE, "", "addressId", "", "LFA0/c;", "details", "", "esid", "flowType", "", "hideAddressDetails", "", "lat", AddressParameter.Value.LNG, SearchParamsConverterKt.LOCATION_ID, "selectedTypes", "sellersName", "verticalId", "LFA0/d;", "workingHours", "<init>", "(LFA0/b;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDJLjava/util/List;Ljava/lang/String;JLFA0/d;)V", "LFA0/b;", "a", "()LFA0/b;", "J", "getAddressId", "()J", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "Ljava/lang/String;", "getEsid", "()Ljava/lang/String;", "getFlowType", "Ljava/lang/Boolean;", "getHideAddressDetails", "()Ljava/lang/Boolean;", "D", "getLat", "()D", "getLng", "getLocationId", "getSelectedTypes", "getSellersName", "getVerticalId", "LFA0/d;", "getWorkingHours", "()LFA0/d;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @k
    private final b address;

    @com.google.gson.annotations.c("addressId")
    private final long addressId;

    @com.google.gson.annotations.c("details")
    @l
    private final List<c> details;

    @com.google.gson.annotations.c("esid")
    @l
    private final String esid;

    @com.google.gson.annotations.c("flowType")
    @l
    private final String flowType;

    @com.google.gson.annotations.c("hideAddressDetails")
    @l
    private final Boolean hideAddressDetails;

    @com.google.gson.annotations.c("lat")
    private final double lat;

    @com.google.gson.annotations.c(AddressParameter.Value.LNG)
    private final double lng;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c("selectedTypes")
    @k
    private final List<String> selectedTypes;

    @com.google.gson.annotations.c("sellersName")
    @k
    private final String sellersName;

    @com.google.gson.annotations.c("verticalId")
    private final long verticalId;

    @com.google.gson.annotations.c("workingHours")
    @k
    private final d workingHours;

    public a(@k b bVar, long j12, @l List<c> list, @l String str, @l String str2, @l Boolean bool, double d12, double d13, long j13, @k List<String> list2, @k String str3, long j14, @k d dVar) {
        this.address = bVar;
        this.addressId = j12;
        this.details = list;
        this.esid = str;
        this.flowType = str2;
        this.hideAddressDetails = bool;
        this.lat = d12;
        this.lng = d13;
        this.locationId = j13;
        this.selectedTypes = list2;
        this.sellersName = str3;
        this.verticalId = j14;
        this.workingHours = dVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final b getAddress() {
        return this.address;
    }
}
