package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class id9 implements kd9 {
    public final List a;

    public id9(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof id9) && this.a.equals(((id9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalDeleteMembers(ids=" + this.a + ")";
    }
}
