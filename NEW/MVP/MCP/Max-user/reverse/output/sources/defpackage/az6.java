package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class az6 implements cz6 {
    public final String a;
    public final s5g b;
    public final List c;

    public az6(String str, s5g s5gVar, List list) {
        this.a = str;
        this.b = s5gVar;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az6)) {
            return false;
        }
        az6 az6Var = (az6) obj;
        return fni.a(this.a, az6Var.a) && fni.a(this.b, az6Var.b) && fni.a(this.c, az6Var.c);
    }

    public final int hashCode() {
        int iD = xc0.d(this.a.hashCode() * 31, 31, this.b);
        List list = this.c;
        return iD + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(conversationId=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", avatarInfo=");
        return az1.j(sb, this.c, ")");
    }
}
