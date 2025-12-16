package u80;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: Dimension.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu80/c;", "", "_avito-discouraged_avito-libs_photo-camera-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f439809a;

    /* renamed from: b, reason: collision with root package name */
    public final int f439810b;

    public c(int i12, int i13) {
        this.f439809a = i12;
        this.f439810b = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f439809a == cVar.f439809a && this.f439810b == cVar.f439810b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f439810b) + (Integer.hashCode(this.f439809a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Dimension(width=");
        sb2.append(this.f439809a);
        sb2.append(", height=");
        return r.t(sb2, this.f439810b, ')');
    }
}
