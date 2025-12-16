package OK0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpanPlacement.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOK0/e;", "", "_avito_text-formatters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f12201a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12202b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12203c;

    public e(int i12, int i13, @k Object obj) {
        this.f12201a = obj;
        this.f12202b = i12;
        this.f12203c = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f12201a, eVar.f12201a) && this.f12202b == eVar.f12202b && this.f12203c == eVar.f12203c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12203c) + r.e(this.f12202b, this.f12201a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanPlacement(span=");
        sb2.append(this.f12201a);
        sb2.append(", from=");
        sb2.append(this.f12202b);
        sb2.append(", to=");
        return r.t(sb2, this.f12203c, ')');
    }
}
