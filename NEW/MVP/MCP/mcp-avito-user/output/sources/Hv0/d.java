package HV0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StringEntry.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHV0/d;", "", "utils_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f7123a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f7124b;

    public d(@k String str, @k String str2) {
        this.f7123a = str;
        this.f7124b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f7123a, dVar.f7123a) && L.f(this.f7124b, dVar.f7124b);
    }

    public final int hashCode() {
        return this.f7124b.hashCode() + (this.f7123a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StringEntry(key=");
        sb2.append(this.f7123a);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f7124b, ')');
    }
}
