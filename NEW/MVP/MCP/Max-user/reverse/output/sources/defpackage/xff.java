package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class xff {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;

    public xff(qff qffVar) {
        this.a = qffVar.a;
        this.b = qffVar.b;
        this.c = qffVar.c;
        this.d = qffVar.d;
        this.e = qffVar.e;
        this.f = qffVar.f;
        this.g = qffVar.g;
        this.h = qffVar.h;
        this.i = qffVar.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xff.class != obj.getClass()) {
            return false;
        }
        xff xffVar = (xff) obj;
        String str = xffVar.c;
        String str2 = xffVar.b;
        if (this.a != xffVar.a || this.d != xffVar.d || this.e != xffVar.e || this.f != xffVar.f || this.i != xffVar.i) {
            return false;
        }
        String str3 = this.b;
        if (str3 == null ? str2 != null : !str3.equals(str2)) {
            return false;
        }
        String str4 = this.c;
        if (str4 == null ? str != null : !str4.equals(str)) {
            return false;
        }
        if (this.g.equals(xffVar.g)) {
            return this.h.equals(xffVar.h);
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f;
        return ((this.h.hashCode() + u45.e((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.g)) * 31) + (this.i ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("StickerSetData{id=", this.a, ", name='", this.b);
        sbN.append("', iconUrl='");
        sbN.append(this.c);
        sbN.append("', authorId=");
        sbN.append(this.d);
        az1.r(this.e, ", createTime=", ", updateTime=", sbN);
        hf3.e(this.f, ", link='", this.g, sbN);
        sbN.append("', stickers=");
        sbN.append(this.h);
        sbN.append(", draft=");
        sbN.append(this.i);
        sbN.append("}");
        return sbN.toString();
    }
}
