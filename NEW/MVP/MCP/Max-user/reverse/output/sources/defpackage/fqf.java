package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class fqf implements t98 {
    public final List X;
    public final int Y;
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence d;
    public final String o;

    public fqf(long j, CharSequence charSequence, String str, CharSequence charSequence2, String str2, List list, int i) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.d = charSequence2;
        this.o = str2;
        this.X = list;
        this.Y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqf)) {
            return false;
        }
        fqf fqfVar = (fqf) obj;
        return this.a == fqfVar.a && fni.a(this.b, fqfVar.b) && fni.a(this.c, fqfVar.c) && fni.a(this.d, fqfVar.d) && fni.a(this.o, fqfVar.o) && fni.a(this.X, fqfVar.X) && this.Y == fqfVar.Y;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return az1.v(this.Y) + xrf.l(this.X, u45.e(u45.g(this.d, u45.e(u45.g(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31), 31, this.o), 31);
    }

    public final CharSequence l() {
        if (this.Y != 3) {
            CharSequence charSequence = this.d;
            if (charSequence.length() != 0) {
                return charSequence;
            }
        }
        return this.b;
    }

    @Override // defpackage.t98
    public final int m() {
        return 1;
    }

    public final String toString() {
        return "SuggestionsState(id=" + this.a + ", name=" + ((Object) this.b) + ", avatar=" + this.c + ", shortName=" + ((Object) this.d) + ", query=" + this.o + ", contextActions=" + this.X + ", type=" + ctd.s(this.Y) + ")";
    }
}
