package JA0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: ApiDeleteSellerAddressResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"LJA0/a;", "", "", AddressParameter.TYPE, "", "addressCount", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("addressCount")
    @l
    private final Long addressCount;

    @c("error")
    @l
    private final String error;

    public a(@l String str, @l Long l12, @l String str2) {
        this.address = str;
        this.addressCount = l12;
        this.error = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getAddressCount() {
        return this.addressCount;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getError() {
        return this.error;
    }
}
