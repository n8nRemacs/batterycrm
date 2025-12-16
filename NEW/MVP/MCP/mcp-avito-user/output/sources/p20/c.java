package P20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiGeoAddress.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LP20/c;", "", "", "locality", "house", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLocality", "()Ljava/lang/String;", "getHouse", "_avito_multigeo-flow_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("house")
    @l
    private final String house;

    @com.google.gson.annotations.c("locality")
    @l
    private final String locality;

    public c(@l String str, @l String str2) {
        this.locality = str;
        this.house = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.locality, cVar.locality) && L.f(this.house, cVar.house);
    }

    public final int hashCode() {
        String str = this.locality;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.house;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiGeoDisplayAddress(locality=");
        sb2.append(this.locality);
        sb2.append(", house=");
        return C22026a.c(sb2, this.house, ')');
    }
}
