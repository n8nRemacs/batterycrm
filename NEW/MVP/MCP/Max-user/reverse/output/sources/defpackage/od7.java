package defpackage;

import android.net.Uri;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class od7 implements jd3 {
    public static final od7 n = new od7(0, Uri.parse(NegotiationErrorStat.KEY_ERROR), -1, -1, false, -1, false, null, null, null, null, null, 7680);
    public final long a;
    public final Uri b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final Uri h;
    public final ynd i;
    public final tyd j;
    public final String k;
    public final Uri l;
    public final String m;

    public od7(long j, Uri uri, int i, int i2, boolean z, int i3, boolean z2, Uri uri2, ynd yndVar, String str, Uri uri3, String str2, int i4) {
        ynd yndVar2 = (i4 & 256) != 0 ? null : yndVar;
        tyd tydVar = tyd.c;
        String str3 = (i4 & 1024) != 0 ? null : str;
        Uri uri4 = (i4 & 2048) != 0 ? null : uri3;
        String str4 = (i4 & 4096) == 0 ? str2 : null;
        this.a = j;
        this.b = uri;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = z2;
        this.h = uri2;
        this.i = yndVar2;
        this.j = tydVar;
        this.k = str3;
        this.l = uri4;
        this.m = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od7)) {
            return false;
        }
        od7 od7Var = (od7) obj;
        return this.a == od7Var.a && fni.a(this.b, od7Var.b) && this.c == od7Var.c && this.d == od7Var.d && this.e == od7Var.e && this.f == od7Var.f && this.g == od7Var.g && fni.a(this.h, od7Var.h) && fni.a(this.i, od7Var.i) && fni.a(this.j, od7Var.j) && fni.a(this.k, od7Var.k) && fni.a(this.l, od7Var.l) && fni.a(this.m, od7Var.m);
    }

    public final int hashCode() {
        int iB = a9h.b(xrf.k(this.f, a9h.b(xrf.k(this.d, xrf.k(this.c, (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31), 31), 31, this.e), 31), 31, this.g);
        Uri uri = this.h;
        int iHashCode = (iB + (uri == null ? 0 : uri.hashCode())) * 31;
        ynd yndVar = this.i;
        int iHashCode2 = (this.j.hashCode() + ((iHashCode + (yndVar == null ? 0 : yndVar.hashCode())) * 31)) * 31;
        String str = this.k;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri2 = this.l;
        int iHashCode4 = (iHashCode3 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        String str2 = this.m;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.jd3
    public final String i() {
        return this.k;
    }

    @Override // defpackage.jd3
    public final boolean j() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageAttachConfig(photoId=");
        sb.append(this.a);
        sb.append(", uri=");
        sb.append(this.b);
        sb.append(", width=");
        sb.append(this.c);
        sb.append(", height=");
        sb.append(this.d);
        sb.append(", isGif=");
        sb.append(this.e);
        sb.append(", maxImageViewHeight=");
        sb.append(this.f);
        sb.append(", isAutoLoadImageDisabled=");
        sb.append(this.g);
        sb.append(", lowResUri=");
        sb.append(this.h);
        sb.append(", resizeOptions=");
        sb.append(this.i);
        sb.append(", scaleType=");
        sb.append(this.j);
        sb.append(", attachId=");
        sb.append(this.k);
        sb.append(", gifUri=");
        sb.append(this.l);
        return ctd.j(sb, ", url=", this.m, ")");
    }
}
