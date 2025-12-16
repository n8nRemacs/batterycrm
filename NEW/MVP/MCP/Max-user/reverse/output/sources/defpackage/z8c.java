package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class z8c {
    public static final z8c a;
    public static final z8c b;
    public static final /* synthetic */ z8c[] c;

    static {
        z8c z8cVar = new z8c("IDLE", 0);
        a = z8cVar;
        z8c z8cVar2 = new z8c("STREAMING", 1);
        b = z8cVar2;
        c = new z8c[]{z8cVar, z8cVar2};
    }

    public static z8c valueOf(String str) {
        return (z8c) Enum.valueOf(z8c.class, str);
    }

    public static z8c[] values() {
        return (z8c[]) c.clone();
    }
}
