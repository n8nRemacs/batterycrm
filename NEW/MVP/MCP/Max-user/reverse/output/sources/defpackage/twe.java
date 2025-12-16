package defpackage;

/* loaded from: classes2.dex */
public final class twe extends laj {
    public final String a;
    public final String b;
    public final n5g c;
    public final boolean d;
    public final s5g e;
    public final Integer f;

    public twe(String str, String str2, n5g n5gVar, boolean z, s5g s5gVar, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = n5gVar;
        this.d = z;
        this.e = s5gVar;
        this.f = num;
    }

    @Override // defpackage.laj
    public final s5g a() {
        return this.e;
    }

    @Override // defpackage.laj
    public final Integer b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twe)) {
            return false;
        }
        twe tweVar = (twe) obj;
        return fni.a(this.a, tweVar.a) && fni.a(this.b, tweVar.b) && this.c.equals(tweVar.c) && this.d == tweVar.d && fni.a(this.e, tweVar.e) && this.f.equals(tweVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iB = a9h.b(a9h.b(xrf.k(this.c.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, false), 31, this.d);
        s5g s5gVar = this.e;
        return this.f.hashCode() + ((iB + (s5gVar != null ? s5gVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("Input(prefix=", this.a, ", link=", this.b, ", placeholder=");
        sbL.append(this.c);
        sbL.append(", shouldShowMore=false, shouldShowDescription=");
        sbL.append(this.d);
        sbL.append(", hint=");
        sbL.append(this.e);
        sbL.append(", hintColor=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
