package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class ti1 {
    public final long a;
    public final int b;
    public final int c;

    public ti1(int i, int i2, long j) {
        this.a = j;
        this.b = i;
        this.c = i2;
    }

    public static ti1 a(String str) throws NumberFormatException {
        long j = 0;
        int i = 1;
        int i2 = 0;
        for (String str2 : str.split(":")) {
            if (str2.startsWith("d")) {
                i2 = Integer.parseInt(str2.substring(1));
            } else {
                boolean zStartsWith = str2.startsWith("g");
                boolean zStartsWith2 = str2.startsWith("u");
                if (zStartsWith || zStartsWith2) {
                    i = zStartsWith ? 2 : 1;
                    j = Long.parseLong(str2.substring(1));
                } else {
                    char cCharAt = str2.charAt(0);
                    if (Character.isDigit(cCharAt) || cCharAt == '-') {
                        j = Long.parseLong(str2);
                    }
                }
            }
        }
        return new ti1(i, i2, j);
    }

    public final String b() {
        return String.valueOf(xc0.a(this.b)) + this.a + ":d" + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ti1.class != obj.getClass()) {
            return false;
        }
        ti1 ti1Var = (ti1) obj;
        return this.a == ti1Var.a && this.c == ti1Var.c && this.b == ti1Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), az1.a(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        return b();
    }
}
