package ky;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SellerType.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lky/d;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f413339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f413340b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f413341c;

    public d(@k String str, int i12, @l Integer num) {
        this.f413339a = str;
        this.f413340b = i12;
        this.f413341c = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f413339a, dVar.f413339a) && this.f413340b == dVar.f413340b && L.f(this.f413341c, dVar.f413341c);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f413340b, this.f413339a.hashCode() * 31, 31);
        Integer num = this.f413341c;
        return iE2 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerType(title=");
        sb2.append(this.f413339a);
        sb2.append(", type=");
        sb2.append(this.f413340b);
        sb2.append(", subtype=");
        return s.j(sb2, this.f413341c, ')');
    }
}
