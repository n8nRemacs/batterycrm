package androidx.media3.datasource.cache;

import androidx.media3.common.util.J;
import j.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* compiled from: DefaultContentMetadata.java */
@J
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public int f48224a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, byte[]> f48225b;

    static {
        new l(Collections.emptyMap());
    }

    public l() {
        this(Collections.emptyMap());
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        Map<String, byte[]> map = ((l) obj).f48225b;
        Map<String, byte[]> map2 = this.f48225b;
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map2.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.f48224a == 0) {
            int iHashCode = 0;
            for (Map.Entry<String, byte[]> entry : this.f48225b.entrySet()) {
                iHashCode += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f48224a = iHashCode;
        }
        return this.f48224a;
    }

    public l(Map<String, byte[]> map) {
        this.f48225b = Collections.unmodifiableMap(map);
    }
}
