package defpackage;

/* loaded from: classes2.dex */
public final class da implements t98 {
    public final boolean X;
    public final long Y;
    public final long a;
    public final String b;
    public final s5g c;
    public final String d;
    public final CharSequence o;

    public da(long j, String str, s5g s5gVar, String str2, CharSequence charSequence, boolean z) {
        this.a = j;
        this.b = str;
        this.c = s5gVar;
        this.d = str2;
        this.o = charSequence;
        this.X = z;
        this.Y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da)) {
            return false;
        }
        da daVar = (da) obj;
        return this.a == daVar.a && this.b.equals(daVar.b) && this.c.equals(daVar.c) && this.d.equals(daVar.d) && this.o.equals(daVar.o) && this.X == daVar.X;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.Y;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.X) + u45.g(this.o, u45.e(xc0.d((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 0;
    }

    public final String toString() {
        return "AdminFromContactsItem(id=" + this.a + ", name=" + ((Object) this.b) + ", subtitle=" + this.c + ", avatar=" + this.d + ", abbreviation=" + ((Object) this.o) + ", isVerified=" + this.X + ")";
    }
}
