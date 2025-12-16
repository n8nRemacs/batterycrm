package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q0b {
    public static final q0b a;
    public static final q0b b;
    public static final /* synthetic */ q0b[] c;

    static {
        q0b q0bVar = new q0b("PRIMARY", 0);
        a = q0bVar;
        q0b q0bVar2 = new q0b("SECONDARY", 1);
        b = q0bVar2;
        c = new q0b[]{q0bVar, q0bVar2};
    }

    public static q0b valueOf(String str) {
        return (q0b) Enum.valueOf(q0b.class, str);
    }

    public static q0b[] values() {
        return (q0b[]) c.clone();
    }
}
