package l6;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.AdvertParameters;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipDiscrepancyState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll6/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f413528b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f413529c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f413530d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> f413531e;

    public c(@k String str, @k String str2, @k String str3, @l List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> list) {
        this.f413528b = str;
        this.f413529c = str2;
        this.f413530d = str3;
        this.f413531e = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f413528b, cVar.f413528b) && L.f(this.f413529c, cVar.f413529c) && L.f(this.f413530d, cVar.f413530d) && L.f(this.f413531e, cVar.f413531e);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f413528b.hashCode() * 31, 31, this.f413529c), 31, this.f413530d);
        List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> list = this.f413531e;
        return iD2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OwnershipDiscrepancyState(title=");
        sb2.append(this.f413528b);
        sb2.append(", description=");
        sb2.append(this.f413529c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f413530d);
        sb2.append(", values=");
        return H.p(sb2, this.f413531e, ')');
    }
}
