package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class op6 extends pp6 {
    public final boolean b;
    public final vd8 c;
    public final ynd d;
    public final zub e;
    public final p2h f;
    public final Uri g;
    public int h;
    public final boolean i;
    public final long j;
    public final int k;
    public final Uri l;
    public final long m;

    public op6(boolean z, vd8 vd8Var, ynd yndVar, zub zubVar, p2h p2hVar, Uri uri, int i, boolean z2, long j, int i2, Uri uri2) {
        super(10);
        this.b = z;
        this.c = vd8Var;
        this.d = yndVar;
        this.e = zubVar;
        this.f = p2hVar;
        this.g = uri;
        this.h = i;
        this.i = z2;
        this.j = j;
        this.k = i2;
        this.l = uri2;
        Long l = vd8Var.Y;
        this.m = l != null ? l.longValue() : 0L;
    }

    public static op6 b(op6 op6Var, zub zubVar, p2h p2hVar, Uri uri, int i, boolean z, int i2, Uri uri2, int i3) {
        boolean z2 = op6Var.b;
        vd8 vd8Var = op6Var.c;
        ynd yndVar = op6Var.d;
        if ((i3 & 8) != 0) {
            zubVar = op6Var.e;
        }
        zub zubVar2 = zubVar;
        p2h p2hVar2 = (i3 & 16) != 0 ? op6Var.f : p2hVar;
        Uri uri3 = (i3 & 32) != 0 ? op6Var.g : uri;
        int i4 = (i3 & 64) != 0 ? op6Var.h : i;
        boolean z3 = (i3 & 128) != 0 ? op6Var.i : z;
        long j = op6Var.j;
        int i5 = (i3 & 512) != 0 ? op6Var.k : i2;
        Uri uri4 = (i3 & 1024) != 0 ? op6Var.l : uri2;
        op6Var.getClass();
        return new op6(z2, vd8Var, yndVar, zubVar2, p2hVar2, uri3, i4, z3, j, i5, uri4);
    }

    @Override // defpackage.pp6
    public final Long a() {
        return Long.valueOf(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op6)) {
            return false;
        }
        op6 op6Var = (op6) obj;
        return this.b == op6Var.b && fni.a(this.c, op6Var.c) && fni.a(this.d, op6Var.d) && fni.a(this.e, op6Var.e) && fni.a(this.f, op6Var.f) && fni.a(this.g, op6Var.g) && this.h == op6Var.h && this.i == op6Var.i && this.j == op6Var.j && this.k == op6Var.k && fni.a(this.l, op6Var.l);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (Boolean.hashCode(this.b) * 31)) * 31)) * 31;
        zub zubVar = this.e;
        int iHashCode2 = (iHashCode + (zubVar == null ? 0 : zubVar.hashCode())) * 31;
        p2h p2hVar = this.f;
        int iHashCode3 = (iHashCode2 + (p2hVar == null ? 0 : p2hVar.hashCode())) * 31;
        Uri uri = this.g;
        return this.l.hashCode() + xrf.k(this.k, a9h.a(a9h.b(xrf.k(this.h, (iHashCode3 + (uri != null ? uri.hashCode() : 0)) * 31, 31), 31, this.i), 31, this.j), 31);
    }

    public final String toString() {
        int i = this.h;
        StringBuilder sb = new StringBuilder("Media(multiSelect=");
        sb.append(this.b);
        sb.append(", origin=");
        sb.append(this.c);
        sb.append(", resizeOptions=");
        sb.append(this.d);
        sb.append(", photoEditorOptions=");
        sb.append(this.e);
        sb.append(", videoConvertOptions=");
        sb.append(this.f);
        sb.append(", overlay=");
        sb.append(this.g);
        sb.append(", selectionNumber=");
        sb.append(i);
        sb.append(", enabled=");
        sb.append(this.i);
        sb.append(", id=");
        utb.n(sb, this.j, ", rotation=", this.k);
        sb.append(", thumbnailUri=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
