package FA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: ApiAddSellerAddressResponse.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LFA0/e;", "", "", AddressParameter.TYPE, "error", "esid", "LFA0/f;", "publishValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LFA0/f;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "getEsid", "LFA0/f;", "c", "()LFA0/f;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @l
    private final String address;

    @com.google.gson.annotations.c("error")
    @l
    private final String error;

    @com.google.gson.annotations.c("esid")
    @k
    private final String esid;

    @com.google.gson.annotations.c("publishValue")
    @l
    private final f publishValue;

    public e(@l String str, @l String str2, @k String str3, @l f fVar) {
        this.address = str;
        this.error = str2;
        this.esid = str3;
        this.publishValue = fVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final f getPublishValue() {
        return this.publishValue;
    }
}
