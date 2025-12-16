package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class hp7 extends nc7 {
    public final String b;
    public final String c;
    public final String d;

    public hp7(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hp7.class == obj.getClass()) {
            hp7 hp7Var = (hp7) obj;
            if (Objects.equals(this.c, hp7Var.c) && Objects.equals(this.b, hp7Var.b) && Objects.equals(this.d, hp7Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.nc7
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
