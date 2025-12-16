package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q1b {
    public static final q1b a;
    public static final /* synthetic */ q1b[] b;

    /* JADX INFO: Fake field, exist only in values array */
    q1b EF0;

    static {
        q1b q1bVar = new q1b("TITLE", 0);
        q1b q1bVar2 = new q1b("SUBTITLE", 1);
        q1b q1bVar3 = new q1b("NONE", 2);
        a = q1bVar3;
        b = new q1b[]{q1bVar, q1bVar2, q1bVar3};
    }

    public static q1b valueOf(String str) {
        return (q1b) Enum.valueOf(q1b.class, str);
    }

    public static q1b[] values() {
        return (q1b[]) b.clone();
    }
}
