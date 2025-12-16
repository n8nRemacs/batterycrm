package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class wb9 extends yb9 {
    public final Long X;
    public final String Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final long c;
    public final Uri d;
    public final int o;
    public final Uri s0;
    public final boolean t0;
    public final boolean u0;
    public final int v0 = fzc.profile_media_view_type_photo_video;

    public wb9(long j, long j2, long j3, Uri uri, int i, Long l, String str, boolean z, Uri uri2, boolean z2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = uri;
        this.o = i;
        this.X = l;
        this.Y = str;
        this.Z = z;
        this.s0 = uri2;
        this.t0 = z2;
        this.u0 = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb9)) {
            return false;
        }
        wb9 wb9Var = (wb9) obj;
        return this.a == wb9Var.a && this.b == wb9Var.b && this.c == wb9Var.c && fni.a(this.d, wb9Var.d) && this.o == wb9Var.o && fni.a(this.X, wb9Var.X) && fni.a(this.Y, wb9Var.Y) && this.Z == wb9Var.Z && fni.a(this.s0, wb9Var.s0) && this.t0 == wb9Var.t0 && this.u0 == wb9Var.u0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        Uri uri = this.d;
        int iK = utb.k(this.o, (iA + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        Long l = this.X;
        int iB = a9h.b(u45.e((iK + (l == null ? 0 : l.hashCode())) * 31, 31, this.Y), 31, this.Z);
        Uri uri2 = this.s0;
        return Boolean.hashCode(this.u0) + a9h.b((iB + (uri2 != null ? uri2.hashCode() : 0)) * 31, 31, this.t0);
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
        return this.u0;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.v0;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "PhotoVideo(itemId=", ", messageId=");
        sbL.append(this.b);
        az1.r(this.c, ", attachId=", ", previewUri=", sbL);
        sbL.append(this.d);
        sbL.append(", type=");
        int i = this.o;
        sbL.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "VIDEO" : "PHOTO");
        sbL.append(", duration=");
        sbL.append(this.X);
        sbL.append(", attachLocalId=");
        sbL.append(this.Y);
        sbL.append(", isInCollage=");
        sbL.append(this.Z);
        sbL.append(", lowResUri=");
        sbL.append(this.s0);
        sbL.append(", isAutoloadDisabled=");
        sbL.append(this.t0);
        sbL.append(", isContentLevel=");
        sbL.append(this.u0);
        sbL.append(")");
        return sbL.toString();
    }
}
