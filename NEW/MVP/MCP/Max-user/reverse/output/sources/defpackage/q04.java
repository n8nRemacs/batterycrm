package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class q04 extends j6e {
    public final boolean X;
    public final boolean Y;
    public final List Z;
    public final long c;
    public final CharSequence d;
    public final CharSequence o;
    public final Uri s0;
    public final CharSequence t0;
    public final int u0;
    public final long v0;

    public q04(long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, List list, Uri uri, CharSequence charSequence3) {
        super(3, list);
        this.c = j;
        this.d = charSequence;
        this.o = charSequence2;
        this.X = z;
        this.Y = z2;
        this.Z = list;
        this.s0 = uri;
        this.t0 = charSequence3;
        this.u0 = i1b.m;
        this.v0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q04)) {
            return false;
        }
        q04 q04Var = (q04) obj;
        return this.c == q04Var.c && fni.a(this.d, q04Var.d) && fni.a(this.o, q04Var.o) && this.X == q04Var.X && this.Y == q04Var.Y && fni.a(this.Z, q04Var.Z) && fni.a(this.s0, q04Var.s0) && fni.a(this.t0, q04Var.t0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.v0;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        CharSequence charSequence = this.d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.o;
        int iL = xrf.l(this.Z, a9h.b(a9h.b((iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.X), 31, this.Y), 31);
        Uri uri = this.s0;
        return this.t0.hashCode() + a9h.b((iL + (uri == null ? 0 : uri.hashCode())) * 31, 31, false);
    }

    @Override // defpackage.j6e
    public final boolean l(j6e j6eVar) {
        return equals((q04) j6eVar);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.u0;
    }

    @Override // defpackage.j6e
    public final boolean n(j6e j6eVar) {
        return this.v0 == j6eVar.getItemId();
    }

    public final String toString() {
        return "ContactSearchModel(id=" + this.c + ", title=" + ((Object) this.d) + ", subtitle=" + ((Object) this.o) + ", isOnline=" + this.X + ", isVerified=" + this.Y + ", contactHighlights=" + this.Z + ", avatar=" + this.s0 + ", selected=false, abbreviation=" + ((Object) this.t0) + ")";
    }
}
