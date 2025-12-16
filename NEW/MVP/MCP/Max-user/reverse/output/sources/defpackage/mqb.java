package defpackage;

/* loaded from: classes2.dex */
public final class mqb implements sqb {
    public final String a;
    public final c9a b;

    public mqb(String str, c9a c9aVar) {
        this.a = str;
        this.b = c9aVar;
    }

    @Override // defpackage.sqb
    public final String a() {
        return this.a;
    }

    @Override // defpackage.sqb
    public final c9a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqb)) {
            return false;
        }
        mqb mqbVar = (mqb) obj;
        return fni.a(this.a, mqbVar.a) && fni.a(this.b, mqbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddPropertiesToMetric(traceId=" + ceg.a(this.a) + ", localProperties=" + this.b + ")";
    }
}
