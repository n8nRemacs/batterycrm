package L91;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f9845a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9846b;

    public r(int i12, List list) {
        this.f9845a = i12;
        this.f9846b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f9845a == rVar.f9845a && L.f(this.f9846b, rVar.f9846b);
    }

    public final int hashCode() {
        return this.f9846b.hashCode() + (Integer.hashCode(this.f9845a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotosState(goalPhotoCount=");
        sb2.append(this.f9845a);
        sb2.append(", photos=");
        return H.n(sb2, this.f9846b, ')');
    }

    public r(int i12) {
        this(i12, C42784z0.f406748b);
    }
}
