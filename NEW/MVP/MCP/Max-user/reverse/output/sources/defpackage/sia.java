package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class sia {
    public final long a;
    public final s00 b;

    public sia(long j, s00 s00Var) {
        this.a = j;
        this.b = s00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sia) {
            sia siaVar = (sia) obj;
            if (this.a == siaVar.a && this.b == siaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
