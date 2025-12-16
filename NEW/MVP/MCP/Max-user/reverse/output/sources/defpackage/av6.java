package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class av6 extends j6e {
    public final f7c X;
    public final f7c Y;
    public final List Z;
    public final long c;
    public final CharSequence d;
    public final Uri o;
    public final boolean s0;
    public final CharSequence t0;
    public final boolean u0;
    public final int v0;
    public final long w0;

    public av6(long j, String str, Uri uri, f7c f7cVar, f7c f7cVar2, List list, boolean z, CharSequence charSequence, boolean z2) {
        super(2, list);
        this.c = j;
        this.d = str;
        this.o = uri;
        this.X = f7cVar;
        this.Y = f7cVar2;
        this.Z = list;
        this.s0 = z;
        this.t0 = charSequence;
        this.u0 = z2;
        this.v0 = i1b.o;
        this.w0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av6)) {
            return false;
        }
        av6 av6Var = (av6) obj;
        return this.c == av6Var.c && fni.a(this.d, av6Var.d) && fni.a(this.o, av6Var.o) && fni.a(this.X, av6Var.X) && fni.a(this.Y, av6Var.Y) && fni.a(this.Z, av6Var.Z) && this.s0 == av6Var.s0 && fni.a(this.t0, av6Var.t0) && this.u0 == av6Var.u0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.w0;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        CharSequence charSequence = this.d;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Uri uri = this.o;
        return Boolean.hashCode(this.u0) + u45.g(this.t0, a9h.b(xrf.l(this.Z, (this.Y.hashCode() + ((this.X.hashCode() + ((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31)) * 31)) * 31, 31), 31, this.s0), 31);
    }

    @Override // defpackage.j6e
    public final boolean l(j6e j6eVar) {
        return equals((av6) j6eVar);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.v0;
    }

    @Override // defpackage.j6e
    public final boolean n(j6e j6eVar) {
        return j6eVar.getItemId() == this.w0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalChatSearchModel(id=");
        sb.append(this.c);
        sb.append(", lastMessageTime=");
        sb.append((Object) this.d);
        sb.append(", avatar=");
        sb.append(this.o);
        sb.append(", preProcessedTitle=");
        sb.append(this.X);
        sb.append(", preProcessedSubtitle=");
        sb.append(this.Y);
        sb.append(", titleHighlights=");
        sb.append(this.Z);
        sb.append(", isChannel=");
        sb.append(this.s0);
        sb.append(", abbreviation=");
        sb.append((Object) this.t0);
        return vb9.f(sb, ", isVerified=", this.u0, ")");
    }
}
