package X51;

import kotlin.jvm.internal.L;
import kotlinx.serialization.w;

@w
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f18629a;

    static {
        new i();
    }

    public /* synthetic */ j(int i12, String str) {
        if ((i12 & 1) == 0) {
            this.f18629a = "browser";
        } else {
            this.f18629a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && L.f(this.f18629a, ((j) obj).f18629a);
    }

    public final int hashCode() {
        return this.f18629a.hashCode();
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("Defaults(ssoOpenIn="), this.f18629a, ")");
    }

    public j(String str) {
        this.f18629a = str;
    }
}
