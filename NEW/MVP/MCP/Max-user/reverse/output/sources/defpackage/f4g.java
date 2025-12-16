package defpackage;

/* loaded from: classes2.dex */
public final class f4g implements xy8 {
    public final String a;
    public final String b;
    public final String c;

    public f4g(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.xy8
    public final String a() {
        return this.b;
    }

    public final String toString() {
        return ho7.l(wy1.l("TextFormat(id: ", this.a, ", sampleMimeType: ", this.b, ", language: "), this.c, ")");
    }
}
