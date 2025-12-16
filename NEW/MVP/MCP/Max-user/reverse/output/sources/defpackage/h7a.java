package defpackage;

/* loaded from: classes2.dex */
public final class h7a extends mxi {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public h7a(long j, long j2, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7a)) {
            return false;
        }
        h7a h7aVar = (h7a) obj;
        return this.a == h7aVar.a && this.b == h7aVar.b && fni.a(this.c, h7aVar.c) && fni.a(this.d, h7aVar.d) && fni.a(this.e, h7aVar.e) && fni.a(this.f, h7aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + u45.e(u45.e(u45.e(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "AudioAttach(chatId=", ", messageId=");
        hf3.e(this.b, ", attachLocalId=", this.c, sbL);
        ho7.r(sbL, ", audioUrl=", this.d, ", attachTitle=", this.e);
        return ctd.j(sbL, ", attachSubtitle=", this.f, ")");
    }
}
