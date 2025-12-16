package Oa1;

import java.util.Map;

/* loaded from: classes9.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12367b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f12368c;

    public h0() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return kotlin.jvm.internal.L.f(this.f12366a, h0Var.f12366a) && kotlin.jvm.internal.L.f(this.f12367b, h0Var.f12367b) && kotlin.jvm.internal.L.f(this.f12368c, h0Var.f12368c);
    }

    public final int hashCode() {
        return this.f12368c.hashCode() + androidx.compose.foundation.H.d(this.f12366a.hashCode() * 31, 31, this.f12367b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MigrationDtoVer1(uuid=");
        sb2.append((Object) ("MetricsEventUuid(value=" + this.f12366a + ')'));
        sb2.append(", eventName=");
        sb2.append(this.f12367b);
        sb2.append(", eventData=");
        return androidx.appcompat.app.r.w(sb2, this.f12368c, ')');
    }

    public h0(String str, String str2, Map map) {
        this.f12366a = str;
        this.f12367b = str2;
        this.f12368c = map;
    }
}
