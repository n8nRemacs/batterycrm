package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o05 {
    public static final o05 X;
    public static final /* synthetic */ o05[] Y;
    public static final /* synthetic */ zg5 Z;
    public static final o05 a;
    public static final o05 b;
    public static final o05 c;
    public static final o05 d;
    public static final o05 o;

    static {
        o05 o05Var = new o05("SHARE_VIDEO", 0);
        a = o05Var;
        o05 o05Var2 = new o05("DOWNLOAD_VIDEO", 1);
        b = o05Var2;
        o05 o05Var3 = new o05("SHARE_PHOTO", 2);
        c = o05Var3;
        o05 o05Var4 = new o05("DOWNLOAD_PHOTO", 3);
        o05 o05Var5 = new o05("SHARE_GIF", 4);
        d = o05Var5;
        o05 o05Var6 = new o05("DOWNLOAD_GIF", 5);
        o = o05Var6;
        o05 o05Var7 = new o05("SHARE_FILE", 6);
        X = o05Var7;
        o05[] o05VarArr = {o05Var, o05Var2, o05Var3, o05Var4, o05Var5, o05Var6, o05Var7};
        Y = o05VarArr;
        Z = new zg5(o05VarArr);
    }

    public static o05 valueOf(String str) {
        return (o05) Enum.valueOf(o05.class, str);
    }

    public static o05[] values() {
        return (o05[]) Y.clone();
    }
}
