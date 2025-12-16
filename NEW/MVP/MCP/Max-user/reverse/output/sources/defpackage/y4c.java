package defpackage;

import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y4c {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final o34 e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Map j;
    public long k = SystemClock.elapsedRealtime();

    public y4c(String str, String str2, String str3, String str4, o34 o34Var, String str5, boolean z, boolean z2, boolean z3, Map map) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = o34Var;
        this.f = str5;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4c)) {
            return false;
        }
        y4c y4cVar = (y4c) obj;
        return fni.a(this.a, y4cVar.a) && fni.a(this.b, y4cVar.b) && fni.a(this.c, y4cVar.c) && fni.a(this.d, y4cVar.d) && this.e == y4cVar.e && fni.a(this.f, y4cVar.f) && this.g == y4cVar.g && this.h == y4cVar.h && this.i == y4cVar.i && fni.a(this.j, y4cVar.j);
    }

    public final int hashCode() {
        String str = this.a;
        int iE = u45.e(u45.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        int iHashCode = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
        o34 o34Var = this.e;
        int iHashCode2 = (iHashCode + (o34Var == null ? 0 : o34Var.hashCode())) * 31;
        String str3 = this.f;
        return this.j.hashCode() + a9h.b(a9h.b(a9h.b((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("PlayerStatInfo(videoId=", this.a, ", sessionId=", this.b, ", interactiveSessionId=");
        ho7.r(sbL, this.c, ", cdnHost=", this.d, ", contentType=");
        sbL.append(this.e);
        sbL.append(", place=");
        sbL.append(this.f);
        sbL.append(", isAuto=");
        az1.t(", isLive=", ", inHistory=", sbL, this.g, this.h);
        sbL.append(this.i);
        sbL.append(", params=");
        sbL.append(this.j);
        sbL.append(")");
        return sbL.toString();
    }
}
