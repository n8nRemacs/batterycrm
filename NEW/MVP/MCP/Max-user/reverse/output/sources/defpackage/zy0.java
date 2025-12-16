package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class zy0 {
    public static final zy0 X;
    public static final zy0 Y;
    public static final zy0 Z;
    public static final zy0 a;
    public static final zy0 b;
    public static final zy0 c;
    public static final zy0 d;
    public static final zy0 o;
    public static final zy0 s0;
    public static final zy0 t0;
    public static final /* synthetic */ zy0[] u0;

    static {
        zy0 zy0Var = new zy0("ROOT", 0);
        a = zy0Var;
        zy0 zy0Var2 = new zy0("IMAGES", 1);
        b = zy0Var2;
        zy0 zy0Var3 = new zy0("AUDIO", 2);
        c = zy0Var3;
        zy0 zy0Var4 = new zy0("GIF", 3);
        d = zy0Var4;
        zy0 zy0Var5 = new zy0("STICKERS", 4);
        o = zy0Var5;
        zy0 zy0Var6 = new zy0("UPLOAD", 5);
        X = zy0Var6;
        zy0 zy0Var7 = new zy0("MUSIC", 6);
        Y = zy0Var7;
        zy0 zy0Var8 = new zy0("VIDEO", 7);
        Z = zy0Var8;
        zy0 zy0Var9 = new zy0("RINGTONE", 8);
        s0 = zy0Var9;
        zy0 zy0Var10 = new zy0("OTHERS", 9);
        t0 = zy0Var10;
        u0 = new zy0[]{zy0Var, zy0Var2, zy0Var3, zy0Var4, zy0Var5, zy0Var6, zy0Var7, zy0Var8, zy0Var9, zy0Var10};
    }

    public static zy0 valueOf(String str) {
        return (zy0) Enum.valueOf(zy0.class, str);
    }

    public static zy0[] values() {
        return (zy0[]) u0.clone();
    }
}
