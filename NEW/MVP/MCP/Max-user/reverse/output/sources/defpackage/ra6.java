package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ra6 {
    public static final /* synthetic */ zg5 X;
    public static final Set b;
    public static final ra6 c;
    public static final ra6 d;
    public static final /* synthetic */ ra6[] o;
    public final int a;

    static {
        ra6 ra6Var = new ra6("HIDE_EMPTY", 0, 0);
        ra6 ra6Var2 = new ra6("NO_DELETE", 1, 1);
        c = ra6Var2;
        ra6 ra6Var3 = new ra6("NO_TITLE_EDIT", 2, 2);
        d = ra6Var3;
        ra6[] ra6VarArr = {ra6Var, ra6Var2, ra6Var3, new ra6("NO_FILTERS_EDIT", 3, 3)};
        o = ra6VarArr;
        X = new zg5(ra6VarArr);
        b = Collections.unmodifiableSet(EnumSet.noneOf(ra6.class));
    }

    public ra6(String str, int i, int i2) {
        this.a = i2;
    }

    public static ra6 valueOf(String str) {
        return (ra6) Enum.valueOf(ra6.class, str);
    }

    public static ra6[] values() {
        return (ra6[]) o.clone();
    }
}
