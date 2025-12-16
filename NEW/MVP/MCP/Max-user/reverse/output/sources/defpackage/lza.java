package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class lza {
    public static final lza a;
    public static final /* synthetic */ lza[] b;

    static {
        lza lzaVar = new lza("IDLE", 0);
        a = lzaVar;
        b = new lza[]{lzaVar, new lza("LOADING", 1)};
    }

    public static lza valueOf(String str) {
        return (lza) Enum.valueOf(lza.class, str);
    }

    public static lza[] values() {
        return (lza[]) b.clone();
    }
}
