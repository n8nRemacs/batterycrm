package i0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MutableCounter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li0/b;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    public int f398333a;

    public b() {
        this(0, 1, null);
    }

    public final void a(int i12) {
        this.f398333a += i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f398333a == ((b) obj).f398333a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f398333a);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("DeltaCounter(count="), this.f398333a, ')');
    }

    public b(int i12, int i13, C42822w c42822w) {
        this.f398333a = (i13 & 1) != 0 ? 0 : i12;
    }
}
