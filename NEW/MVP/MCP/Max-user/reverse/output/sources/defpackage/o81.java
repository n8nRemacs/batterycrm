package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class o81 {
    public final String a;
    public final int b;
    public final int c;

    public o81(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o81.class != obj.getClass()) {
            return false;
        }
        o81 o81Var = (o81) obj;
        return this.a.equals(o81Var.a) && this.b == o81Var.b && this.c == o81Var.c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.c);
        return Objects.hash(this.a, az1.a(this.b), numValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallExternalId{id='");
        sb.append(this.a);
        sb.append("', type=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "ANONYM" : "VK" : "UNKNOWN");
        sb.append(", deviceIndex=");
        return xc0.h(sb, this.c, '}');
    }
}
