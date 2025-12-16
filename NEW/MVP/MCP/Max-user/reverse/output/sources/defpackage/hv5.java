package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class hv5 implements m00 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public final Layout f;
    public final gv5 g;
    public final String h;
    public final int i;
    public final od7 j;
    public final s0h k;
    public final boolean l;
    public final hbd m;

    public hv5(long j, long j2, String str, String str2, long j3, Layout layout, gv5 gv5Var, String str3, int i, od7 od7Var, s0h s0hVar, boolean z, hbd hbdVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
        this.f = layout;
        this.g = gv5Var;
        this.h = str3;
        this.i = i;
        this.j = od7Var;
        this.k = s0hVar;
        this.l = z;
        this.m = hbdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv5)) {
            return false;
        }
        hv5 hv5Var = (hv5) obj;
        return this.b == hv5Var.b && this.a == hv5Var.a && fni.a(this.c, hv5Var.c) && fni.a(this.d, hv5Var.d) && this.e == hv5Var.e && fni.a(this.f, hv5Var.f) && fni.a(this.g, hv5Var.g) && fni.a(this.h, hv5Var.h) && this.i == hv5Var.i && fni.a(this.j, hv5Var.j) && fni.a(this.k, hv5Var.k) && this.l == hv5Var.l;
    }

    public final int hashCode() {
        int iHashCode = (this.g.hashCode() + ((this.f.hashCode() + a9h.a(u45.e(u45.e(a9h.a(Long.hashCode(this.b) * 31, 31, this.a), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31;
        String str = this.h;
        int iK = utb.k(this.i, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        od7 od7Var = this.j;
        int iHashCode2 = (iK + (od7Var != null ? od7Var.hashCode() : 0)) * 31;
        s0h s0hVar = this.k;
        return Boolean.hashCode(this.l) + ((iHashCode2 + (s0hVar != null ? s0hVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "FileAttachModel(fileId=", ", messageId=");
        hf3.e(this.b, ", attachLocalId=", this.c, sbL);
        sbL.append(", fileName=");
        sbL.append(this.d);
        sbL.append(", fileSize=");
        sbL.append(this.e);
        sbL.append(", fileNameLayout=");
        sbL.append(this.f);
        sbL.append(", extension=");
        sbL.append(this.g);
        sbL.append(", localPath=");
        sbL.append(this.h);
        sbL.append(", type=");
        int i = this.i;
        sbL.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "UNKNOWN" : "GIF" : "VIDEO" : "PHOTO");
        sbL.append(", imageAttachConfig=");
        sbL.append(this.j);
        sbL.append(", videoAttachConfig=");
        sbL.append(this.k);
        sbL.append(", hasText=");
        sbL.append(this.l);
        sbL.append(", stateFlow=");
        sbL.append(this.m);
        sbL.append(")");
        return sbL.toString();
    }
}
