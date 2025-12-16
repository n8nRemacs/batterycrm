package lc1;

import N41.j;
import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f413947a;

    /* renamed from: b, reason: collision with root package name */
    public final String f413948b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f413949c;

    /* renamed from: d, reason: collision with root package name */
    public final j f413950d;

    public d(String str, String str2, Integer num, j jVar) {
        this.f413947a = str;
        this.f413948b = str2;
        this.f413949c = num;
        this.f413950d = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f413947a, dVar.f413947a) && L.f(this.f413948b, dVar.f413948b) && L.f(this.f413949c, dVar.f413949c) && L.f(this.f413950d, dVar.f413950d);
    }

    public final int hashCode() {
        int iHashCode = this.f413947a.hashCode() * 31;
        String str = this.f413948b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f413949c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        j jVar = this.f413950d;
        return iHashCode3 + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        return "LinkModel(webLink=" + this.f413947a + ", clientId=" + this.f413948b + ", partnerColorInt=" + this.f413949c + ", openIn=" + this.f413950d + ")";
    }
}
