package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class fg3 extends nc7 {
    public final String b;
    public final String c;
    public final String d;

    public fg3(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fg3.class == obj.getClass()) {
            fg3 fg3Var = (fg3) obj;
            if (Objects.equals(this.c, fg3Var.c) && Objects.equals(this.b, fg3Var.b) && Objects.equals(this.d, fg3Var.d)) {
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
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }
}
