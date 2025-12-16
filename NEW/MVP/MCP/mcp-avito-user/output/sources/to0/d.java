package To0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/d;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f15901a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15902b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15903c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15904d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15905e;

    public d(@k e eVar, long j12, boolean z12, long j13, boolean z13) {
        this.f15901a = eVar;
        this.f15902b = j12;
        this.f15903c = z12;
        this.f15904d = j13;
        this.f15905e = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f15901a, dVar.f15901a) && this.f15902b == dVar.f15902b && this.f15903c == dVar.f15903c && this.f15904d == dVar.f15904d && this.f15905e == dVar.f15905e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15905e) + r.g(r.i(r.g(this.f15901a.hashCode() * 31, 31, this.f15902b), 31, this.f15903c), 31, this.f15904d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForecastPreset(audience=");
        sb2.append(this.f15901a);
        sb2.append(", budget=");
        sb2.append(this.f15902b);
        sb2.append(", isDefault=");
        sb2.append(this.f15903c);
        sb2.append(", ttlDays=");
        sb2.append(this.f15904d);
        sb2.append(", isRecommended=");
        return r.x(sb2, this.f15905e, ')');
    }
}
