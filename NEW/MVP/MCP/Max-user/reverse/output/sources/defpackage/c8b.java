package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c8b {
    public static final c8b a;
    public static final c8b b;
    public static final /* synthetic */ c8b[] c;

    static {
        c8b c8bVar = new c8b("FILED", 0);
        a = c8bVar;
        c8b c8bVar2 = new c8b("PLAIN", 1);
        b = c8bVar2;
        c = new c8b[]{c8bVar, c8bVar2};
    }

    public static c8b valueOf(String str) {
        return (c8b) Enum.valueOf(c8b.class, str);
    }

    public static c8b[] values() {
        return (c8b[]) c.clone();
    }
}
