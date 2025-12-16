package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class bg2 implements t98 {
    public final yd0 X;
    public final List Y;
    public final int Z;
    public final s5g a;
    public final s5g b;
    public final String c;
    public final CharSequence d;
    public final long o;
    public final long s0;

    public bg2(s5g s5gVar, s5g s5gVar2, String str, CharSequence charSequence, long j, yd0 yd0Var, List list) {
        this.a = s5gVar;
        this.b = s5gVar2;
        this.c = str;
        this.d = charSequence;
        this.o = j;
        this.X = yd0Var;
        this.Y = list;
        this.Z = j7b.e;
        this.s0 = Integer.hashCode(j7b.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2)) {
            return false;
        }
        bg2 bg2Var = (bg2) obj;
        return fni.a(this.a, bg2Var.a) && fni.a(this.b, bg2Var.b) && fni.a(this.c, bg2Var.c) && fni.a(this.d, bg2Var.d) && this.o == bg2Var.o && fni.a(this.X, bg2Var.X) && fni.a(this.Y, bg2Var.Y);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.s0;
    }

    public final int hashCode() {
        int iD = xc0.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.d;
        int iA = a9h.a((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.o);
        yd0 yd0Var = this.X;
        return this.Y.hashCode() + ((iA + (yd0Var != null ? yd0Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Z;
    }

    public final String toString() {
        return "ChatDescriptionViewListItem(title=" + this.a + ", subtitle=" + this.b + ", avatarUrl=" + this.c + ", avatarPlaceholder=" + ((Object) this.d) + ", avatarPlaceholderId=" + this.o + ", avatarOverlayDrawable=" + this.X + ", descriptionList=" + this.Y + ")";
    }

    public /* synthetic */ bg2(s5g s5gVar, n5g n5gVar, String str, CharSequence charSequence, long j) {
        this(s5gVar, n5gVar, str, charSequence, j, null, hd5.a);
    }
}
