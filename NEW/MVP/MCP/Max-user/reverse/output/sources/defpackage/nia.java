package defpackage;

/* loaded from: classes2.dex */
public final class nia extends IllegalStateException {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String o;

    public nia(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.o = str5;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sbL = wy1.l("Current state. \n                |scopeId:", b1e.a(this.a), ", \n                |parent:", this.b, ", \n                |internalTargetInstanceId:");
        ho7.r(sbL, this.c, ", \n                |target:", this.d, ", \n                |fullSnapshot:");
        sbL.append(this.o);
        sbL.append(", \n                |");
        return wmf.e(sbL.toString());
    }
}
