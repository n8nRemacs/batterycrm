package U3;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoFlatsTwoColumnDialogState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU3/d;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f16144a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList f16145b;

    public d(@k String str, @l ArrayList arrayList) {
        this.f16144a = str;
        this.f16145b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f16144a, dVar.f16144a) && L.f(this.f16145b, dVar.f16145b);
    }

    public final int hashCode() {
        int iHashCode = this.f16144a.hashCode() * 31;
        ArrayList arrayList = this.f16145b;
        return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpecItem(title=");
        sb2.append(this.f16144a);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f16145b, ')');
    }
}
