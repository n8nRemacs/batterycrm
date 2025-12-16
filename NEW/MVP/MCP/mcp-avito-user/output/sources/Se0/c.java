package Se0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SlotChangedData.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSe0/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f15106a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f15107b;

    public c(@l String str, @l String str2) {
        this.f15106a = str;
        this.f15107b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15106a, cVar.f15106a) && L.f(this.f15107b, cVar.f15107b);
    }

    public final int hashCode() {
        String str = this.f15106a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f15107b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotChangedData(description=");
        sb2.append(this.f15106a);
        sb2.append(", buttonText=");
        return C22026a.c(sb2, this.f15107b, ')');
    }
}
