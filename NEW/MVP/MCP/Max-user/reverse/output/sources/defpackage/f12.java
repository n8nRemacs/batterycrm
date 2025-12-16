package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class f12 {
    public static final f12 a;
    public static final f12 b;
    public static final f12 c;
    public static final f12 d;
    public static final /* synthetic */ f12[] o;

    static {
        f12 f12Var = new f12("PhotoDefault", 0);
        a = f12Var;
        f12 f12Var2 = new f12("PhotoTaking", 1);
        b = f12Var2;
        f12 f12Var3 = new f12("VideoDefault", 2);
        c = f12Var3;
        f12 f12Var4 = new f12("VideoRecording", 3);
        d = f12Var4;
        o = new f12[]{f12Var, f12Var2, f12Var3, f12Var4};
    }

    public static f12 valueOf(String str) {
        return (f12) Enum.valueOf(f12.class, str);
    }

    public static f12[] values() {
        return (f12[]) o.clone();
    }
}
