package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class v03 {
    public static final v03 c = new v03(hd5.a, true);
    public final Object a;
    public final boolean b;

    public v03(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v03)) {
            return false;
        }
        v03 v03Var = (v03) obj;
        return this.a.equals(v03Var.a) && this.b == v03Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatsList(chats=" + this.a + ", hasMore=" + this.b + ")";
    }
}
