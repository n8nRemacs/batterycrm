package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o34 {
    public static final o34 a;
    public static final o34 b;
    public static final o34 c;
    public static final /* synthetic */ o34[] d;

    static {
        o34 o34Var = new o34("mp4", 0);
        a = o34Var;
        o34 o34Var2 = new o34("dash", 1);
        b = o34Var2;
        o34 o34Var3 = new o34("hls", 2);
        c = o34Var3;
        d = new o34[]{o34Var, o34Var2, o34Var3, new o34("embed", 3), new o34("webm", 4), new o34("rtmp", 5)};
    }

    public static o34 valueOf(String str) {
        return (o34) Enum.valueOf(o34.class, str);
    }

    public static o34[] values() {
        return (o34[]) d.clone();
    }
}
