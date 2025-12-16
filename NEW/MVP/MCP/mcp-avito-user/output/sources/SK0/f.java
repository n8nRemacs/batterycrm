package SK0;

import Y61.k;
import Y61.l;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UxFbProperties.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSK0/f;", "", "<init>", "()V", "_avito_ux-feedback_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final LinkedHashMap f14906a = new LinkedHashMap();

    public final void a(@k String str, @k String str2) {
        this.f14906a.put(str, str2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (f.class.equals(obj != null ? obj.getClass() : null)) {
            return L.f(this.f14906a, ((f) obj).f14906a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14906a.hashCode();
    }

    @k
    public final String toString() {
        return this.f14906a.toString();
    }
}
