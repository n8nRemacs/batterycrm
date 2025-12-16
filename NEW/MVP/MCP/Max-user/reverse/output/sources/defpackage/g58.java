package defpackage;

/* loaded from: classes2.dex */
public final class g58 extends h58 {
    public final long a;
    public final Long b;
    public final Long c;
    public final r04 d;
    public final fz6 e;
    public final d2h f;
    public final Long g;
    public final String h;

    public g58(long j, Long l, Long l2, r04 r04Var, fz6 fz6Var, d2h d2hVar, Long l3, String str) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = r04Var;
        this.e = fz6Var;
        this.f = d2hVar;
        this.g = l3;
        this.h = str;
    }

    @Override // defpackage.h58
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g58)) {
            return false;
        }
        g58 g58Var = (g58) obj;
        return this.a == g58Var.a && fni.a(this.b, g58Var.b) && fni.a(this.c, g58Var.c) && fni.a(this.d, g58Var.d) && fni.a(this.e, g58Var.e) && fni.a(this.f, g58Var.f) && fni.a(this.g, g58Var.g) && fni.a(this.h, g58Var.h);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        r04 r04Var = this.d;
        int iHashCode4 = (iHashCode3 + (r04Var == null ? 0 : r04Var.hashCode())) * 31;
        fz6 fz6Var = this.e;
        int iHashCode5 = (iHashCode4 + (fz6Var == null ? 0 : fz6Var.hashCode())) * 31;
        d2h d2hVar = this.f;
        int iHashCode6 = (iHashCode5 + (d2hVar == null ? 0 : d2hVar.hashCode())) * 31;
        Long l3 = this.g;
        int iHashCode7 = (iHashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "SuccessLinkInfo(requestId=" + this.a + ", chatId=" + this.b + ", messageId=" + this.c + ", contactSearchResult=" + this.d + ", groupChatInfo=" + this.e + ", videoConference=" + this.f + ", stickerSetId=" + this.g + ", startPayload=" + this.h + ")";
    }
}
