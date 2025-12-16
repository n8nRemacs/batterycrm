package defpackage;

/* loaded from: classes2.dex */
public final class b0f {
    public final String a;
    public final y6d b;
    public final z6d c;

    public b0f(y6d y6dVar, z6d z6dVar, String str) {
        this.b = y6dVar;
        this.c = z6dVar;
        this.a = ho7.i("OK", str, "Signaling");
    }

    public final void a(String str) {
        this.b.log(this.a, str);
    }

    public final void b(String str) {
        boolean zShouldHideSensitiveInformation = this.c.shouldHideSensitiveInformation();
        String str2 = this.a;
        y6d y6dVar = this.b;
        if (zShouldHideSensitiveInformation) {
            a9h.o(" -> ", qaj.b(str), y6dVar, str2);
        } else {
            a9h.o(" -> ", str, y6dVar, str2);
        }
    }
}
