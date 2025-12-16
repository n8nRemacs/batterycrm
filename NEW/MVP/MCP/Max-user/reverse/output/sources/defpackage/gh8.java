package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class gh8 extends l0g implements xg8 {
    public final Map X;
    public final String Y;
    public final long Z;
    public final wac c;
    public final List d;
    public final List o;
    public final po3 s0;
    public final Map t0;
    public final long u0;
    public final List v0;
    public final boolean w0;
    public final long x0;
    public final o35 y0;
    public final long z0;

    public gh8(wac wacVar, List list, List list2, Map map, String str, long j, po3 po3Var, Map map2, long j2, List list3, boolean z, long j3, o35 o35Var, long j4) {
        this.c = wacVar;
        this.d = list;
        this.o = list2;
        this.X = map;
        this.Y = str;
        this.Z = j;
        this.s0 = po3Var;
        this.t0 = map2;
        this.u0 = j2;
        this.v0 = list3;
        this.w0 = z;
        this.x0 = j3;
        this.y0 = o35Var;
        this.z0 = j4;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j4));
    }

    @Override // defpackage.xg8
    public final String a(boolean z, boolean z2) {
        nud nudVar;
        Map map;
        po3 po3Var = this.s0;
        if (po3Var != null && (nudVar = po3Var.b) != null && (map = (Map) nudVar.b) != null) {
            if (map.containsKey("log-full")) {
                Object obj = map.get("log-full");
                z = Boolean.parseBoolean(obj != null ? obj.toString() : null);
            }
            if (map.containsKey("log-sensitive")) {
                Object obj2 = map.get("log-sensitive");
                z2 = Boolean.parseBoolean(obj2 != null ? obj2.toString() : null);
            }
        }
        StringBuilder sb = new StringBuilder("LOGIN.Response(profile=");
        sb.append(String.valueOf(this.c));
        sb.append(",token=");
        String str = this.Y;
        sb.append(z2 ? str != null ? str.toString() : "NULL" : l8g.f(str));
        sb.append(",time=");
        sb.append(this.Z);
        sb.append(",chatMarker=");
        sb.append(this.u0);
        sb.append(",videoChatHistory=");
        sb.append(this.w0);
        sb.append(",resetAt=");
        sb.append(this.x0);
        sb.append(",contactInfos=");
        sb.append(eri.b(this.o, z, z2));
        sb.append(",config=");
        sb.append(po3Var);
        sb.append(",messages=");
        sb.append(eri.c(this.t0, z, z2));
        sb.append(",chats=");
        sb.append(eri.b(this.d, z, z2));
        sb.append(",presence=");
        sb.append(eri.c(this.X, z, z2));
        sb.append(",calls=");
        sb.append(eri.b(this.v0, z, z2));
        sb.append(",draftsNews=");
        sb.append(this.y0);
        sb.append(')');
        return sb.toString();
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.o) {
            if (((gx3) obj) != ex3.z0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh8)) {
            return false;
        }
        gh8 gh8Var = (gh8) obj;
        return fni.a(this.c, gh8Var.c) && fni.a(this.d, gh8Var.d) && fni.a(this.o, gh8Var.o) && fni.a(this.X, gh8Var.X) && fni.a(this.Y, gh8Var.Y) && this.Z == gh8Var.Z && fni.a(this.s0, gh8Var.s0) && fni.a(this.t0, gh8Var.t0) && this.u0 == gh8Var.u0 && fni.a(this.v0, gh8Var.v0) && this.w0 == gh8Var.w0 && this.x0 == gh8Var.x0 && fni.a(this.y0, gh8Var.y0) && this.z0 == gh8Var.z0;
    }

    public final int hashCode() {
        wac wacVar = this.c;
        int iHashCode = (this.X.hashCode() + xrf.l(this.o, xrf.l(this.d, (wacVar == null ? 0 : wacVar.hashCode()) * 31, 31), 31)) * 31;
        String str = this.Y;
        int iA = a9h.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.Z);
        po3 po3Var = this.s0;
        int iA2 = a9h.a(a9h.b(xrf.l(this.v0, a9h.a((this.t0.hashCode() + ((iA + (po3Var == null ? 0 : po3Var.hashCode())) * 31)) * 31, 31, this.u0), 31), 31, this.w0), 31, this.x0);
        o35 o35Var = this.y0;
        return Long.hashCode(this.z0) + ((iA2 + (o35Var != null ? o35Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return a(false, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gh8() {
        hd5 hd5Var = hd5.a;
        id5 id5Var = id5.a;
        this(null, hd5Var, hd5Var, id5Var, null, 0L, null, id5Var, 0L, hd5Var, false, 0L, null, 0L);
    }
}
