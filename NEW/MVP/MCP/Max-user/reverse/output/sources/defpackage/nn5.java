package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nn5 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final gf3 i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final ExportException p;
    public final wg7 q;

    public nn5(zjd zjdVar, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, gf3 gf3Var, int i5, int i6, int i7, String str3, String str4, int i8, ExportException exportException) {
        this.q = zjdVar;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = gf3Var;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.p = exportException;
        a(str2, i8, zjdVar, 1);
        a(str4, i8, zjdVar, 2);
    }

    public static void a(String str, int i, zjd zjdVar, int i2) {
        if (str == null || i == 1) {
            return;
        }
        char c = 0;
        t76 t76VarListIterator = zjdVar.listIterator(0);
        while (t76VarListIterator.hasNext()) {
            mn5 mn5Var = (mn5) t76VarListIterator.next();
            if ((i2 == 1 ? mn5Var.d : mn5Var.e) == null) {
                if (c == 1) {
                    return;
                } else {
                    c = 2;
                }
            } else if (c == 2) {
                return;
            } else {
                c = 1;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nn5)) {
            return false;
        }
        nn5 nn5Var = (nn5) obj;
        return Objects.equals(this.q, nn5Var.q) && this.a == nn5Var.a && this.b == nn5Var.b && this.c == nn5Var.c && this.d == nn5Var.d && this.e == nn5Var.e && Objects.equals(this.f, nn5Var.f) && Objects.equals(this.g, nn5Var.g) && this.h == nn5Var.h && Objects.equals(this.i, nn5Var.i) && this.j == nn5Var.j && this.k == nn5Var.k && this.l == nn5Var.l && Objects.equals(this.m, nn5Var.m) && Objects.equals(this.n, nn5Var.n) && this.o == nn5Var.o && Objects.equals(this.p, nn5Var.p);
    }

    public final int hashCode() {
        return Objects.hashCode(this.p) + ((((Objects.hashCode(this.n) + ((Objects.hashCode(this.m) + ((((((((Objects.hashCode(this.i) + ((((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}
