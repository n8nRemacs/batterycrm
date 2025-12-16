package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class n67 extends ml0 {
    public final String i;
    public final int j;
    public final int k;

    public n67(String str, long j, long j2, long j3, boolean z, ry ryVar, boolean z2, int i, int i2, int i3, int i4) {
        super(j2, j, z, j3, ryVar, z2, i, i2);
        this.i = str;
        this.j = i3;
        this.k = i4;
    }

    @Override // defpackage.f2h
    public final Uri a() {
        return Uri.parse(this.i);
    }

    @Override // defpackage.ml0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n67.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        n67 n67Var = (n67) obj;
        if (this.j == n67Var.j && this.k == n67Var.k) {
            return this.i.equals(n67Var.i);
        }
        return false;
    }

    @Override // defpackage.f2h
    public final int getHeight() {
        return this.k;
    }

    @Override // defpackage.f2h
    public final int getWidth() {
        return this.j;
    }

    @Override // defpackage.ml0
    public final int hashCode() {
        return ((u45.e(super.hashCode() * 31, 31, this.i) + this.j) * 31) + this.k;
    }
}
