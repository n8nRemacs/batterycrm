package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ewa {
    public static final ewa a;
    public static final ewa b;
    public static final /* synthetic */ ewa[] c;

    static {
        ewa ewaVar = new ewa("ACCEPT", 0);
        a = ewaVar;
        ewa ewaVar2 = new ewa("DECLINE", 1);
        b = ewaVar2;
        c = new ewa[]{ewaVar, ewaVar2};
    }

    public static ewa valueOf(String str) {
        return (ewa) Enum.valueOf(ewa.class, str);
    }

    public static ewa[] values() {
        return (ewa[]) c.clone();
    }
}
