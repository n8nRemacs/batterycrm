package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class dl2 implements fl2 {
    public final List a;

    public dl2(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl2) && fni.a(this.a, ((dl2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Remove(messageIds=" + this.a + ")";
    }
}
