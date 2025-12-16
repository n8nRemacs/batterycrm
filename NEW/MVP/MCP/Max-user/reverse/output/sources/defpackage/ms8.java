package defpackage;

import org.apache.http.util.VersionInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ms8 {
    public static final /* synthetic */ ms8[] X;
    public static final ms8 a;
    public static final ms8 b;
    public static final ms8 c;
    public static final ms8 d;
    public static final ms8 o;

    static {
        ms8 ms8Var = new ms8("OFF", 0);
        a = ms8Var;
        ms8 ms8Var2 = new ms8("ON", 1);
        b = ms8Var2;
        ms8 ms8Var3 = new ms8("DISABLED", 2);
        c = ms8Var3;
        ms8 ms8Var4 = new ms8("HIDE", 3);
        d = ms8Var4;
        ms8 ms8Var5 = new ms8(VersionInfo.UNAVAILABLE, 4);
        o = ms8Var5;
        X = new ms8[]{ms8Var, ms8Var2, ms8Var3, ms8Var4, ms8Var5};
    }

    public static ms8 valueOf(String str) {
        return (ms8) Enum.valueOf(ms8.class, str);
    }

    public static ms8[] values() {
        return (ms8[]) X.clone();
    }
}
