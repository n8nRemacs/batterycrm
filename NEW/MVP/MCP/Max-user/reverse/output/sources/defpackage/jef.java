package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class jef implements Serializable {
    public final String X;
    public final String Y;
    public final String Z;
    public final long a;
    public final int b;
    public final int c;
    public final String d;
    public final long o;
    public final List s0;
    public final int t0;
    public final long u0;
    public final String v0;
    public final boolean w0;
    public final int x0;
    public final String y0;

    public jef(q10 q10Var) {
        this.a = q10Var.a;
        this.b = q10Var.b;
        this.c = q10Var.c;
        this.d = q10Var.d;
        this.o = q10Var.e;
        this.X = q10Var.f;
        this.Y = q10Var.g;
        this.Z = q10Var.h;
        this.s0 = q10Var.i;
        this.t0 = q10Var.j;
        this.u0 = q10Var.k;
        this.v0 = q10Var.l;
        this.w0 = q10Var.m;
        this.x0 = q10Var.n;
        this.y0 = q10Var.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jef.class != obj.getClass()) {
            return false;
        }
        jef jefVar = (jef) obj;
        String str = jefVar.v0;
        List list = jefVar.s0;
        String str2 = jefVar.Z;
        String str3 = jefVar.Y;
        String str4 = jefVar.X;
        String str5 = jefVar.d;
        if (this.a != jefVar.a || this.b != jefVar.b || this.c != jefVar.c || this.o != jefVar.o || this.u0 != jefVar.u0 || this.w0 != jefVar.w0) {
            return false;
        }
        String str6 = this.d;
        if (str6 != null) {
            if (!str6.equals(str5)) {
                return false;
            }
        } else if (str5 != null) {
            return false;
        }
        String str7 = this.X;
        if (str7 != null) {
            if (!str7.equals(str4)) {
                return false;
            }
        } else if (str4 != null) {
            return false;
        }
        String str8 = this.Y;
        if (str8 != null) {
            if (!str8.equals(str3)) {
                return false;
            }
        } else if (str3 != null) {
            return false;
        }
        String str9 = this.Z;
        if (str9 != null) {
            if (!str9.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        List list2 = this.s0;
        if (list2 != null) {
            if (!list2.equals(list)) {
                return false;
            }
        } else if (list != null) {
            return false;
        }
        if (this.t0 != jefVar.t0) {
            return false;
        }
        String str10 = this.v0;
        if (str10 != null) {
            if (!str10.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        return Objects.equals(this.y0, jefVar.y0) && this.x0 == jefVar.x0;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((((((int) (j ^ (j >>> 32))) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        long j2 = this.o;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str2 = this.X;
        int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.Y;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.Z;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List list = this.s0;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        int i3 = this.t0;
        int iV = (iHashCode5 + (i3 != 0 ? az1.v(i3) : 0)) * 961;
        long j3 = this.u0;
        int i4 = (iV + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str5 = this.v0;
        int iHashCode6 = (((i4 + (str5 != null ? str5.hashCode() : 0)) * 31) + (this.w0 ? 1 : 0)) * 961;
        int i5 = this.x0;
        int iV2 = (iHashCode6 + (i5 != 0 ? az1.v(i5) : 0)) * 31;
        String str6 = this.y0;
        return iV2 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Sticker{id=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", url='");
        sb.append(this.d);
        az1.r(this.o, "', updateTime=", ", mp4Url='", sb);
        ho7.r(sb, this.X, "', firstUrl='", this.Y, "', previewUrl='");
        sb.append(this.Z);
        sb.append("', tags=");
        sb.append(this.s0);
        sb.append(", stickerType=");
        sb.append(ctd.r(this.t0));
        sb.append(", external=false, setId=");
        sb.append(this.u0);
        sb.append(", lottieUrl='");
        sb.append(this.v0);
        sb.append("', audio=");
        sb.append(this.w0);
        sb.append(", photoAttach=null, stickerAuthorType=");
        sb.append(ctd.p(this.x0));
        sb.append(", videoUrl='");
        sb.append(this.y0);
        sb.append("'}");
        return sb.toString();
    }
}
