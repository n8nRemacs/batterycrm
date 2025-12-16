package defpackage;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class fxb implements t98 {
    public final boolean X;
    public final boolean Y;
    public final yyb Z;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final s5g d;
    public final Uri o;
    public final CharSequence s0;
    public final boolean t0;
    public final long u0;

    public /* synthetic */ fxb(long j, long j2, CharSequence charSequence, r5g r5gVar, Uri uri, boolean z, yyb yybVar, CharSequence charSequence2) {
        this(j, j2, charSequence, r5gVar, uri, false, z, yybVar, charSequence2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxb)) {
            return false;
        }
        fxb fxbVar = (fxb) obj;
        return this.a == fxbVar.a && this.b == fxbVar.b && fni.a(this.c, fxbVar.c) && fni.a(this.d, fxbVar.d) && fni.a(this.o, fxbVar.o) && this.X == fxbVar.X && this.Y == fxbVar.Y && fni.a(this.Z, fxbVar.Z) && fni.a(this.s0, fxbVar.s0) && this.t0 == fxbVar.t0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.u0;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.u0 == t98Var.getItemId();
    }

    public final int hashCode() {
        int iG = u45.g(this.c, a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31);
        s5g s5gVar = this.d;
        int iHashCode = (iG + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31;
        Uri uri = this.o;
        return Boolean.hashCode(this.t0) + u45.g(this.s0, (this.Z.hashCode() + a9h.b(a9h.b((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31, 31, this.X), 31, this.Y)) * 31, 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        boolean z;
        fxb fxbVar = t98Var instanceof fxb ? (fxb) t98Var : null;
        if (fxbVar == null || this.X == (z = fxbVar.X)) {
            return null;
        }
        return new exb(z);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "PickerChatListItem(id=", ", avatarSourceId=");
        sbL.append(this.b);
        sbL.append(", name=");
        sbL.append((Object) this.c);
        sbL.append(", subtitle=");
        sbL.append(this.d);
        sbL.append(", avatar=");
        sbL.append(this.o);
        hf3.f(", isOnline=", ", isVerified=", sbL, this.X, this.Y);
        sbL.append(", entity=");
        sbL.append(this.Z);
        sbL.append(", abbreviation=");
        sbL.append((Object) this.s0);
        return vb9.f(sbL, ", isEnabled=", this.t0, ")");
    }

    public fxb(long j, long j2, CharSequence charSequence, s5g s5gVar, Uri uri, boolean z, boolean z2, yyb yybVar, CharSequence charSequence2, boolean z3) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.d = s5gVar;
        this.o = uri;
        this.X = z;
        this.Y = z2;
        this.Z = yybVar;
        this.s0 = charSequence2;
        this.t0 = z3;
        this.u0 = yybVar.a;
    }
}
