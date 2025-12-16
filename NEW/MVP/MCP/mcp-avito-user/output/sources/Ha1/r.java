package ha1;

import androidx.compose.runtime.C22026a;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class r extends t {

    /* renamed from: a, reason: collision with root package name */
    public final String f397257a;

    public r(String str) {
        super(0);
        this.f397257a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && L.f(this.f397257a, ((r) obj).f397257a);
    }

    public final int hashCode() {
        String str = this.f397257a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("ImageUploaded(text="), this.f397257a, ')');
    }
}
