package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: JoinedKey.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/N0;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class N0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Integer f38053a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Object f38054b;

    public N0(@Y61.l Integer num, @Y61.l Object obj) {
        this.f38053a = num;
        this.f38054b = obj;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f38053a.equals(n02.f38053a) && kotlin.jvm.internal.L.f(this.f38054b, n02.f38054b);
    }

    public final int hashCode() {
        int iHashCode = this.f38053a.hashCode() * 31;
        Object obj = this.f38054b;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + iHashCode;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JoinedKey(left=");
        sb2.append(this.f38053a);
        sb2.append(", right=");
        return androidx.compose.foundation.H.n(sb2, this.f38054b, ')');
    }
}
