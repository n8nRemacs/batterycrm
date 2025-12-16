package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cc6 extends l0g {
    public final d9a X;
    public final long c;
    public final w8a d;
    public final List o;

    public cc6(long j, w8a w8aVar, List list, d9a d9aVar) {
        this.c = j;
        this.d = w8aVar;
        this.o = list;
        this.X = d9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc6)) {
            return false;
        }
        cc6 cc6Var = (cc6) obj;
        return this.c == cc6Var.c && fni.a(this.d, cc6Var.d) && fni.a(this.o, cc6Var.o) && fni.a(this.X, cc6Var.X);
    }

    public final int hashCode() {
        return this.X.hashCode() + xrf.l(this.o, (this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31, 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(folderSync=" + this.c + ", folders=" + this.d + ", foldersOrder=" + this.o + ", allFilterExcludeFolders=" + this.X + ")";
    }
}
