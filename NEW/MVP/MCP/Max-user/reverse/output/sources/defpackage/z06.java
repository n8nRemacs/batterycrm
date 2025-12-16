package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class z06 {
    public static final z06 a;
    public static final z06 b;
    public static final z06 c;
    public static final z06 d;
    public static final /* synthetic */ z06[] o;

    /* JADX INFO: Fake field, exist only in values array */
    z06 EF0;

    static {
        z06 z06Var = new z06("FIRST_FRAME_DECODED", 0);
        z06 z06Var2 = new z06("FIRST_FRAME_RENDERED", 1);
        a = z06Var2;
        z06 z06Var3 = new z06("PLAYING", 2);
        b = z06Var3;
        z06 z06Var4 = new z06("READY", 3);
        c = z06Var4;
        z06 z06Var5 = new z06("PLAY", 4);
        d = z06Var5;
        o = new z06[]{z06Var, z06Var2, z06Var3, z06Var4, z06Var5};
    }

    public static z06 valueOf(String str) {
        return (z06) Enum.valueOf(z06.class, str);
    }

    public static z06[] values() {
        return (z06[]) o.clone();
    }
}
