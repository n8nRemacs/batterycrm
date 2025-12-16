package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class f9g {
    public static final f9g a;
    public static final f9g b;
    public static final /* synthetic */ f9g[] c;

    static {
        f9g f9gVar = new f9g("UPTIME", 0);
        a = f9gVar;
        f9g f9gVar2 = new f9g("REALTIME", 1);
        b = f9gVar2;
        c = new f9g[]{f9gVar, f9gVar2};
    }

    public static f9g valueOf(String str) {
        return (f9g) Enum.valueOf(f9g.class, str);
    }

    public static f9g[] values() {
        return (f9g[]) c.clone();
    }
}
