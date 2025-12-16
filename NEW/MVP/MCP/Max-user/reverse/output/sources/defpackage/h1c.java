package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h1c {
    public static final h1c a;
    public static final h1c b;
    public static final /* synthetic */ h1c[] c;

    static {
        h1c h1cVar = new h1c("TOP", 0);
        a = h1cVar;
        h1c h1cVar2 = new h1c("BOTTOM", 1);
        b = h1cVar2;
        c = new h1c[]{h1cVar, h1cVar2};
    }

    public static h1c valueOf(String str) {
        return (h1c) Enum.valueOf(h1c.class, str);
    }

    public static h1c[] values() {
        return (h1c[]) c.clone();
    }
}
