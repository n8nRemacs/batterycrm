package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class fk6 {
    public static final fk6 X;
    public static final fk6 Y;
    public static final fk6 Z;
    public static final fk6 c;
    public static final fk6 d;
    public static final fk6 o;
    public static final fk6 s0;
    public static final fk6 t0;
    public static final fk6 u0;
    public static final /* synthetic */ fk6[] v0;
    public static final /* synthetic */ zg5 w0;
    public final int a;
    public final int b;

    static {
        fk6 fk6Var = new fk6(0, "_144p", 256, 144);
        c = fk6Var;
        fk6 fk6Var2 = new fk6(1, "_240p", 426, 240);
        d = fk6Var2;
        fk6 fk6Var3 = new fk6(2, "_360p", 640, 360);
        o = fk6Var3;
        fk6 fk6Var4 = new fk6(3, "_480p", 853, 480);
        X = fk6Var4;
        fk6 fk6Var5 = new fk6(4, "_720p", 1280, 720);
        Y = fk6Var5;
        fk6 fk6Var6 = new fk6(5, "_1080p", 1920, 1080);
        Z = fk6Var6;
        fk6 fk6Var7 = new fk6(6, "_1440p", 2560, 1440);
        s0 = fk6Var7;
        fk6 fk6Var8 = new fk6(7, "_2160p", 3840, 2160);
        t0 = fk6Var8;
        fk6 fk6Var9 = new fk6(8, "_4320p", 7680, 4320);
        u0 = fk6Var9;
        fk6[] fk6VarArr = {fk6Var, fk6Var2, fk6Var3, fk6Var4, fk6Var5, fk6Var6, fk6Var7, fk6Var8, fk6Var9};
        v0 = fk6VarArr;
        w0 = new zg5(fk6VarArr);
    }

    public fk6(int i, String str, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static fk6 valueOf(String str) {
        return (fk6) Enum.valueOf(fk6.class, str);
    }

    public static fk6[] values() {
        return (fk6[]) v0.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.b + "p";
    }
}
