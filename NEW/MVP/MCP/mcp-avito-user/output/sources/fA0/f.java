package FA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u0017"}, d2 = {"LFA0/f;", "", "", AddressParameter.Value.JSON_WEB_TOKEN, "", "lat", AddressParameter.Value.LNG, "LFA0/g;", AddressParameter.Value.ADDRESS_DATA, "text", "<init>", "(Ljava/lang/String;DDLFA0/g;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "D", "b", "()D", "c", "LFA0/g;", "d", "()LFA0/g;", "e", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
    @l
    private final String jwt;

    @com.google.gson.annotations.c("lat")
    private final double lat;

    @com.google.gson.annotations.c(AddressParameter.Value.LNG)
    private final double lng;

    @com.google.gson.annotations.c(AddressParameter.Value.ADDRESS_DATA)
    @l
    private final g sellerAddressData;

    @com.google.gson.annotations.c("text")
    @k
    private final String text;

    public f(@l String str, double d12, double d13, @l g gVar, @k String str2) {
        this.jwt = str;
        this.lat = d12;
        this.lng = d13;
        this.sellerAddressData = gVar;
        this.text = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    /* renamed from: b, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* renamed from: c, reason: from getter */
    public final double getLng() {
        return this.lng;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final g getSellerAddressData() {
        return this.sellerAddressData;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }
}
