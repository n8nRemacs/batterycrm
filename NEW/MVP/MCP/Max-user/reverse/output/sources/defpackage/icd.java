package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class icd implements t98 {
    public final boolean X;
    public final boolean Y;
    public final long Z;
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence d;
    public final boolean o;

    public icd(long j, String str, String str2, CharSequence charSequence, boolean z, boolean z2, int i) {
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        boolean z3 = (i & 64) == 0;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
        this.o = z;
        this.X = z2;
        this.Y = z3;
        this.Z = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icd)) {
            return false;
        }
        icd icdVar = (icd) obj;
        return this.a == icdVar.a && fni.a(this.b, icdVar.b) && fni.a(this.c, icdVar.c) && this.d.equals(icdVar.d) && this.o == icdVar.o && this.X == icdVar.X && this.Y == icdVar.Y;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.Z;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.a == t98Var.getItemId();
    }

    public final int hashCode() {
        int iG = u45.g(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(false) + a9h.b(a9h.b(a9h.b(u45.g(this.d, (iG + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.o), 31, this.X), 31, this.Y);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        icd icdVar = (icd) t98Var;
        CharSequence charSequence = icdVar.d;
        String str = icdVar.c;
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence2 = icdVar.b;
        if (!fni.a(this.b, charSequence2)) {
            arrayList.add(new fcd(charSequence2));
        }
        boolean z = icdVar.X;
        if (this.X != z) {
            arrayList.add(new hcd(z));
        }
        if (!fni.a(this.c, str)) {
            arrayList.add(new ecd(str));
        }
        if (!this.d.equals(charSequence)) {
            arrayList.add(new dcd(charSequence));
        }
        boolean z2 = icdVar.o;
        if (this.o != z2) {
            arrayList.add(new gcd(z2));
        }
        return arrayList;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 0;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentContactModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append((Object) this.d);
        hf3.f(", isOnline=", ", isVerified=", sb, this.o, this.X);
        return vb9.f(sb, ", isWebapp=", this.Y, ", isSavedMessages=false)");
    }
}
