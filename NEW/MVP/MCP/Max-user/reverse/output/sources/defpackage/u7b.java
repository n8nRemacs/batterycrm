package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u7b {
    public static final u7b a;
    public static final /* synthetic */ u7b[] b;

    /* JADX INFO: Fake field, exist only in values array */
    u7b EF0;

    static {
        u7b u7bVar = new u7b("TITLE", 0);
        u7b u7bVar2 = new u7b("SUBTITLE", 1);
        u7b u7bVar3 = new u7b("NONE", 2);
        a = u7bVar3;
        b = new u7b[]{u7bVar, u7bVar2, u7bVar3};
    }

    public static u7b valueOf(String str) {
        return (u7b) Enum.valueOf(u7b.class, str);
    }

    public static u7b[] values() {
        return (u7b[]) b.clone();
    }
}
