package Na1;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNa1/c;", "", "sdk-public-metrics_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f11607a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, String> f11608b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11609c;

    public c(String str, Map<String, String> map) {
        this(str, map, System.currentTimeMillis());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f11607a, cVar.f11607a) && L.f(this.f11608b, cVar.f11608b);
    }

    public final int hashCode() {
        return this.f11608b.hashCode() + (this.f11607a.hashCode() * 31);
    }

    public c(String str, Map<String, String> map, long j12) {
        this.f11607a = str;
        this.f11608b = map;
        this.f11609c = j12;
    }
}
