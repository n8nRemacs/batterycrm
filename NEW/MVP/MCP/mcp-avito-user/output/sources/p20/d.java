package P20;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiGeoResponse.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LP20/d;", "", "", "error", AddressParameter.Value.JSON_WEB_TOKEN, "LP20/a;", AddressParameter.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;LP20/a;)V", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "a", "LP20/a;", "getAddress", "()LP20/a;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @l
    private final a address;

    @com.google.gson.annotations.c("error")
    @l
    private final String error;

    @com.google.gson.annotations.c(AddressParameter.Value.JSON_WEB_TOKEN)
    @k
    private final String jwt;

    public d(@l String str, @k String str2, @l a aVar) {
        this.error = str;
        this.jwt = str2;
        this.address = aVar;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.error, dVar.error) && L.f(this.jwt, dVar.jwt) && L.f(this.address, dVar.address);
    }

    public final int hashCode() {
        String str = this.error;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.jwt);
        a aVar = this.address;
        return iD2 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MultiGeoResponse(error=" + this.error + ", jwt=" + this.jwt + ", address=" + this.address + ')';
    }
}
