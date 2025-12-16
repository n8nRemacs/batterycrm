package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class oja extends l0g {
    public final d9a X;
    public final long c;
    public final w8a d;
    public final List o;

    public oja(long j, w8a w8aVar, List list, d9a d9aVar) {
        this.c = j;
        this.d = w8aVar;
        this.o = list;
        this.X = d9aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oja)) {
            return false;
        }
        oja ojaVar = (oja) obj;
        return this.c == ojaVar.c && fni.a(this.d, ojaVar.d) && fni.a(this.o, ojaVar.o) && fni.a(this.X, ojaVar.X);
    }

    public final int hashCode() {
        return this.X.hashCode() + xrf.l(this.o, (this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31, 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(folderSync=" + this.c + ", folders=" + this.d + ", foldersOrder=" + this.o + ", allFilterExcludeFolders=" + this.X + ")";
    }
}
