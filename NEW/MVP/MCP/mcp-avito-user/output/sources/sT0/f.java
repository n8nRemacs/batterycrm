package ST0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DateTime.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LST0/f;", "LST0/a;", "LST0/h;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f implements a, h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f14991a;

    public f(@k String str) {
        this.f14991a = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && L.f(this.f14991a, ((f) obj).f14991a);
    }

    @Override // ST0.b
    @k
    /* renamed from: getValue, reason: from getter */
    public final String getF14989a() {
        return this.f14991a;
    }

    public final int hashCode() {
        return this.f14991a.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("LocalDateTime(value="), this.f14991a, ')');
    }
}
