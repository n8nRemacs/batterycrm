package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gza {
    public static final /* synthetic */ gza[] X;
    public static final gza a;
    public static final gza b;
    public static final gza c;
    public static final gza d;
    public static final gza o;

    static {
        gza gzaVar = new gza("ACCENT", 0);
        a = gzaVar;
        gza gzaVar2 = new gza("NEGATIVE", 1);
        b = gzaVar2;
        gza gzaVar3 = new gza("NEUTRAL", 2);
        c = gzaVar3;
        gza gzaVar4 = new gza("NEUTRAL_THEMED", 3);
        d = gzaVar4;
        gza gzaVar5 = new gza("CONTRAST_STATIC", 4);
        o = gzaVar5;
        X = new gza[]{gzaVar, gzaVar2, gzaVar3, gzaVar4, gzaVar5};
    }

    public static gza valueOf(String str) {
        return (gza) Enum.valueOf(gza.class, str);
    }

    public static gza[] values() {
        return (gza[]) X.clone();
    }
}
