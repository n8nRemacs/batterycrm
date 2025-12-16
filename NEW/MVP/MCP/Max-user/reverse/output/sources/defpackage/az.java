package defpackage;

/* loaded from: classes2.dex */
public final class az {
    public final CharSequence a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final boolean f;
    public final boolean g;

    public az(CharSequence charSequence, String str, String str2, Integer num, Integer num2, boolean z, boolean z2) {
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = num;
        this.e = num2;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az)) {
            return false;
        }
        az azVar = (az) obj;
        return fni.a(this.a, azVar.a) && fni.a(this.b, azVar.b) && fni.a(this.c, azVar.c) && fni.a(this.d, azVar.d) && fni.a(this.e, azVar.e) && this.f == azVar.f && this.g == azVar.g;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return Boolean.hashCode(this.g) + a9h.b((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachDescription(description=");
        sb.append((Object) this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", placeholder=");
        sb.append(this.d);
        sb.append(", count=");
        sb.append(this.e);
        sb.append(", isRoundPreview=");
        sb.append(this.f);
        sb.append(", isContentLevel=");
        return az1.k(sb, this.g, ")");
    }
}
