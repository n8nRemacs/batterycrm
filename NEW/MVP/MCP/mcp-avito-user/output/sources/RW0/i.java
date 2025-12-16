package rw0;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NextAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/i;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437214a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f437215b;

    public i(@Y61.k String str, @Y61.l String str2) {
        this.f437214a = str;
        this.f437215b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f437214a, iVar.f437214a) && L.f(this.f437215b, iVar.f437215b);
    }

    public final int hashCode() {
        int iHashCode = this.f437214a.hashCode() * 31;
        String str = this.f437215b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NextAction(title=");
        sb2.append(this.f437214a);
        sb2.append(", style=");
        return C22026a.c(sb2, this.f437215b, ')');
    }
}
