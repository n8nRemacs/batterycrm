package E91;

import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3842b;

    public e(String str, String str2) {
        this.f3841a = str;
        this.f3842b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f3841a, eVar.f3841a) && L.f(this.f3842b, eVar.f3842b);
    }

    public final int hashCode() {
        return this.f3842b.hashCode() + (this.f3841a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DocumentResultField(subTitle=");
        sb2.append(this.f3841a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f3842b, ')');
    }
}
