package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s7d {
    public static final s7d a;
    public static final s7d b;
    public static final /* synthetic */ s7d[] c;

    static {
        s7d s7dVar = new s7d("SMALL", 0);
        a = s7dVar;
        s7d s7dVar2 = new s7d("BIG", 1);
        b = s7dVar2;
        c = new s7d[]{s7dVar, s7dVar2};
    }

    public static s7d valueOf(String str) {
        return (s7d) Enum.valueOf(s7d.class, str);
    }

    public static s7d[] values() {
        return (s7d[]) c.clone();
    }
}
