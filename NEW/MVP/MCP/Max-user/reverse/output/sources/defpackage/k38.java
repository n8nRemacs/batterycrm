package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k38 {
    private static final /* synthetic */ k38[] $VALUES;
    public static final i38 Companion;
    public static final k38 ON_ANY;
    public static final k38 ON_CREATE;
    public static final k38 ON_DESTROY;
    public static final k38 ON_PAUSE;
    public static final k38 ON_RESUME;
    public static final k38 ON_START;
    public static final k38 ON_STOP;

    static {
        k38 k38Var = new k38("ON_CREATE", 0);
        ON_CREATE = k38Var;
        k38 k38Var2 = new k38("ON_START", 1);
        ON_START = k38Var2;
        k38 k38Var3 = new k38("ON_RESUME", 2);
        ON_RESUME = k38Var3;
        k38 k38Var4 = new k38("ON_PAUSE", 3);
        ON_PAUSE = k38Var4;
        k38 k38Var5 = new k38("ON_STOP", 4);
        ON_STOP = k38Var5;
        k38 k38Var6 = new k38("ON_DESTROY", 5);
        ON_DESTROY = k38Var6;
        k38 k38Var7 = new k38("ON_ANY", 6);
        ON_ANY = k38Var7;
        $VALUES = new k38[]{k38Var, k38Var2, k38Var3, k38Var4, k38Var5, k38Var6, k38Var7};
        Companion = new i38();
    }

    public static k38 valueOf(String str) {
        return (k38) Enum.valueOf(k38.class, str);
    }

    public static k38[] values() {
        return (k38[]) $VALUES.clone();
    }

    public final l38 a() {
        switch (j38.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return l38.c;
            case 3:
            case 4:
                return l38.d;
            case 5:
                return l38.o;
            case 6:
                return l38.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
