package defpackage;

/* loaded from: classes2.dex */
public final class qte {
    public final s5g a;
    public final s5g b;
    public final String c;
    public final Integer d;

    public qte(s5g s5gVar, s5g s5gVar2, String str, Integer num) {
        this.a = s5gVar;
        this.b = s5gVar2;
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qte)) {
            return false;
        }
        qte qteVar = (qte) obj;
        return this.a.equals(qteVar.a) && fni.a(this.b, qteVar.b) && fni.a(this.c, qteVar.c) && fni.a(this.d, qteVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s5g s5gVar = this.b;
        int iHashCode2 = (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=" + this.c + ", count=" + this.d + ", placeholder=null)";
    }
}
