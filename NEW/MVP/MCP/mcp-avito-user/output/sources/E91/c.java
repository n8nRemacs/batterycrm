package E91;

import androidx.compose.foundation.H;
import java.util.List;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f3822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3823b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3824c;

    public c(String str, String str2, List list) {
        this.f3822a = str;
        this.f3823b = str2;
        this.f3824c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f3822a, cVar.f3822a) && L.f(this.f3823b, cVar.f3823b) && L.f(this.f3824c, cVar.f3824c);
    }

    public final int hashCode() {
        String str = this.f3822a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f3823b;
        return this.f3824c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentConfirmationState(title=");
        sb2.append(this.f3822a);
        sb2.append(", description=");
        sb2.append(this.f3823b);
        sb2.append(", fields=");
        return H.n(sb2, this.f3824c, ')');
    }
}
