package ha1;

import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class q extends t {

    /* renamed from: a, reason: collision with root package name */
    public final float f397253a;

    /* renamed from: b, reason: collision with root package name */
    public final String f397254b;

    /* renamed from: c, reason: collision with root package name */
    public final String f397255c;

    /* renamed from: d, reason: collision with root package name */
    public final String f397256d;

    public q(float f12, String str, String str2, String str3) {
        super(0);
        this.f397253a = f12;
        this.f397254b = str;
        this.f397255c = str2;
        this.f397256d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Float.compare(this.f397253a, qVar.f397253a) == 0 && L.f(this.f397254b, qVar.f397254b) && L.f(this.f397255c, qVar.f397255c) && L.f(this.f397256d, qVar.f397256d);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f397253a) * 31;
        String str = this.f397254b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f397255c;
        return this.f397256d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Active(ratio=");
        sb2.append(this.f397253a);
        sb2.append(", navBarText=");
        sb2.append(this.f397254b);
        sb2.append(", text=");
        sb2.append(this.f397255c);
        sb2.append(", secondaryText=");
        return C22026a.c(sb2, this.f397256d, ')');
    }
}
