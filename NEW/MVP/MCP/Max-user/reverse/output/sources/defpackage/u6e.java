package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class u6e implements Serializable, Comparable {
    public final fh9 X;
    public final long Y;
    public final jqc Z;
    public final int a;
    public final String b;
    public final List c;
    public final pb2 d;
    public final ku3 o;

    public u6e(int i, String str, List list, pb2 pb2Var, ku3 ku3Var, fh9 fh9Var, long j, jqc jqcVar) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = pb2Var;
        this.o = ku3Var;
        this.X = fh9Var;
        this.Y = j;
        this.Z = jqcVar;
    }

    public static u6e a(pb2 pb2Var, List list) {
        return new u6e(1, null, list, pb2Var, null, null, 0L, null);
    }

    public static u6e c(fh9 fh9Var, long j, String str, List list) {
        return new u6e(3, str, list, null, null, fh9Var, j, null);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u6e u6eVar = (u6e) obj;
        if (u6eVar == null) {
            return 0;
        }
        pb2 pb2Var = u6eVar.d;
        pb2 pb2Var2 = this.d;
        return (pb2Var2 == null || pb2Var == null) ? (pb2Var2 == null || pb2Var != null) ? 0 : -1 : Long.compare(pb2Var.o(), pb2Var2.o());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchResult{type=");
        sb.append(ctd.u(this.a));
        sb.append(", feedback='");
        sb.append(this.b);
        sb.append("', highlights=");
        sb.append(this.c.size());
        sb.append(", chat=");
        sb.append(this.d);
        sb.append(", contact=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.X);
        sb.append(", chatId=");
        return utb.l(sb, this.Y, '}');
    }
}
