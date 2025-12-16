package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o97 implements Serializable {
    public final int a;
    public final String b;
    public final String c;

    public o97(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o97.class == obj.getClass() && this.a == ((o97) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpError{code=");
        sb.append(this.a);
        sb.append(", error='");
        sb.append(this.b);
        sb.append("', reason='");
        return ho7.l(sb, this.c, "'}");
    }

    public o97(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
