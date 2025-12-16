package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dk {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;

    public dk(long j, String str, String str2, String str3, long j2, List list) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk)) {
            return false;
        }
        dk dkVar = (dk) obj;
        return this.a == dkVar.a && fni.a(this.b, dkVar.b) && fni.a(this.c, dkVar.c) && fni.a(this.d, dkVar.d) && this.e == dkVar.e && fni.a(this.f, dkVar.f);
    }

    public final int hashCode() {
        int iE = u45.e(u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + a9h.a((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("AnimojiSetEntity(id=", this.a, ", name=", this.b);
        ho7.r(sbN, ", iconUrl=", this.c, ", iconLottieUrl=", this.d);
        az1.r(this.e, ", updateTime=", ", animojiIds=", sbN);
        return az1.j(sbN, this.f, ")");
    }
}
