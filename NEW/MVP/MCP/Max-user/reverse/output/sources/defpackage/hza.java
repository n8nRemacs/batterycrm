package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hza {
    public static final hza a;
    public static final hza b;
    public static final hza c;
    public static final /* synthetic */ hza[] d;

    static {
        hza hzaVar = new hza("STANDARD", 0);
        a = hzaVar;
        hza hzaVar2 = new hza("ICON", 1);
        b = hzaVar2;
        hza hzaVar3 = new hza("PROGRESS_BAR", 2);
        c = hzaVar3;
        d = new hza[]{hzaVar, hzaVar2, hzaVar3};
    }

    public static hza valueOf(String str) {
        return (hza) Enum.valueOf(hza.class, str);
    }

    public static hza[] values() {
        return (hza[]) d.clone();
    }
}
