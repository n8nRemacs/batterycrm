package To0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTo0/e;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Long f15906a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15907b;

    public e(@l Long l12, long j12) {
        this.f15906a = l12;
        this.f15907b = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f15906a, eVar.f15906a) && this.f15907b == eVar.f15907b;
    }

    public final int hashCode() {
        Long l12 = this.f15906a;
        return Long.hashCode(this.f15907b) + ((l12 == null ? 0 : l12.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ForecastPresetAudience(min=");
        sb2.append(this.f15906a);
        sb2.append(", max=");
        return r.u(sb2, this.f15907b, ')');
    }
}
