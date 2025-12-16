package Ry0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsResponse.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRy0/b;", "", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f14763a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f14764b;

    public b(int i12, @k String str) {
        this.f14763a = i12;
        this.f14764b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f14763a == bVar.f14763a && L.f(this.f14764b, bVar.f14764b);
    }

    public final int hashCode() {
        return this.f14764b.hashCode() + (Integer.hashCode(this.f14763a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodValue(id=");
        sb2.append(this.f14763a);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f14764b, ')');
    }
}
