package defpackage;

/* loaded from: classes2.dex */
public final class sza {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final boolean f;

    public /* synthetic */ sza(int i, Integer num, Integer num2, Integer num3, Integer num4, int i2) {
        this(i, num, (i2 & 4) != 0 ? null : num2, num3, (i2 & 16) != 0 ? null : num4, true);
    }

    public static sza a(sza szaVar, boolean z) {
        return new sza(szaVar.a, szaVar.b, szaVar.c, szaVar.d, szaVar.e, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sza)) {
            return false;
        }
        sza szaVar = (sza) obj;
        return this.a == szaVar.a && fni.a(this.b, szaVar.b) && fni.a(this.c, szaVar.c) && fni.a(this.d, szaVar.d) && fni.a(this.e, szaVar.e) && this.f == szaVar.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ButtonData(id=" + this.a + ", textRes=" + this.b + ", textColor=" + this.c + ", iconRes=" + this.d + ", iconColor=" + this.e + ", isEnabled=" + this.f + ")";
    }

    public sza(int i, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
        this.f = z;
    }
}
