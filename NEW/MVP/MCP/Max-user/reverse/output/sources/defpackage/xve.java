package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class xve {
    public static final xve a;
    public static final /* synthetic */ xve[] b;

    static {
        xve xveVar = new xve("START", 0);
        a = xveVar;
        b = new xve[]{xveVar, new xve("STOP", 1), new xve("STOP_AND_RESET_REPLAY_CACHE", 2)};
    }

    public static xve valueOf(String str) {
        return (xve) Enum.valueOf(xve.class, str);
    }

    public static xve[] values() {
        return (xve[]) b.clone();
    }
}
