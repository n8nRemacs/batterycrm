package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class in2 {
    public static final in2 d = new in2(hd5.a, false, false);
    public final List a;
    public final boolean b;
    public final boolean c;

    public in2(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in2)) {
            return false;
        }
        in2 in2Var = (in2) obj;
        return fni.a(this.a, in2Var.a) && this.b == in2Var.b && this.c == in2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + a9h.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachesViewState(messages=");
        sb.append(this.a);
        sb.append(", hasMoreNext=");
        sb.append(this.b);
        sb.append(", hasMorePrev=");
        return az1.k(sb, this.c, ")");
    }
}
