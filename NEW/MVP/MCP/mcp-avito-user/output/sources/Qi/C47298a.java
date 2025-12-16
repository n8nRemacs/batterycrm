package qI;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AddressByCoordinatesResult.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LqI/a;", "", "", "formattedAddress", "jsonWebToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getFormattedAddress", "()Ljava/lang/String;", "a", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C47298a {

    @com.google.gson.annotations.c("formattedAddress")
    @k
    private final String formattedAddress;

    @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
    @l
    private final String jsonWebToken;

    public C47298a(@k String str, @l String str2) {
        this.formattedAddress = str;
        this.jsonWebToken = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getJsonWebToken() {
        return this.jsonWebToken;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47298a)) {
            return false;
        }
        C47298a c47298a = (C47298a) obj;
        return L.f(this.formattedAddress, c47298a.formattedAddress) && L.f(this.jsonWebToken, c47298a.jsonWebToken);
    }

    public final int hashCode() {
        int iHashCode = this.formattedAddress.hashCode() * 31;
        String str = this.jsonWebToken;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AddressByCoordinatesResult(formattedAddress=");
        sb2.append(this.formattedAddress);
        sb2.append(", jsonWebToken=");
        return C22026a.c(sb2, this.jsonWebToken, ')');
    }
}
