package defpackage;

/* loaded from: classes2.dex */
public final class zhb extends cda {
    public final long b;
    public final boolean c;
    public final String d;

    public zhb(long j, String str, boolean z) {
        super(qqg.a);
        this.b = j;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhb)) {
            return false;
        }
        zhb zhbVar = (zhb) obj;
        return this.b == zhbVar.b && this.c == zhbVar.c && fni.a(this.d, zhbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + a9h.b(Long.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return ctd.j(xc0.j(this.b, "OpenChatCall(chatId=", ", isVideo=", this.c), ", link=", this.d, ")");
    }
}
