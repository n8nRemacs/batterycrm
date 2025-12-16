package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class l0f {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public l0f(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final String a(int i) {
        switch (k0f.$EnumSwitchMapping$0[az1.v(i)]) {
            case 1:
                return this.a;
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0f)) {
            return false;
        }
        l0f l0fVar = (l0f) obj;
        return fni.a(this.a, l0fVar.a) && fni.a(this.b, l0fVar.b) && fni.a(this.c, l0fVar.c) && fni.a(this.d, l0fVar.d) && fni.a(this.e, l0fVar.e) && fni.a(this.f, l0fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + u45.e(u45.e(u45.e(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("SignalingType(restart=", this.a, ", connected=", this.b, ", reconnected=");
        ho7.r(sbL, this.c, ", failedByPings=", this.d, ", failedByException=");
        sbL.append(this.e);
        sbL.append(", timeout=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
