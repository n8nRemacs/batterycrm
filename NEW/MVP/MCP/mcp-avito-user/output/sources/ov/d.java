package Ov;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryLocation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOv/d;", "", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f12680a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f12681b;

    public d(long j12, @Y61.k String str) {
        this.f12680a = j12;
        this.f12681b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f12680a == dVar.f12680a && L.f(this.f12681b, dVar.f12681b);
    }

    public final int hashCode() {
        return this.f12681b.hashCode() + (Long.hashCode(this.f12680a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryLocation(id=");
        sb2.append(this.f12680a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f12681b, ')');
    }
}
