package pw0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/e;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f428871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f428872b;

    public e(@Y61.k String str, @Y61.k String str2) {
        this.f428871a = str;
        this.f428872b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f428871a, eVar.f428871a) && L.f(this.f428872b, eVar.f428872b);
    }

    public final int hashCode() {
        return this.f428872b.hashCode() + (this.f428871a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsDetailedAge(id=");
        sb2.append(this.f428871a);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f428872b, ')');
    }
}
