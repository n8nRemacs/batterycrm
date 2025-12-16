package defpackage;

/* loaded from: classes2.dex */
public final class k58 extends l0g {
    public final String X;
    public final fz6 Y;
    public final d2h Z;
    public final qb2 c;
    public final r04 d;
    public final fh9 o;
    public final tff s0;

    public k58(qb2 qb2Var, r04 r04Var, fh9 fh9Var, String str, fz6 fz6Var, d2h d2hVar, tff tffVar) {
        this.c = qb2Var;
        this.d = r04Var;
        this.o = fh9Var;
        this.X = str;
        this.Y = fz6Var;
        this.Z = d2hVar;
        this.s0 = tffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k58)) {
            return false;
        }
        k58 k58Var = (k58) obj;
        return fni.a(this.c, k58Var.c) && fni.a(this.d, k58Var.d) && fni.a(this.o, k58Var.o) && fni.a(this.X, k58Var.X) && fni.a(this.Y, k58Var.Y) && fni.a(this.Z, k58Var.Z) && fni.a(this.s0, k58Var.s0);
    }

    public final int hashCode() {
        qb2 qb2Var = this.c;
        int iHashCode = (qb2Var == null ? 0 : qb2Var.hashCode()) * 31;
        r04 r04Var = this.d;
        int iHashCode2 = (iHashCode + (r04Var == null ? 0 : r04Var.hashCode())) * 31;
        fh9 fh9Var = this.o;
        int iHashCode3 = (iHashCode2 + (fh9Var == null ? 0 : fh9Var.hashCode())) * 31;
        String str = this.X;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        fz6 fz6Var = this.Y;
        int iHashCode5 = (iHashCode4 + (fz6Var == null ? 0 : fz6Var.hashCode())) * 31;
        d2h d2hVar = this.Z;
        int iHashCode6 = (iHashCode5 + (d2hVar == null ? 0 : d2hVar.hashCode())) * 31;
        tff tffVar = this.s0;
        return iHashCode6 + (tffVar != null ? tffVar.hashCode() : 0);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(chat=" + this.c + ", contactSearchResult=" + this.d + ", message=" + this.o + ", startPayload=" + this.X + ", groupChatInfo=" + this.Y + ", videoConference=" + this.Z + ", stickerSet=" + this.s0 + ")";
    }
}
