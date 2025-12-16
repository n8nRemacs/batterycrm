package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class xx3 implements t98 {
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final int D0;
    public final CharSequence X;
    public final Uri Y;
    public final boolean Z;
    public final long a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final CharSequence o;
    public final boolean s0;
    public final CharSequence t0;
    public final boolean u0;
    public final qtb v0;
    public final Boolean w0;
    public final boolean x0;
    public final int y0;
    public final boolean z0;

    public xx3(long j, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4, Uri uri, boolean z, boolean z2, CharSequence charSequence5, boolean z3, qtb qtbVar, Boolean bool, boolean z4, int i, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.a = j;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.o = charSequence3;
        this.X = charSequence4;
        this.Y = uri;
        this.Z = z;
        this.s0 = z2;
        this.t0 = charSequence5;
        this.u0 = z3;
        this.v0 = qtbVar;
        this.w0 = bool;
        this.x0 = z4;
        this.y0 = i;
        this.z0 = z5;
        this.A0 = z6;
        this.B0 = z7;
        this.C0 = z8;
        this.D0 = charSequence4 == null ? u1b.o : u1b.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx3)) {
            return false;
        }
        xx3 xx3Var = (xx3) obj;
        return this.a == xx3Var.a && fni.a(this.b, xx3Var.b) && fni.a(this.c, xx3Var.c) && fni.a(this.d, xx3Var.d) && fni.a(this.o, xx3Var.o) && fni.a(this.X, xx3Var.X) && fni.a(this.Y, xx3Var.Y) && this.Z == xx3Var.Z && this.s0 == xx3Var.s0 && fni.a(this.t0, xx3Var.t0) && this.u0 == xx3Var.u0 && fni.a(this.v0, xx3Var.v0) && fni.a(this.w0, xx3Var.w0) && this.x0 == xx3Var.x0 && this.y0 == xx3Var.y0 && this.z0 == xx3Var.z0 && this.A0 == xx3Var.A0 && this.B0 == xx3Var.B0 && this.C0 == xx3Var.C0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iG = u45.g(this.b, Long.hashCode(this.a) * 31, 31);
        CharSequence charSequence = this.c;
        int iHashCode = (iG + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CharSequence charSequence2 = this.o;
        int iHashCode3 = (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.X;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        Uri uri = this.Y;
        int iB = a9h.b(u45.g(this.t0, a9h.b(a9h.b((iHashCode4 + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.Z), 31, this.s0), 31), 31, this.u0);
        qtb qtbVar = this.v0;
        int iHashCode5 = (iB + (qtbVar == null ? 0 : qtbVar.hashCode())) * 31;
        Boolean bool = this.w0;
        return Boolean.hashCode(this.C0) + a9h.b(a9h.b(a9h.b(xrf.k(this.y0, a9h.b((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.x0), 31), 31, this.z0), 31, this.A0), 31, this.B0);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        xx3 xx3Var = t98Var instanceof xx3 ? (xx3) t98Var : null;
        if (xx3Var != null) {
            Boolean bool = xx3Var.w0;
            if (!fni.a(this.w0, bool)) {
                return new wx3(bool);
            }
        }
        return null;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.D0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactListItem(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append((Object) this.b);
        sb.append(", shortName=");
        sb.append((Object) this.c);
        sb.append(", phones=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append((Object) this.o);
        sb.append(", button=");
        sb.append((Object) this.X);
        sb.append(", avatar=");
        sb.append(this.Y);
        sb.append(", isOnline=");
        sb.append(this.Z);
        sb.append(", isVerified=");
        sb.append(this.s0);
        sb.append(", abbreviation=");
        sb.append((Object) this.t0);
        sb.append(", isSelf=");
        sb.append(this.u0);
        sb.append(", availablePhone=");
        sb.append(this.v0);
        sb.append(", isSelected=");
        sb.append(this.w0);
        sb.append(", hasCallActions=");
        sb.append(this.x0);
        sb.append(", presence=");
        sb.append(this.y0);
        sb.append(", isBot=");
        sb.append(this.z0);
        hf3.f(", isRestricted=", ", isNoForward=", sb, this.A0, this.B0);
        return vb9.f(sb, ", isBotOfficialAccount=", this.C0, ")");
    }

    public /* synthetic */ xx3(long j, String str, String str2, List list, CharSequence charSequence, CharSequence charSequence2, Uri uri, boolean z, boolean z2, CharSequence charSequence3, boolean z3, qtb qtbVar, int i, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        this(j, str, str2, list, charSequence, charSequence2, uri, z, z2, charSequence3, (i2 & 1024) != 0 ? false : z3, (i2 & 2048) != 0 ? null : qtbVar, null, false, (i2 & 16384) != 0 ? 0 : i, z4, z5, z6, z7);
    }
}
