package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jtg extends sj0 {
    public final long b;
    public final List c;

    public jtg(long j, List list) {
        this.b = j;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtg)) {
            return false;
        }
        jtg jtgVar = (jtg) obj;
        return this.b == jtgVar.b && fni.a(this.c, jtgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    @Override // defpackage.sj0
    public final String toString() {
        return "UpdateMessagesEvent(chatId=" + this.b + ", messageIds=" + this.c + ")";
    }
}
