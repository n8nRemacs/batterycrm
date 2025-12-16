package mx0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SocketEventType.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx0/e;", "", "_avito_socket-events_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f414833a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f414834b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f414835c;

    public e(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? null : str2;
        z12 = (i12 & 4) != 0 ? false : z12;
        this.f414833a = str;
        this.f414834b = str2;
        this.f414835c = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f414833a, eVar.f414833a) && L.f(this.f414834b, eVar.f414834b) && this.f414835c == eVar.f414835c;
    }

    public final int hashCode() {
        int iHashCode = this.f414833a.hashCode() * 31;
        String str = this.f414834b;
        return Boolean.hashCode(this.f414835c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SocketEventType(value=");
        sb2.append(this.f414833a);
        sb2.append(", subType=");
        sb2.append(this.f414834b);
        sb2.append(", isEventMappingBySuffix=");
        return r.x(sb2, this.f414835c, ')');
    }
}
