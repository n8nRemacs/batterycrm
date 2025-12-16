package M91;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10435a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10436b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10437c;

    public c(String str, String str2, boolean z12) {
        this.f10435a = str;
        this.f10436b = str2;
        this.f10437c = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f10435a, cVar.f10435a) && L.f(this.f10436b, cVar.f10436b) && this.f10437c == cVar.f10437c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10437c) + H.d(this.f10435a.hashCode() * 31, 31, this.f10436b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UiDocumentType(type=");
        sb2.append(this.f10435a);
        sb2.append(", name=");
        sb2.append(this.f10436b);
        sb2.append(", isChosen=");
        return r.x(sb2, this.f10437c, ')');
    }
}
