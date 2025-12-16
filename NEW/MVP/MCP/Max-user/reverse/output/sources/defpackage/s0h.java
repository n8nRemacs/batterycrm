package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class s0h implements jd3 {
    public static final s0h l;
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final String g;
    public final Uri h;
    public final ynd i;
    public final p10 j;
    public final boolean k;

    static {
        Uri uri = Uri.EMPTY;
        int i = s65.d;
        l = new s0h(0L, uri, -1, -1, -1, 0L, (String) null, (Uri) null, (ynd) null, (p10) null, 1856);
    }

    public s0h(long j, Uri uri, int i, int i2, int i3, long j2, String str, Uri uri2, ynd yndVar, p10 p10Var, boolean z) {
        this.a = j;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = j2;
        this.g = str;
        this.h = uri2;
        this.i = yndVar;
        this.j = p10Var;
        this.k = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0h)) {
            return false;
        }
        s0h s0hVar = (s0h) obj;
        return this.a == s0hVar.a && fni.a(this.b, s0hVar.b) && this.c == s0hVar.c && this.d == s0hVar.d && this.e == s0hVar.e && s65.e(this.f, s0hVar.f) && fni.a(this.g, s0hVar.g) && fni.a(this.h, s0hVar.h) && fni.a(this.i, s0hVar.i) && this.j == s0hVar.j && this.k == s0hVar.k;
    }

    public final int hashCode() {
        int iK = xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31);
        int i = s65.d;
        int iA = a9h.a(iK, 31, this.f);
        String str = this.g;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.h;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        ynd yndVar = this.i;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((iHashCode2 + (yndVar != null ? yndVar.hashCode() : 0)) * 31)) * 31);
    }

    @Override // defpackage.jd3
    public final String i() {
        return this.g;
    }

    @Override // defpackage.jd3
    public final boolean j() {
        return this.k;
    }

    public final String toString() {
        String strN = s65.n(this.f);
        StringBuilder sb = new StringBuilder("VideoAttachConfig(videoId=");
        sb.append(this.a);
        sb.append(", previewUri=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", maxImageViewHeight=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(strN);
        sb.append(", attachId=");
        sb.append(this.g);
        sb.append(", lowResUri=");
        sb.append(this.h);
        sb.append(", previewResizeOptions=");
        sb.append(this.i);
        sb.append(", status=");
        sb.append(this.j);
        return vb9.f(sb, ", isAutoLoadImageDisabled=", this.k, ")");
    }

    public /* synthetic */ s0h(long j, Uri uri, int i, int i2, int i3, long j2, String str, Uri uri2, ynd yndVar, p10 p10Var, int i4) {
        this(j, uri, i, i2, i3, j2, (i4 & 64) != 0 ? null : str, uri2, (i4 & 256) != 0 ? null : yndVar, (i4 & 512) != 0 ? p10.a : p10Var, false);
    }
}
