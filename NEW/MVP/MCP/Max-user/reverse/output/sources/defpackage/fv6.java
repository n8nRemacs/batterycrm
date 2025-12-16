package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes2.dex */
public final class fv6 extends j6e {
    public final f7c X;
    public final boolean Y;
    public final boolean Z;
    public final long c;
    public final String d;
    public final f7c o;
    public final Uri s0;
    public final b8c t0;
    public final gx3 u0;
    public final List v0;
    public final int w0;
    public final long x0;

    public fv6(long j, String str, f7c f7cVar, f7c f7cVar2, boolean z, boolean z2, Uri uri, b8c b8cVar, gx3 gx3Var, List list) {
        super(4, list);
        this.c = j;
        this.d = str;
        this.o = f7cVar;
        this.X = f7cVar2;
        this.Y = z;
        this.Z = z2;
        this.s0 = uri;
        this.t0 = b8cVar;
        this.u0 = gx3Var;
        this.v0 = list;
        this.w0 = i1b.p;
        this.x0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv6)) {
            return false;
        }
        fv6 fv6Var = (fv6) obj;
        return this.c == fv6Var.c && this.d.equals(fv6Var.d) && fni.a(this.o, fv6Var.o) && fni.a(this.X, fv6Var.X) && this.Y == fv6Var.Y && this.Z == fv6Var.Z && fni.a(this.s0, fv6Var.s0) && this.t0.equals(fv6Var.t0) && fni.a(this.u0, fv6Var.u0) && fni.a(this.v0, fv6Var.v0);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.x0;
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.b((this.X.hashCode() + ((this.o.hashCode() + ((this.d.hashCode() + (Long.hashCode(this.c) * 31)) * 31)) * 31)) * 31, 31, this.Y), 31, this.Z);
        Uri uri = this.s0;
        return Boolean.hashCode(false) + xrf.l(this.v0, (this.u0.hashCode() + ((this.t0.hashCode() + ((iB + (uri == null ? 0 : uri.hashCode())) * 31)) * 31)) * 31, 31);
    }

    @Override // defpackage.j6e
    public final boolean l(j6e j6eVar) {
        return equals((fv6) j6eVar);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.w0;
    }

    @Override // defpackage.j6e
    public final boolean n(j6e j6eVar) {
        return this.x0 == j6eVar.getItemId();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalContactSearchModel(id=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append((Object) this.d);
        sb.append(", title=");
        sb.append(this.o);
        sb.append(", subtitle=");
        sb.append(this.X);
        hf3.f(", isOnline=", ", isVerified=", sb, this.Y, this.Z);
        sb.append(", avatar=");
        sb.append(this.s0);
        sb.append(", presence=");
        sb.append(this.t0);
        sb.append(", contactInfo=");
        sb.append(this.u0);
        sb.append(", contactHighlights=");
        sb.append(this.v0);
        sb.append(", selected=false)");
        return sb.toString();
    }
}
