package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l0e {
    public static final l0e a;
    public static final l0e b;
    public static final l0e c;
    public static final /* synthetic */ l0e[] d;

    static {
        l0e l0eVar = new l0e("NETWORK_UNMETERED", 0);
        a = l0eVar;
        l0e l0eVar2 = new l0e("DEVICE_IDLE", 1);
        b = l0eVar2;
        l0e l0eVar3 = new l0e("DEVICE_CHARGING", 2);
        c = l0eVar3;
        d = new l0e[]{l0eVar, l0eVar2, l0eVar3};
    }

    public static l0e valueOf(String str) {
        return (l0e) Enum.valueOf(l0e.class, str);
    }

    public static l0e[] values() {
        return (l0e[]) d.clone();
    }
}
