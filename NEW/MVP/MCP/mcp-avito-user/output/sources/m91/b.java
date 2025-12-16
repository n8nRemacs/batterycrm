package M91;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10432a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10433b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10434c;

    public b(String str, String str2, boolean z12) {
        this.f10432a = str;
        this.f10433b = str2;
        this.f10434c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f10432a, bVar.f10432a) && L.f(this.f10433b, bVar.f10433b) && this.f10434c == bVar.f10434c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10434c) + H.d(this.f10432a.hashCode() * 31, 31, this.f10433b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiCountryItem(code=");
        sb2.append(this.f10432a);
        sb2.append(", name=");
        sb2.append(this.f10433b);
        sb2.append(", isChosen=");
        return r.x(sb2, this.f10434c, ')');
    }
}
