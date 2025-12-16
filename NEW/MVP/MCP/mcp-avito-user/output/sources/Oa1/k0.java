package Oa1;

import java.util.Map;

/* loaded from: classes9.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12372a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12373b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f12374c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12375d;

    public k0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.L.f(this.f12372a, k0Var.f12372a) && kotlin.jvm.internal.L.f(this.f12373b, k0Var.f12373b) && kotlin.jvm.internal.L.f(this.f12374c, k0Var.f12374c) && this.f12375d == k0Var.f12375d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12375d) + AK.c.c(androidx.compose.foundation.H.d(this.f12372a.hashCode() * 31, 31, this.f12373b), 31, this.f12374c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MigrationDtoVer2(uuid=");
        sb2.append((Object) ("MetricsEventUuid(value=" + this.f12372a + ')'));
        sb2.append(", eventName=");
        sb2.append(this.f12373b);
        sb2.append(", eventData=");
        sb2.append(this.f12374c);
        sb2.append(", eventTimeStamp=");
        return androidx.appcompat.app.r.u(sb2, this.f12375d, ')');
    }

    public k0(long j12, String str, String str2, Map map) {
        this.f12372a = str;
        this.f12373b = str2;
        this.f12374c = map;
        this.f12375d = j12;
    }
}
