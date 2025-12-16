package defpackage;

/* loaded from: classes2.dex */
public final class ytb extends pj0 implements Comparable {
    public final String X;
    public final String Y;
    public final String Z;
    public final long b;
    public final int c;
    public final String d;
    public final long o;
    public final String s0;
    public final int t0;

    public ytb(long j, long j2, int i, String str, long j3, String str2, String str3, String str4, String str5, int i2) {
        super(j);
        this.b = j2;
        this.c = i;
        this.d = str;
        this.o = j3;
        this.X = str2;
        this.Y = str3;
        this.Z = str4;
        this.s0 = str5;
        this.t0 = utb.b(i2);
    }

    public final String c() {
        String str = this.Y;
        if (!l8g.d(str)) {
            return str;
        }
        String str2 = this.Z;
        if (!l8g.d(str2)) {
            return str;
        }
        return str + " " + str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c().compareTo(((ytb) obj).c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ytb.class != obj.getClass()) {
            return false;
        }
        ytb ytbVar = (ytb) obj;
        String str = ytbVar.s0;
        String str2 = ytbVar.Z;
        String str3 = ytbVar.Y;
        String str4 = ytbVar.d;
        if (this.c != ytbVar.c) {
            return false;
        }
        String str5 = this.d;
        if (str5 == null ? str4 != null : !str5.equals(str4)) {
            return false;
        }
        String str6 = this.Y;
        if (str6 == null ? str3 != null : !str6.equals(str3)) {
            return false;
        }
        String str7 = this.Z;
        if (str7 == null ? str2 != null : !str7.equals(str2)) {
            return false;
        }
        String str8 = this.s0;
        return str8 == null ? str == null : str8.equals(str);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "PhoneDb{phonebookId=" + this.b + ", contactId=" + this.c + ", phone='" + this.d + "', serverPhone=" + this.o + ", firstName='" + this.Y + "', lastName='" + this.Z + "', type=" + utb.p(this.t0) + '}';
    }
}
