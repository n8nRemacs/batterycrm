package Vx;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeature;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvertInfoState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVx/d;", "", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f17524a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<EarlyAccessFeature> f17525b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f17526c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f17527d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f17528e;

    public d(@l String str, @l List<EarlyAccessFeature> list, @l String str2, @l String str3, @l String str4) {
        this.f17524a = str;
        this.f17525b = list;
        this.f17526c = str2;
        this.f17527d = str3;
        this.f17528e = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f17524a, dVar.f17524a) && L.f(this.f17525b, dVar.f17525b) && L.f(this.f17526c, dVar.f17526c) && L.f(this.f17527d, dVar.f17527d) && L.f(this.f17528e, dVar.f17528e);
    }

    public final int hashCode() {
        String str = this.f17524a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<EarlyAccessFeature> list = this.f17525b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f17526c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17527d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17528e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessAdvertInfoViewState(title=");
        sb2.append(this.f17524a);
        sb2.append(", features=");
        sb2.append(this.f17525b);
        sb2.append(", agreementButtonText=");
        sb2.append(this.f17526c);
        sb2.append(", disagreementButtonText=");
        sb2.append(this.f17527d);
        sb2.append(", buttonDisclaimer=");
        return C22026a.c(sb2, this.f17528e, ')');
    }
}
