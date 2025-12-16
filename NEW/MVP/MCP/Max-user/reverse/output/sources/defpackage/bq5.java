package defpackage;

import android.net.Uri;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class bq5 implements t98 {
    public final CharSequence X;
    public final boolean Y;
    public final CharSequence Z;
    public final long a;
    public final Uri b;
    public final boolean c;
    public final boolean d;
    public final CharSequence o;

    public bq5(long j, Uri uri, boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2, boolean z3, CharSequence charSequence3) {
        this.a = j;
        this.b = uri;
        this.c = z;
        this.d = z2;
        this.o = charSequence;
        this.X = charSequence2;
        this.Y = z3;
        this.Z = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq5)) {
            return false;
        }
        bq5 bq5Var = (bq5) obj;
        return this.a == bq5Var.a && fni.a(this.b, bq5Var.b) && this.c == bq5Var.c && this.d == bq5Var.d && fni.a(this.o, bq5Var.o) && fni.a(this.X, bq5Var.X) && this.Y == bq5Var.Y && fni.a(this.Z, bq5Var.Z);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Uri uri = this.b;
        int iG = u45.g(this.o, a9h.b(a9h.b((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.d), 31);
        CharSequence charSequence = this.X;
        return this.Z.hashCode() + a9h.b((iG + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.Y);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        bq5 bq5Var = t98Var instanceof bq5 ? (bq5) t98Var : null;
        if (bq5Var == null) {
            return null;
        }
        aq5 aq5Var = new aq5(9);
        BitSet bitSet = (BitSet) aq5Var.b;
        bitSet.set(0, !fni.a(this.b, bq5Var.b));
        bitSet.set(1, this.c != bq5Var.c);
        bitSet.set(2, !fni.a(this.o, bq5Var.o));
        bitSet.set(3, !fni.a(this.X, bq5Var.X));
        bitSet.set(4, this.Y != bq5Var.Y);
        bitSet.set(5, !fni.a(this.Z, bq5Var.Z));
        bitSet.set(6, this.d != bq5Var.d);
        return aq5Var;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        int i = this.Y ? i1b.u : i1b.v;
        int i2 = c03.a;
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeChatModel(contactId=");
        sb.append(this.a);
        sb.append(", avatar=");
        sb.append(this.b);
        hf3.f(", isOnline=", ", isVerified=", sb, this.c, this.d);
        sb.append(", title=");
        sb.append((Object) this.o);
        sb.append(", subtitle=");
        sb.append((Object) this.X);
        sb.append(", isRegistered=");
        sb.append(this.Y);
        sb.append(", abbreviation=");
        sb.append((Object) this.Z);
        sb.append(")");
        return sb.toString();
    }
}
