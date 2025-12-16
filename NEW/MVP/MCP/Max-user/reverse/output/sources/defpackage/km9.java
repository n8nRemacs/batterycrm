package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class km9 {
    public static final HashMap a;
    public static final km9 b;
    public static final km9 c;
    public static final km9 d;
    public static final /* synthetic */ km9[] o;

    static {
        km9 km9Var = new km9("UNKNOWN", 0);
        b = km9Var;
        km9 km9Var2 = new km9("EDITED", 1);
        km9 km9Var3 = new km9("REMOVED", 2);
        c = km9Var3;
        km9 km9Var4 = new km9("DELAYED_FIRE_ERROR", 3);
        d = km9Var4;
        o = new km9[]{km9Var, km9Var2, km9Var3, km9Var4};
        HashMap map = new HashMap(4);
        for (km9 km9Var5 : values()) {
            map.put(km9Var5.name(), km9Var5);
        }
        a = map;
    }

    public static km9 valueOf(String str) {
        return (km9) Enum.valueOf(km9.class, str);
    }

    public static km9[] values() {
        return (km9[]) o.clone();
    }
}
