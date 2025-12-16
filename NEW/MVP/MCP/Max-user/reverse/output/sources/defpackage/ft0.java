package defpackage;

/* loaded from: classes.dex */
public final class ft0 {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public ft0(int i, int i2, x74 x74Var, x26 x26Var) {
        this.c = x26Var;
        this.a = i;
        this.b = i2;
        this.d = x74Var;
    }

    public chg a() {
        int i = this.a;
        return new chg((String) this.c, i, this.b, (String) this.d);
    }

    public void b(String str) {
        String strN = xz9.n(str);
        hsi.a("Not an audio MIME type: " + strN, strN == null || xz9.i(strN));
        this.c = strN;
    }

    public void c(String str) {
        String strN = xz9.n(str);
        hsi.a("Not a video MIME type: " + strN, strN == null || xz9.m(strN));
        this.d = strN;
    }

    public ft0(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = i;
        fsi.b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.c = fArr;
        this.d = fArr2;
        this.b = i2;
    }
}
