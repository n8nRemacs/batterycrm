package xQ0;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeerStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxQ0/j;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f442492a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f442493b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f442494c;

    public j(@Y61.k String str, boolean z12, @Y61.k h hVar) {
        this.f442492a = str;
        this.f442493b = z12;
        this.f442494c = hVar;
    }

    public static j a(j jVar, String str, h hVar, int i12) {
        if ((i12 & 1) != 0) {
            str = jVar.f442492a;
        }
        jVar.getClass();
        boolean z12 = (i12 & 4) != 0 ? jVar.f442493b : true;
        if ((i12 & 8) != 0) {
            hVar = jVar.f442494c;
        }
        jVar.getClass();
        return new j(str, z12, hVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f442492a, jVar.f442492a) && this.f442493b == jVar.f442493b && L.f(this.f442494c, jVar.f442494c);
    }

    public final int hashCode() {
        return this.f442494c.hashCode() + r.i(this.f442492a.hashCode() * 961, 31, this.f442493b);
    }

    @Y61.k
    public final String toString() {
        return "PeerStatus(userId=" + this.f442492a + ", endpointId=, wasRingingReceived=" + this.f442493b + ", mediaStatus=" + this.f442494c + ')';
    }
}
