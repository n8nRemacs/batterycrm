package defpackage;

/* loaded from: classes2.dex */
public final class kyb {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final CharSequence e;

    public kyb(long j, long j2, CharSequence charSequence, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyb)) {
            return false;
        }
        kyb kybVar = (kyb) obj;
        return this.a == kybVar.a && this.b == kybVar.b && fni.a(this.c, kybVar.c) && fni.a(this.d, kybVar.d) && fni.a(this.e, kybVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + u45.e(u45.e(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "PickerChip(id=", ", avatarSourceId=");
        hf3.e(this.b, ", title=", this.c, sbL);
        sbL.append(", avatarUrl=");
        sbL.append(this.d);
        sbL.append(", abbreviation=");
        sbL.append((Object) this.e);
        sbL.append(")");
        return sbL.toString();
    }
}
