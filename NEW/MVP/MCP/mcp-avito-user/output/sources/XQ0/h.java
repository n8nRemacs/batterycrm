package xQ0;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MediaStatus.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxQ0/h;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g f442490a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f442491b;

    public h(@Y61.k g gVar, boolean z12) {
        this.f442490a = gVar;
        this.f442491b = z12;
    }

    public static h a(h hVar, g gVar, boolean z12, int i12) {
        if ((i12 & 1) != 0) {
            gVar = hVar.f442490a;
        }
        if ((i12 & 2) != 0) {
            z12 = hVar.f442491b;
        }
        hVar.getClass();
        return new h(gVar, z12);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f442490a, hVar.f442490a) && this.f442491b == hVar.f442491b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f442491b) + (this.f442490a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaStatus(mss=");
        sb2.append(this.f442490a);
        sb2.append(", connected=");
        return r.x(sb2, this.f442491b, ')');
    }
}
