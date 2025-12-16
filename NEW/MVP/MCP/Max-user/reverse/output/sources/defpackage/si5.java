package defpackage;

/* loaded from: classes.dex */
public final class si5 {
    public final mi5[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public si5(String str, String str2, long[] jArr, mi5[] mi5VarArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = mi5VarArr;
    }

    public final String a() {
        String str = this.c;
        int iF = u45.f(1, str);
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(u45.f(iF, str2));
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
