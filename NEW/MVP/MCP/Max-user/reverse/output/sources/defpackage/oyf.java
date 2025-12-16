package defpackage;

/* loaded from: classes.dex */
public final class oyf implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    public oyf(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        oyf oyfVar = (oyf) obj;
        int i = this.a - oyfVar.a;
        return i == 0 ? this.b - oyfVar.b : i;
    }
}
