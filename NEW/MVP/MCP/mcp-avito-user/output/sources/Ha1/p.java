package ha1;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f397251a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f397252b;

    public p(int i12, List list) {
        this.f397251a = i12;
        this.f397252b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f397251a == pVar.f397251a && L.f(this.f397252b, pVar.f397252b);
    }

    public final int hashCode() {
        return this.f397252b.hashCode() + (Integer.hashCode(this.f397251a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhotosState(goalPhotoCount=");
        sb2.append(this.f397251a);
        sb2.append(", photos=");
        return H.n(sb2, this.f397252b, ')');
    }

    public p(int i12) {
        this(i12, C42784z0.f406748b);
    }
}
