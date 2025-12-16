package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class xb9 extends yb9 {
    public final String X;
    public final String Y;
    public final fve Z;
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final Uri o;
    public final int s0 = fzc.profile_media_view_type_video_msg;

    public xb9(long j, long j2, long j3, String str, Uri uri, String str2, String str3, fve fveVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.o = uri;
        this.X = str2;
        this.Y = str3;
        this.Z = fveVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb9)) {
            return false;
        }
        xb9 xb9Var = (xb9) obj;
        return this.a == xb9Var.a && this.b == xb9Var.b && this.c == xb9Var.c && fni.a(this.d, xb9Var.d) && fni.a(this.o, xb9Var.o) && fni.a(this.X, xb9Var.X) && fni.a(this.Y, xb9Var.Y) && fni.a(this.Z, xb9Var.Z);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iE = u45.e(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        Uri uri = this.o;
        return Boolean.hashCode(false) + ((this.Z.hashCode() + u45.e(u45.e((iE + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.X), 31, this.Y)) * 31);
    }

    @Override // defpackage.yb9
    public final long i() {
        return this.c;
    }

    @Override // defpackage.yb9
    public final long j() {
        return this.b;
    }

    @Override // defpackage.yb9
    public final boolean l() {
        return false;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.s0;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "VideoMsg(itemId=", ", messageId=");
        sbL.append(this.b);
        az1.r(this.c, ", attachId=", ", attachLocalId=", sbL);
        sbL.append(this.d);
        sbL.append(", preview=");
        sbL.append(this.o);
        sbL.append(", title=");
        ho7.r(sbL, this.X, ", subtitle=", this.Y, ", state=");
        sbL.append(this.Z);
        sbL.append(", isContentLevel=false)");
        return sbL.toString();
    }
}
