package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.List;

/* loaded from: classes2.dex */
public final class cy2 extends j6e {
    public final boolean A0;
    public final boolean B0;
    public final boolean C0;
    public final CharSequence D0;
    public final boolean E0;
    public final int F0;
    public final long G0;
    public final boolean X;
    public final boolean Y;
    public final CharSequence Z;
    public final long c;
    public final boolean d;
    public final boolean o;
    public final int s0;
    public final sc2 t0;
    public final Uri u0;
    public final long v0;
    public final f7c w0;
    public final CharSequence x0;
    public final List y0;
    public final boolean z0;

    public cy2(long j, boolean z, boolean z2, boolean z3, boolean z4, String str, int i, sc2 sc2Var, Uri uri, long j2, f7c f7cVar, CharSequence charSequence, List list, boolean z5, boolean z6, boolean z7, boolean z8, CharSequence charSequence2, boolean z9) {
        super(1, list);
        this.c = j;
        this.d = z;
        this.o = z2;
        this.X = z3;
        this.Y = z4;
        this.Z = str;
        this.s0 = i;
        this.t0 = sc2Var;
        this.u0 = uri;
        this.v0 = j2;
        this.w0 = f7cVar;
        this.x0 = charSequence;
        this.y0 = list;
        this.z0 = z5;
        this.A0 = z6;
        this.B0 = z7;
        this.C0 = z8;
        this.D0 = charSequence2;
        this.E0 = z9;
        this.F0 = i1b.l;
        this.G0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy2)) {
            return false;
        }
        cy2 cy2Var = (cy2) obj;
        return this.c == cy2Var.c && this.d == cy2Var.d && this.o == cy2Var.o && this.X == cy2Var.X && this.Y == cy2Var.Y && fni.a(this.Z, cy2Var.Z) && this.s0 == cy2Var.s0 && this.t0 == cy2Var.t0 && fni.a(this.u0, cy2Var.u0) && this.v0 == cy2Var.v0 && this.w0.equals(cy2Var.w0) && fni.a(this.x0, cy2Var.x0) && fni.a(this.y0, cy2Var.y0) && this.z0 == cy2Var.z0 && this.A0 == cy2Var.A0 && this.B0 == cy2Var.B0 && this.C0 == cy2Var.C0 && fni.a(this.D0, cy2Var.D0) && this.E0 == cy2Var.E0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.G0;
    }

    public final int hashCode() {
        int iB = a9h.b(a9h.b(a9h.b(a9h.b(Long.hashCode(this.c) * 31, 31, this.d), 31, this.o), 31, this.X), 31, this.Y);
        CharSequence charSequence = this.Z;
        int iHashCode = (this.t0.hashCode() + xrf.k(this.s0, (iB + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31;
        Uri uri = this.u0;
        int iHashCode2 = (this.w0.hashCode() + a9h.a((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.v0)) * 31;
        CharSequence charSequence2 = this.x0;
        return Boolean.hashCode(this.E0) + u45.g(this.D0, a9h.b(a9h.b(a9h.b(a9h.b(a9h.b(xrf.l(this.y0, (iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31), 31, this.z0), 31, this.A0), 31, this.B0), 31, this.C0), 31, false), 31);
    }

    @Override // defpackage.j6e
    public final boolean l(j6e j6eVar) {
        return equals((cy2) j6eVar);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.F0;
    }

    @Override // defpackage.j6e
    public final boolean n(j6e j6eVar) {
        return j6eVar.getItemId() == this.G0;
    }

    public final String toString() throws IOException {
        String strH = uog.h(this.w0.a);
        String strH2 = uog.h(this.x0);
        String strN = ue3.N(this.y0, null, null, null, new gf1(22), 31);
        StringBuilder sb = new StringBuilder("ChatSearchModel(id=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.F0);
        az1.r(this.G0, ", itemId=", ", isPinned=", sb);
        az1.t(", isMuted=", ", hasUnreadReplyOrMention=", sb, this.d, this.o);
        az1.t(", hasReaction=", ", lastMessageTime=", sb, this.X, this.Y);
        sb.append((Object) this.Z);
        sb.append(", unreadCount=");
        sb.append(this.s0);
        sb.append(", status=");
        sb.append(this.t0);
        sb.append(", avatar=");
        sb.append(this.u0);
        sb.append(", avatarSourceId=");
        sb.append(this.v0);
        sb.append(", preProcessedChatTitle=");
        sb.append((Object) strH);
        sb.append(", subtitle=");
        sb.append((Object) strH2);
        sb.append(", titleHighlights=");
        sb.append(strN);
        hf3.f(", isChannel=", ", highlightTitle=", sb, this.z0, this.A0);
        hf3.f(", highlightLink=", ", highlightContactName=", sb, this.B0, this.C0);
        return vb9.f(sb, ", selected=false, abbreviation=*, isVerified=", this.E0, ")");
    }
}
