package Ov;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocationSettingErrorPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/h;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f12689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f12690b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f12691c;

    public h(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        this.f12689a = str;
        this.f12690b = str2;
        this.f12691c = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f12689a, hVar.f12689a) && L.f(this.f12690b, hVar.f12690b) && L.f(this.f12691c, hVar.f12691c);
    }

    public final int hashCode() {
        String str = this.f12689a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f12690b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12691c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationSettingErrorPayload(priceErrorMessage=");
        sb2.append(this.f12689a);
        sb2.append(", minDaysMessage=");
        sb2.append(this.f12690b);
        sb2.append(", maxDaysMessage=");
        return C22026a.c(sb2, this.f12691c, ')');
    }
}
