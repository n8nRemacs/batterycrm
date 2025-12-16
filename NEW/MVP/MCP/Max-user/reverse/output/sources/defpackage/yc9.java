package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public final class yc9 implements zc9 {
    public final long a;
    public final br2 b;
    public final Collection c;

    public yc9(long j, br2 br2Var, Collection collection) {
        this.a = j;
        this.b = br2Var;
        this.c = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc9)) {
            return false;
        }
        yc9 yc9Var = (yc9) obj;
        return this.a == yc9Var.a && this.b == yc9Var.b && fni.a(this.c, yc9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Remove(chatId=" + this.a + ", chatMemberType=" + this.b + ", ids=" + this.c + ")";
    }
}
